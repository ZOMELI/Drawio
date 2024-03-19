package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;
import javax.validation.Valid;



@JsonTypeName("MoneyTransferResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class MoneyTransferResponse   {
  
  private @Valid String accountingTransferId;
  private @Valid ChargeInformationResponse chargeInformation;
  private @Valid DepositInformationResponse depositInformation;
  private @Valid ExchangeInformationResponse exchangeInformation;

  /**
   * Número Único de la transacción para el orquestador
   **/
  public MoneyTransferResponse accountingTransferId(String accountingTransferId) {
    this.accountingTransferId = accountingTransferId;
    return this;
  }

  
  @JsonProperty("accountingTransferId")
  public String getAccountingTransferId() {
    return accountingTransferId;
  }

  @JsonProperty("accountingTransferId")
  public void setAccountingTransferId(String accountingTransferId) {
    this.accountingTransferId = accountingTransferId;
  }

/**
   **/
  public MoneyTransferResponse chargeInformation(ChargeInformationResponse chargeInformation) {
    this.chargeInformation = chargeInformation;
    return this;
  }

  
  @JsonProperty("chargeInformation")
  public ChargeInformationResponse getChargeInformation() {
    return chargeInformation;
  }

  @JsonProperty("chargeInformation")
  public void setChargeInformation(ChargeInformationResponse chargeInformation) {
    this.chargeInformation = chargeInformation;
  }

/**
   **/
  public MoneyTransferResponse depositInformation(DepositInformationResponse depositInformation) {
    this.depositInformation = depositInformation;
    return this;
  }

  
  @JsonProperty("depositInformation")
  public DepositInformationResponse getDepositInformation() {
    return depositInformation;
  }

  @JsonProperty("depositInformation")
  public void setDepositInformation(DepositInformationResponse depositInformation) {
    this.depositInformation = depositInformation;
  }

/**
   **/
  public MoneyTransferResponse exchangeInformation(ExchangeInformationResponse exchangeInformation) {
    this.exchangeInformation = exchangeInformation;
    return this;
  }

  
  @JsonProperty("exchangeInformation")
  public ExchangeInformationResponse getExchangeInformation() {
    return exchangeInformation;
  }

  @JsonProperty("exchangeInformation")
  public void setExchangeInformation(ExchangeInformationResponse exchangeInformation) {
    this.exchangeInformation = exchangeInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoneyTransferResponse moneyTransferResponse = (MoneyTransferResponse) o;
    return Objects.equals(this.accountingTransferId, moneyTransferResponse.accountingTransferId) &&
        Objects.equals(this.chargeInformation, moneyTransferResponse.chargeInformation) &&
        Objects.equals(this.depositInformation, moneyTransferResponse.depositInformation) &&
        Objects.equals(this.exchangeInformation, moneyTransferResponse.exchangeInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountingTransferId, chargeInformation, depositInformation, exchangeInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoneyTransferResponse {\n");
    
    sb.append("    accountingTransferId: ").append(toIndentedString(accountingTransferId)).append("\n");
    sb.append("    chargeInformation: ").append(toIndentedString(chargeInformation)).append("\n");
    sb.append("    depositInformation: ").append(toIndentedString(depositInformation)).append("\n");
    sb.append("    exchangeInformation: ").append(toIndentedString(exchangeInformation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

