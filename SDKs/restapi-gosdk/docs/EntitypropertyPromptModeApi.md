# \EntitypropertyPromptModeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityPropertyPromptModeByIdGET**](EntitypropertyPromptModeApi.md#EntityPropertyPromptModeByIdGET) | **Get** /entity/property_prompt_mode/{id} | EntityPropertyPromptModeById_GET
[**EntityPropertyPromptModeDescribeGET**](EntitypropertyPromptModeApi.md#EntityPropertyPromptModeDescribeGET) | **Get** /entity/property_prompt_mode/describe | EntityPropertyPromptModeDescribe_GET
[**EntityPropertyPromptModeGET**](EntitypropertyPromptModeApi.md#EntityPropertyPromptModeGET) | **Get** /entity/property_prompt_mode | EntityPropertyPromptMode_GET


# **EntityPropertyPromptModeByIdGET**
> interface{} EntityPropertyPromptModeByIdGET(ctx, id, optional)
EntityPropertyPromptModeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitypropertyPromptModeApiEntityPropertyPromptModeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitypropertyPromptModeApiEntityPropertyPromptModeByIdGETOpts struct

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

# **EntityPropertyPromptModeDescribeGET**
> interface{} EntityPropertyPromptModeDescribeGET(ctx, )
EntityPropertyPromptModeDescribe_GET



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

# **EntityPropertyPromptModeGET**
> interface{} EntityPropertyPromptModeGET(ctx, optional)
EntityPropertyPromptMode_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitypropertyPromptModeApiEntityPropertyPromptModeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitypropertyPromptModeApiEntityPropertyPromptModeGETOpts struct

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

