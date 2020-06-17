# \EntitywaveTemplateStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityWaveTemplateStatusByIdGET**](EntitywaveTemplateStatusApi.md#EntityWaveTemplateStatusByIdGET) | **Get** /entity/wave_template_status/{id} | EntityWaveTemplateStatusById_GET
[**EntityWaveTemplateStatusDescribeGET**](EntitywaveTemplateStatusApi.md#EntityWaveTemplateStatusDescribeGET) | **Get** /entity/wave_template_status/describe | EntityWaveTemplateStatusDescribe_GET
[**EntityWaveTemplateStatusGET**](EntitywaveTemplateStatusApi.md#EntityWaveTemplateStatusGET) | **Get** /entity/wave_template_status | EntityWaveTemplateStatus_GET


# **EntityWaveTemplateStatusByIdGET**
> interface{} EntityWaveTemplateStatusByIdGET(ctx, id, optional)
EntityWaveTemplateStatusById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitywaveTemplateStatusApiEntityWaveTemplateStatusByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitywaveTemplateStatusApiEntityWaveTemplateStatusByIdGETOpts struct

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

# **EntityWaveTemplateStatusDescribeGET**
> interface{} EntityWaveTemplateStatusDescribeGET(ctx, )
EntityWaveTemplateStatusDescribe_GET



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

# **EntityWaveTemplateStatusGET**
> interface{} EntityWaveTemplateStatusGET(ctx, optional)
EntityWaveTemplateStatus_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitywaveTemplateStatusApiEntityWaveTemplateStatusGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitywaveTemplateStatusApiEntityWaveTemplateStatusGETOpts struct

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

