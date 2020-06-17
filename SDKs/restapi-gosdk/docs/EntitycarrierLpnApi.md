# \EntitycarrierLpnApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityCarrierLpnByIdGET**](EntitycarrierLpnApi.md#EntityCarrierLpnByIdGET) | **Get** /entity/carrier_lpn/{id} | EntityCarrierLpnById_GET
[**EntityCarrierLpnDescribeGET**](EntitycarrierLpnApi.md#EntityCarrierLpnDescribeGET) | **Get** /entity/carrier_lpn/describe | EntityCarrierLpnDescribe_GET
[**EntityCarrierLpnGET**](EntitycarrierLpnApi.md#EntityCarrierLpnGET) | **Get** /entity/carrier_lpn | EntityCarrierLpn_GET


# **EntityCarrierLpnByIdGET**
> interface{} EntityCarrierLpnByIdGET(ctx, id, optional)
EntityCarrierLpnById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitycarrierLpnApiEntityCarrierLpnByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycarrierLpnApiEntityCarrierLpnByIdGETOpts struct

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

# **EntityCarrierLpnDescribeGET**
> interface{} EntityCarrierLpnDescribeGET(ctx, )
EntityCarrierLpnDescribe_GET



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

# **EntityCarrierLpnGET**
> interface{} EntityCarrierLpnGET(ctx, optional)
EntityCarrierLpn_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitycarrierLpnApiEntityCarrierLpnGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycarrierLpnApiEntityCarrierLpnGETOpts struct

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

