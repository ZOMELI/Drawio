package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;
import javax.validation.Valid;



@JsonTypeName("ChargeInformationResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class ChargeInformationResponse   {
  
  private @Valid ChargeTypeResponse chargeType;
  private @Valid ChargeAccountResponse chargeAccount;
  private @Valid ChargeAccountBalanceResponse chargeAccountbalance;
  private @Valid String chargeAccountDescription;

  /**
   **/
  public ChargeInformationResponse chargeType(ChargeTypeResponse chargeType) {
    this.chargeType = chargeType;
    return this;
  }

  
  @JsonProperty("chargeType")
  public ChargeTypeResponse getChargeType() {
    return chargeType;
  }

  @JsonProperty("chargeType")
  public void setChargeType(ChargeTypeResponse chargeType) {
    this.chargeType = chargeType;
  }

/**
   **/
  public ChargeInformationResponse chargeAccount(ChargeAccountResponse chargeAccount) {
    this.chargeAccount = chargeAccount;
    return this;
  }

  
  @JsonProperty("chargeAccount")
  public ChargeAccountResponse getChargeAccount() {
    return chargeAccount;
  }

  @JsonProperty("chargeAccount")
  public void setChargeAccount(ChargeAccountResponse chargeAccount) {
    this.chargeAccount = chargeAccount;
  }

/**
   **/
  public ChargeInformationResponse chargeAccountbalance(
      ChargeAccountBalanceResponse chargeAccountbalance) {
    this.chargeAccountbalance = chargeAccountbalance;
    return this;
  }

  
  @JsonProperty("chargeAccountbalance")
  public ChargeAccountBalanceResponse getChargeAccountbalance() {
    return chargeAccountbalance;
  }

  @JsonProperty("chargeAccountbalance")
  public void setChargeAccountbalance(ChargeAccountBalanceResponse chargeAccountbalance) {
    this.chargeAccountbalance = chargeAccountbalance;
  }

/**
   * Descripción con la que se identifica el movimiento realizado.
   **/
  public ChargeInformationResponse chargeAccountDescription(String chargeAccountDescription) {
    this.chargeAccountDescription = chargeAccountDescription;
    return this;
  }

  
  @JsonProperty("ChargeAccountDescription")
  public String getChargeAccountDescription() {
    return chargeAccountDescription;
  }

  @JsonProperty("ChargeAccountDescription")
  public void setChargeAccountDescription(String chargeAccountDescription) {
    this.chargeAccountDescription = chargeAccountDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeInformationResponse chargeInformationResponse = (ChargeInformationResponse) o;
    return Objects.equals(this.chargeType, chargeInformationResponse.chargeType) &&
        Objects.equals(this.chargeAccount, chargeInformationResponse.chargeAccount) &&
        Objects.equals(this.chargeAccountbalance, chargeInformationResponse.chargeAccountbalance) &&
        Objects.equals(this.chargeAccountDescription, chargeInformationResponse.chargeAccountDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeType, chargeAccount, chargeAccountbalance, chargeAccountDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeInformationResponse {\n");
    
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    chargeAccount: ").append(toIndentedString(chargeAccount)).append("\n");
    sb.append("    chargeAccountbalance: ").append(toIndentedString(chargeAccountbalance)).append("\n");
    sb.append("    chargeAccountDescription: ").append(toIndentedString(chargeAccountDescription)).append("\n");
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

