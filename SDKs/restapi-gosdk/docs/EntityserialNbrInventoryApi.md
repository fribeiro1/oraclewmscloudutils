# \EntityserialNbrInventoryApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntitySerialNbrInventoryByIdGET**](EntityserialNbrInventoryApi.md#EntitySerialNbrInventoryByIdGET) | **Get** /entity/serial_nbr_inventory/{id} | EntitySerialNbrInventoryById_GET
[**EntitySerialNbrInventoryDescribeGET**](EntityserialNbrInventoryApi.md#EntitySerialNbrInventoryDescribeGET) | **Get** /entity/serial_nbr_inventory/describe | EntitySerialNbrInventoryDescribe_GET
[**EntitySerialNbrInventoryGET**](EntityserialNbrInventoryApi.md#EntitySerialNbrInventoryGET) | **Get** /entity/serial_nbr_inventory | EntitySerialNbrInventory_GET


# **EntitySerialNbrInventoryByIdGET**
> interface{} EntitySerialNbrInventoryByIdGET(ctx, id, optional)
EntitySerialNbrInventoryById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityserialNbrInventoryApiEntitySerialNbrInventoryByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityserialNbrInventoryApiEntitySerialNbrInventoryByIdGETOpts struct

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

# **EntitySerialNbrInventoryDescribeGET**
> interface{} EntitySerialNbrInventoryDescribeGET(ctx, )
EntitySerialNbrInventoryDescribe_GET



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

# **EntitySerialNbrInventoryGET**
> interface{} EntitySerialNbrInventoryGET(ctx, optional)
EntitySerialNbrInventory_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityserialNbrInventoryApiEntitySerialNbrInventoryGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityserialNbrInventoryApiEntitySerialNbrInventoryGETOpts struct

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

