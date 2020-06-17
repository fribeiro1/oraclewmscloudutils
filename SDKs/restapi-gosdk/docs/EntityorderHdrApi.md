# \EntityorderHdrApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityOrderHdrBulkLockPOST**](EntityorderHdrApi.md#EntityOrderHdrBulkLockPOST) | **Post** /entity/order_hdr/bulk_lock | EntityOrderHdrBulkLock_POST
[**EntityOrderHdrBulkUnlockPOST**](EntityorderHdrApi.md#EntityOrderHdrBulkUnlockPOST) | **Post** /entity/order_hdr/bulk_unlock | EntityOrderHdrBulkUnlock_POST
[**EntityOrderHdrByIdGET**](EntityorderHdrApi.md#EntityOrderHdrByIdGET) | **Get** /entity/order_hdr/{id} | EntityOrderHdrById_GET
[**EntityOrderHdrByIdPATCH**](EntityorderHdrApi.md#EntityOrderHdrByIdPATCH) | **Patch** /entity/order_hdr/{id} | EntityOrderHdrById_PATCH
[**EntityOrderHdrDescribeGET**](EntityorderHdrApi.md#EntityOrderHdrDescribeGET) | **Get** /entity/order_hdr/describe | EntityOrderHdrDescribe_GET
[**EntityOrderHdrGET**](EntityorderHdrApi.md#EntityOrderHdrGET) | **Get** /entity/order_hdr | EntityOrderHdr_GET
[**EntityOrderHdrIblpnsByIdPOST**](EntityorderHdrApi.md#EntityOrderHdrIblpnsByIdPOST) | **Post** /entity/order_hdr/{id}/iblpns | EntityOrderHdrIblpnsById_POST
[**EntityOrderHdrOblpnsByIdPOST**](EntityorderHdrApi.md#EntityOrderHdrOblpnsByIdPOST) | **Post** /entity/order_hdr/{id}/oblpns | EntityOrderHdrOblpnsById_POST


# **EntityOrderHdrBulkLockPOST**
> interface{} EntityOrderHdrBulkLockPOST(ctx, )
EntityOrderHdrBulkLock_POST



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

# **EntityOrderHdrBulkUnlockPOST**
> interface{} EntityOrderHdrBulkUnlockPOST(ctx, )
EntityOrderHdrBulkUnlock_POST



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

# **EntityOrderHdrByIdGET**
> interface{} EntityOrderHdrByIdGET(ctx, id, optional)
EntityOrderHdrById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityorderHdrApiEntityOrderHdrByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityorderHdrApiEntityOrderHdrByIdGETOpts struct

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

# **EntityOrderHdrByIdPATCH**
> interface{} EntityOrderHdrByIdPATCH(ctx, id, optional)
EntityOrderHdrById_PATCH



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityorderHdrApiEntityOrderHdrByIdPATCHOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityorderHdrApiEntityOrderHdrByIdPATCHOpts struct

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

# **EntityOrderHdrDescribeGET**
> interface{} EntityOrderHdrDescribeGET(ctx, )
EntityOrderHdrDescribe_GET



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

# **EntityOrderHdrGET**
> interface{} EntityOrderHdrGET(ctx, optional)
EntityOrderHdr_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityorderHdrApiEntityOrderHdrGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityorderHdrApiEntityOrderHdrGETOpts struct

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

# **EntityOrderHdrIblpnsByIdPOST**
> interface{} EntityOrderHdrIblpnsByIdPOST(ctx, id)
EntityOrderHdrIblpnsById_POST



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

# **EntityOrderHdrOblpnsByIdPOST**
> interface{} EntityOrderHdrOblpnsByIdPOST(ctx, id)
EntityOrderHdrOblpnsById_POST



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

