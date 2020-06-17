# RestApi.PickPackApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pickPackCloseLpnPOST**](PickPackApi.md#pickPackCloseLpnPOST) | **POST** /pick_pack/close_lpn | PickPackCloseLpn_POST
[**pickPackPickConfirmPOST**](PickPackApi.md#pickPackPickConfirmPOST) | **POST** /pick_pack/pick_confirm | PickPackPickConfirm_POST
[**pickPackWaveCompletePOST**](PickPackApi.md#pickPackWaveCompletePOST) | **POST** /pick_pack/wave_complete | PickPackWaveComplete_POST


<a name="pickPackCloseLpnPOST"></a>
# **pickPackCloseLpnPOST**
> Object pickPackCloseLpnPOST(toContainerNbr, opts)

PickPackCloseLpn_POST



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

var apiInstance = new RestApi.PickPackApi();

var toContainerNbr = "toContainerNbr_example"; // String | 

var opts = { 
  'asyncFlg': true, // Boolean | 
  'closeContainerStatus': "closeContainerStatus_example", // String | 
  'companyId': 8.14, // Number | 
  'companyIdCode': "companyIdCode_example", // String | 
  'facilityId': 8.14, // Number | 
  'facilityIdCode': "facilityIdCode_example", // String | 
  'reasonCode': "reasonCode_example", // String | 
  'shortOnCloseFlg': true, // Boolean | 
  'updateInventoryOnShortFlg': true, // Boolean | 
  'toContainerCode': "toContainerCode_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.pickPackCloseLpnPOST(toContainerNbr, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **toContainerNbr** | **String**|  | 
 **asyncFlg** | **Boolean**|  | [optional] 
 **closeContainerStatus** | **String**|  | [optional] 
 **companyId** | **Number**|  | [optional] 
 **companyIdCode** | **String**|  | [optional] 
 **facilityId** | **Number**|  | [optional] 
 **facilityIdCode** | **String**|  | [optional] 
 **reasonCode** | **String**|  | [optional] 
 **shortOnCloseFlg** | **Boolean**|  | [optional] 
 **updateInventoryOnShortFlg** | **Boolean**|  | [optional] 
 **toContainerCode** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="pickPackPickConfirmPOST"></a>
# **pickPackPickConfirmPOST**
> Object pickPackPickConfirmPOST(asyncFlg, mheModeFlg, orderNbr, waveNbr, opts)

PickPackPickConfirm_POST



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

var apiInstance = new RestApi.PickPackApi();

var asyncFlg = true; // Boolean | 

var mheModeFlg = true; // Boolean | 

var orderNbr = "orderNbr_example"; // String | 

var waveNbr = "waveNbr_example"; // String | 

var opts = { 
  'allocationUom': "allocationUom_example", // String | 
  'batchNbr': "batchNbr_example", // String | 
  'closeContainerStatus': "closeContainerStatus_example", // String | 
  'companyId': 8.14, // Number | 
  'companyIdCode': "companyIdCode_example", // String | 
  'facilityId': 8.14, // Number | 
  'facilityIdCode': "facilityIdCode_example", // String | 
  'fromContainerNbr': "fromContainerNbr_example", // String | 
  'itemAlternateCode': "itemAlternateCode_example", // String | 
  'itemBarcode': "itemBarcode_example", // String | 
  'mheSystemCode': "mheSystemCode_example", // String | 
  'pickLocation': "pickLocation_example", // String | 
  'qty': 8.14, // Number | 
  'reasonCode': "reasonCode_example", // String | 
  'shortFlg': true, // Boolean | 
  'shortOnCloseFlg': true, // Boolean | 
  'toContainerNbr': "toContainerNbr_example", // String | 
  'uomQty': "uomQty_example", // String | 
  'updateInventoryOnShortFlg': true // Boolean | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.pickPackPickConfirmPOST(asyncFlg, mheModeFlg, orderNbr, waveNbr, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asyncFlg** | **Boolean**|  | 
 **mheModeFlg** | **Boolean**|  | 
 **orderNbr** | **String**|  | 
 **waveNbr** | **String**|  | 
 **allocationUom** | **String**|  | [optional] 
 **batchNbr** | **String**|  | [optional] 
 **closeContainerStatus** | **String**|  | [optional] 
 **companyId** | **Number**|  | [optional] 
 **companyIdCode** | **String**|  | [optional] 
 **facilityId** | **Number**|  | [optional] 
 **facilityIdCode** | **String**|  | [optional] 
 **fromContainerNbr** | **String**|  | [optional] 
 **itemAlternateCode** | **String**|  | [optional] 
 **itemBarcode** | **String**|  | [optional] 
 **mheSystemCode** | **String**|  | [optional] 
 **pickLocation** | **String**|  | [optional] 
 **qty** | **Number**|  | [optional] 
 **reasonCode** | **String**|  | [optional] 
 **shortFlg** | **Boolean**|  | [optional] 
 **shortOnCloseFlg** | **Boolean**|  | [optional] 
 **toContainerNbr** | **String**|  | [optional] 
 **uomQty** | **String**|  | [optional] 
 **updateInventoryOnShortFlg** | **Boolean**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="pickPackWaveCompletePOST"></a>
# **pickPackWaveCompletePOST**
> Object pickPackWaveCompletePOST(waveNbr, opts)

PickPackWaveComplete_POST



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

var apiInstance = new RestApi.PickPackApi();

var waveNbr = "waveNbr_example"; // String | 

var opts = { 
  'asyncFlg': true, // Boolean | 
  'closeContainerStatus': "closeContainerStatus_example", // String | 
  'companyId': 8.14, // Number | 
  'companyIdCode': "companyIdCode_example", // String | 
  'facilityId': 8.14, // Number | 
  'facilityIdCode': "facilityIdCode_example", // String | 
  'mheSystemCode': "mheSystemCode_example", // String | 
  'reasonCode': "reasonCode_example", // String | 
  'updateInventoryOnShortFlg': true // Boolean | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.pickPackWaveCompletePOST(waveNbr, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **waveNbr** | **String**|  | 
 **asyncFlg** | **Boolean**|  | [optional] 
 **closeContainerStatus** | **String**|  | [optional] 
 **companyId** | **Number**|  | [optional] 
 **companyIdCode** | **String**|  | [optional] 
 **facilityId** | **Number**|  | [optional] 
 **facilityIdCode** | **String**|  | [optional] 
 **mheSystemCode** | **String**|  | [optional] 
 **reasonCode** | **String**|  | [optional] 
 **updateInventoryOnShortFlg** | **Boolean**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

