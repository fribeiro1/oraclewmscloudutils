# \EntityitemCharacteristicsApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityItemCharacteristicsByIdGET**](EntityitemCharacteristicsApi.md#EntityItemCharacteristicsByIdGET) | **Get** /entity/item_characteristics/{id} | EntityItemCharacteristicsById_GET
[**EntityItemCharacteristicsByIdPATCH**](EntityitemCharacteristicsApi.md#EntityItemCharacteristicsByIdPATCH) | **Patch** /entity/item_characteristics/{id} | EntityItemCharacteristicsById_PATCH
[**EntityItemCharacteristicsDescribeGET**](EntityitemCharacteristicsApi.md#EntityItemCharacteristicsDescribeGET) | **Get** /entity/item_characteristics/describe | EntityItemCharacteristicsDescribe_GET
[**EntityItemCharacteristicsGET**](EntityitemCharacteristicsApi.md#EntityItemCharacteristicsGET) | **Get** /entity/item_characteristics | EntityItemCharacteristics_GET


# **EntityItemCharacteristicsByIdGET**
> interface{} EntityItemCharacteristicsByIdGET(ctx, id, optional)
EntityItemCharacteristicsById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityitemCharacteristicsApiEntityItemCharacteristicsByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityitemCharacteristicsApiEntityItemCharacteristicsByIdGETOpts struct

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

# **EntityItemCharacteristicsByIdPATCH**
> interface{} EntityItemCharacteristicsByIdPATCH(ctx, id, optional)
EntityItemCharacteristicsById_PATCH



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityitemCharacteristicsApiEntityItemCharacteristicsByIdPATCHOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityitemCharacteristicsApiEntityItemCharacteristicsByIdPATCHOpts struct

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

# **EntityItemCharacteristicsDescribeGET**
> interface{} EntityItemCharacteristicsDescribeGET(ctx, )
EntityItemCharacteristicsDescribe_GET



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

# **EntityItemCharacteristicsGET**
> interface{} EntityItemCharacteristicsGET(ctx, optional)
EntityItemCharacteristics_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityitemCharacteristicsApiEntityItemCharacteristicsGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityitemCharacteristicsApiEntityItemCharacteristicsGETOpts struct

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

