# \EntitywaveMheStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityWaveMheStatusByIdGET**](EntitywaveMheStatusApi.md#EntityWaveMheStatusByIdGET) | **Get** /entity/wave_mhe_status/{id} | EntityWaveMheStatusById_GET
[**EntityWaveMheStatusDescribeGET**](EntitywaveMheStatusApi.md#EntityWaveMheStatusDescribeGET) | **Get** /entity/wave_mhe_status/describe | EntityWaveMheStatusDescribe_GET
[**EntityWaveMheStatusGET**](EntitywaveMheStatusApi.md#EntityWaveMheStatusGET) | **Get** /entity/wave_mhe_status | EntityWaveMheStatus_GET


# **EntityWaveMheStatusByIdGET**
> interface{} EntityWaveMheStatusByIdGET(ctx, id, optional)
EntityWaveMheStatusById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitywaveMheStatusApiEntityWaveMheStatusByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitywaveMheStatusApiEntityWaveMheStatusByIdGETOpts struct

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

# **EntityWaveMheStatusDescribeGET**
> interface{} EntityWaveMheStatusDescribeGET(ctx, )
EntityWaveMheStatusDescribe_GET



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

# **EntityWaveMheStatusGET**
> interface{} EntityWaveMheStatusGET(ctx, optional)
EntityWaveMheStatus_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitywaveMheStatusApiEntityWaveMheStatusGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitywaveMheStatusApiEntityWaveMheStatusGETOpts struct

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

