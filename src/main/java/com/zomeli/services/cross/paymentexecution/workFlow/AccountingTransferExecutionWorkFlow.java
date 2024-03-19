package com.zomeli.services.cross.paymentexecution.workFlow;

import com.zomeli.services.cross.paymentexecution.model.WorkFlowRequest;
import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface AccountingTransferExecutionWorkFlow {

  @WorkflowMethod
  String initWorkFlow(WorkFlowRequest workFlowRequest);

}
