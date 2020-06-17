# \EntitywaveTemplateApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityWaveTemplateByIdGET**](EntitywaveTemplateApi.md#EntityWaveTemplateByIdGET) | **Get** /entity/wave_template/{id} | EntityWaveTemplateById_GET
[**EntityWaveTemplateDescribeGET**](EntitywaveTemplateApi.md#EntityWaveTemplateDescribeGET) | **Get** /entity/wave_template/describe | EntityWaveTemplateDescribe_GET
[**EntityWaveTemplateGET**](EntitywaveTemplateApi.md#EntityWaveTemplateGET) | **Get** /entity/wave_template | EntityWaveTemplate_GET


# **EntityWaveTemplateByIdGET**
> interface{} EntityWaveTemplateByIdGET(ctx, id, optional)
EntityWaveTemplateById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitywaveTemplateApiEntityWaveTemplateByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitywaveTemplateApiEntityWaveTemplateByIdGETOpts struct

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

# **EntityWaveTemplateDescribeGET**
> interface{} EntityWaveTemplateDescribeGET(ctx, )
EntityWaveTemplateDescribe_GET



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

# **EntityWaveTemplateGET**
> interface{} EntityWaveTemplateGET(ctx, optional)
EntityWaveTemplate_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitywaveTemplateApiEntityWaveTemplateGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitywaveTemplateApiEntityWaveTemplateGETOpts struct

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

