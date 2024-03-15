package com.zomeli.services.cross.paymentexecution.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class TransferDto {

  private String amount;
  private Currency currency;
  private ChargeInformation chargeInformation;
  private DepositInformation depositInformation;

}
