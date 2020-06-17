# \EntitymheMsgTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityMheMsgTypeByIdGET**](EntitymheMsgTypeApi.md#EntityMheMsgTypeByIdGET) | **Get** /entity/mhe_msg_type/{id} | EntityMheMsgTypeById_GET
[**EntityMheMsgTypeDescribeGET**](EntitymheMsgTypeApi.md#EntityMheMsgTypeDescribeGET) | **Get** /entity/mhe_msg_type/describe | EntityMheMsgTypeDescribe_GET
[**EntityMheMsgTypeGET**](EntitymheMsgTypeApi.md#EntityMheMsgTypeGET) | **Get** /entity/mhe_msg_type | EntityMheMsgType_GET


# **EntityMheMsgTypeByIdGET**
> interface{} EntityMheMsgTypeByIdGET(ctx, id, optional)
EntityMheMsgTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitymheMsgTypeApiEntityMheMsgTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitymheMsgTypeApiEntityMheMsgTypeByIdGETOpts struct

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

# **EntityMheMsgTypeDescribeGET**
> interface{} EntityMheMsgTypeDescribeGET(ctx, )
EntityMheMsgTypeDescribe_GET



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

# **EntityMheMsgTypeGET**
> interface{} EntityMheMsgTypeGET(ctx, optional)
EntityMheMsgType_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitymheMsgTypeApiEntityMheMsgTypeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitymheMsgTypeApiEntityMheMsgTypeGETOpts struct

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

