package com.zomeli.services.cross.paymentexecution.workFlow;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface AccountingTransferExecutionWorkFlow {

  @WorkflowMethod
  String initWorkFlow(String fromAccountId, String toAccountId, String referenceId, double amount);

}
