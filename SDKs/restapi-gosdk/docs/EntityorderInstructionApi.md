# \EntityorderInstructionApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityOrderInstructionByIdGET**](EntityorderInstructionApi.md#EntityOrderInstructionByIdGET) | **Get** /entity/order_instruction/{id} | EntityOrderInstructionById_GET
[**EntityOrderInstructionDescribeGET**](EntityorderInstructionApi.md#EntityOrderInstructionDescribeGET) | **Get** /entity/order_instruction/describe | EntityOrderInstructionDescribe_GET
[**EntityOrderInstructionGET**](EntityorderInstructionApi.md#EntityOrderInstructionGET) | **Get** /entity/order_instruction | EntityOrderInstruction_GET


# **EntityOrderInstructionByIdGET**
> interface{} EntityOrderInstructionByIdGET(ctx, id, optional)
EntityOrderInstructionById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityorderInstructionApiEntityOrderInstructionByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityorderInstructionApiEntityOrderInstructionByIdGETOpts struct

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

# **EntityOrderInstructionDescribeGET**
> interface{} EntityOrderInstructionDescribeGET(ctx, )
EntityOrderInstructionDescribe_GET



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

# **EntityOrderInstructionGET**
> interface{} EntityOrderInstructionGET(ctx, optional)
EntityOrderInstruction_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityorderInstructionApiEntityOrderInstructionGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityorderInstructionApiEntityOrderInstructionGETOpts struct

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

