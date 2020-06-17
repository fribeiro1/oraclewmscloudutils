# RestApi.ReportApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportCustomInventorySummaryGET**](ReportApi.md#reportCustomInventorySummaryGET) | **GET** /report/custom_inventory_summary | ReportCustomInventorySummary_GET


<a name="reportCustomInventorySummaryGET"></a>
# **reportCustomInventorySummaryGET**
> Object reportCustomInventorySummaryGET(itemCode, opts)

ReportCustomInventorySummary_GET



### Example
```javascript
var RestApi = require('rest_api');
var defaultClient = RestApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new RestApi.ReportApi();

var itemCode = "itemCode_example"; // String | 

var opts = { 
  'companyId': 8.14, // Number | 
  'companyIdCode': "companyIdCode_example", // String | 
  'facilityId': 8.14, // Number | 
  'facilityIdCode': "facilityIdCode_example", // String | 
  'writeHeaderLineFlg': true // Boolean | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.reportCustomInventorySummaryGET(itemCode, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemCode** | **String**|  | 
 **companyId** | **Number**|  | [optional] 
 **companyIdCode** | **String**|  | [optional] 
 **facilityId** | **Number**|  | [optional] 
 **facilityIdCode** | **String**|  | [optional] 
 **writeHeaderLineFlg** | **Boolean**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

