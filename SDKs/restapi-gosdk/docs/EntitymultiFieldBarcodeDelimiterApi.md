# \EntitymultiFieldBarcodeDelimiterApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityMultiFieldBarcodeDelimiterByIdGET**](EntitymultiFieldBarcodeDelimiterApi.md#EntityMultiFieldBarcodeDelimiterByIdGET) | **Get** /entity/multi_field_barcode_delimiter/{id} | EntityMultiFieldBarcodeDelimiterById_GET
[**EntityMultiFieldBarcodeDelimiterDescribeGET**](EntitymultiFieldBarcodeDelimiterApi.md#EntityMultiFieldBarcodeDelimiterDescribeGET) | **Get** /entity/multi_field_barcode_delimiter/describe | EntityMultiFieldBarcodeDelimiterDescribe_GET
[**EntityMultiFieldBarcodeDelimiterGET**](EntitymultiFieldBarcodeDelimiterApi.md#EntityMultiFieldBarcodeDelimiterGET) | **Get** /entity/multi_field_barcode_delimiter | EntityMultiFieldBarcodeDelimiter_GET


# **EntityMultiFieldBarcodeDelimiterByIdGET**
> interface{} EntityMultiFieldBarcodeDelimiterByIdGET(ctx, id, optional)
EntityMultiFieldBarcodeDelimiterById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitymultiFieldBarcodeDelimiterApiEntityMultiFieldBarcodeDelimiterByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitymultiFieldBarcodeDelimiterApiEntityMultiFieldBarcodeDelimiterByIdGETOpts struct

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

# **EntityMultiFieldBarcodeDelimiterDescribeGET**
> interface{} EntityMultiFieldBarcodeDelimiterDescribeGET(ctx, )
EntityMultiFieldBarcodeDelimiterDescribe_GET



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

# **EntityMultiFieldBarcodeDelimiterGET**
> interface{} EntityMultiFieldBarcodeDelimiterGET(ctx, optional)
EntityMultiFieldBarcodeDelimiter_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitymultiFieldBarcodeDelimiterApiEntityMultiFieldBarcodeDelimiterGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitymultiFieldBarcodeDelimiterApiEntityMultiFieldBarcodeDelimiterGETOpts struct

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

