

# Error

Details of the error condition such as the source of the error, reason code for the error, if the error is recoverable, and details about the error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | **String** | The application that generated this error | 
**reasonCode** | **String** | A unique constant identifying the error case encountered during transaction processing | 
**description** | **String** | Short description of the ReasonCode field | 
**recoverable** | **Boolean** | Indicates whether this error will always be returned for this request, or retrying could change the outcome | 
**details** | **String** | Description of the issue |  [optional]



