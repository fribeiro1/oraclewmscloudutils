# \EntityputawayTypeCalcRuleApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EntityPutawayTypeCalcRuleByIdGET**](EntityputawayTypeCalcRuleApi.md#EntityPutawayTypeCalcRuleByIdGET) | **Get** /entity/putaway_type_calc_rule/{id} | EntityPutawayTypeCalcRuleById_GET
[**EntityPutawayTypeCalcRuleGET**](EntityputawayTypeCalcRuleApi.md#EntityPutawayTypeCalcRuleGET) | **Get** /entity/putaway_type_calc_rule | EntityPutawayTypeCalcRule_GET
[**EntityPutawayTypeCalcRulePOST**](EntityputawayTypeCalcRuleApi.md#EntityPutawayTypeCalcRulePOST) | **Post** /entity/putaway_type_calc_rule | EntityPutawayTypeCalcRule_POST


# **EntityPutawayTypeCalcRuleByIdGET**
> interface{} EntityPutawayTypeCalcRuleByIdGET(ctx, id, optional)
EntityPutawayTypeCalcRuleById_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **id** | **float32**|  | 
 **optional** | ***EntityputawayTypeCalcRuleApiEntityPutawayTypeCalcRuleByIdGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a EntityputawayTypeCalcRuleApiEntityPutawayTypeCalcRuleByIdGETOpts struct

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

# **EntityPutawayTypeCalcRuleGET**
> interface{} EntityPutawayTypeCalcRuleGET(ctx, )
EntityPutawayTypeCalcRule_GET



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

# **EntityPutawayTypeCalcRulePOST**
> interface{} EntityPutawayTypeCalcRulePOST(ctx, )
EntityPutawayTypeCalcRule_POST



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

