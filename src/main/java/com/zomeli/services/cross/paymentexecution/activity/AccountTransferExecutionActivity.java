package com.zomeli.services.cross.paymentexecution.activity;

import com.zomeli.services.cross.paymentexecution.model.generate.MoneyTransferRequest;
import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface AccountTransferExecutionActivity {

  @ActivityMethod
  String withdraw(String uuid, MoneyTransferRequest transferRequest);

  @ActivityMethod
  String deposit(String uuid, MoneyTransferRequest transferRequest);

  @ActivityMethod
  String withdrawExtortion(String uuid, MoneyTransferRequest transferRequest);

  @ActivityMethod
  String depositExtortion(String uuid, MoneyTransferRequest transferRequest);

}
