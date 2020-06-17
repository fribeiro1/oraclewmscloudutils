# \EntityiblpnApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityIblpnByIdGET**](EntityiblpnApi.md#EntityIblpnByIdGET) | **Get** /entity/iblpn/{id} | EntityIblpnById_GET
[**EntityIblpnByIdPATCH**](EntityiblpnApi.md#EntityIblpnByIdPATCH) | **Patch** /entity/iblpn/{id} | EntityIblpnById_PATCH
[**EntityIblpnCompositeCreatePOST**](EntityiblpnApi.md#EntityIblpnCompositeCreatePOST) | **Post** /entity/iblpn/composite_create | EntityIblpnCompositeCreate_POST
[**EntityIblpnDescribeGET**](EntityiblpnApi.md#EntityIblpnDescribeGET) | **Get** /entity/iblpn/describe | EntityIblpnDescribe_GET
[**EntityIblpnDirectConsumeByIdPOST**](EntityiblpnApi.md#EntityIblpnDirectConsumeByIdPOST) | **Post** /entity/iblpn/{id}/direct_consume | EntityIblpnDirectConsumeById_POST
[**EntityIblpnGET**](EntityiblpnApi.md#EntityIblpnGET) | **Get** /entity/iblpn | EntityIblpn_GET
[**EntityIblpnModifyItemQtyByIdPOST**](EntityiblpnApi.md#EntityIblpnModifyItemQtyByIdPOST) | **Post** /entity/iblpn/{id}/modify_item_qty | EntityIblpnModifyItemQtyById_POST
[**EntityIblpnModifyItemQtyPOST**](EntityiblpnApi.md#EntityIblpnModifyItemQtyPOST) | **Post** /entity/iblpn/modify_item_qty | EntityIblpnModifyItemQty_POST
[**EntityIblpnPOST**](EntityiblpnApi.md#EntityIblpnPOST) | **Post** /entity/iblpn | EntityIblpn_POST


# **EntityIblpnByIdGET**
> interface{} EntityIblpnByIdGET(ctx, id, optional)
EntityIblpnById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityiblpnApiEntityIblpnByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityiblpnApiEntityIblpnByIdGETOpts struct

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

# **EntityIblpnByIdPATCH**
> interface{} EntityIblpnByIdPATCH(ctx, id, optional)
EntityIblpnById_PATCH



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityiblpnApiEntityIblpnByIdPATCHOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityiblpnApiEntityIblpnByIdPATCHOpts struct

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

# **EntityIblpnCompositeCreatePOST**
> interface{} EntityIblpnCompositeCreatePOST(ctx, )
EntityIblpnCompositeCreate_POST



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

# **EntityIblpnDescribeGET**
> interface{} EntityIblpnDescribeGET(ctx, )
EntityIblpnDescribe_GET



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

# **EntityIblpnDirectConsumeByIdPOST**
> interface{} EntityIblpnDirectConsumeByIdPOST(ctx, id)
EntityIblpnDirectConsumeById_POST



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

# **EntityIblpnGET**
> interface{} EntityIblpnGET(ctx, optional)
EntityIblpn_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityiblpnApiEntityIblpnGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityiblpnApiEntityIblpnGETOpts struct

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

# **EntityIblpnModifyItemQtyByIdPOST**
> interface{} EntityIblpnModifyItemQtyByIdPOST(ctx, id)
EntityIblpnModifyItemQtyById_POST



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

# **EntityIblpnModifyItemQtyPOST**
> interface{} EntityIblpnModifyItemQtyPOST(ctx, )
EntityIblpnModifyItemQty_POST



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

# **EntityIblpnPOST**
> interface{} EntityIblpnPOST(ctx, optional)
EntityIblpn_POST



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityiblpnApiEntityIblpnPOSTOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityiblpnApiEntityIblpnPOSTOpts struct

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

