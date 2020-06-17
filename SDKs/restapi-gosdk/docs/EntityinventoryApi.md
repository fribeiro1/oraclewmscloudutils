# \EntityinventoryApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityInventoryBulkUpdateInventoryAttributesPOST**](EntityinventoryApi.md#EntityInventoryBulkUpdateInventoryAttributesPOST) | **Post** /entity/inventory/bulk_update_inventory_attributes | EntityInventoryBulkUpdateInventoryAttributes_POST
[**EntityInventoryByIdGET**](EntityinventoryApi.md#EntityInventoryByIdGET) | **Get** /entity/inventory/{id} | EntityInventoryById_GET
[**EntityInventoryDescribeGET**](EntityinventoryApi.md#EntityInventoryDescribeGET) | **Get** /entity/inventory/describe | EntityInventoryDescribe_GET
[**EntityInventoryGET**](EntityinventoryApi.md#EntityInventoryGET) | **Get** /entity/inventory | EntityInventory_GET
[**EntityInventoryLinkSerialNbrsByIdPOST**](EntityinventoryApi.md#EntityInventoryLinkSerialNbrsByIdPOST) | **Post** /entity/inventory/{id}/link_serial_nbrs | EntityInventoryLinkSerialNbrsById_POST
[**EntityInventoryPOST**](EntityinventoryApi.md#EntityInventoryPOST) | **Post** /entity/inventory | EntityInventory_POST


# **EntityInventoryBulkUpdateInventoryAttributesPOST**
> interface{} EntityInventoryBulkUpdateInventoryAttributesPOST(ctx, )
EntityInventoryBulkUpdateInventoryAttributes_POST



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

# **EntityInventoryByIdGET**
> interface{} EntityInventoryByIdGET(ctx, id, optional)
EntityInventoryById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityinventoryApiEntityInventoryByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityinventoryApiEntityInventoryByIdGETOpts struct

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

# **EntityInventoryDescribeGET**
> interface{} EntityInventoryDescribeGET(ctx, )
EntityInventoryDescribe_GET



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

# **EntityInventoryGET**
> interface{} EntityInventoryGET(ctx, optional)
EntityInventory_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityinventoryApiEntityInventoryGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityinventoryApiEntityInventoryGETOpts struct

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

# **EntityInventoryLinkSerialNbrsByIdPOST**
> interface{} EntityInventoryLinkSerialNbrsByIdPOST(ctx, id)
EntityInventoryLinkSerialNbrsById_POST



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

# **EntityInventoryPOST**
> interface{} EntityInventoryPOST(ctx, optional)
EntityInventory_POST



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityinventoryApiEntityInventoryPOSTOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityinventoryApiEntityInventoryPOSTOpts struct

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

