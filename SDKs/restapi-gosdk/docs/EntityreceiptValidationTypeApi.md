# \EntityreceiptValidationTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityReceiptValidationTypeByIdGET**](EntityreceiptValidationTypeApi.md#EntityReceiptValidationTypeByIdGET) | **Get** /entity/receipt_validation_type/{id} | EntityReceiptValidationTypeById_GET
[**EntityReceiptValidationTypeDescribeGET**](EntityreceiptValidationTypeApi.md#EntityReceiptValidationTypeDescribeGET) | **Get** /entity/receipt_validation_type/describe | EntityReceiptValidationTypeDescribe_GET
[**EntityReceiptValidationTypeGET**](EntityreceiptValidationTypeApi.md#EntityReceiptValidationTypeGET) | **Get** /entity/receipt_validation_type | EntityReceiptValidationType_GET


# **EntityReceiptValidationTypeByIdGET**
> interface{} EntityReceiptValidationTypeByIdGET(ctx, id, optional)
EntityReceiptValidationTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityreceiptValidationTypeApiEntityReceiptValidationTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityreceiptValidationTypeApiEntityReceiptValidationTypeByIdGETOpts struct

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

# **EntityReceiptValidationTypeDescribeGET**
> interface{} EntityReceiptValidationTypeDescribeGET(ctx, )
EntityReceiptValidationTypeDescribe_GET



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

# **EntityReceiptValidationTypeGET**
> interface{} EntityReceiptValidationTypeGET(ctx, optional)
EntityReceiptValidationType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityreceiptValidationTypeApiEntityReceiptValidationTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityreceiptValidationTypeApiEntityReceiptValidationTypeGETOpts struct

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

