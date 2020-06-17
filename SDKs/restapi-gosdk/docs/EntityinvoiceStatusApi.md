# \EntityinvoiceStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityInvoiceStatusByIdGET**](EntityinvoiceStatusApi.md#EntityInvoiceStatusByIdGET) | **Get** /entity/invoice_status/{id} | EntityInvoiceStatusById_GET
[**EntityInvoiceStatusDescribeGET**](EntityinvoiceStatusApi.md#EntityInvoiceStatusDescribeGET) | **Get** /entity/invoice_status/describe | EntityInvoiceStatusDescribe_GET
[**EntityInvoiceStatusGET**](EntityinvoiceStatusApi.md#EntityInvoiceStatusGET) | **Get** /entity/invoice_status | EntityInvoiceStatus_GET


# **EntityInvoiceStatusByIdGET**
> interface{} EntityInvoiceStatusByIdGET(ctx, id, optional)
EntityInvoiceStatusById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityinvoiceStatusApiEntityInvoiceStatusByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityinvoiceStatusApiEntityInvoiceStatusByIdGETOpts struct

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

# **EntityInvoiceStatusDescribeGET**
> interface{} EntityInvoiceStatusDescribeGET(ctx, )
EntityInvoiceStatusDescribe_GET



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

# **EntityInvoiceStatusGET**
> interface{} EntityInvoiceStatusGET(ctx, optional)
EntityInvoiceStatus_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityinvoiceStatusApiEntityInvoiceStatusGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityinvoiceStatusApiEntityInvoiceStatusGETOpts struct

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

