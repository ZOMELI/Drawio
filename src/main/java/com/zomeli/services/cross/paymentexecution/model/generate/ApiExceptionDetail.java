package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;
import javax.validation.Valid;

/**
 * Datos del error técnico.
 **/

@JsonTypeName("ApiExceptionDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class ApiExceptionDetail   {
  
  private @Valid String code;
  private @Valid String component;
  private @Valid String description;

  /**
   * Codigo de error del Detalle/Proveedor
   **/
  public ApiExceptionDetail code(String code) {
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
   * Nombre del componente de falla
   **/
  public ApiExceptionDetail component(String component) {
    this.component = component;
    return this;
  }

  
  @JsonProperty("component")
  public String getComponent() {
    return component;
  }

  @JsonProperty("component")
  public void setComponent(String component) {
    this.component = component;
  }

/**
   * Descripcion del Detalle
   **/
  public ApiExceptionDetail description(String description) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiExceptionDetail apiExceptionDetail = (ApiExceptionDetail) o;
    return Objects.equals(this.code, apiExceptionDetail.code) &&
        Objects.equals(this.component, apiExceptionDetail.component) &&
        Objects.equals(this.description, apiExceptionDetail.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, component, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiExceptionDetail {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

