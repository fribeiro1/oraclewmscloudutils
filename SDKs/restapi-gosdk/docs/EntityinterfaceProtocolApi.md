# \EntityinterfaceProtocolApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityInterfaceProtocolByIdGET**](EntityinterfaceProtocolApi.md#EntityInterfaceProtocolByIdGET) | **Get** /entity/interface_protocol/{id} | EntityInterfaceProtocolById_GET
[**EntityInterfaceProtocolDescribeGET**](EntityinterfaceProtocolApi.md#EntityInterfaceProtocolDescribeGET) | **Get** /entity/interface_protocol/describe | EntityInterfaceProtocolDescribe_GET
[**EntityInterfaceProtocolGET**](EntityinterfaceProtocolApi.md#EntityInterfaceProtocolGET) | **Get** /entity/interface_protocol | EntityInterfaceProtocol_GET


# **EntityInterfaceProtocolByIdGET**
> interface{} EntityInterfaceProtocolByIdGET(ctx, id, optional)
EntityInterfaceProtocolById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityinterfaceProtocolApiEntityInterfaceProtocolByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityinterfaceProtocolApiEntityInterfaceProtocolByIdGETOpts struct

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

# **EntityInterfaceProtocolDescribeGET**
> interface{} EntityInterfaceProtocolDescribeGET(ctx, )
EntityInterfaceProtocolDescribe_GET



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

# **EntityInterfaceProtocolGET**
> interface{} EntityInterfaceProtocolGET(ctx, optional)
EntityInterfaceProtocol_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityinterfaceProtocolApiEntityInterfaceProtocolGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityinterfaceProtocolApiEntityInterfaceProtocolGETOpts struct

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

