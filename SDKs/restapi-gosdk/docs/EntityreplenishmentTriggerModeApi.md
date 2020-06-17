# \EntityreplenishmentTriggerModeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityReplenishmentTriggerModeByIdGET**](EntityreplenishmentTriggerModeApi.md#EntityReplenishmentTriggerModeByIdGET) | **Get** /entity/replenishment_trigger_mode/{id} | EntityReplenishmentTriggerModeById_GET
[**EntityReplenishmentTriggerModeDescribeGET**](EntityreplenishmentTriggerModeApi.md#EntityReplenishmentTriggerModeDescribeGET) | **Get** /entity/replenishment_trigger_mode/describe | EntityReplenishmentTriggerModeDescribe_GET
[**EntityReplenishmentTriggerModeGET**](EntityreplenishmentTriggerModeApi.md#EntityReplenishmentTriggerModeGET) | **Get** /entity/replenishment_trigger_mode | EntityReplenishmentTriggerMode_GET


# **EntityReplenishmentTriggerModeByIdGET**
> interface{} EntityReplenishmentTriggerModeByIdGET(ctx, id, optional)
EntityReplenishmentTriggerModeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityreplenishmentTriggerModeApiEntityReplenishmentTriggerModeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityreplenishmentTriggerModeApiEntityReplenishmentTriggerModeByIdGETOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **fields** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EntityReplenishmentTriggerModeDescribeGET**
> interface{} EntityReplenishmentTriggerModeDescribeGET(ctx, )
EntityReplenishmentTriggerModeDescribe_GET



### Required Parameters
This endpoint does not need any parameter.

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EntityReplenishmentTriggerModeGET**
> interface{} EntityReplenishmentTriggerModeGET(ctx, optional)
EntityReplenishmentTriggerMode_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityreplenishmentTriggerModeApiEntityReplenishmentTriggerModeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityreplenishmentTriggerModeApiEntityReplenishmentTriggerModeGETOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **optional.String**|  | 
 **ordering** | **optional.String**|  | 
 **pageMode** | **optional.String**|  | [default to paged]

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

