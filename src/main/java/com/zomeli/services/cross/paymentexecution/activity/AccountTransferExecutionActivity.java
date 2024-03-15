package com.zomeli.services.cross.paymentexecution.activity;

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface AccountTransferExecutionActivity {

  @ActivityMethod
  String withdraw(String accountId, String referenceId, double amount);

  @ActivityMethod
  String deposit(String accountId, String referenceId, double amount);


  @ActivityMethod
  String withdrawExtortion(String accountId, String referenceId, double amount);

  @ActivityMethod
  String depositExtortion(String accountId, String referenceId, double amount);

}
