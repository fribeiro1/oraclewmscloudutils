# \EntitybarcodeTypeDtlApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityBarcodeTypeDtlByIdGET**](EntitybarcodeTypeDtlApi.md#EntityBarcodeTypeDtlByIdGET) | **Get** /entity/barcode_type_dtl/{id} | EntityBarcodeTypeDtlById_GET
[**EntityBarcodeTypeDtlDescribeGET**](EntitybarcodeTypeDtlApi.md#EntityBarcodeTypeDtlDescribeGET) | **Get** /entity/barcode_type_dtl/describe | EntityBarcodeTypeDtlDescribe_GET
[**EntityBarcodeTypeDtlGET**](EntitybarcodeTypeDtlApi.md#EntityBarcodeTypeDtlGET) | **Get** /entity/barcode_type_dtl | EntityBarcodeTypeDtl_GET


# **EntityBarcodeTypeDtlByIdGET**
> interface{} EntityBarcodeTypeDtlByIdGET(ctx, id, optional)
EntityBarcodeTypeDtlById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitybarcodeTypeDtlApiEntityBarcodeTypeDtlByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitybarcodeTypeDtlApiEntityBarcodeTypeDtlByIdGETOpts struct

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

# **EntityBarcodeTypeDtlDescribeGET**
> interface{} EntityBarcodeTypeDtlDescribeGET(ctx, )
EntityBarcodeTypeDtlDescribe_GET



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

# **EntityBarcodeTypeDtlGET**
> interface{} EntityBarcodeTypeDtlGET(ctx, optional)
EntityBarcodeTypeDtl_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitybarcodeTypeDtlApiEntityBarcodeTypeDtlGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitybarcodeTypeDtlApiEntityBarcodeTypeDtlGETOpts struct

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

