# \EntitypurchaseOrderHdrApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityPurchaseOrderHdrByIdGET**](EntitypurchaseOrderHdrApi.md#EntityPurchaseOrderHdrByIdGET) | **Get** /entity/purchase_order_hdr/{id} | EntityPurchaseOrderHdrById_GET
[**EntityPurchaseOrderHdrByIdPATCH**](EntitypurchaseOrderHdrApi.md#EntityPurchaseOrderHdrByIdPATCH) | **Patch** /entity/purchase_order_hdr/{id} | EntityPurchaseOrderHdrById_PATCH
[**EntityPurchaseOrderHdrDescribeGET**](EntitypurchaseOrderHdrApi.md#EntityPurchaseOrderHdrDescribeGET) | **Get** /entity/purchase_order_hdr/describe | EntityPurchaseOrderHdrDescribe_GET
[**EntityPurchaseOrderHdrGET**](EntitypurchaseOrderHdrApi.md#EntityPurchaseOrderHdrGET) | **Get** /entity/purchase_order_hdr | EntityPurchaseOrderHdr_GET


# **EntityPurchaseOrderHdrByIdGET**
> interface{} EntityPurchaseOrderHdrByIdGET(ctx, id, optional)
EntityPurchaseOrderHdrById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitypurchaseOrderHdrApiEntityPurchaseOrderHdrByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitypurchaseOrderHdrApiEntityPurchaseOrderHdrByIdGETOpts struct

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

# **EntityPurchaseOrderHdrByIdPATCH**
> interface{} EntityPurchaseOrderHdrByIdPATCH(ctx, id, optional)
EntityPurchaseOrderHdrById_PATCH



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitypurchaseOrderHdrApiEntityPurchaseOrderHdrByIdPATCHOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitypurchaseOrderHdrApiEntityPurchaseOrderHdrByIdPATCHOpts struct

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

# **EntityPurchaseOrderHdrDescribeGET**
> interface{} EntityPurchaseOrderHdrDescribeGET(ctx, )
EntityPurchaseOrderHdrDescribe_GET



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

# **EntityPurchaseOrderHdrGET**
> interface{} EntityPurchaseOrderHdrGET(ctx, optional)
EntityPurchaseOrderHdr_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitypurchaseOrderHdrApiEntityPurchaseOrderHdrGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitypurchaseOrderHdrApiEntityPurchaseOrderHdrGETOpts struct

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

