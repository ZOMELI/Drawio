package com.zomeli.services.cross.paymentexecution.model;

import com.zomeli.services.cross.paymentexecution.model.generate.MoneyTransferResponse;
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
public class WorkFlowResponse {

  private String uuid;
  private String accountingTransferId;
  private MoneyTransferHeaders moneyTransferHeaders;
  private MoneyTransferResponse moneyTransferResponse;

}
