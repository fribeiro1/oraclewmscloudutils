# \EntitytrailerApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityTrailerByIdGET**](EntitytrailerApi.md#EntityTrailerByIdGET) | **Get** /entity/trailer/{id} | EntityTrailerById_GET
[**EntityTrailerDescribeGET**](EntitytrailerApi.md#EntityTrailerDescribeGET) | **Get** /entity/trailer/describe | EntityTrailerDescribe_GET
[**EntityTrailerGET**](EntitytrailerApi.md#EntityTrailerGET) | **Get** /entity/trailer | EntityTrailer_GET
[**EntityTrailerLocateToYardByIdPOST**](EntitytrailerApi.md#EntityTrailerLocateToYardByIdPOST) | **Post** /entity/trailer/{id}/locate_to_yard | EntityTrailerLocateToYardById_POST
[**EntityTrailerLocateToYardPOST**](EntitytrailerApi.md#EntityTrailerLocateToYardPOST) | **Post** /entity/trailer/locate_to_yard | EntityTrailerLocateToYard_POST
[**EntityTrailerPOST**](EntitytrailerApi.md#EntityTrailerPOST) | **Post** /entity/trailer | EntityTrailer_POST
[**EntityTrailerRemoveFromYardByIdPOST**](EntitytrailerApi.md#EntityTrailerRemoveFromYardByIdPOST) | **Post** /entity/trailer/{id}/remove_from_yard | EntityTrailerRemoveFromYardById_POST
[**EntityTrailerRemoveFromYardPOST**](EntitytrailerApi.md#EntityTrailerRemoveFromYardPOST) | **Post** /entity/trailer/remove_from_yard | EntityTrailerRemoveFromYard_POST


# **EntityTrailerByIdGET**
> interface{} EntityTrailerByIdGET(ctx, id, optional)
EntityTrailerById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitytrailerApiEntityTrailerByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitytrailerApiEntityTrailerByIdGETOpts struct

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

# **EntityTrailerDescribeGET**
> interface{} EntityTrailerDescribeGET(ctx, )
EntityTrailerDescribe_GET



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

# **EntityTrailerGET**
> interface{} EntityTrailerGET(ctx, optional)
EntityTrailer_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitytrailerApiEntityTrailerGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitytrailerApiEntityTrailerGETOpts struct

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

# **EntityTrailerLocateToYardByIdPOST**
> interface{} EntityTrailerLocateToYardByIdPOST(ctx, id)
EntityTrailerLocateToYardById_POST



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EntityTrailerLocateToYardPOST**
> interface{} EntityTrailerLocateToYardPOST(ctx, )
EntityTrailerLocateToYard_POST



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

# **EntityTrailerPOST**
> interface{} EntityTrailerPOST(ctx, optional)
EntityTrailer_POST



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitytrailerApiEntityTrailerPOSTOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitytrailerApiEntityTrailerPOSTOpts struct

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

# **EntityTrailerRemoveFromYardByIdPOST**
> interface{} EntityTrailerRemoveFromYardByIdPOST(ctx, id)
EntityTrailerRemoveFromYardById_POST



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EntityTrailerRemoveFromYardPOST**
> interface{} EntityTrailerRemoveFromYardPOST(ctx, )
EntityTrailerRemoveFromYard_POST



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

