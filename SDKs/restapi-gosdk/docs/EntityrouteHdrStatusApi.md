# \EntityrouteHdrStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityRouteHdrStatusByIdGET**](EntityrouteHdrStatusApi.md#EntityRouteHdrStatusByIdGET) | **Get** /entity/route_hdr_status/{id} | EntityRouteHdrStatusById_GET
[**EntityRouteHdrStatusDescribeGET**](EntityrouteHdrStatusApi.md#EntityRouteHdrStatusDescribeGET) | **Get** /entity/route_hdr_status/describe | EntityRouteHdrStatusDescribe_GET
[**EntityRouteHdrStatusGET**](EntityrouteHdrStatusApi.md#EntityRouteHdrStatusGET) | **Get** /entity/route_hdr_status | EntityRouteHdrStatus_GET


# **EntityRouteHdrStatusByIdGET**
> interface{} EntityRouteHdrStatusByIdGET(ctx, id, optional)
EntityRouteHdrStatusById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityrouteHdrStatusApiEntityRouteHdrStatusByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityrouteHdrStatusApiEntityRouteHdrStatusByIdGETOpts struct

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

# **EntityRouteHdrStatusDescribeGET**
> interface{} EntityRouteHdrStatusDescribeGET(ctx, )
EntityRouteHdrStatusDescribe_GET



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

# **EntityRouteHdrStatusGET**
> interface{} EntityRouteHdrStatusGET(ctx, optional)
EntityRouteHdrStatus_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityrouteHdrStatusApiEntityRouteHdrStatusGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityrouteHdrStatusApiEntityRouteHdrStatusGETOpts struct

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

