# \EntitybreakByModifierApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityBreakByModifierByIdGET**](EntitybreakByModifierApi.md#EntityBreakByModifierByIdGET) | **Get** /entity/break_by_modifier/{id} | EntityBreakByModifierById_GET
[**EntityBreakByModifierDescribeGET**](EntitybreakByModifierApi.md#EntityBreakByModifierDescribeGET) | **Get** /entity/break_by_modifier/describe | EntityBreakByModifierDescribe_GET
[**EntityBreakByModifierGET**](EntitybreakByModifierApi.md#EntityBreakByModifierGET) | **Get** /entity/break_by_modifier | EntityBreakByModifier_GET


# **EntityBreakByModifierByIdGET**
> interface{} EntityBreakByModifierByIdGET(ctx, id, optional)
EntityBreakByModifierById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitybreakByModifierApiEntityBreakByModifierByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitybreakByModifierApiEntityBreakByModifierByIdGETOpts struct

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

# **EntityBreakByModifierDescribeGET**
> interface{} EntityBreakByModifierDescribeGET(ctx, )
EntityBreakByModifierDescribe_GET



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

# **EntityBreakByModifierGET**
> interface{} EntityBreakByModifierGET(ctx, optional)
EntityBreakByModifier_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitybreakByModifierApiEntityBreakByModifierGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitybreakByModifierApiEntityBreakByModifierGETOpts struct

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

