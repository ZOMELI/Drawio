package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;



@JsonTypeName("MoneyTransferRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class MoneyTransferRequest   {
  
  private @Valid BigDecimal amount;
  private @Valid TransactionCurrency currency;
  private @Valid ChargeInformationRequest chargeInformation;
  private @Valid DepositInformationRequest depositInformation;

  /**
   * Importe de la Operación
   **/
  public MoneyTransferRequest amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  @JsonProperty("amount")
  @NotNull
  public BigDecimal getAmount() {
    return amount;
  }

  @JsonProperty("amount")
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

/**
   **/
  public MoneyTransferRequest currency(TransactionCurrency currency) {
    this.currency = currency;
    return this;
  }

  
  @JsonProperty("currency")
  @NotNull
  public TransactionCurrency getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(TransactionCurrency currency) {
    this.currency = currency;
  }

/**
   **/
  public MoneyTransferRequest chargeInformation(ChargeInformationRequest chargeInformation) {
    this.chargeInformation = chargeInformation;
    return this;
  }

  
  @JsonProperty("chargeInformation")
  @NotNull
  public ChargeInformationRequest getChargeInformation() {
    return chargeInformation;
  }

  @JsonProperty("chargeInformation")
  public void setChargeInformation(ChargeInformationRequest chargeInformation) {
    this.chargeInformation = chargeInformation;
  }

/**
   **/
  public MoneyTransferRequest depositInformation(DepositInformationRequest depositInformation) {
    this.depositInformation = depositInformation;
    return this;
  }

  
  @JsonProperty("depositInformation")
  @NotNull
  public DepositInformationRequest getDepositInformation() {
    return depositInformation;
  }

  @JsonProperty("depositInformation")
  public void setDepositInformation(DepositInformationRequest depositInformation) {
    this.depositInformation = depositInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoneyTransferRequest moneyTransferRequest = (MoneyTransferRequest) o;
    return Objects.equals(this.amount, moneyTransferRequest.amount) &&
        Objects.equals(this.currency, moneyTransferRequest.currency) &&
        Objects.equals(this.chargeInformation, moneyTransferRequest.chargeInformation) &&
        Objects.equals(this.depositInformation, moneyTransferRequest.depositInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, chargeInformation, depositInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoneyTransferRequest {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    chargeInformation: ").append(toIndentedString(chargeInformation)).append("\n");
    sb.append("    depositInformation: ").append(toIndentedString(depositInformation)).append("\n");
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

