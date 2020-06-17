# \EntityanswerInputTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityAnswerInputTypeByIdGET**](EntityanswerInputTypeApi.md#EntityAnswerInputTypeByIdGET) | **Get** /entity/answer_input_type/{id} | EntityAnswerInputTypeById_GET
[**EntityAnswerInputTypeDescribeGET**](EntityanswerInputTypeApi.md#EntityAnswerInputTypeDescribeGET) | **Get** /entity/answer_input_type/describe | EntityAnswerInputTypeDescribe_GET
[**EntityAnswerInputTypeGET**](EntityanswerInputTypeApi.md#EntityAnswerInputTypeGET) | **Get** /entity/answer_input_type | EntityAnswerInputType_GET


# **EntityAnswerInputTypeByIdGET**
> interface{} EntityAnswerInputTypeByIdGET(ctx, id, optional)
EntityAnswerInputTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityanswerInputTypeApiEntityAnswerInputTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityanswerInputTypeApiEntityAnswerInputTypeByIdGETOpts struct

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

# **EntityAnswerInputTypeDescribeGET**
> interface{} EntityAnswerInputTypeDescribeGET(ctx, )
EntityAnswerInputTypeDescribe_GET



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

# **EntityAnswerInputTypeGET**
> interface{} EntityAnswerInputTypeGET(ctx, optional)
EntityAnswerInputType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityanswerInputTypeApiEntityAnswerInputTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityanswerInputTypeApiEntityAnswerInputTypeGETOpts struct

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

