# \EntityorderInstructionTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityOrderInstructionTypeByIdGET**](EntityorderInstructionTypeApi.md#EntityOrderInstructionTypeByIdGET) | **Get** /entity/order_instruction_type/{id} | EntityOrderInstructionTypeById_GET
[**EntityOrderInstructionTypeDescribeGET**](EntityorderInstructionTypeApi.md#EntityOrderInstructionTypeDescribeGET) | **Get** /entity/order_instruction_type/describe | EntityOrderInstructionTypeDescribe_GET
[**EntityOrderInstructionTypeGET**](EntityorderInstructionTypeApi.md#EntityOrderInstructionTypeGET) | **Get** /entity/order_instruction_type | EntityOrderInstructionType_GET


# **EntityOrderInstructionTypeByIdGET**
> interface{} EntityOrderInstructionTypeByIdGET(ctx, id, optional)
EntityOrderInstructionTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityorderInstructionTypeApiEntityOrderInstructionTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityorderInstructionTypeApiEntityOrderInstructionTypeByIdGETOpts struct

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

# **EntityOrderInstructionTypeDescribeGET**
> interface{} EntityOrderInstructionTypeDescribeGET(ctx, )
EntityOrderInstructionTypeDescribe_GET



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

# **EntityOrderInstructionTypeGET**
> interface{} EntityOrderInstructionTypeGET(ctx, optional)
EntityOrderInstructionType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityorderInstructionTypeApiEntityOrderInstructionTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityorderInstructionTypeApiEntityOrderInstructionTypeGETOpts struct

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

