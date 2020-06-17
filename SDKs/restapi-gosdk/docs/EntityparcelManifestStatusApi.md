# \EntityparcelManifestStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityParcelManifestStatusByIdGET**](EntityparcelManifestStatusApi.md#EntityParcelManifestStatusByIdGET) | **Get** /entity/parcel_manifest_status/{id} | EntityParcelManifestStatusById_GET
[**EntityParcelManifestStatusDescribeGET**](EntityparcelManifestStatusApi.md#EntityParcelManifestStatusDescribeGET) | **Get** /entity/parcel_manifest_status/describe | EntityParcelManifestStatusDescribe_GET
[**EntityParcelManifestStatusGET**](EntityparcelManifestStatusApi.md#EntityParcelManifestStatusGET) | **Get** /entity/parcel_manifest_status | EntityParcelManifestStatus_GET


# **EntityParcelManifestStatusByIdGET**
> interface{} EntityParcelManifestStatusByIdGET(ctx, id, optional)
EntityParcelManifestStatusById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityparcelManifestStatusApiEntityParcelManifestStatusByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityparcelManifestStatusApiEntityParcelManifestStatusByIdGETOpts struct

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

# **EntityParcelManifestStatusDescribeGET**
> interface{} EntityParcelManifestStatusDescribeGET(ctx, )
EntityParcelManifestStatusDescribe_GET



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

# **EntityParcelManifestStatusGET**
> interface{} EntityParcelManifestStatusGET(ctx, optional)
EntityParcelManifestStatus_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityparcelManifestStatusApiEntityParcelManifestStatusGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityparcelManifestStatusApiEntityParcelManifestStatusGETOpts struct

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

