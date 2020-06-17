# \EntityitemAssignmentTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityItemAssignmentTypeByIdGET**](EntityitemAssignmentTypeApi.md#EntityItemAssignmentTypeByIdGET) | **Get** /entity/item_assignment_type/{id} | EntityItemAssignmentTypeById_GET
[**EntityItemAssignmentTypeDescribeGET**](EntityitemAssignmentTypeApi.md#EntityItemAssignmentTypeDescribeGET) | **Get** /entity/item_assignment_type/describe | EntityItemAssignmentTypeDescribe_GET
[**EntityItemAssignmentTypeGET**](EntityitemAssignmentTypeApi.md#EntityItemAssignmentTypeGET) | **Get** /entity/item_assignment_type | EntityItemAssignmentType_GET


# **EntityItemAssignmentTypeByIdGET**
> interface{} EntityItemAssignmentTypeByIdGET(ctx, id, optional)
EntityItemAssignmentTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityitemAssignmentTypeApiEntityItemAssignmentTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityitemAssignmentTypeApiEntityItemAssignmentTypeByIdGETOpts struct

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

# **EntityItemAssignmentTypeDescribeGET**
> interface{} EntityItemAssignmentTypeDescribeGET(ctx, )
EntityItemAssignmentTypeDescribe_GET



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

# **EntityItemAssignmentTypeGET**
> interface{} EntityItemAssignmentTypeGET(ctx, optional)
EntityItemAssignmentType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityitemAssignmentTypeApiEntityItemAssignmentTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityitemAssignmentTypeApiEntityItemAssignmentTypeGETOpts struct

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

