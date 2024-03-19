package com.zomeli.services.cross.paymentexecution.workFlow;

import com.zomeli.services.cross.paymentexecution.activity.AccountTransferExecutionActivity;
//import io.quarkus.temporal.runtime.annotations.TemporalActivityStub;
import com.zomeli.services.cross.paymentexecution.model.WorkFlowRequest;
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
  public String initWorkFlow(WorkFlowRequest workFlowRequest) {

    MDC.put("request.id", workFlowRequest.getUuid());
    Saga.Options sagaOptions = new Saga.Options.Builder().setParallelCompensation(true).build();
    Saga saga = new Saga(sagaOptions);
    String withdrawAccount;
    String depositAccount;

    try {
      withdrawAccount = activities.withdraw(workFlowRequest.getUuid(), workFlowRequest.getTransferRequest());
      saga.addCompensation(activities::withdrawExtortion, workFlowRequest.getUuid(), workFlowRequest.getTransferRequest());

      depositAccount = activities.deposit(workFlowRequest.getUuid(), workFlowRequest.getTransferRequest());
      saga.addCompensation(activities::depositExtortion, workFlowRequest.getUuid(), workFlowRequest.getTransferRequest());

    } catch (ActivityFailure e) {
      saga.compensate();
      throw e;
    }

    log.info("Transfer Successful! " + withdrawAccount + " and " + depositAccount);
    return "Transfer Successful! " + withdrawAccount + " and " + depositAccount;

  }
}
