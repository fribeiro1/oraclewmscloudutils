# \EntityprocessMonitorStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityProcessMonitorStatusByIdGET**](EntityprocessMonitorStatusApi.md#EntityProcessMonitorStatusByIdGET) | **Get** /entity/process_monitor_status/{id} | EntityProcessMonitorStatusById_GET
[**EntityProcessMonitorStatusDescribeGET**](EntityprocessMonitorStatusApi.md#EntityProcessMonitorStatusDescribeGET) | **Get** /entity/process_monitor_status/describe | EntityProcessMonitorStatusDescribe_GET
[**EntityProcessMonitorStatusGET**](EntityprocessMonitorStatusApi.md#EntityProcessMonitorStatusGET) | **Get** /entity/process_monitor_status | EntityProcessMonitorStatus_GET


# **EntityProcessMonitorStatusByIdGET**
> interface{} EntityProcessMonitorStatusByIdGET(ctx, id, optional)
EntityProcessMonitorStatusById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityprocessMonitorStatusApiEntityProcessMonitorStatusByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityprocessMonitorStatusApiEntityProcessMonitorStatusByIdGETOpts struct

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

# **EntityProcessMonitorStatusDescribeGET**
> interface{} EntityProcessMonitorStatusDescribeGET(ctx, )
EntityProcessMonitorStatusDescribe_GET



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

# **EntityProcessMonitorStatusGET**
> interface{} EntityProcessMonitorStatusGET(ctx, optional)
EntityProcessMonitorStatus_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityprocessMonitorStatusApiEntityProcessMonitorStatusGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityprocessMonitorStatusApiEntityProcessMonitorStatusGETOpts struct

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

