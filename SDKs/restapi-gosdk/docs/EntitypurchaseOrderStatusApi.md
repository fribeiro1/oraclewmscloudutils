# \EntitypurchaseOrderStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityPurchaseOrderStatusByIdGET**](EntitypurchaseOrderStatusApi.md#EntityPurchaseOrderStatusByIdGET) | **Get** /entity/purchase_order_status/{id} | EntityPurchaseOrderStatusById_GET
[**EntityPurchaseOrderStatusDescribeGET**](EntitypurchaseOrderStatusApi.md#EntityPurchaseOrderStatusDescribeGET) | **Get** /entity/purchase_order_status/describe | EntityPurchaseOrderStatusDescribe_GET
[**EntityPurchaseOrderStatusGET**](EntitypurchaseOrderStatusApi.md#EntityPurchaseOrderStatusGET) | **Get** /entity/purchase_order_status | EntityPurchaseOrderStatus_GET


# **EntityPurchaseOrderStatusByIdGET**
> interface{} EntityPurchaseOrderStatusByIdGET(ctx, id, optional)
EntityPurchaseOrderStatusById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitypurchaseOrderStatusApiEntityPurchaseOrderStatusByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitypurchaseOrderStatusApiEntityPurchaseOrderStatusByIdGETOpts struct

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

# **EntityPurchaseOrderStatusDescribeGET**
> interface{} EntityPurchaseOrderStatusDescribeGET(ctx, )
EntityPurchaseOrderStatusDescribe_GET



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

# **EntityPurchaseOrderStatusGET**
> interface{} EntityPurchaseOrderStatusGET(ctx, optional)
EntityPurchaseOrderStatus_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitypurchaseOrderStatusApiEntityPurchaseOrderStatusGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitypurchaseOrderStatusApiEntityPurchaseOrderStatusGETOpts struct

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

