# \EntityputawayTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityPutawayTypeByIdGET**](EntityputawayTypeApi.md#EntityPutawayTypeByIdGET) | **Get** /entity/putaway_type/{id} | EntityPutawayTypeById_GET
[**EntityPutawayTypeGET**](EntityputawayTypeApi.md#EntityPutawayTypeGET) | **Get** /entity/putaway_type | EntityPutawayType_GET
[**EntityPutawayTypePOST**](EntityputawayTypeApi.md#EntityPutawayTypePOST) | **Post** /entity/putaway_type | EntityPutawayType_POST


# **EntityPutawayTypeByIdGET**
> interface{} EntityPutawayTypeByIdGET(ctx, id, optional)
EntityPutawayTypeById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityputawayTypeApiEntityPutawayTypeByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityputawayTypeApiEntityPutawayTypeByIdGETOpts struct

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

# **EntityPutawayTypeGET**
> interface{} EntityPutawayTypeGET(ctx, )
EntityPutawayType_GET



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

# **EntityPutawayTypePOST**
> interface{} EntityPutawayTypePOST(ctx, )
EntityPutawayType_POST



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

