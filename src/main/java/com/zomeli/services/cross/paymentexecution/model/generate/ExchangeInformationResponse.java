package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;
import javax.validation.Valid;



@JsonTypeName("ExchangeInformationResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class ExchangeInformationResponse   {
  
  private @Valid String exchangeId;
  private @Valid TargetResponse target;
  private @Valid Integer operationNumber;
  private @Valid String exchangeDate;
  private @Valid String exchangeTime;

  /**
   * Identificador del Tipo de Cambio
   **/
  public ExchangeInformationResponse exchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
    return this;
  }

  
  @JsonProperty("exchangeId")
  public String getExchangeId() {
    return exchangeId;
  }

  @JsonProperty("exchangeId")
  public void setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
  }

/**
   **/
  public ExchangeInformationResponse target(TargetResponse target) {
    this.target = target;
    return this;
  }

  
  @JsonProperty("target")
  public TargetResponse getTarget() {
    return target;
  }

  @JsonProperty("target")
  public void setTarget(TargetResponse target) {
    this.target = target;
  }

/**
   * Número de operación de C/V de moneda extranjera
   **/
  public ExchangeInformationResponse operationNumber(Integer operationNumber) {
    this.operationNumber = operationNumber;
    return this;
  }

  
  @JsonProperty("operationNumber")
  public Integer getOperationNumber() {
    return operationNumber;
  }

  @JsonProperty("operationNumber")
  public void setOperationNumber(Integer operationNumber) {
    this.operationNumber = operationNumber;
  }

/**
   * Fecha de asignación del tipo de cambio utilizado&lt;br/&gt; Formato AAAA-MM-DD o AAAA/MM/DD
   **/
  public ExchangeInformationResponse exchangeDate(String exchangeDate) {
    this.exchangeDate = exchangeDate;
    return this;
  }

  
  @JsonProperty("exchangeDate")
  public String getExchangeDate() {
    return exchangeDate;
  }

  @JsonProperty("exchangeDate")
  public void setExchangeDate(String exchangeDate) {
    this.exchangeDate = exchangeDate;
  }

/**
   * Hora de asignación del tipo de cambio utilizado (formato HH:MM:SS)
   **/
  public ExchangeInformationResponse exchangeTime(String exchangeTime) {
    this.exchangeTime = exchangeTime;
    return this;
  }

  
  @JsonProperty("exchangeTime")
  public String getExchangeTime() {
    return exchangeTime;
  }

  @JsonProperty("exchangeTime")
  public void setExchangeTime(String exchangeTime) {
    this.exchangeTime = exchangeTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeInformationResponse exchangeInformationResponse = (ExchangeInformationResponse) o;
    return Objects.equals(this.exchangeId, exchangeInformationResponse.exchangeId) &&
        Objects.equals(this.target, exchangeInformationResponse.target) &&
        Objects.equals(this.operationNumber, exchangeInformationResponse.operationNumber) &&
        Objects.equals(this.exchangeDate, exchangeInformationResponse.exchangeDate) &&
        Objects.equals(this.exchangeTime, exchangeInformationResponse.exchangeTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeId, target, operationNumber, exchangeDate, exchangeTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeInformationResponse {\n");
    
    sb.append("    exchangeId: ").append(toIndentedString(exchangeId)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    operationNumber: ").append(toIndentedString(operationNumber)).append("\n");
    sb.append("    exchangeDate: ").append(toIndentedString(exchangeDate)).append("\n");
    sb.append("    exchangeTime: ").append(toIndentedString(exchangeTime)).append("\n");
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

