# \EntitylocationSizeTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityLocationSizeTypeByIdGET**](EntitylocationSizeTypeApi.md#EntityLocationSizeTypeByIdGET) | **Get** /entity/location_size_type/{id} | EntityLocationSizeTypeById_GET
[**EntityLocationSizeTypeGET**](EntitylocationSizeTypeApi.md#EntityLocationSizeTypeGET) | **Get** /entity/location_size_type | EntityLocationSizeType_GET
[**EntityLocationSizeTypePOST**](EntitylocationSizeTypeApi.md#EntityLocationSizeTypePOST) | **Post** /entity/location_size_type | EntityLocationSizeType_POST


# **EntityLocationSizeTypeByIdGET**
> interface{} EntityLocationSizeTypeByIdGET(ctx, id, optional)
EntityLocationSizeTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitylocationSizeTypeApiEntityLocationSizeTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitylocationSizeTypeApiEntityLocationSizeTypeByIdGETOpts struct

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

# **EntityLocationSizeTypeGET**
> interface{} EntityLocationSizeTypeGET(ctx, )
EntityLocationSizeType_GET



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

# **EntityLocationSizeTypePOST**
> interface{} EntityLocationSizeTypePOST(ctx, )
EntityLocationSizeType_POST



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

