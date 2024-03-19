package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.Objects;
import javax.validation.Valid;



@JsonTypeName("ChargeAccountBalanceResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class ChargeAccountBalanceResponse   {
  
  private @Valid BigDecimal baseAmount;
  private @Valid BigDecimal accountingAmount;
  private @Valid BigDecimal availableAmount;
  private @Valid String registerDate;

  /**
   * Importe base en la cuenta
   **/
  public ChargeAccountBalanceResponse baseAmount(BigDecimal baseAmount) {
    this.baseAmount = baseAmount;
    return this;
  }

  
  @JsonProperty("baseAmount")
  public BigDecimal getBaseAmount() {
    return baseAmount;
  }

  @JsonProperty("baseAmount")
  public void setBaseAmount(BigDecimal baseAmount) {
    this.baseAmount = baseAmount;
  }

/**
   * Saldo Contable de la chargeAccountbalance
   **/
  public ChargeAccountBalanceResponse accountingAmount(BigDecimal accountingAmount) {
    this.accountingAmount = accountingAmount;
    return this;
  }

  
  @JsonProperty("accountingAmount")
  public BigDecimal getAccountingAmount() {
    return accountingAmount;
  }

  @JsonProperty("accountingAmount")
  public void setAccountingAmount(BigDecimal accountingAmount) {
    this.accountingAmount = accountingAmount;
  }

/**
   * Saldo Disponible de la Cuenta
   **/
  public ChargeAccountBalanceResponse availableAmount(BigDecimal availableAmount) {
    this.availableAmount = availableAmount;
    return this;
  }

  
  @JsonProperty("availableAmount")
  public BigDecimal getAvailableAmount() {
    return availableAmount;
  }

  @JsonProperty("availableAmount")
  public void setAvailableAmount(BigDecimal availableAmount) {
    this.availableAmount = availableAmount;
  }

/**
   * Fecha de la transacción de abono en el Servicio Contable&lt;br/&gt; Formato AAAA-MM-DD o AAAA/MM/DD
   **/
  public ChargeAccountBalanceResponse registerDate(String registerDate) {
    this.registerDate = registerDate;
    return this;
  }

  
  @JsonProperty("registerDate")
  public String getRegisterDate() {
    return registerDate;
  }

  @JsonProperty("registerDate")
  public void setRegisterDate(String registerDate) {
    this.registerDate = registerDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeAccountBalanceResponse chargeAccountBalanceResponse = (ChargeAccountBalanceResponse) o;
    return Objects.equals(this.baseAmount, chargeAccountBalanceResponse.baseAmount) &&
        Objects.equals(this.accountingAmount, chargeAccountBalanceResponse.accountingAmount) &&
        Objects.equals(this.availableAmount, chargeAccountBalanceResponse.availableAmount) &&
        Objects.equals(this.registerDate, chargeAccountBalanceResponse.registerDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseAmount, accountingAmount, availableAmount, registerDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeAccountBalanceResponse {\n");
    
    sb.append("    baseAmount: ").append(toIndentedString(baseAmount)).append("\n");
    sb.append("    accountingAmount: ").append(toIndentedString(accountingAmount)).append("\n");
    sb.append("    availableAmount: ").append(toIndentedString(availableAmount)).append("\n");
    sb.append("    registerDate: ").append(toIndentedString(registerDate)).append("\n");
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

