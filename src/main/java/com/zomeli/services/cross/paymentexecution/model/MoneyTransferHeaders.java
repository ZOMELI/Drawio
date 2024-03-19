package com.zomeli.services.cross.paymentexecution.model;

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
public class MoneyTransferHeaders {

  private String token;
  private String opnNumber;
  private String opnNumberReverse;
  private String requestId;
  private String requestDate;

}
