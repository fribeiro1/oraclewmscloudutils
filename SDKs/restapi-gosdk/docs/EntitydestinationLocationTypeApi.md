# \EntitydestinationLocationTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityDestinationLocationTypeByIdGET**](EntitydestinationLocationTypeApi.md#EntityDestinationLocationTypeByIdGET) | **Get** /entity/destination_location_type/{id} | EntityDestinationLocationTypeById_GET
[**EntityDestinationLocationTypeDescribeGET**](EntitydestinationLocationTypeApi.md#EntityDestinationLocationTypeDescribeGET) | **Get** /entity/destination_location_type/describe | EntityDestinationLocationTypeDescribe_GET
[**EntityDestinationLocationTypeGET**](EntitydestinationLocationTypeApi.md#EntityDestinationLocationTypeGET) | **Get** /entity/destination_location_type | EntityDestinationLocationType_GET


# **EntityDestinationLocationTypeByIdGET**
> interface{} EntityDestinationLocationTypeByIdGET(ctx, id, optional)
EntityDestinationLocationTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitydestinationLocationTypeApiEntityDestinationLocationTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitydestinationLocationTypeApiEntityDestinationLocationTypeByIdGETOpts struct

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

# **EntityDestinationLocationTypeDescribeGET**
> interface{} EntityDestinationLocationTypeDescribeGET(ctx, )
EntityDestinationLocationTypeDescribe_GET



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

# **EntityDestinationLocationTypeGET**
> interface{} EntityDestinationLocationTypeGET(ctx, optional)
EntityDestinationLocationType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitydestinationLocationTypeApiEntityDestinationLocationTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitydestinationLocationTypeApiEntityDestinationLocationTypeGETOpts struct

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

