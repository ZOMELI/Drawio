package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;
import javax.validation.Valid;



@JsonTypeName("ClientResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class ClientResponse   {
  
  private @Valid String cic;
  private @Valid String fullName;
  private @Valid PersonAddressResponse address;

  /**
   * CIC del cliente titular de la cuenta &lt;br/&gt; Formato [8-11]documento [1]tipoDocumento [3]correlativo
   **/
  public ClientResponse cic(String cic) {
    this.cic = cic;
    return this;
  }

  
  @JsonProperty("cic")
  public String getCic() {
    return cic;
  }

  @JsonProperty("cic")
  public void setCic(String cic) {
    this.cic = cic;
  }

/**
   * Nombre del cliente titular de la cuent.
   **/
  public ClientResponse fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }

  @JsonProperty("fullName")
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

/**
   **/
  public ClientResponse address(PersonAddressResponse address) {
    this.address = address;
    return this;
  }

  
  @JsonProperty("address")
  public PersonAddressResponse getAddress() {
    return address;
  }

  @JsonProperty("address")
  public void setAddress(PersonAddressResponse address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientResponse clientResponse = (ClientResponse) o;
    return Objects.equals(this.cic, clientResponse.cic) &&
        Objects.equals(this.fullName, clientResponse.fullName) &&
        Objects.equals(this.address, clientResponse.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cic, fullName, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientResponse {\n");
    
    sb.append("    cic: ").append(toIndentedString(cic)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

