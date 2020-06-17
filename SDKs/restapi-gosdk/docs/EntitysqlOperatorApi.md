# \EntitysqlOperatorApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntitySqlOperatorByIdGET**](EntitysqlOperatorApi.md#EntitySqlOperatorByIdGET) | **Get** /entity/sql_operator/{id} | EntitySqlOperatorById_GET
[**EntitySqlOperatorDescribeGET**](EntitysqlOperatorApi.md#EntitySqlOperatorDescribeGET) | **Get** /entity/sql_operator/describe | EntitySqlOperatorDescribe_GET
[**EntitySqlOperatorGET**](EntitysqlOperatorApi.md#EntitySqlOperatorGET) | **Get** /entity/sql_operator | EntitySqlOperator_GET


# **EntitySqlOperatorByIdGET**
> interface{} EntitySqlOperatorByIdGET(ctx, id, optional)
EntitySqlOperatorById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntitysqlOperatorApiEntitySqlOperatorByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitysqlOperatorApiEntitySqlOperatorByIdGETOpts struct

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

# **EntitySqlOperatorDescribeGET**
> interface{} EntitySqlOperatorDescribeGET(ctx, )
EntitySqlOperatorDescribe_GET



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

# **EntitySqlOperatorGET**
> interface{} EntitySqlOperatorGET(ctx, optional)
EntitySqlOperator_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***EntitysqlOperatorApiEntitySqlOperatorGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntitysqlOperatorApiEntitySqlOperatorGETOpts struct

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

