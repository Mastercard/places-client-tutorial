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
 * Place Filter
 */
@ApiModel(description = "Place Filter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-10T10:46:25.143944500-05:00[America/Chicago]")
public class PlaceFilter {
  public static final String SERIALIZED_NAME_AGGREGATE_MERCHANT_ID = "aggregateMerchantId";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_MERCHANT_ID)
  private Long aggregateMerchantId;

  public static final String SERIALIZED_NAME_AGGREGATE_MERCHANT_NAME = "aggregateMerchantName";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_MERCHANT_NAME)
  private String aggregateMerchantName;

  public static final String SERIALIZED_NAME_CITY_NAME = "cityName";
  @SerializedName(SERIALIZED_NAME_CITY_NAME)
  private String cityName;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_DMA_CODE = "dmaCode";
  @SerializedName(SERIALIZED_NAME_DMA_CODE)
  private String dmaCode;

  public static final String SERIALIZED_NAME_GEOCODE_QUALITY_INDICATOR = "geocodeQualityIndicator";
  @SerializedName(SERIALIZED_NAME_GEOCODE_QUALITY_INDICATOR)
  private String geocodeQualityIndicator;

  public static final String SERIALIZED_NAME_HAS_CASH_BACK = "hasCashBack";
  @SerializedName(SERIALIZED_NAME_HAS_CASH_BACK)
  private Boolean hasCashBack;

  public static final String SERIALIZED_NAME_HAS_NFC = "hasNfc";
  @SerializedName(SERIALIZED_NAME_HAS_NFC)
  private Boolean hasNfc;

  public static final String SERIALIZED_NAME_HAS_PAY_AT_THE_PUMP = "hasPayAtThePump";
  @SerializedName(SERIALIZED_NAME_HAS_PAY_AT_THE_PUMP)
  private Boolean hasPayAtThePump;

  public static final String SERIALIZED_NAME_INDUSTRY = "industry";
  @SerializedName(SERIALIZED_NAME_INDUSTRY)
  private String industry;

  public static final String SERIALIZED_NAME_IS_IN_BUSINESS180_DAY = "isInBusiness180Day";
  @SerializedName(SERIALIZED_NAME_IS_IN_BUSINESS180_DAY)
  private Boolean isInBusiness180Day;

  public static final String SERIALIZED_NAME_IS_IN_BUSINESS30_DAY = "isInBusiness30Day";
  @SerializedName(SERIALIZED_NAME_IS_IN_BUSINESS30_DAY)
  private Boolean isInBusiness30Day;

  public static final String SERIALIZED_NAME_IS_IN_BUSINESS360_DAY = "isInBusiness360Day";
  @SerializedName(SERIALIZED_NAME_IS_IN_BUSINESS360_DAY)
  private Boolean isInBusiness360Day;

  public static final String SERIALIZED_NAME_IS_IN_BUSINESS60_DAY = "isInBusiness60Day";
  @SerializedName(SERIALIZED_NAME_IS_IN_BUSINESS60_DAY)
  private Boolean isInBusiness60Day;

  public static final String SERIALIZED_NAME_IS_IN_BUSINESS7_DAY = "isInBusiness7Day";
  @SerializedName(SERIALIZED_NAME_IS_IN_BUSINESS7_DAY)
  private Boolean isInBusiness7Day;

  public static final String SERIALIZED_NAME_IS_IN_BUSINESS90_DAY = "isInBusiness90Day";
  @SerializedName(SERIALIZED_NAME_IS_IN_BUSINESS90_DAY)
  private Boolean isInBusiness90Day;

  public static final String SERIALIZED_NAME_IS_NEW_BUSINESS = "isNewBusiness";
  @SerializedName(SERIALIZED_NAME_IS_NEW_BUSINESS)
  private Boolean isNewBusiness;

  public static final String SERIALIZED_NAME_KEY_AGGREGATE_MERCHANT_ID = "keyAggregateMerchantId";
  @SerializedName(SERIALIZED_NAME_KEY_AGGREGATE_MERCHANT_ID)
  private Long keyAggregateMerchantId;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private String latitude;

  public static final String SERIALIZED_NAME_LEGAL_CORPORATE_NAME = "legalCorporateName";
  @SerializedName(SERIALIZED_NAME_LEGAL_CORPORATE_NAME)
  private String legalCorporateName;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private Long locationId;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private String longitude;

  public static final String SERIALIZED_NAME_MCC_CODE = "mccCode";
  @SerializedName(SERIALIZED_NAME_MCC_CODE)
  private String mccCode;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchantName";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_MSA_CODE = "msaCode";
  @SerializedName(SERIALIZED_NAME_MSA_CODE)
  private String msaCode;

  public static final String SERIALIZED_NAME_NAICS_CODE = "naicsCode";
  @SerializedName(SERIALIZED_NAME_NAICS_CODE)
  private String naicsCode;

  public static final String SERIALIZED_NAME_PARENT_AGGREGATE_MERCHANT_ID = "parentAggregateMerchantId";
  @SerializedName(SERIALIZED_NAME_PARENT_AGGREGATE_MERCHANT_ID)
  private String parentAggregateMerchantId;

  public static final String SERIALIZED_NAME_PARENT_AGGREGATE_MERCHANT_NAME = "parentAggregateMerchantName";
  @SerializedName(SERIALIZED_NAME_PARENT_AGGREGATE_MERCHANT_NAME)
  private String parentAggregateMerchantName;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_PRIMARY_CHANNEL_OF_DISTRIBUTION = "primaryChannelOfDistribution";
  @SerializedName(SERIALIZED_NAME_PRIMARY_CHANNEL_OF_DISTRIBUTION)
  private String primaryChannelOfDistribution;

  public static final String SERIALIZED_NAME_STATE_PROVINCE_CODE = "stateProvinceCode";
  @SerializedName(SERIALIZED_NAME_STATE_PROVINCE_CODE)
  private String stateProvinceCode;

  public static final String SERIALIZED_NAME_STREET_ADDRESS = "streetAddress";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESS)
  private String streetAddress;

  public static final String SERIALIZED_NAME_SUPER_INDUSTRY = "superIndustry";
  @SerializedName(SERIALIZED_NAME_SUPER_INDUSTRY)
  private String superIndustry;

  public static final String SERIALIZED_NAME_TELEPHONE_NUMBER = "telephoneNumber";
  @SerializedName(SERIALIZED_NAME_TELEPHONE_NUMBER)
  private String telephoneNumber;


  public PlaceFilter aggregateMerchantId(Long aggregateMerchantId) {
    
    this.aggregateMerchantId = aggregateMerchantId;
    return this;
  }

   /**
   * Filter results by the aggregate merchant ID
   * @return aggregateMerchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter results by the aggregate merchant ID")

  public Long getAggregateMerchantId() {
    return aggregateMerchantId;
  }


  public void setAggregateMerchantId(Long aggregateMerchantId) {
    this.aggregateMerchantId = aggregateMerchantId;
  }


  public PlaceFilter aggregateMerchantName(String aggregateMerchantName) {
    
    this.aggregateMerchantName = aggregateMerchantName;
    return this;
  }

   /**
   * Filter results by the aggregate merchant name
   * @return aggregateMerchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter results by the aggregate merchant name")

  public String getAggregateMerchantName() {
    return aggregateMerchantName;
  }


  public void setAggregateMerchantName(String aggregateMerchantName) {
    this.aggregateMerchantName = aggregateMerchantName;
  }


  public PlaceFilter cityName(String cityName) {
    
    this.cityName = cityName;
    return this;
  }

   /**
   * The city for the desired location
   * @return cityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "O FALLON", value = "The city for the desired location")

  public String getCityName() {
    return cityName;
  }


  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public PlaceFilter countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The country code for the desired location
   * @return countryCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "US", required = true, value = "The country code for the desired location")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public PlaceFilter dmaCode(String dmaCode) {
    
    this.dmaCode = dmaCode;
    return this;
  }

   /**
   * Filter results by the DMA code
   * @return dmaCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter results by the DMA code")

  public String getDmaCode() {
    return dmaCode;
  }


  public void setDmaCode(String dmaCode) {
    this.dmaCode = dmaCode;
  }


  public PlaceFilter geocodeQualityIndicator(String geocodeQualityIndicator) {
    
    this.geocodeQualityIndicator = geocodeQualityIndicator;
    return this;
  }

   /**
   * Utilize to only return businesses with the certain characteristics like a rooftop
   * @return geocodeQualityIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Utilize to only return businesses with the certain characteristics like a rooftop")

  public String getGeocodeQualityIndicator() {
    return geocodeQualityIndicator;
  }


  public void setGeocodeQualityIndicator(String geocodeQualityIndicator) {
    this.geocodeQualityIndicator = geocodeQualityIndicator;
  }


  public PlaceFilter hasCashBack(Boolean hasCashBack) {
    
    this.hasCashBack = hasCashBack;
    return this;
  }

   /**
   * Utilize to only return locations that have cash back
   * @return hasCashBack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Utilize to only return locations that have cash back")

  public Boolean getHasCashBack() {
    return hasCashBack;
  }


  public void setHasCashBack(Boolean hasCashBack) {
    this.hasCashBack = hasCashBack;
  }


  public PlaceFilter hasNfc(Boolean hasNfc) {
    
    this.hasNfc = hasNfc;
    return this;
  }

   /**
   * Utilize to only return locations that support nfc
   * @return hasNfc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Utilize to only return locations that support nfc")

  public Boolean getHasNfc() {
    return hasNfc;
  }


  public void setHasNfc(Boolean hasNfc) {
    this.hasNfc = hasNfc;
  }


  public PlaceFilter hasPayAtThePump(Boolean hasPayAtThePump) {
    
    this.hasPayAtThePump = hasPayAtThePump;
    return this;
  }

   /**
   * Utilize to only return locations that have pay at the pump
   * @return hasPayAtThePump
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Utilize to only return locations that have pay at the pump")

  public Boolean getHasPayAtThePump() {
    return hasPayAtThePump;
  }


  public void setHasPayAtThePump(Boolean hasPayAtThePump) {
    this.hasPayAtThePump = hasPayAtThePump;
  }


  public PlaceFilter industry(String industry) {
    
    this.industry = industry;
    return this;
  }

   /**
   * The industry for the desired location
   * @return industry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The industry for the desired location")

  public String getIndustry() {
    return industry;
  }


  public void setIndustry(String industry) {
    this.industry = industry;
  }


  public PlaceFilter isInBusiness180Day(Boolean isInBusiness180Day) {
    
    this.isInBusiness180Day = isInBusiness180Day;
    return this;
  }

   /**
   * Utilize to only return businesses that have had business the last 180 days
   * @return isInBusiness180Day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Utilize to only return businesses that have had business the last 180 days")

  public Boolean getIsInBusiness180Day() {
    return isInBusiness180Day;
  }


  public void setIsInBusiness180Day(Boolean isInBusiness180Day) {
    this.isInBusiness180Day = isInBusiness180Day;
  }


  public PlaceFilter isInBusiness30Day(Boolean isInBusiness30Day) {
    
    this.isInBusiness30Day = isInBusiness30Day;
    return this;
  }

   /**
   * Utilize to only return businesses that have had business the last 30 days
   * @return isInBusiness30Day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Utilize to only return businesses that have had business the last 30 days")

  public Boolean getIsInBusiness30Day() {
    return isInBusiness30Day;
  }


  public void setIsInBusiness30Day(Boolean isInBusiness30Day) {
    this.isInBusiness30Day = isInBusiness30Day;
  }


  public PlaceFilter isInBusiness360Day(Boolean isInBusiness360Day) {
    
    this.isInBusiness360Day = isInBusiness360Day;
    return this;
  }

   /**
   * Utilize to only return businesses that have had business the last 360 days
   * @return isInBusiness360Day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Utilize to only return businesses that have had business the last 360 days")

  public Boolean getIsInBusiness360Day() {
    return isInBusiness360Day;
  }


  public void setIsInBusiness360Day(Boolean isInBusiness360Day) {
    this.isInBusiness360Day = isInBusiness360Day;
  }


  public PlaceFilter isInBusiness60Day(Boolean isInBusiness60Day) {
    
    this.isInBusiness60Day = isInBusiness60Day;
    return this;
  }

   /**
   * Utilize to only return businesses that have had business the last 60 days
   * @return isInBusiness60Day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Utilize to only return businesses that have had business the last 60 days")

  public Boolean getIsInBusiness60Day() {
    return isInBusiness60Day;
  }


  public void setIsInBusiness60Day(Boolean isInBusiness60Day) {
    this.isInBusiness60Day = isInBusiness60Day;
  }


  public PlaceFilter isInBusiness7Day(Boolean isInBusiness7Day) {
    
    this.isInBusiness7Day = isInBusiness7Day;
    return this;
  }

   /**
   * Utilize to only return businesses that have had business the last 7 days
   * @return isInBusiness7Day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Utilize to only return businesses that have had business the last 7 days")

  public Boolean getIsInBusiness7Day() {
    return isInBusiness7Day;
  }


  public void setIsInBusiness7Day(Boolean isInBusiness7Day) {
    this.isInBusiness7Day = isInBusiness7Day;
  }


  public PlaceFilter isInBusiness90Day(Boolean isInBusiness90Day) {
    
    this.isInBusiness90Day = isInBusiness90Day;
    return this;
  }

   /**
   * Utilize to only return businesses that have had business the last 90 days
   * @return isInBusiness90Day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Utilize to only return businesses that have had business the last 90 days")

  public Boolean getIsInBusiness90Day() {
    return isInBusiness90Day;
  }


  public void setIsInBusiness90Day(Boolean isInBusiness90Day) {
    this.isInBusiness90Day = isInBusiness90Day;
  }


  public PlaceFilter isNewBusiness(Boolean isNewBusiness) {
    
    this.isNewBusiness = isNewBusiness;
    return this;
  }

   /**
   * Utilize to only return new or recently opened businesses
   * @return isNewBusiness
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Utilize to only return new or recently opened businesses")

  public Boolean getIsNewBusiness() {
    return isNewBusiness;
  }


  public void setIsNewBusiness(Boolean isNewBusiness) {
    this.isNewBusiness = isNewBusiness;
  }


  public PlaceFilter keyAggregateMerchantId(Long keyAggregateMerchantId) {
    
    this.keyAggregateMerchantId = keyAggregateMerchantId;
    return this;
  }

   /**
   * Filter results by the key aggregate merchant ID
   * @return keyAggregateMerchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter results by the key aggregate merchant ID")

  public Long getKeyAggregateMerchantId() {
    return keyAggregateMerchantId;
  }


  public void setKeyAggregateMerchantId(Long keyAggregateMerchantId) {
    this.keyAggregateMerchantId = keyAggregateMerchantId;
  }


  public PlaceFilter latitude(String latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * Utilize to only return businesses at the selected latitude
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "38.7467", value = "Utilize to only return businesses at the selected latitude")

  public String getLatitude() {
    return latitude;
  }


  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  public PlaceFilter legalCorporateName(String legalCorporateName) {
    
    this.legalCorporateName = legalCorporateName;
    return this;
  }

   /**
   * The legal corporate name for the desired location
   * @return legalCorporateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The legal corporate name for the desired location")

  public String getLegalCorporateName() {
    return legalCorporateName;
  }


  public void setLegalCorporateName(String legalCorporateName) {
    this.legalCorporateName = legalCorporateName;
  }


  public PlaceFilter locationId(Long locationId) {
    
    this.locationId = locationId;
    return this;
  }

   /**
   * Filter results by the Location ID
   * @return locationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter results by the Location ID")

  public Long getLocationId() {
    return locationId;
  }


  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }


  public PlaceFilter longitude(String longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Utilize to only return businesses at the selected longitude
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-90.7464", value = "Utilize to only return businesses at the selected longitude")

  public String getLongitude() {
    return longitude;
  }


  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  public PlaceFilter mccCode(String mccCode) {
    
    this.mccCode = mccCode;
    return this;
  }

   /**
   * Filter results by the Merchant Category Code
   * @return mccCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter results by the Merchant Category Code")

  public String getMccCode() {
    return mccCode;
  }


  public void setMccCode(String mccCode) {
    this.mccCode = mccCode;
  }


  public PlaceFilter merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * The merchant name for the desired location
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The merchant name for the desired location")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public PlaceFilter msaCode(String msaCode) {
    
    this.msaCode = msaCode;
    return this;
  }

   /**
   * Filter results by the MSA code
   * @return msaCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter results by the MSA code")

  public String getMsaCode() {
    return msaCode;
  }


  public void setMsaCode(String msaCode) {
    this.msaCode = msaCode;
  }


  public PlaceFilter naicsCode(String naicsCode) {
    
    this.naicsCode = naicsCode;
    return this;
  }

   /**
   * Filter results by the NAICS code
   * @return naicsCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter results by the NAICS code")

  public String getNaicsCode() {
    return naicsCode;
  }


  public void setNaicsCode(String naicsCode) {
    this.naicsCode = naicsCode;
  }


  public PlaceFilter parentAggregateMerchantId(String parentAggregateMerchantId) {
    
    this.parentAggregateMerchantId = parentAggregateMerchantId;
    return this;
  }

   /**
   * Filter results by the parent aggregate merchant ID
   * @return parentAggregateMerchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter results by the parent aggregate merchant ID")

  public String getParentAggregateMerchantId() {
    return parentAggregateMerchantId;
  }


  public void setParentAggregateMerchantId(String parentAggregateMerchantId) {
    this.parentAggregateMerchantId = parentAggregateMerchantId;
  }


  public PlaceFilter parentAggregateMerchantName(String parentAggregateMerchantName) {
    
    this.parentAggregateMerchantName = parentAggregateMerchantName;
    return this;
  }

   /**
   * Filter results by the parent aggregate merchant name
   * @return parentAggregateMerchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter results by the parent aggregate merchant name")

  public String getParentAggregateMerchantName() {
    return parentAggregateMerchantName;
  }


  public void setParentAggregateMerchantName(String parentAggregateMerchantName) {
    this.parentAggregateMerchantName = parentAggregateMerchantName;
  }


  public PlaceFilter postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code for the desired location
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code for the desired location")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public PlaceFilter primaryChannelOfDistribution(String primaryChannelOfDistribution) {
    
    this.primaryChannelOfDistribution = primaryChannelOfDistribution;
    return this;
  }

   /**
   * Utilize to only return businesses that utilize Brick and Mortar or Web as their primary channel. O &#x3D; Online / Ecommerce, B &#x3D; Brick &amp; Mortar, N &#x3D; Non-Store Retail
   * @return primaryChannelOfDistribution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B", value = "Utilize to only return businesses that utilize Brick and Mortar or Web as their primary channel. O = Online / Ecommerce, B = Brick & Mortar, N = Non-Store Retail")

  public String getPrimaryChannelOfDistribution() {
    return primaryChannelOfDistribution;
  }


  public void setPrimaryChannelOfDistribution(String primaryChannelOfDistribution) {
    this.primaryChannelOfDistribution = primaryChannelOfDistribution;
  }


  public PlaceFilter stateProvinceCode(String stateProvinceCode) {
    
    this.stateProvinceCode = stateProvinceCode;
    return this;
  }

   /**
   * The state for the desired location
   * @return stateProvinceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MO", value = "The state for the desired location")

  public String getStateProvinceCode() {
    return stateProvinceCode;
  }


  public void setStateProvinceCode(String stateProvinceCode) {
    this.stateProvinceCode = stateProvinceCode;
  }


  public PlaceFilter streetAddress(String streetAddress) {
    
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * The street address for the desired location
   * @return streetAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The street address for the desired location")

  public String getStreetAddress() {
    return streetAddress;
  }


  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }


  public PlaceFilter superIndustry(String superIndustry) {
    
    this.superIndustry = superIndustry;
    return this;
  }

   /**
   * The super industry for the desired location
   * @return superIndustry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The super industry for the desired location")

  public String getSuperIndustry() {
    return superIndustry;
  }


  public void setSuperIndustry(String superIndustry) {
    this.superIndustry = superIndustry;
  }


  public PlaceFilter telephoneNumber(String telephoneNumber) {
    
    this.telephoneNumber = telephoneNumber;
    return this;
  }

   /**
   * The telephone number for the desired location
   * @return telephoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The telephone number for the desired location")

  public String getTelephoneNumber() {
    return telephoneNumber;
  }


  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceFilter placeFilter = (PlaceFilter) o;
    return Objects.equals(this.aggregateMerchantId, placeFilter.aggregateMerchantId) &&
        Objects.equals(this.aggregateMerchantName, placeFilter.aggregateMerchantName) &&
        Objects.equals(this.cityName, placeFilter.cityName) &&
        Objects.equals(this.countryCode, placeFilter.countryCode) &&
        Objects.equals(this.dmaCode, placeFilter.dmaCode) &&
        Objects.equals(this.geocodeQualityIndicator, placeFilter.geocodeQualityIndicator) &&
        Objects.equals(this.hasCashBack, placeFilter.hasCashBack) &&
        Objects.equals(this.hasNfc, placeFilter.hasNfc) &&
        Objects.equals(this.hasPayAtThePump, placeFilter.hasPayAtThePump) &&
        Objects.equals(this.industry, placeFilter.industry) &&
        Objects.equals(this.isInBusiness180Day, placeFilter.isInBusiness180Day) &&
        Objects.equals(this.isInBusiness30Day, placeFilter.isInBusiness30Day) &&
        Objects.equals(this.isInBusiness360Day, placeFilter.isInBusiness360Day) &&
        Objects.equals(this.isInBusiness60Day, placeFilter.isInBusiness60Day) &&
        Objects.equals(this.isInBusiness7Day, placeFilter.isInBusiness7Day) &&
        Objects.equals(this.isInBusiness90Day, placeFilter.isInBusiness90Day) &&
        Objects.equals(this.isNewBusiness, placeFilter.isNewBusiness) &&
        Objects.equals(this.keyAggregateMerchantId, placeFilter.keyAggregateMerchantId) &&
        Objects.equals(this.latitude, placeFilter.latitude) &&
        Objects.equals(this.legalCorporateName, placeFilter.legalCorporateName) &&
        Objects.equals(this.locationId, placeFilter.locationId) &&
        Objects.equals(this.longitude, placeFilter.longitude) &&
        Objects.equals(this.mccCode, placeFilter.mccCode) &&
        Objects.equals(this.merchantName, placeFilter.merchantName) &&
        Objects.equals(this.msaCode, placeFilter.msaCode) &&
        Objects.equals(this.naicsCode, placeFilter.naicsCode) &&
        Objects.equals(this.parentAggregateMerchantId, placeFilter.parentAggregateMerchantId) &&
        Objects.equals(this.parentAggregateMerchantName, placeFilter.parentAggregateMerchantName) &&
        Objects.equals(this.postalCode, placeFilter.postalCode) &&
        Objects.equals(this.primaryChannelOfDistribution, placeFilter.primaryChannelOfDistribution) &&
        Objects.equals(this.stateProvinceCode, placeFilter.stateProvinceCode) &&
        Objects.equals(this.streetAddress, placeFilter.streetAddress) &&
        Objects.equals(this.superIndustry, placeFilter.superIndustry) &&
        Objects.equals(this.telephoneNumber, placeFilter.telephoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregateMerchantId, aggregateMerchantName, cityName, countryCode, dmaCode, geocodeQualityIndicator, hasCashBack, hasNfc, hasPayAtThePump, industry, isInBusiness180Day, isInBusiness30Day, isInBusiness360Day, isInBusiness60Day, isInBusiness7Day, isInBusiness90Day, isNewBusiness, keyAggregateMerchantId, latitude, legalCorporateName, locationId, longitude, mccCode, merchantName, msaCode, naicsCode, parentAggregateMerchantId, parentAggregateMerchantName, postalCode, primaryChannelOfDistribution, stateProvinceCode, streetAddress, superIndustry, telephoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceFilter {\n");
    sb.append("    aggregateMerchantId: ").append(toIndentedString(aggregateMerchantId)).append("\n");
    sb.append("    aggregateMerchantName: ").append(toIndentedString(aggregateMerchantName)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    dmaCode: ").append(toIndentedString(dmaCode)).append("\n");
    sb.append("    geocodeQualityIndicator: ").append(toIndentedString(geocodeQualityIndicator)).append("\n");
    sb.append("    hasCashBack: ").append(toIndentedString(hasCashBack)).append("\n");
    sb.append("    hasNfc: ").append(toIndentedString(hasNfc)).append("\n");
    sb.append("    hasPayAtThePump: ").append(toIndentedString(hasPayAtThePump)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    isInBusiness180Day: ").append(toIndentedString(isInBusiness180Day)).append("\n");
    sb.append("    isInBusiness30Day: ").append(toIndentedString(isInBusiness30Day)).append("\n");
    sb.append("    isInBusiness360Day: ").append(toIndentedString(isInBusiness360Day)).append("\n");
    sb.append("    isInBusiness60Day: ").append(toIndentedString(isInBusiness60Day)).append("\n");
    sb.append("    isInBusiness7Day: ").append(toIndentedString(isInBusiness7Day)).append("\n");
    sb.append("    isInBusiness90Day: ").append(toIndentedString(isInBusiness90Day)).append("\n");
    sb.append("    isNewBusiness: ").append(toIndentedString(isNewBusiness)).append("\n");
    sb.append("    keyAggregateMerchantId: ").append(toIndentedString(keyAggregateMerchantId)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    legalCorporateName: ").append(toIndentedString(legalCorporateName)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    mccCode: ").append(toIndentedString(mccCode)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    msaCode: ").append(toIndentedString(msaCode)).append("\n");
    sb.append("    naicsCode: ").append(toIndentedString(naicsCode)).append("\n");
    sb.append("    parentAggregateMerchantId: ").append(toIndentedString(parentAggregateMerchantId)).append("\n");
    sb.append("    parentAggregateMerchantName: ").append(toIndentedString(parentAggregateMerchantName)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    primaryChannelOfDistribution: ").append(toIndentedString(primaryChannelOfDistribution)).append("\n");
    sb.append("    stateProvinceCode: ").append(toIndentedString(stateProvinceCode)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    superIndustry: ").append(toIndentedString(superIndustry)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
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
