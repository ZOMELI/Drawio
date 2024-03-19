package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;



@JsonTypeName("ChargeAccountRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class ChargeAccountRequest   {
  
  private @Valid String referenceId;
  private @Valid ChargeAccountCurrency currency;
  private @Valid String chargeAccountDescription;

  /**
   * Número de Cuenta de Cargo
   **/
  public ChargeAccountRequest referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  
  @JsonProperty("referenceId")
 @Pattern(regexp="^\\d{12,16}$")  public String getReferenceId() {
    return referenceId;
  }

  @JsonProperty("referenceId")
  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

/**
   **/
  public ChargeAccountRequest currency(ChargeAccountCurrency currency) {
    this.currency = currency;
    return this;
  }

  
  @JsonProperty("currency")
  @NotNull
  public ChargeAccountCurrency getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(ChargeAccountCurrency currency) {
    this.currency = currency;
  }

/**
   * Descripción con la que se identifica el movimiento realizado.
   **/
  public ChargeAccountRequest chargeAccountDescription(String chargeAccountDescription) {
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
    ChargeAccountRequest chargeAccountRequest = (ChargeAccountRequest) o;
    return Objects.equals(this.referenceId, chargeAccountRequest.referenceId) &&
        Objects.equals(this.currency, chargeAccountRequest.currency) &&
        Objects.equals(this.chargeAccountDescription, chargeAccountRequest.chargeAccountDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, currency, chargeAccountDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeAccountRequest {\n");
    
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

