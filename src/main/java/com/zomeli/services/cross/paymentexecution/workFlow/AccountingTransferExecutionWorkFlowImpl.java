package com.zomeli.services.cross.paymentexecution.workFlow;

import com.zomeli.services.cross.paymentexecution.activity.AccountTransferExecutionActivity;
//import io.quarkus.temporal.runtime.annotations.TemporalActivityStub;
import io.quarkus.temporal.runtime.annotations.TemporalActivityStub;
import io.quarkus.temporal.runtime.annotations.TemporalWorkflow;
import io.temporal.failure.ActivityFailure;
import io.temporal.workflow.Saga;
import org.jboss.logmanager.Logger;
import org.jboss.logmanager.MDC;

@TemporalWorkflow(queue = "MONEY_TRANSFER_TASK_QUEUE", name = "AccountingTransferExecutionWorkFlow")
public class AccountingTransferExecutionWorkFlowImpl implements AccountingTransferExecutionWorkFlow{

  private static final Logger log = Logger.getLogger(
      String.valueOf(AccountingTransferExecutionWorkFlowImpl.class));

  @TemporalActivityStub
  AccountTransferExecutionActivity activities;


  // The transfer method is the entry point to the Workflow.
  // Activity method executions can be orchestrated here or from within other Activity methods.
  @Override
  public String initWorkFlow(String fromAccountId, String toAccountId, String referenceId,
                             double amount) {
    MDC.put("request.id", referenceId);
    Saga.Options sagaOptions = new Saga.Options.Builder().setParallelCompensation(true).build();
    Saga saga = new Saga(sagaOptions);
    String withdrawAccount;
    String depositAccount;

    try {
      withdrawAccount = activities.withdraw(fromAccountId, referenceId, amount);
      saga.addCompensation(activities::withdrawExtortion, fromAccountId, referenceId, amount);

      depositAccount = activities.deposit(fromAccountId, referenceId, amount);
      saga.addCompensation(activities::depositExtortion, fromAccountId, referenceId, amount);

    } catch (ActivityFailure e) {
      saga.compensate();
      throw e;
    }

    log.info("Transfer Successful! " + withdrawAccount + " and " + depositAccount);
    return "Transfer Successful! " + withdrawAccount + " and " + depositAccount;

  }
}
