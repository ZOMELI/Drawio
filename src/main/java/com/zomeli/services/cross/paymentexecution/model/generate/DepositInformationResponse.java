package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;
import javax.validation.Valid;



@JsonTypeName("DepositInformationResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class DepositInformationResponse   {
  
  private @Valid ChargeTypeResponse depositType;
  private @Valid ChargeAccountResponse depositAccount;
  private @Valid ChargeAccountBalanceResponse depositAccountbalance;
  private @Valid String depositAccountDescription;

  /**
   **/
  public DepositInformationResponse depositType(ChargeTypeResponse depositType) {
    this.depositType = depositType;
    return this;
  }

  
  @JsonProperty("depositType")
  public ChargeTypeResponse getDepositType() {
    return depositType;
  }

  @JsonProperty("depositType")
  public void setDepositType(ChargeTypeResponse depositType) {
    this.depositType = depositType;
  }

/**
   **/
  public DepositInformationResponse depositAccount(ChargeAccountResponse depositAccount) {
    this.depositAccount = depositAccount;
    return this;
  }

  
  @JsonProperty("depositAccount")
  public ChargeAccountResponse getDepositAccount() {
    return depositAccount;
  }

  @JsonProperty("depositAccount")
  public void setDepositAccount(ChargeAccountResponse depositAccount) {
    this.depositAccount = depositAccount;
  }

/**
   **/
  public DepositInformationResponse depositAccountbalance(
      ChargeAccountBalanceResponse depositAccountbalance) {
    this.depositAccountbalance = depositAccountbalance;
    return this;
  }

  
  @JsonProperty("depositAccountbalance")
  public ChargeAccountBalanceResponse getDepositAccountbalance() {
    return depositAccountbalance;
  }

  @JsonProperty("depositAccountbalance")
  public void setDepositAccountbalance(ChargeAccountBalanceResponse depositAccountbalance) {
    this.depositAccountbalance = depositAccountbalance;
  }

/**
   * Descripción con la que se identifica el movimiento realizado.
   **/
  public DepositInformationResponse depositAccountDescription(String depositAccountDescription) {
    this.depositAccountDescription = depositAccountDescription;
    return this;
  }

  
  @JsonProperty("depositAccountDescription")
  public String getDepositAccountDescription() {
    return depositAccountDescription;
  }

  @JsonProperty("depositAccountDescription")
  public void setDepositAccountDescription(String depositAccountDescription) {
    this.depositAccountDescription = depositAccountDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositInformationResponse depositInformationResponse = (DepositInformationResponse) o;
    return Objects.equals(this.depositType, depositInformationResponse.depositType) &&
        Objects.equals(this.depositAccount, depositInformationResponse.depositAccount) &&
        Objects.equals(this.depositAccountbalance, depositInformationResponse.depositAccountbalance) &&
        Objects.equals(this.depositAccountDescription, depositInformationResponse.depositAccountDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositType, depositAccount, depositAccountbalance, depositAccountDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositInformationResponse {\n");
    
    sb.append("    depositType: ").append(toIndentedString(depositType)).append("\n");
    sb.append("    depositAccount: ").append(toIndentedString(depositAccount)).append("\n");
    sb.append("    depositAccountbalance: ").append(toIndentedString(depositAccountbalance)).append("\n");
    sb.append("    depositAccountDescription: ").append(toIndentedString(depositAccountDescription)).append("\n");
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

