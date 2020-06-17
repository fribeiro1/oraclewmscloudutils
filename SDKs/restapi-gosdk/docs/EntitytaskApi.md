# \EntitytaskApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityTaskByIdGET**](EntitytaskApi.md#EntityTaskByIdGET) | **Get** /entity/task/{id} | EntityTaskById_GET
[**EntityTaskDescribeGET**](EntitytaskApi.md#EntityTaskDescribeGET) | **Get** /entity/task/describe | EntityTaskDescribe_GET
[**EntityTaskGET**](EntitytaskApi.md#EntityTaskGET) | **Get** /entity/task | EntityTask_GET
[**EntityTaskNextTaskGET**](EntitytaskApi.md#EntityTaskNextTaskGET) | **Get** /entity/task/next_task | EntityTaskNextTask_GET


# **EntityTaskByIdGET**
> interface{} EntityTaskByIdGET(ctx, id, optional)
EntityTaskById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitytaskApiEntityTaskByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitytaskApiEntityTaskByIdGETOpts struct

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

# **EntityTaskDescribeGET**
> interface{} EntityTaskDescribeGET(ctx, )
EntityTaskDescribe_GET



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

# **EntityTaskGET**
> interface{} EntityTaskGET(ctx, optional)
EntityTask_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitytaskApiEntityTaskGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitytaskApiEntityTaskGETOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **optional.String**|  | 
 **ordering** | **optional.String**|  | 
 **pageMode** | **optional.String**|  | [default to paged]
 **facilityId** | **optional.Int32**|  | 
 **facilityIdCode** | **optional.String**|  | 
 **locationBarcode** | **optional.String**|  | 
 **taskType** | **optional.String**|  | 
 **orderingRule** | **optional.String**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EntityTaskNextTaskGET**
> interface{} EntityTaskNextTaskGET(ctx, facilityId, facilityIdCode, locationBarcode, orderingRule, taskType)
EntityTaskNextTask_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **facilityId** | **float32**|  | 
  **facilityIdCode** | **string**|  | 
  **locationBarcode** | **string**|  | 
  **orderingRule** | **string**|  | 
  **taskType** | **string**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

