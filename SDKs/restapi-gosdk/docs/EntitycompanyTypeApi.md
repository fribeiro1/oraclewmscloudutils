# \EntitycompanyTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityCompanyTypeByIdGET**](EntitycompanyTypeApi.md#EntityCompanyTypeByIdGET) | **Get** /entity/company_type/{id} | EntityCompanyTypeById_GET
[**EntityCompanyTypeDescribeGET**](EntitycompanyTypeApi.md#EntityCompanyTypeDescribeGET) | **Get** /entity/company_type/describe | EntityCompanyTypeDescribe_GET
[**EntityCompanyTypeGET**](EntitycompanyTypeApi.md#EntityCompanyTypeGET) | **Get** /entity/company_type | EntityCompanyType_GET


# **EntityCompanyTypeByIdGET**
> interface{} EntityCompanyTypeByIdGET(ctx, id, optional)
EntityCompanyTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitycompanyTypeApiEntityCompanyTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycompanyTypeApiEntityCompanyTypeByIdGETOpts struct

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

# **EntityCompanyTypeDescribeGET**
> interface{} EntityCompanyTypeDescribeGET(ctx, )
EntityCompanyTypeDescribe_GET



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

# **EntityCompanyTypeGET**
> interface{} EntityCompanyTypeGET(ctx, optional)
EntityCompanyType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitycompanyTypeApiEntityCompanyTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitycompanyTypeApiEntityCompanyTypeGETOpts struct

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

