package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;

/**
 * Datos del error de sistema.
 **/

@JsonTypeName("ApiException")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class ModelApiException   {
  
  private @Valid String code;
  private @Valid String description;
  private @Valid String errorType;
  private @Valid List<ApiExceptionDetail> exceptionDetails = new ArrayList<>();

  /**
   * Codigo de error de Sistema
   **/
  public ModelApiException code(String code) {
    this.code = code;
    return this;
  }

  
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(String code) {
    this.code = code;
  }

/**
   * Descripcion del error de Sistema
   **/
  public ModelApiException description(String description) {
    this.description = description;
    return this;
  }

  
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

/**
   * Tipo de Error de Sistema
   **/
  public ModelApiException errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

  
  @JsonProperty("errorType")
  public String getErrorType() {
    return errorType;
  }

  @JsonProperty("errorType")
  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

/**
   * Lista de detalles del error
   **/
  public ModelApiException exceptionDetails(List<ApiExceptionDetail> exceptionDetails) {
    this.exceptionDetails = exceptionDetails;
    return this;
  }

  
  @JsonProperty("exceptionDetails")
  public List<ApiExceptionDetail> getExceptionDetails() {
    return exceptionDetails;
  }

  @JsonProperty("exceptionDetails")
  public void setExceptionDetails(List<ApiExceptionDetail> exceptionDetails) {
    this.exceptionDetails = exceptionDetails;
  }

  public ModelApiException addExceptionDetailsItem(ApiExceptionDetail exceptionDetailsItem) {
    if (this.exceptionDetails == null) {
      this.exceptionDetails = new ArrayList<>();
    }

    this.exceptionDetails.add(exceptionDetailsItem);
    return this;
  }

  public ModelApiException removeExceptionDetailsItem(ApiExceptionDetail exceptionDetailsItem) {
    if (exceptionDetailsItem != null && this.exceptionDetails != null) {
      this.exceptionDetails.remove(exceptionDetailsItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelApiException _apiException = (ModelApiException) o;
    return Objects.equals(this.code, _apiException.code) &&
        Objects.equals(this.description, _apiException.description) &&
        Objects.equals(this.errorType, _apiException.errorType) &&
        Objects.equals(this.exceptionDetails, _apiException.exceptionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, errorType, exceptionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelApiException {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    exceptionDetails: ").append(toIndentedString(exceptionDetails)).append("\n");
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

