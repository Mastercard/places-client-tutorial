/*
 * Places API
 * Places API
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.api.places.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Merchant Category Code
 */
@ApiModel(description = "Merchant Category Code")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-10T10:46:25.143944500-05:00[America/Chicago]")
public class MerchantCategoryCode {
  public static final String SERIALIZED_NAME_MERCHANT_CATEGORY_CODE = "merchantCategoryCode";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CATEGORY_CODE)
  private String merchantCategoryCode;

  public static final String SERIALIZED_NAME_MERCHANT_CATEGORY_NAME = "merchantCategoryName";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CATEGORY_NAME)
  private String merchantCategoryName;


  public MerchantCategoryCode merchantCategoryCode(String merchantCategoryCode) {
    
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

   /**
   * This code represents the category that a merchant location may be under and is supported by most payment providers
   * @return merchantCategoryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0004", value = "This code represents the category that a merchant location may be under and is supported by most payment providers")

  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }


  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }


  public MerchantCategoryCode merchantCategoryName(String merchantCategoryName) {
    
    this.merchantCategoryName = merchantCategoryName;
    return this;
  }

   /**
   * This is the name of the Merchant Category that accompanies the MCC Code which identifies the category a merchant falls under
   * @return merchantCategoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AIR CARRIERS  AIRLINES-NOT ELSEWHERE CLASSIFIED", value = "This is the name of the Merchant Category that accompanies the MCC Code which identifies the category a merchant falls under")

  public String getMerchantCategoryName() {
    return merchantCategoryName;
  }


  public void setMerchantCategoryName(String merchantCategoryName) {
    this.merchantCategoryName = merchantCategoryName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantCategoryCode merchantCategoryCode = (MerchantCategoryCode) o;
    return Objects.equals(this.merchantCategoryCode, merchantCategoryCode.merchantCategoryCode) &&
        Objects.equals(this.merchantCategoryName, merchantCategoryCode.merchantCategoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantCategoryCode, merchantCategoryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantCategoryCode {\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    merchantCategoryName: ").append(toIndentedString(merchantCategoryName)).append("\n");
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

