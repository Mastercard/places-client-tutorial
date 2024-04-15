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
import com.mastercard.api.places.model.MerchantCategoryCode;
import com.mastercard.api.places.model.PageResponse;
import com.mastercard.api.places.model.PagedMerchantCategoryCodeAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PagedMerchantCategoryCode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-10T10:46:25.143944500-05:00[America/Chicago]")
public class PagedMerchantCategoryCode {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<MerchantCategoryCode> items = new ArrayList<MerchantCategoryCode>();


  public PagedMerchantCategoryCode total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public PagedMerchantCategoryCode limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public PagedMerchantCategoryCode offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public PagedMerchantCategoryCode items(List<MerchantCategoryCode> items) {
    
    this.items = items;
    return this;
  }

  public PagedMerchantCategoryCode addItemsItem(MerchantCategoryCode itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array of Merchant Category Codes
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Array of Merchant Category Codes")

  public List<MerchantCategoryCode> getItems() {
    return items;
  }


  public void setItems(List<MerchantCategoryCode> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedMerchantCategoryCode pagedMerchantCategoryCode = (PagedMerchantCategoryCode) o;
    return Objects.equals(this.total, pagedMerchantCategoryCode.total) &&
        Objects.equals(this.limit, pagedMerchantCategoryCode.limit) &&
        Objects.equals(this.offset, pagedMerchantCategoryCode.offset) &&
        Objects.equals(this.items, pagedMerchantCategoryCode.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, limit, offset, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedMerchantCategoryCode {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

