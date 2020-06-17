# \EntitypalletApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityPalletByIdGET**](EntitypalletApi.md#EntityPalletByIdGET) | **Get** /entity/pallet/{id} | EntityPalletById_GET
[**EntityPalletCloseInboundSortingByIdPOST**](EntitypalletApi.md#EntityPalletCloseInboundSortingByIdPOST) | **Post** /entity/pallet/{id}/close_inbound_sorting | EntityPalletCloseInboundSortingById_POST
[**EntityPalletCloseInboundSortingPOST**](EntitypalletApi.md#EntityPalletCloseInboundSortingPOST) | **Post** /entity/pallet/close_inbound_sorting | EntityPalletCloseInboundSorting_POST
[**EntityPalletDescribeGET**](EntitypalletApi.md#EntityPalletDescribeGET) | **Get** /entity/pallet/describe | EntityPalletDescribe_GET
[**EntityPalletGET**](EntitypalletApi.md#EntityPalletGET) | **Get** /entity/pallet | EntityPallet_GET
[**EntityPalletSortLpnPOST**](EntitypalletApi.md#EntityPalletSortLpnPOST) | **Post** /entity/pallet/sort_lpn | EntityPalletSortLpn_POST


# **EntityPalletByIdGET**
> interface{} EntityPalletByIdGET(ctx, id, optional)
EntityPalletById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitypalletApiEntityPalletByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitypalletApiEntityPalletByIdGETOpts struct

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

# **EntityPalletCloseInboundSortingByIdPOST**
> interface{} EntityPalletCloseInboundSortingByIdPOST(ctx, id)
EntityPalletCloseInboundSortingById_POST



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EntityPalletCloseInboundSortingPOST**
> interface{} EntityPalletCloseInboundSortingPOST(ctx, )
EntityPalletCloseInboundSorting_POST



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

# **EntityPalletDescribeGET**
> interface{} EntityPalletDescribeGET(ctx, )
EntityPalletDescribe_GET



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

# **EntityPalletGET**
> interface{} EntityPalletGET(ctx, optional)
EntityPallet_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitypalletApiEntityPalletGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitypalletApiEntityPalletGETOpts struct

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

# **EntityPalletSortLpnPOST**
> interface{} EntityPalletSortLpnPOST(ctx, )
EntityPalletSortLpn_POST



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

