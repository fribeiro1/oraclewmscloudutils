# \EntityreasonCodeTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityReasonCodeTypeByIdGET**](EntityreasonCodeTypeApi.md#EntityReasonCodeTypeByIdGET) | **Get** /entity/reason_code_type/{id} | EntityReasonCodeTypeById_GET
[**EntityReasonCodeTypeDescribeGET**](EntityreasonCodeTypeApi.md#EntityReasonCodeTypeDescribeGET) | **Get** /entity/reason_code_type/describe | EntityReasonCodeTypeDescribe_GET
[**EntityReasonCodeTypeGET**](EntityreasonCodeTypeApi.md#EntityReasonCodeTypeGET) | **Get** /entity/reason_code_type | EntityReasonCodeType_GET


# **EntityReasonCodeTypeByIdGET**
> interface{} EntityReasonCodeTypeByIdGET(ctx, id, optional)
EntityReasonCodeTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityreasonCodeTypeApiEntityReasonCodeTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityreasonCodeTypeApiEntityReasonCodeTypeByIdGETOpts struct

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

# **EntityReasonCodeTypeDescribeGET**
> interface{} EntityReasonCodeTypeDescribeGET(ctx, )
EntityReasonCodeTypeDescribe_GET



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

# **EntityReasonCodeTypeGET**
> interface{} EntityReasonCodeTypeGET(ctx, optional)
EntityReasonCodeType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityreasonCodeTypeApiEntityReasonCodeTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityreasonCodeTypeApiEntityReasonCodeTypeGETOpts struct

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

