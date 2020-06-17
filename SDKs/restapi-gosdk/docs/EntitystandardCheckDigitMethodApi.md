# \EntitystandardCheckDigitMethodApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityStandardCheckDigitMethodByIdGET**](EntitystandardCheckDigitMethodApi.md#EntityStandardCheckDigitMethodByIdGET) | **Get** /entity/standard_check_digit_method/{id} | EntityStandardCheckDigitMethodById_GET
[**EntityStandardCheckDigitMethodDescribeGET**](EntitystandardCheckDigitMethodApi.md#EntityStandardCheckDigitMethodDescribeGET) | **Get** /entity/standard_check_digit_method/describe | EntityStandardCheckDigitMethodDescribe_GET
[**EntityStandardCheckDigitMethodGET**](EntitystandardCheckDigitMethodApi.md#EntityStandardCheckDigitMethodGET) | **Get** /entity/standard_check_digit_method | EntityStandardCheckDigitMethod_GET


# **EntityStandardCheckDigitMethodByIdGET**
> interface{} EntityStandardCheckDigitMethodByIdGET(ctx, id, optional)
EntityStandardCheckDigitMethodById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitystandardCheckDigitMethodApiEntityStandardCheckDigitMethodByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitystandardCheckDigitMethodApiEntityStandardCheckDigitMethodByIdGETOpts struct

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

# **EntityStandardCheckDigitMethodDescribeGET**
> interface{} EntityStandardCheckDigitMethodDescribeGET(ctx, )
EntityStandardCheckDigitMethodDescribe_GET



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

# **EntityStandardCheckDigitMethodGET**
> interface{} EntityStandardCheckDigitMethodGET(ctx, optional)
EntityStandardCheckDigitMethod_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitystandardCheckDigitMethodApiEntityStandardCheckDigitMethodGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitystandardCheckDigitMethodApiEntityStandardCheckDigitMethodGETOpts struct

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

