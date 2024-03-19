package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;



@JsonTypeName("ChargeInformationRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class ChargeInformationRequest   {
  
  private @Valid ChargeTypeRequest chargeType;
  private @Valid ChargeAccountRequest chargeAccount;

  /**
   **/
  public ChargeInformationRequest chargeType(ChargeTypeRequest chargeType) {
    this.chargeType = chargeType;
    return this;
  }

  
  @JsonProperty("chargeType")
  @NotNull
  public ChargeTypeRequest getChargeType() {
    return chargeType;
  }

  @JsonProperty("chargeType")
  public void setChargeType(ChargeTypeRequest chargeType) {
    this.chargeType = chargeType;
  }

/**
   **/
  public ChargeInformationRequest chargeAccount(ChargeAccountRequest chargeAccount) {
    this.chargeAccount = chargeAccount;
    return this;
  }

  
  @JsonProperty("chargeAccount")
  @NotNull
  public ChargeAccountRequest getChargeAccount() {
    return chargeAccount;
  }

  @JsonProperty("chargeAccount")
  public void setChargeAccount(ChargeAccountRequest chargeAccount) {
    this.chargeAccount = chargeAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeInformationRequest chargeInformationRequest = (ChargeInformationRequest) o;
    return Objects.equals(this.chargeType, chargeInformationRequest.chargeType) &&
        Objects.equals(this.chargeAccount, chargeInformationRequest.chargeAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeType, chargeAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeInformationRequest {\n");
    
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    chargeAccount: ").append(toIndentedString(chargeAccount)).append("\n");
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

