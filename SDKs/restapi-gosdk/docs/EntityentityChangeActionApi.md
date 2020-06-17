# \EntityentityChangeActionApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityEntityChangeActionByIdGET**](EntityentityChangeActionApi.md#EntityEntityChangeActionByIdGET) | **Get** /entity/entity_change_action/{id} | EntityEntityChangeActionById_GET
[**EntityEntityChangeActionDescribeGET**](EntityentityChangeActionApi.md#EntityEntityChangeActionDescribeGET) | **Get** /entity/entity_change_action/describe | EntityEntityChangeActionDescribe_GET
[**EntityEntityChangeActionGET**](EntityentityChangeActionApi.md#EntityEntityChangeActionGET) | **Get** /entity/entity_change_action | EntityEntityChangeAction_GET


# **EntityEntityChangeActionByIdGET**
> interface{} EntityEntityChangeActionByIdGET(ctx, id, optional)
EntityEntityChangeActionById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityentityChangeActionApiEntityEntityChangeActionByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityentityChangeActionApiEntityEntityChangeActionByIdGETOpts struct

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

# **EntityEntityChangeActionDescribeGET**
> interface{} EntityEntityChangeActionDescribeGET(ctx, )
EntityEntityChangeActionDescribe_GET



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

# **EntityEntityChangeActionGET**
> interface{} EntityEntityChangeActionGET(ctx, optional)
EntityEntityChangeAction_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityentityChangeActionApiEntityEntityChangeActionGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityentityChangeActionApiEntityEntityChangeActionGETOpts struct

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

