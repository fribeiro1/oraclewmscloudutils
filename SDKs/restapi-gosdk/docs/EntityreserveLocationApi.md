# \EntityreserveLocationApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityReserveLocationByIdGET**](EntityreserveLocationApi.md#EntityReserveLocationByIdGET) | **Get** /entity/reserve_location/{id} | EntityReserveLocationById_GET
[**EntityReserveLocationByIdPATCH**](EntityreserveLocationApi.md#EntityReserveLocationByIdPATCH) | **Patch** /entity/reserve_location/{id} | EntityReserveLocationById_PATCH
[**EntityReserveLocationDescribeGET**](EntityreserveLocationApi.md#EntityReserveLocationDescribeGET) | **Get** /entity/reserve_location/describe | EntityReserveLocationDescribe_GET
[**EntityReserveLocationGET**](EntityreserveLocationApi.md#EntityReserveLocationGET) | **Get** /entity/reserve_location | EntityReserveLocation_GET


# **EntityReserveLocationByIdGET**
> interface{} EntityReserveLocationByIdGET(ctx, id, optional)
EntityReserveLocationById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityreserveLocationApiEntityReserveLocationByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityreserveLocationApiEntityReserveLocationByIdGETOpts struct

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

# **EntityReserveLocationByIdPATCH**
> interface{} EntityReserveLocationByIdPATCH(ctx, id, optional)
EntityReserveLocationById_PATCH



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityreserveLocationApiEntityReserveLocationByIdPATCHOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityreserveLocationApiEntityReserveLocationByIdPATCHOpts struct

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

# **EntityReserveLocationDescribeGET**
> interface{} EntityReserveLocationDescribeGET(ctx, )
EntityReserveLocationDescribe_GET



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

# **EntityReserveLocationGET**
> interface{} EntityReserveLocationGET(ctx, optional)
EntityReserveLocation_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityreserveLocationApiEntityReserveLocationGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityreserveLocationApiEntityReserveLocationGETOpts struct

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

