package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;
import javax.validation.Valid;



@JsonTypeName("ChargeAccountResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class ChargeAccountResponse   {
  
  private @Valid String referenceId;
  private @Valid String formattedAccountNumber;
  private @Valid CurrencyResponse currency;
  private @Valid ClientResponse client;

  /**
   * Número de Cuenta.
   **/
  public ChargeAccountResponse referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  
  @JsonProperty("referenceId")
  public String getReferenceId() {
    return referenceId;
  }

  @JsonProperty("referenceId")
  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

/**
   * Número de Cuenta en Formato Comercial.
   **/
  public ChargeAccountResponse formattedAccountNumber(String formattedAccountNumber) {
    this.formattedAccountNumber = formattedAccountNumber;
    return this;
  }

  
  @JsonProperty("formattedAccountNumber")
  public String getFormattedAccountNumber() {
    return formattedAccountNumber;
  }

  @JsonProperty("formattedAccountNumber")
  public void setFormattedAccountNumber(String formattedAccountNumber) {
    this.formattedAccountNumber = formattedAccountNumber;
  }

/**
   **/
  public ChargeAccountResponse currency(CurrencyResponse currency) {
    this.currency = currency;
    return this;
  }

  
  @JsonProperty("currency")
  public CurrencyResponse getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(CurrencyResponse currency) {
    this.currency = currency;
  }

/**
   **/
  public ChargeAccountResponse client(ClientResponse client) {
    this.client = client;
    return this;
  }

  
  @JsonProperty("client")
  public ClientResponse getClient() {
    return client;
  }

  @JsonProperty("client")
  public void setClient(ClientResponse client) {
    this.client = client;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeAccountResponse chargeAccountResponse = (ChargeAccountResponse) o;
    return Objects.equals(this.referenceId, chargeAccountResponse.referenceId) &&
        Objects.equals(this.formattedAccountNumber, chargeAccountResponse.formattedAccountNumber) &&
        Objects.equals(this.currency, chargeAccountResponse.currency) &&
        Objects.equals(this.client, chargeAccountResponse.client);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, formattedAccountNumber, currency, client);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeAccountResponse {\n");
    
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    formattedAccountNumber: ").append(toIndentedString(formattedAccountNumber)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
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

