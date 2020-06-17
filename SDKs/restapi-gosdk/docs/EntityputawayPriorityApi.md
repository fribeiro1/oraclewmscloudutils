# \EntityputawayPriorityApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityPutawayPriorityByIdGET**](EntityputawayPriorityApi.md#EntityPutawayPriorityByIdGET) | **Get** /entity/putaway_priority/{id} | EntityPutawayPriorityById_GET
[**EntityPutawayPriorityGET**](EntityputawayPriorityApi.md#EntityPutawayPriorityGET) | **Get** /entity/putaway_priority | EntityPutawayPriority_GET
[**EntityPutawayPriorityPOST**](EntityputawayPriorityApi.md#EntityPutawayPriorityPOST) | **Post** /entity/putaway_priority | EntityPutawayPriority_POST


# **EntityPutawayPriorityByIdGET**
> interface{} EntityPutawayPriorityByIdGET(ctx, id, optional)
EntityPutawayPriorityById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityputawayPriorityApiEntityPutawayPriorityByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityputawayPriorityApiEntityPutawayPriorityByIdGETOpts struct

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

# **EntityPutawayPriorityGET**
> interface{} EntityPutawayPriorityGET(ctx, )
EntityPutawayPriority_GET



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

# **EntityPutawayPriorityPOST**
> interface{} EntityPutawayPriorityPOST(ctx, )
EntityPutawayPriority_POST



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

