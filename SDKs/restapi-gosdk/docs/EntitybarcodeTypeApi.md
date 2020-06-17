# \EntitybarcodeTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityBarcodeTypeByIdGET**](EntitybarcodeTypeApi.md#EntityBarcodeTypeByIdGET) | **Get** /entity/barcode_type/{id} | EntityBarcodeTypeById_GET
[**EntityBarcodeTypeDescribeGET**](EntitybarcodeTypeApi.md#EntityBarcodeTypeDescribeGET) | **Get** /entity/barcode_type/describe | EntityBarcodeTypeDescribe_GET
[**EntityBarcodeTypeGET**](EntitybarcodeTypeApi.md#EntityBarcodeTypeGET) | **Get** /entity/barcode_type | EntityBarcodeType_GET


# **EntityBarcodeTypeByIdGET**
> interface{} EntityBarcodeTypeByIdGET(ctx, id, optional)
EntityBarcodeTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitybarcodeTypeApiEntityBarcodeTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitybarcodeTypeApiEntityBarcodeTypeByIdGETOpts struct

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

# **EntityBarcodeTypeDescribeGET**
> interface{} EntityBarcodeTypeDescribeGET(ctx, )
EntityBarcodeTypeDescribe_GET



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

# **EntityBarcodeTypeGET**
> interface{} EntityBarcodeTypeGET(ctx, optional)
EntityBarcodeType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitybarcodeTypeApiEntityBarcodeTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitybarcodeTypeApiEntityBarcodeTypeGETOpts struct

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

