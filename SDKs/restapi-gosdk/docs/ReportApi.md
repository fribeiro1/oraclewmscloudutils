# \ReportApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ReportCustomInventorySummaryGET**](ReportApi.md#ReportCustomInventorySummaryGET) | **Get** /report/custom_inventory_summary | ReportCustomInventorySummary_GET


# **ReportCustomInventorySummaryGET**
> interface{} ReportCustomInventorySummaryGET(ctx, itemCode, optional)
ReportCustomInventorySummary_GET



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **itemCode** | **string**|  | 
 **optional** | ***ReportApiReportCustomInventorySummaryGETOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ReportApiReportCustomInventorySummaryGETOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **companyId** | **optional.Float32**|  | 
 **companyIdCode** | **optional.String**|  | 
 **facilityId** | **optional.Float32**|  | 
 **facilityIdCode** | **optional.String**|  | 
 **writeHeaderLineFlg** | **optional.Bool**|  | 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

