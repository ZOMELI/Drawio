package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;



@JsonTypeName("DepositAccountRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class DepositAccountRequest   {
  
  private @Valid String referenceId;
  private @Valid DepositAccountCurrency currency;
  private @Valid String depositAccountDescription;

  /**
   * Número de Cuenta de Abono
   **/
  public DepositAccountRequest referenceId(String referenceId) {
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
  public DepositAccountRequest currency(DepositAccountCurrency currency) {
    this.currency = currency;
    return this;
  }

  
  @JsonProperty("currency")
  @NotNull
  public DepositAccountCurrency getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(DepositAccountCurrency currency) {
    this.currency = currency;
  }

/**
   * Descripción con la que se identifica el movimiento realizado.
   **/
  public DepositAccountRequest depositAccountDescription(String depositAccountDescription) {
    this.depositAccountDescription = depositAccountDescription;
    return this;
  }

  
  @JsonProperty("DepositAccountDescription")
  public String getDepositAccountDescription() {
    return depositAccountDescription;
  }

  @JsonProperty("DepositAccountDescription")
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
    DepositAccountRequest depositAccountRequest = (DepositAccountRequest) o;
    return Objects.equals(this.referenceId, depositAccountRequest.referenceId) &&
        Objects.equals(this.currency, depositAccountRequest.currency) &&
        Objects.equals(this.depositAccountDescription, depositAccountRequest.depositAccountDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, currency, depositAccountDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountRequest {\n");
    
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

