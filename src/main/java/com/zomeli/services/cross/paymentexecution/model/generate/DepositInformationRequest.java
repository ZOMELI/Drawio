package com.zomeli.services.cross.paymentexecution.model.generate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;



@JsonTypeName("DepositInformationRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-19T01:48:34.673945-05:00[America/Lima]")@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

public class DepositInformationRequest   {
  
  private @Valid DepositTypeRequest depositType;
  private @Valid DepositAccountRequest depositAccount;

  /**
   **/
  public DepositInformationRequest depositType(DepositTypeRequest depositType) {
    this.depositType = depositType;
    return this;
  }

  
  @JsonProperty("depositType")
  @NotNull
  public DepositTypeRequest getDepositType() {
    return depositType;
  }

  @JsonProperty("depositType")
  public void setDepositType(DepositTypeRequest depositType) {
    this.depositType = depositType;
  }

/**
   **/
  public DepositInformationRequest depositAccount(DepositAccountRequest depositAccount) {
    this.depositAccount = depositAccount;
    return this;
  }

  
  @JsonProperty("depositAccount")
  @NotNull
  public DepositAccountRequest getDepositAccount() {
    return depositAccount;
  }

  @JsonProperty("depositAccount")
  public void setDepositAccount(DepositAccountRequest depositAccount) {
    this.depositAccount = depositAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositInformationRequest depositInformationRequest = (DepositInformationRequest) o;
    return Objects.equals(this.depositType, depositInformationRequest.depositType) &&
        Objects.equals(this.depositAccount, depositInformationRequest.depositAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositType, depositAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositInformationRequest {\n");
    
    sb.append("    depositType: ").append(toIndentedString(depositType)).append("\n");
    sb.append("    depositAccount: ").append(toIndentedString(depositAccount)).append("\n");
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

