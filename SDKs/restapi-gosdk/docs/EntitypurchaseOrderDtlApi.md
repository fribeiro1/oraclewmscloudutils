# \EntitypurchaseOrderDtlApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityPurchaseOrderDtlByIdGET**](EntitypurchaseOrderDtlApi.md#EntityPurchaseOrderDtlByIdGET) | **Get** /entity/purchase_order_dtl/{id} | EntityPurchaseOrderDtlById_GET
[**EntityPurchaseOrderDtlByIdPATCH**](EntitypurchaseOrderDtlApi.md#EntityPurchaseOrderDtlByIdPATCH) | **Patch** /entity/purchase_order_dtl/{id} | EntityPurchaseOrderDtlById_PATCH
[**EntityPurchaseOrderDtlDescribeGET**](EntitypurchaseOrderDtlApi.md#EntityPurchaseOrderDtlDescribeGET) | **Get** /entity/purchase_order_dtl/describe | EntityPurchaseOrderDtlDescribe_GET
[**EntityPurchaseOrderDtlGET**](EntitypurchaseOrderDtlApi.md#EntityPurchaseOrderDtlGET) | **Get** /entity/purchase_order_dtl | EntityPurchaseOrderDtl_GET


# **EntityPurchaseOrderDtlByIdGET**
> interface{} EntityPurchaseOrderDtlByIdGET(ctx, id, optional)
EntityPurchaseOrderDtlById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitypurchaseOrderDtlApiEntityPurchaseOrderDtlByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitypurchaseOrderDtlApiEntityPurchaseOrderDtlByIdGETOpts struct

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

# **EntityPurchaseOrderDtlByIdPATCH**
> interface{} EntityPurchaseOrderDtlByIdPATCH(ctx, id, optional)
EntityPurchaseOrderDtlById_PATCH



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitypurchaseOrderDtlApiEntityPurchaseOrderDtlByIdPATCHOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitypurchaseOrderDtlApiEntityPurchaseOrderDtlByIdPATCHOpts struct

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

# **EntityPurchaseOrderDtlDescribeGET**
> interface{} EntityPurchaseOrderDtlDescribeGET(ctx, )
EntityPurchaseOrderDtlDescribe_GET



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

# **EntityPurchaseOrderDtlGET**
> interface{} EntityPurchaseOrderDtlGET(ctx, optional)
EntityPurchaseOrderDtl_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitypurchaseOrderDtlApiEntityPurchaseOrderDtlGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitypurchaseOrderDtlApiEntityPurchaseOrderDtlGETOpts struct

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

