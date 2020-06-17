# \EntityvasExecutionStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityVasExecutionStatusByIdGET**](EntityvasExecutionStatusApi.md#EntityVasExecutionStatusByIdGET) | **Get** /entity/vas_execution_status/{id} | EntityVasExecutionStatusById_GET
[**EntityVasExecutionStatusDescribeGET**](EntityvasExecutionStatusApi.md#EntityVasExecutionStatusDescribeGET) | **Get** /entity/vas_execution_status/describe | EntityVasExecutionStatusDescribe_GET
[**EntityVasExecutionStatusGET**](EntityvasExecutionStatusApi.md#EntityVasExecutionStatusGET) | **Get** /entity/vas_execution_status | EntityVasExecutionStatus_GET


# **EntityVasExecutionStatusByIdGET**
> interface{} EntityVasExecutionStatusByIdGET(ctx, id, optional)
EntityVasExecutionStatusById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityvasExecutionStatusApiEntityVasExecutionStatusByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityvasExecutionStatusApiEntityVasExecutionStatusByIdGETOpts struct

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

# **EntityVasExecutionStatusDescribeGET**
> interface{} EntityVasExecutionStatusDescribeGET(ctx, )
EntityVasExecutionStatusDescribe_GET



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

# **EntityVasExecutionStatusGET**
> interface{} EntityVasExecutionStatusGET(ctx, optional)
EntityVasExecutionStatus_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityvasExecutionStatusApiEntityVasExecutionStatusGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityvasExecutionStatusApiEntityVasExecutionStatusGETOpts struct

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

