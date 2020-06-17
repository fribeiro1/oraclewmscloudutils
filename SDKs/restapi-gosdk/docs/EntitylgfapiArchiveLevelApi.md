# \EntitylgfapiArchiveLevelApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityLgfapiArchiveLevelByIdGET**](EntitylgfapiArchiveLevelApi.md#EntityLgfapiArchiveLevelByIdGET) | **Get** /entity/lgfapi_archive_level/{id} | EntityLgfapiArchiveLevelById_GET
[**EntityLgfapiArchiveLevelDescribeGET**](EntitylgfapiArchiveLevelApi.md#EntityLgfapiArchiveLevelDescribeGET) | **Get** /entity/lgfapi_archive_level/describe | EntityLgfapiArchiveLevelDescribe_GET
[**EntityLgfapiArchiveLevelGET**](EntitylgfapiArchiveLevelApi.md#EntityLgfapiArchiveLevelGET) | **Get** /entity/lgfapi_archive_level | EntityLgfapiArchiveLevel_GET


# **EntityLgfapiArchiveLevelByIdGET**
> interface{} EntityLgfapiArchiveLevelByIdGET(ctx, id, optional)
EntityLgfapiArchiveLevelById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitylgfapiArchiveLevelApiEntityLgfapiArchiveLevelByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitylgfapiArchiveLevelApiEntityLgfapiArchiveLevelByIdGETOpts struct

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

# **EntityLgfapiArchiveLevelDescribeGET**
> interface{} EntityLgfapiArchiveLevelDescribeGET(ctx, )
EntityLgfapiArchiveLevelDescribe_GET



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

# **EntityLgfapiArchiveLevelGET**
> interface{} EntityLgfapiArchiveLevelGET(ctx, optional)
EntityLgfapiArchiveLevel_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitylgfapiArchiveLevelApiEntityLgfapiArchiveLevelGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitylgfapiArchiveLevelApiEntityLgfapiArchiveLevelGETOpts struct

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

