# \EntityinventoryAttributeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityInventoryAttributeByIdGET**](EntityinventoryAttributeApi.md#EntityInventoryAttributeByIdGET) | **Get** /entity/inventory_attribute/{id} | EntityInventoryAttributeById_GET
[**EntityInventoryAttributeDescribeGET**](EntityinventoryAttributeApi.md#EntityInventoryAttributeDescribeGET) | **Get** /entity/inventory_attribute/describe | EntityInventoryAttributeDescribe_GET
[**EntityInventoryAttributeGET**](EntityinventoryAttributeApi.md#EntityInventoryAttributeGET) | **Get** /entity/inventory_attribute | EntityInventoryAttribute_GET
[**EntityInventoryAttributePOST**](EntityinventoryAttributeApi.md#EntityInventoryAttributePOST) | **Post** /entity/inventory_attribute | EntityInventoryAttribute_POST


# **EntityInventoryAttributeByIdGET**
> interface{} EntityInventoryAttributeByIdGET(ctx, id, optional)
EntityInventoryAttributeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityinventoryAttributeApiEntityInventoryAttributeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityinventoryAttributeApiEntityInventoryAttributeByIdGETOpts struct

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

# **EntityInventoryAttributeDescribeGET**
> interface{} EntityInventoryAttributeDescribeGET(ctx, )
EntityInventoryAttributeDescribe_GET



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

# **EntityInventoryAttributeGET**
> interface{} EntityInventoryAttributeGET(ctx, optional)
EntityInventoryAttribute_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityinventoryAttributeApiEntityInventoryAttributeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityinventoryAttributeApiEntityInventoryAttributeGETOpts struct

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

# **EntityInventoryAttributePOST**
> interface{} EntityInventoryAttributePOST(ctx, optional)
EntityInventoryAttribute_POST



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityinventoryAttributeApiEntityInventoryAttributePOSTOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityinventoryAttributeApiEntityInventoryAttributePOSTOpts struct

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

