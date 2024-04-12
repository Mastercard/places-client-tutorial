

# PlaceInfo

Place Info

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregateMerchantId** | **Long** | Merchant Aggregate ID groups merchant locations by chain. This is the first level of aggregation |  [optional]
**aggregateMerchantName** | **String** | The aggregate merchant name of this merchant location |  [optional]
**cityName** | **String** | The city for the desired location |  [optional]
**cleansedCityName** | **String** | The cleansed city name is provided by Mastercard matching its transaction data with another Data Partner to ensure standardization |  [optional]
**cleansedCountryCode** | **String** | The cleansed country code is provided by Mastercard matching its transaction data with another Data Partner to ensure standardization |  [optional]
**cleansedLegalCorporateName** | **String** | The cleansed legal corporate name is provided by Mastercard matching its transaction data with another Data Partner to ensure standardization |  [optional]
**cleansedMerchantName** | **String** | The cleansed merchant name is provided by Mastercard matching its transaction data with another Data Partner to ensure standardization |  [optional]
**cleansedPostalCode** | **String** | The cleansed postal code is provided by Mastercard matching its transaction data with another Data Partner to ensure standardization |  [optional]
**cleansedStateProvinceCode** | **String** | The cleansed state is provided by Mastercard matching its transaction data with another Data Partner |  [optional]
**cleansedStreetAddress** | **String** | The cleansed street address is provided by Mastercard matching its transaction data with another Data Partner to ensure standardization |  [optional]
**cleansedTelephoneNumber** | **String** | The cleansed telephone number is provided by Mastercard matching its transaction data with another Data Partner to ensure standardization |  [optional]
**countryCode** | **String** | The country code for the desired location | 
**firstSeenWeek** | **String** | Week of the year for the first transaction |  [optional]
**lastSeenWeek** | **String** | Week of the year for the last transaction |  [optional]
**dmaCode** | **String** | A Designated Market Area or a DMA is a geographic  area that  represents specific television markets as defined by and updated annually by the Nielsen Company. (US Only) |  [optional]
**geocodeQualityIndicator** | **String** | Geocoding quality indicating the specificity of the geo location such as Storefront, Rooftop, Street, Postcode, Admin, Other or None |  [optional]
**hasCashBack** | **Boolean** | Indicates if the merchants provides cash back |  [optional]
**hasNfc** | **Boolean** | Indicates if the merchant supports near field communications (nfc) |  [optional]
**hasPayAtThePump** | **Boolean** | Indicates if a merchant has pay at the pump |  [optional]
**industry** | **String** | The industry for the desired location |  [optional]
**isInBusiness180Day** | **Boolean** | Indicates if this location was in business in the last 180 days |  [optional]
**isInBusiness30Day** | **Boolean** | Indicates if this location was in business in the last 30 days |  [optional]
**isInBusiness360Day** | **Boolean** | Indicates if this location was in business in the last in the last 360 days |  [optional]
**isInBusiness60Day** | **Boolean** | Indicates if this location was in business in the last 60 days |  [optional]
**isInBusiness7Day** | **Boolean** | Indicates if this location was in business in the last 7 days |  [optional]
**isInBusiness90Day** | **Boolean** | Indicates if this location was in business in the last 90 days |  [optional]
**isNewBusiness** | **Boolean** | Indicates if new or recently opened businesses |  [optional]
**keyAggregateMerchantId** | **Long** | The Mastercard defined key aggregate merchant id joins together different channels of one merchant under the same id |  [optional]
**latitude** | **Double** | The latitude geo coordinate position of this merchant location up to 6 decimal precision digits |  [optional]
**legalCorporateName** | **String** | The legal corporate name for the desired location |  [optional]
**locationId** | **Long** | The Mastercard assigned location id representing this merchant location | 
**longitude** | **Double** | The longitude geo coordinate position of this merchant location up to 6 decimal precision digits |  [optional]
**mccCode** | **String** | The Merchant Category Code for the desired location |  [optional]
**merchantName** | **String** | The merchant name for the desired location |  [optional]
**msaCode** | **String** | The metropolitan statistical area (US only). These codes group merchants into metropolitan area |  [optional]
**naicsCode** | **String** | North American Industry Classification System Code |  [optional]
**parentAggregateMerchantId** | **String** | The ID code for the parent aggregate merchant of this merchant location. This helps to further aggregate merchants under one identifier |  [optional]
**parentAggregateMerchantName** | **String** | The name for the parent aggregate merchant of this merchant location. This helps to further aggregate merchants under one identifier |  [optional]
**postalCode** | **String** | The postal code for the desired location |  [optional]
**primaryChannelOfDistribution** | **String** | Return businesses that utilize Brick and Mortar or Web as their primary channel. \\r\\nO &#x3D; Online - Ecommerce, B &#x3D; Brick and Mortar, N &#x3D; Non-Store Retail |  [optional]
**stateProvinceCode** | **String** | The state for the desired location |  [optional]
**streetAddress** | **String** | The street address for the desired location |  [optional]
**superIndustry** | **String** | The super industry for the desired location |  [optional]
**telephoneNumber** | **String** | The telephone number for the desired location |  [optional]



