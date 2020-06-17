# \EntityputawaySearchModeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityPutawaySearchModeByIdGET**](EntityputawaySearchModeApi.md#EntityPutawaySearchModeByIdGET) | **Get** /entity/putaway_search_mode/{id} | EntityPutawaySearchModeById_GET
[**EntityPutawaySearchModeDescribeGET**](EntityputawaySearchModeApi.md#EntityPutawaySearchModeDescribeGET) | **Get** /entity/putaway_search_mode/describe | EntityPutawaySearchModeDescribe_GET
[**EntityPutawaySearchModeGET**](EntityputawaySearchModeApi.md#EntityPutawaySearchModeGET) | **Get** /entity/putaway_search_mode | EntityPutawaySearchMode_GET


# **EntityPutawaySearchModeByIdGET**
> interface{} EntityPutawaySearchModeByIdGET(ctx, id, optional)
EntityPutawaySearchModeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityputawaySearchModeApiEntityPutawaySearchModeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityputawaySearchModeApiEntityPutawaySearchModeByIdGETOpts struct

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

# **EntityPutawaySearchModeDescribeGET**
> interface{} EntityPutawaySearchModeDescribeGET(ctx, )
EntityPutawaySearchModeDescribe_GET



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

# **EntityPutawaySearchModeGET**
> interface{} EntityPutawaySearchModeGET(ctx, optional)
EntityPutawaySearchMode_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntityputawaySearchModeApiEntityPutawaySearchModeGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityputawaySearchModeApiEntityPutawaySearchModeGETOpts struct

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

