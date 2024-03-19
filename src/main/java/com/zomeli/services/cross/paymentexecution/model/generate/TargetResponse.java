package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.Objects;
import javax.validation.Valid;



@JsonTypeName("TargetResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class TargetResponse   {
  
  private @Valid BigDecimal rate;
  private @Valid ExchangeCurrency currency;
  private @Valid BigDecimal amount;

  /**
   * Tipo de cambio utilizado
   **/
  public TargetResponse rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  
  @JsonProperty("rate")
  public BigDecimal getRate() {
    return rate;
  }

  @JsonProperty("rate")
  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }

/**
   **/
  public TargetResponse currency(ExchangeCurrency currency) {
    this.currency = currency;
    return this;
  }

  
  @JsonProperty("currency")
  public ExchangeCurrency getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(ExchangeCurrency currency) {
    this.currency = currency;
  }

/**
   * Importe en la moneda destino
   **/
  public TargetResponse amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  @JsonProperty("amount")
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetResponse targetResponse = (TargetResponse) o;
    return Objects.equals(this.rate, targetResponse.rate) &&
        Objects.equals(this.currency, targetResponse.currency) &&
        Objects.equals(this.amount, targetResponse.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, currency, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetResponse {\n");
    
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

