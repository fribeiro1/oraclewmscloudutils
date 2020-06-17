# \EntityvasRequirementTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityVasRequirementTypeByIdGET**](EntityvasRequirementTypeApi.md#EntityVasRequirementTypeByIdGET) | **Get** /entity/vas_requirement_type/{id} | EntityVasRequirementTypeById_GET
[**EntityVasRequirementTypeDescribeGET**](EntityvasRequirementTypeApi.md#EntityVasRequirementTypeDescribeGET) | **Get** /entity/vas_requirement_type/describe | EntityVasRequirementTypeDescribe_GET
[**EntityVasRequirementTypeGET**](EntityvasRequirementTypeApi.md#EntityVasRequirementTypeGET) | **Get** /entity/vas_requirement_type | EntityVasRequirementType_GET


# **EntityVasRequirementTypeByIdGET**
> interface{} EntityVasRequirementTypeByIdGET(ctx, id, optional)
EntityVasRequirementTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityvasRequirementTypeApiEntityVasRequirementTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityvasRequirementTypeApiEntityVasRequirementTypeByIdGETOpts struct

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

# **EntityVasRequirementTypeDescribeGET**
> interface{} EntityVasRequirementTypeDescribeGET(ctx, )
EntityVasRequirementTypeDescribe_GET



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

# **EntityVasRequirementTypeGET**
> interface{} EntityVasRequirementTypeGET(ctx, optional)
EntityVasRequirementType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityvasRequirementTypeApiEntityVasRequirementTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityvasRequirementTypeApiEntityVasRequirementTypeGETOpts struct

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

