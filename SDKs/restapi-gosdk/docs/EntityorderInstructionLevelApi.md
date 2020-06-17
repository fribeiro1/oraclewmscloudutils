# \EntityorderInstructionLevelApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityOrderInstructionLevelByIdGET**](EntityorderInstructionLevelApi.md#EntityOrderInstructionLevelByIdGET) | **Get** /entity/order_instruction_level/{id} | EntityOrderInstructionLevelById_GET
[**EntityOrderInstructionLevelDescribeGET**](EntityorderInstructionLevelApi.md#EntityOrderInstructionLevelDescribeGET) | **Get** /entity/order_instruction_level/describe | EntityOrderInstructionLevelDescribe_GET
[**EntityOrderInstructionLevelGET**](EntityorderInstructionLevelApi.md#EntityOrderInstructionLevelGET) | **Get** /entity/order_instruction_level | EntityOrderInstructionLevel_GET


# **EntityOrderInstructionLevelByIdGET**
> interface{} EntityOrderInstructionLevelByIdGET(ctx, id, optional)
EntityOrderInstructionLevelById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityorderInstructionLevelApiEntityOrderInstructionLevelByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityorderInstructionLevelApiEntityOrderInstructionLevelByIdGETOpts struct

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

# **EntityOrderInstructionLevelDescribeGET**
> interface{} EntityOrderInstructionLevelDescribeGET(ctx, )
EntityOrderInstructionLevelDescribe_GET



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

# **EntityOrderInstructionLevelGET**
> interface{} EntityOrderInstructionLevelGET(ctx, optional)
EntityOrderInstructionLevel_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityorderInstructionLevelApiEntityOrderInstructionLevelGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityorderInstructionLevelApiEntityOrderInstructionLevelGETOpts struct

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

