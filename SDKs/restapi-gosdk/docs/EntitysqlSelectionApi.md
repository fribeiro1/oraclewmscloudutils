# \EntitysqlSelectionApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntitySqlSelectionByIdGET**](EntitysqlSelectionApi.md#EntitySqlSelectionByIdGET) | **Get** /entity/sql_selection/{id} | EntitySqlSelectionById_GET
[**EntitySqlSelectionGET**](EntitysqlSelectionApi.md#EntitySqlSelectionGET) | **Get** /entity/sql_selection | EntitySqlSelection_GET
[**EntitySqlSelectionPOST**](EntitysqlSelectionApi.md#EntitySqlSelectionPOST) | **Post** /entity/sql_selection | EntitySqlSelection_POST


# **EntitySqlSelectionByIdGET**
> interface{} EntitySqlSelectionByIdGET(ctx, id, optional)
EntitySqlSelectionById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitysqlSelectionApiEntitySqlSelectionByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitysqlSelectionApiEntitySqlSelectionByIdGETOpts struct

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

# **EntitySqlSelectionGET**
> interface{} EntitySqlSelectionGET(ctx, )
EntitySqlSelection_GET



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

# **EntitySqlSelectionPOST**
> interface{} EntitySqlSelectionPOST(ctx, )
EntitySqlSelection_POST



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

