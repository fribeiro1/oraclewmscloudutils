# \EntitycontainerApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityContainerBulkLockPOST**](EntitycontainerApi.md#EntityContainerBulkLockPOST) | **Post** /entity/container/bulk_lock | EntityContainerBulkLock_POST
[**EntityContainerBulkUnlockPOST**](EntitycontainerApi.md#EntityContainerBulkUnlockPOST) | **Post** /entity/container/bulk_unlock | EntityContainerBulkUnlock_POST
[**EntityContainerByIdGET**](EntitycontainerApi.md#EntityContainerByIdGET) | **Get** /entity/container/{id} | EntityContainerById_GET
[**EntityContainerByIdPATCH**](EntitycontainerApi.md#EntityContainerByIdPATCH) | **Patch** /entity/container/{id} | EntityContainerById_PATCH
[**EntityContainerDepalletizeByIdPOST**](EntitycontainerApi.md#EntityContainerDepalletizeByIdPOST) | **Post** /entity/container/{id}/depalletize | EntityContainerDepalletizeById_POST
[**EntityContainerDepalletizePOST**](EntitycontainerApi.md#EntityContainerDepalletizePOST) | **Post** /entity/container/depalletize | EntityContainerDepalletize_POST
[**EntityContainerDescribeGET**](EntitycontainerApi.md#EntityContainerDescribeGET) | **Get** /entity/container/describe | EntityContainerDescribe_GET
[**EntityContainerGET**](EntitycontainerApi.md#EntityContainerGET) | **Get** /entity/container | EntityContainer_GET
[**EntityContainerLockByIdPOST**](EntitycontainerApi.md#EntityContainerLockByIdPOST) | **Post** /entity/container/{id}/lock | EntityContainerLockById_POST
[**EntityContainerOrdersByIdGET**](EntitycontainerApi.md#EntityContainerOrdersByIdGET) | **Get** /entity/container/{id}/orders | EntityContainerOrdersById_GET
[**EntityContainerPalletizeByIdPOST**](EntitycontainerApi.md#EntityContainerPalletizeByIdPOST) | **Post** /entity/container/{id}/palletize | EntityContainerPalletizeById_POST
[**EntityContainerUnlockByIdPOST**](EntitycontainerApi.md#EntityContainerUnlockByIdPOST) | **Post** /entity/container/{id}/unlock | EntityContainerUnlockById_POST


# **EntityContainerBulkLockPOST**
> interface{} EntityContainerBulkLockPOST(ctx, )
EntityContainerBulkLock_POST



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

# **EntityContainerBulkUnlockPOST**
> interface{} EntityContainerBulkUnlockPOST(ctx, )
EntityContainerBulkUnlock_POST



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

# **EntityContainerByIdGET**
> interface{} EntityContainerByIdGET(ctx, id, optional)
EntityContainerById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitycontainerApiEntityContainerByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycontainerApiEntityContainerByIdGETOpts struct

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

# **EntityContainerByIdPATCH**
> interface{} EntityContainerByIdPATCH(ctx, id, optional)
EntityContainerById_PATCH



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitycontainerApiEntityContainerByIdPATCHOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycontainerApiEntityContainerByIdPATCHOpts struct

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

# **EntityContainerDepalletizeByIdPOST**
> interface{} EntityContainerDepalletizeByIdPOST(ctx, id)
EntityContainerDepalletizeById_POST



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

# **EntityContainerDepalletizePOST**
> interface{} EntityContainerDepalletizePOST(ctx, )
EntityContainerDepalletize_POST



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

# **EntityContainerDescribeGET**
> interface{} EntityContainerDescribeGET(ctx, )
EntityContainerDescribe_GET



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

# **EntityContainerGET**
> interface{} EntityContainerGET(ctx, optional)
EntityContainer_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitycontainerApiEntityContainerGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycontainerApiEntityContainerGETOpts struct

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

# **EntityContainerLockByIdPOST**
> interface{} EntityContainerLockByIdPOST(ctx, id)
EntityContainerLockById_POST



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

# **EntityContainerOrdersByIdGET**
> interface{} EntityContainerOrdersByIdGET(ctx, id)
EntityContainerOrdersById_GET



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

# **EntityContainerPalletizeByIdPOST**
> interface{} EntityContainerPalletizeByIdPOST(ctx, id)
EntityContainerPalletizeById_POST



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

# **EntityContainerUnlockByIdPOST**
> interface{} EntityContainerUnlockByIdPOST(ctx, id)
EntityContainerUnlockById_POST



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

