# \EntityprinterProtocolApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityPrinterProtocolByIdGET**](EntityprinterProtocolApi.md#EntityPrinterProtocolByIdGET) | **Get** /entity/printer_protocol/{id} | EntityPrinterProtocolById_GET
[**EntityPrinterProtocolDescribeGET**](EntityprinterProtocolApi.md#EntityPrinterProtocolDescribeGET) | **Get** /entity/printer_protocol/describe | EntityPrinterProtocolDescribe_GET
[**EntityPrinterProtocolGET**](EntityprinterProtocolApi.md#EntityPrinterProtocolGET) | **Get** /entity/printer_protocol | EntityPrinterProtocol_GET


# **EntityPrinterProtocolByIdGET**
> interface{} EntityPrinterProtocolByIdGET(ctx, id, optional)
EntityPrinterProtocolById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityprinterProtocolApiEntityPrinterProtocolByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityprinterProtocolApiEntityPrinterProtocolByIdGETOpts struct

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

# **EntityPrinterProtocolDescribeGET**
> interface{} EntityPrinterProtocolDescribeGET(ctx, )
EntityPrinterProtocolDescribe_GET



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

# **EntityPrinterProtocolGET**
> interface{} EntityPrinterProtocolGET(ctx, optional)
EntityPrinterProtocol_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityprinterProtocolApiEntityPrinterProtocolGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityprinterProtocolApiEntityPrinterProtocolGETOpts struct

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

