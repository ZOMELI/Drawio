package com.zomeli.services.cross.paymentexecution.model;

import com.zomeli.services.cross.paymentexecution.model.generate.MoneyTransferRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkFlowRequest {

  private String uuid;
  private MoneyTransferRequest transferRequest;
  private MoneyTransferHeaders moneyTransferHeaders;

}
