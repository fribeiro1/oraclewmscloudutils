# \EntityworkOrderStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityWorkOrderStatusByIdGET**](EntityworkOrderStatusApi.md#EntityWorkOrderStatusByIdGET) | **Get** /entity/work_order_status/{id} | EntityWorkOrderStatusById_GET
[**EntityWorkOrderStatusDescribeGET**](EntityworkOrderStatusApi.md#EntityWorkOrderStatusDescribeGET) | **Get** /entity/work_order_status/describe | EntityWorkOrderStatusDescribe_GET
[**EntityWorkOrderStatusGET**](EntityworkOrderStatusApi.md#EntityWorkOrderStatusGET) | **Get** /entity/work_order_status | EntityWorkOrderStatus_GET


# **EntityWorkOrderStatusByIdGET**
> interface{} EntityWorkOrderStatusByIdGET(ctx, id, optional)
EntityWorkOrderStatusById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityworkOrderStatusApiEntityWorkOrderStatusByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityworkOrderStatusApiEntityWorkOrderStatusByIdGETOpts struct

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

# **EntityWorkOrderStatusDescribeGET**
> interface{} EntityWorkOrderStatusDescribeGET(ctx, )
EntityWorkOrderStatusDescribe_GET



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

# **EntityWorkOrderStatusGET**
> interface{} EntityWorkOrderStatusGET(ctx, optional)
EntityWorkOrderStatus_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityworkOrderStatusApiEntityWorkOrderStatusGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityworkOrderStatusApiEntityWorkOrderStatusGETOpts struct

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

