# ReportApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportCustomInventorySummaryGET**](ReportApi.md#reportCustomInventorySummaryGET) | **GET** /report/custom_inventory_summary | ReportCustomInventorySummary_GET


<a name="reportCustomInventorySummaryGET"></a>
# **reportCustomInventorySummaryGET**
> Object reportCustomInventorySummaryGET(itemCode, companyId, companyIdCode, facilityId, facilityIdCode, writeHeaderLineFlg)

ReportCustomInventorySummary_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ReportApi apiInstance = new ReportApi();
String itemCode = "itemCode_example"; // String | 
BigDecimal companyId = new BigDecimal(); // BigDecimal | 
String companyIdCode = "companyIdCode_example"; // String | 
BigDecimal facilityId = new BigDecimal(); // BigDecimal | 
String facilityIdCode = "facilityIdCode_example"; // String | 
Boolean writeHeaderLineFlg = true; // Boolean | 
try {
    Object result = apiInstance.reportCustomInventorySummaryGET(itemCode, companyId, companyIdCode, facilityId, facilityIdCode, writeHeaderLineFlg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#reportCustomInventorySummaryGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemCode** | **String**|  |
 **companyId** | **BigDecimal**|  | [optional]
 **companyIdCode** | **String**|  | [optional]
 **facilityId** | **BigDecimal**|  | [optional]
 **facilityIdCode** | **String**|  | [optional]
 **writeHeaderLineFlg** | **Boolean**|  | [optional]

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

