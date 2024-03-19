package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;
import javax.validation.Valid;



@JsonTypeName("PersonAddressResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class PersonAddressResponse   {
  
  private @Valid String summary;
  private @Valid String district;
  private @Valid String city;

  /**
   * Dirección del cliente titular de la cuenta
   **/
  public PersonAddressResponse summary(String summary) {
    this.summary = summary;
    return this;
  }

  
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  @JsonProperty("summary")
  public void setSummary(String summary) {
    this.summary = summary;
  }

/**
   * Distrito de la dirección del cliente titular de la cuenta
   **/
  public PersonAddressResponse district(String district) {
    this.district = district;
    return this;
  }

  
  @JsonProperty("district")
  public String getDistrict() {
    return district;
  }

  @JsonProperty("district")
  public void setDistrict(String district) {
    this.district = district;
  }

/**
   * Ciudad de la dirección del cliente titular de la cuenta
   **/
  public PersonAddressResponse city(String city) {
    this.city = city;
    return this;
  }

  
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(String city) {
    this.city = city;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonAddressResponse personAddressResponse = (PersonAddressResponse) o;
    return Objects.equals(this.summary, personAddressResponse.summary) &&
        Objects.equals(this.district, personAddressResponse.district) &&
        Objects.equals(this.city, personAddressResponse.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, district, city);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonAddressResponse {\n");
    
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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

