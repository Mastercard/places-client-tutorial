

# PlaceSearchRequest

Place Search Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**distance** | **Long** | Distance measurement for calculating the radius search. The length of distance from the centroid point. Value integer(&lt;15). |  [optional]
**place** | [**PlaceFilter**](PlaceFilter.md) |  |  [optional]
**radiusSearch** | **Boolean** | Switches on the radius search algorithm to be performed with places from a given centroid. Value boolean (true) switches on the radius search algorithm. NOTE - Distance, Latitude and Longitude are REQUIRED for radius search algorithm |  [optional]
**unit** | [**UnitEnum**](#UnitEnum) | Unit of measurement for calculating the radius search. Optional. Measurement of distance unit in miles or kilometers. Value string (m or km |  [optional]



## Enum: UnitEnum

Name | Value
---- | -----
MILE | &quot;MILE&quot;
KM | &quot;KM&quot;



