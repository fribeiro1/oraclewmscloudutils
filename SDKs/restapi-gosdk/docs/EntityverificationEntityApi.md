# \EntityverificationEntityApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityVerificationEntityByIdGET**](EntityverificationEntityApi.md#EntityVerificationEntityByIdGET) | **Get** /entity/verification_entity/{id} | EntityVerificationEntityById_GET
[**EntityVerificationEntityDescribeGET**](EntityverificationEntityApi.md#EntityVerificationEntityDescribeGET) | **Get** /entity/verification_entity/describe | EntityVerificationEntityDescribe_GET
[**EntityVerificationEntityGET**](EntityverificationEntityApi.md#EntityVerificationEntityGET) | **Get** /entity/verification_entity | EntityVerificationEntity_GET


# **EntityVerificationEntityByIdGET**
> interface{} EntityVerificationEntityByIdGET(ctx, id, optional)
EntityVerificationEntityById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityverificationEntityApiEntityVerificationEntityByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityverificationEntityApiEntityVerificationEntityByIdGETOpts struct

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

# **EntityVerificationEntityDescribeGET**
> interface{} EntityVerificationEntityDescribeGET(ctx, )
EntityVerificationEntityDescribe_GET



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

# **EntityVerificationEntityGET**
> interface{} EntityVerificationEntityGET(ctx, optional)
EntityVerificationEntity_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityverificationEntityApiEntityVerificationEntityGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityverificationEntityApiEntityVerificationEntityGETOpts struct

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

