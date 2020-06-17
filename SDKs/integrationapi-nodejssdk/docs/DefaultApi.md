# IntegrationApi.DefaultApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assignOBLPNtoLoad**](DefaultApi.md#assignOBLPNtoLoad) | **POST** /assign_oblpn_to_load/ | Assign OBLPN to Load
[**assignandLoadLPN**](DefaultApi.md#assignandLoadLPN) | **POST** /assign_and_load_oblpn/ | Assign and Load LPN
[**createLPN**](DefaultApi.md#createLPN) | **POST** /create_lpn/ | Create LPN
[**divertConfirm**](DefaultApi.md#divertConfirm) | **POST** /divert_confirm/ | Divert Confirm
[**entityUpdate**](DefaultApi.md#entityUpdate) | **PATCH** /entity/{entity_name}/{key}/{sequence_number}/ | Entity Update
[**extendedProperty**](DefaultApi.md#extendedProperty) | **GET** /extended_property/{entity_name}/{key}/{extended_property}/ | Extended Property
[**fromMHEDistributionPack**](DefaultApi.md#fromMHEDistributionPack) | **POST** /from_mhe_distribution_pack/ | From MHE Distribution Pack
[**fromMHEDistributionShort**](DefaultApi.md#fromMHEDistributionShort) | **POST** /from_mhe_distribution_short/ | From MHE Distribution Short
[**getNextNumbers**](DefaultApi.md#getNextNumbers) | **POST** /get_next_numbers/ | Get Next Numbers
[**getStatus**](DefaultApi.md#getStatus) | **POST** /get_status/ | Get Status
[**inductLPN**](DefaultApi.md#inductLPN) | **POST** /induct_lpn/ | Induct LPN
[**initStageInterface**](DefaultApi.md#initStageInterface) | **POST** /init_stage_interface/ | Init Stage Interface
[**lockUnlockLPN**](DefaultApi.md#lockUnlockLPN) | **POST** /lock_unlock_lpn/ | Lock/Unlock LPN
[**objectInquiry**](DefaultApi.md#objectInquiry) | **GET** /entity/{entity}/{key}/ | Object Inquiry
[**pickConfirm**](DefaultApi.md#pickConfirm) | **POST** /pick_confirm/ | Pick Confirm
[**receiveLPN**](DefaultApi.md#receiveLPN) | **POST** /receive_lpn/ | Receive LPN
[**runMHEStageInterface**](DefaultApi.md#runMHEStageInterface) | **POST** /run_mhe_stage_interface/ | Run MHE Stage Interface
[**runStageInterface**](DefaultApi.md#runStageInterface) | **POST** /run_stage_interface/ | Run Stage Interface
[**shipOBLPN**](DefaultApi.md#shipOBLPN) | **POST** /ship_oblpn | Ship OBLPN
[**updateActiveInventory**](DefaultApi.md#updateActiveInventory) | **PATCH** /entity/active_inventory/{location_barcode}/ | Update Active Inventory
[**updateCarrierLPNLabel**](DefaultApi.md#updateCarrierLPNLabel) | **POST** /update_carrier_lpn_label/ | Update Carrier LPN Label
[**updateOBLPNDimensions**](DefaultApi.md#updateOBLPNDimensions) | **POST** /update_oblpn_dims/ | Update OBLPN Dimensions
[**updateOBLPNTrackingNumber**](DefaultApi.md#updateOBLPNTrackingNumber) | **POST** /update_oblpn_tracing_nbr/ | Update OBLPN Tracking Number
[**updateOutputInterface**](DefaultApi.md#updateOutputInterface) | **POST** /update_output_interface/ | Update Output Interface


<a name="assignOBLPNtoLoad"></a>
# **assignOBLPNtoLoad**
> Object assignOBLPNtoLoad(loadNbr, oblpnNbr, opts)

Assign OBLPN to Load



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var loadNbr = "loadNbr_example"; // String | 

var oblpnNbr = "oblpnNbr_example"; // String | 

var opts = { 
  'carrierCode': "carrierCode_example", // String | 
  'companyCode': "companyCode_example", // String | 
  'delimiter': "delimiter_example", // String | 
  'facilityCode': "facilityCode_example", // String | 
  'reassignLoadFlg': true, // Boolean | 
  'requireSpecificOblpnStatus': 56, // Number | 
  'trailerNbr': "trailerNbr_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.assignOBLPNtoLoad(loadNbr, oblpnNbr, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadNbr** | **String**|  | 
 **oblpnNbr** | **String**|  | 
 **carrierCode** | **String**|  | [optional] 
 **companyCode** | **String**|  | [optional] 
 **delimiter** | **String**|  | [optional] 
 **facilityCode** | **String**|  | [optional] 
 **reassignLoadFlg** | **Boolean**|  | [optional] 
 **requireSpecificOblpnStatus** | **Number**|  | [optional] 
 **trailerNbr** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="assignandLoadLPN"></a>
# **assignandLoadLPN**
> Object assignandLoadLPN(loadNbr, oblpnNbr, opts)

Assign and Load LPN



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var loadNbr = "loadNbr_example"; // String | 

var oblpnNbr = "oblpnNbr_example"; // String | 

var opts = { 
  'companyCode': "companyCode_example", // String | 
  'dockDoorNbr': "dockDoorNbr_example", // String | 
  'facilityCode': "facilityCode_example", // String | 
  'oblpnWeight': 8.14, // Number | 
  'palletNbr': "palletNbr_example", // String | 
  'trailerNbr': "trailerNbr_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.assignandLoadLPN(loadNbr, oblpnNbr, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadNbr** | **String**|  | 
 **oblpnNbr** | **String**|  | 
 **companyCode** | **String**|  | [optional] 
 **dockDoorNbr** | **String**|  | [optional] 
 **facilityCode** | **String**|  | [optional] 
 **oblpnWeight** | **Number**|  | [optional] 
 **palletNbr** | **String**|  | [optional] 
 **trailerNbr** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="createLPN"></a>
# **createLPN**
> Object createLPN(lpnNbr, qty, opts)

Create LPN



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var lpnNbr = "lpnNbr_example"; // String | 

var qty = 56; // Number | 

var opts = { 
  'batchNumber': "batchNumber_example", // String | 
  'companyCode': "companyCode_example", // String | 
  'destFacilityCode': "destFacilityCode_example", // String | 
  'dropLocnBarcode': "dropLocnBarcode_example", // String | 
  'expiryDate': "expiryDate_example", // String | 
  'facilityCode': "facilityCode_example", // String | 
  'itemAlternateCode': "itemAlternateCode_example", // String | 
  'itemBarcode': "itemBarcode_example", // String | 
  'lockCode': "lockCode_example", // String | 
  'lpnWeight': 8.14, // Number | 
  'orderType': "orderType_example", // String | 
  'xdockLpnFlg': true // Boolean | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createLPN(lpnNbr, qty, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lpnNbr** | **String**|  | 
 **qty** | **Number**|  | 
 **batchNumber** | **String**|  | [optional] 
 **companyCode** | **String**|  | [optional] 
 **destFacilityCode** | **String**|  | [optional] 
 **dropLocnBarcode** | **String**|  | [optional] 
 **expiryDate** | **String**|  | [optional] 
 **facilityCode** | **String**|  | [optional] 
 **itemAlternateCode** | **String**|  | [optional] 
 **itemBarcode** | **String**|  | [optional] 
 **lockCode** | **String**|  | [optional] 
 **lpnWeight** | **Number**|  | [optional] 
 **orderType** | **String**|  | [optional] 
 **xdockLpnFlg** | **Boolean**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="divertConfirm"></a>
# **divertConfirm**
> Object divertConfirm(opts)

Divert Confirm



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var opts = { 
  'flatData': "flatData_example", // String | 
  'xmlData': "xmlData_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.divertConfirm(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flatData** | **String**|  | [optional] 
 **xmlData** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="entityUpdate"></a>
# **entityUpdate**
> Object entityUpdate(entityName, key, sequenceNumber)

Entity Update



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var entityName = "entityName_example"; // String | 

var key = "key_example"; // String | 

var sequenceNumber = "sequenceNumber_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entityUpdate(entityName, key, sequenceNumber, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityName** | **String**|  | 
 **key** | **String**|  | 
 **sequenceNumber** | **String**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="extendedProperty"></a>
# **extendedProperty**
> Object extendedProperty(entityName, extendedProperty, key, opts)

Extended Property



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var entityName = "entityName_example"; // String | 

var extendedProperty = "extendedProperty_example"; // String | 

var key = "key_example"; // String | 

var opts = { 
  'companyCode': "companyCode_example", // String | 
  'facilityCode': "facilityCode_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.extendedProperty(entityName, extendedProperty, key, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityName** | **String**|  | 
 **extendedProperty** | **String**|  | 
 **key** | **String**|  | 
 **companyCode** | **String**|  | [optional] 
 **facilityCode** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="fromMHEDistributionPack"></a>
# **fromMHEDistributionPack**
> Object fromMHEDistributionPack(opts)

From MHE Distribution Pack



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var opts = { 
  'xmlData': "xmlData_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.fromMHEDistributionPack(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xmlData** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="fromMHEDistributionShort"></a>
# **fromMHEDistributionShort**
> Object fromMHEDistributionShort(opts)

From MHE Distribution Short



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var opts = { 
  'flatData': "flatData_example", // String | 
  'xmlData': "xmlData_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.fromMHEDistributionShort(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flatData** | **String**|  | [optional] 
 **xmlData** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="getNextNumbers"></a>
# **getNextNumbers**
> Object getNextNumbers(counterCode, opts)

Get Next Numbers



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var counterCode = "counterCode_example"; // String | 

var opts = { 
  'companyCode': "companyCode_example", // String | 
  'count': 56, // Number | 
  'facilityCode': "facilityCode_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getNextNumbers(counterCode, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **counterCode** | **String**|  | 
 **companyCode** | **String**|  | [optional] 
 **count** | **Number**|  | [optional] 
 **facilityCode** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="getStatus"></a>
# **getStatus**
> Object getStatus(entity, key, opts)

Get Status



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var entity = "entity_example"; // String | 

var key = "key_example"; // String | 

var opts = { 
  'companyCode': "companyCode_example", // String | 
  'facilityCode': "facilityCode_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getStatus(entity, key, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**|  | 
 **key** | **String**|  | 
 **companyCode** | **String**|  | [optional] 
 **facilityCode** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="inductLPN"></a>
# **inductLPN**
> Object inductLPN(opts)

Induct LPN



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var opts = { 
  'flatData': "flatData_example", // String | 
  'xmlData': "xmlData_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.inductLPN(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flatData** | **String**|  | [optional] 
 **xmlData** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="initStageInterface"></a>
# **initStageInterface**
> Object initStageInterface(opts)

Init Stage Interface



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var opts = { 
  'async': true, // Boolean | 
  'entity': "entity_example", // String | 
  'flatData': "flatData_example", // String | 
  'validateXml': true, // Boolean | 
  'xmlData': "xmlData_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.initStageInterface(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **async** | **Boolean**|  | [optional] 
 **entity** | **String**|  | [optional] 
 **flatData** | **String**|  | [optional] 
 **validateXml** | **Boolean**|  | [optional] 
 **xmlData** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="lockUnlockLPN"></a>
# **lockUnlockLPN**
> Object lockUnlockLPN(opts)

Lock/Unlock LPN



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var opts = { 
  'action': "action_example", // String | 
  'companyCode': "companyCode_example", // String | 
  'facilityCode': "facilityCode_example", // String | 
  'lockCode': "lockCode_example", // String | 
  'lpnNbr': "lpnNbr_example", // String | 
  'removeLockFromShipmentDtlFlg': true // Boolean | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.lockUnlockLPN(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**|  | [optional] 
 **companyCode** | **String**|  | [optional] 
 **facilityCode** | **String**|  | [optional] 
 **lockCode** | **String**|  | [optional] 
 **lpnNbr** | **String**|  | [optional] 
 **removeLockFromShipmentDtlFlg** | **Boolean**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="objectInquiry"></a>
# **objectInquiry**
> Object objectInquiry(entity, key, companyCode, facilityCode, opts)

Object Inquiry



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var entity = "entity_example"; // String | 

var key = "key_example"; // String | 

var companyCode = "companyCode_example"; // String | 

var facilityCode = "facilityCode_example"; // String | 

var opts = { 
  'minimize': "minimize_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.objectInquiry(entity, key, companyCode, facilityCode, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**|  | 
 **key** | **String**|  | 
 **companyCode** | **String**|  | 
 **facilityCode** | **String**|  | 
 **minimize** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="pickConfirm"></a>
# **pickConfirm**
> Object pickConfirm(opts)

Pick Confirm



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var opts = { 
  'flatData': "flatData_example", // String | 
  'xmlData': "xmlData_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.pickConfirm(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flatData** | **String**|  | [optional] 
 **xmlData** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="receiveLPN"></a>
# **receiveLPN**
> Object receiveLPN(lpnNbr, opts)

Receive LPN



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var lpnNbr = "lpnNbr_example"; // String | 

var opts = { 
  'companyCode': "companyCode_example", // String | 
  'facilityCode': "facilityCode_example", // String | 
  'rcvdTrailerNbr': "rcvdTrailerNbr_example", // String | 
  'receivedTs': "receivedTs_example", // String | 
  'receivingLocation': "receivingLocation_example", // String | 
  'xdockLpnFlg': true, // Boolean | 
  'xmlData': "xmlData_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.receiveLPN(lpnNbr, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lpnNbr** | **String**|  | 
 **companyCode** | **String**|  | [optional] 
 **facilityCode** | **String**|  | [optional] 
 **rcvdTrailerNbr** | **String**|  | [optional] 
 **receivedTs** | **String**|  | [optional] 
 **receivingLocation** | **String**|  | [optional] 
 **xdockLpnFlg** | **Boolean**|  | [optional] 
 **xmlData** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="runMHEStageInterface"></a>
# **runMHEStageInterface**
> Object runMHEStageInterface(companyCode, entity, facilityCode, mheVendorCode, opts)

Run MHE Stage Interface



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var companyCode = "companyCode_example"; // String | 

var entity = "entity_example"; // String | 

var facilityCode = "facilityCode_example"; // String | 

var mheVendorCode = "mheVendorCode_example"; // String | 

var opts = { 
  'pythonFunction': "pythonFunction_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.runMHEStageInterface(companyCode, entity, facilityCode, mheVendorCode, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyCode** | **String**|  | 
 **entity** | **String**|  | 
 **facilityCode** | **String**|  | 
 **mheVendorCode** | **String**|  | 
 **pythonFunction** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="runStageInterface"></a>
# **runStageInterface**
> Object runStageInterface(companyCode, entity, facilityCode, fileGroupNbr, opts)

Run Stage Interface



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var companyCode = "companyCode_example"; // String | 

var entity = "entity_example"; // String | 

var facilityCode = "facilityCode_example"; // String | 

var fileGroupNbr = "fileGroupNbr_example"; // String | 

var opts = { 
  'async': true // Boolean | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.runStageInterface(companyCode, entity, facilityCode, fileGroupNbr, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyCode** | **String**|  | 
 **entity** | **String**|  | 
 **facilityCode** | **String**|  | 
 **fileGroupNbr** | **String**|  | 
 **async** | **Boolean**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="shipOBLPN"></a>
# **shipOBLPN**
> Object shipOBLPN(companyCode, facilityCode, locnBarcode, oblpnNbr, opts)

Ship OBLPN



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var companyCode = "companyCode_example"; // String | 

var facilityCode = "facilityCode_example"; // String | 

var locnBarcode = "locnBarcode_example"; // String | 

var oblpnNbr = "oblpnNbr_example"; // String | 

var opts = { 
  'outputFileToGenerate': "outputFileToGenerate_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.shipOBLPN(companyCode, facilityCode, locnBarcode, oblpnNbr, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyCode** | **String**|  | 
 **facilityCode** | **String**|  | 
 **locnBarcode** | **String**|  | 
 **oblpnNbr** | **String**|  | 
 **outputFileToGenerate** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="updateActiveInventory"></a>
# **updateActiveInventory**
> Object updateActiveInventory(locationBarcode, reasonCode, opts)

Update Active Inventory



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var locationBarcode = "locationBarcode_example"; // String | 

var reasonCode = "reasonCode_example"; // String | 

var opts = { 
  'actualQty': 8.14, // Number | 
  'adjustmentQty': 8.14, // Number | 
  'batchNumber': "batchNumber_example", // String | 
  'companyCode': "companyCode_example", // String | 
  'expiryData': "expiryData_example", // String | 
  'facilityCode': "facilityCode_example", // String | 
  'invnAttrA': "invnAttrA_example", // String | 
  'invnAttrB': "invnAttrB_example", // String | 
  'invnAttrC': "invnAttrC_example", // String | 
  'invnAttrD': "invnAttrD_example", // String | 
  'invnAttrE': "invnAttrE_example", // String | 
  'invnAttrF': "invnAttrF_example", // String | 
  'invnAttrG': "invnAttrG_example", // String | 
  'itemAlternateCode': "itemAlternateCode_example", // String | 
  'itemBarcode': "itemBarcode_example", // String | 
  'itemCode': "itemCode_example", // String | 
  'locnCapacityCheckFlg': true // Boolean | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateActiveInventory(locationBarcode, reasonCode, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationBarcode** | **String**|  | 
 **reasonCode** | **String**|  | 
 **actualQty** | **Number**|  | [optional] 
 **adjustmentQty** | **Number**|  | [optional] 
 **batchNumber** | **String**|  | [optional] 
 **companyCode** | **String**|  | [optional] 
 **expiryData** | **String**|  | [optional] 
 **facilityCode** | **String**|  | [optional] 
 **invnAttrA** | **String**|  | [optional] 
 **invnAttrB** | **String**|  | [optional] 
 **invnAttrC** | **String**|  | [optional] 
 **invnAttrD** | **String**|  | [optional] 
 **invnAttrE** | **String**|  | [optional] 
 **invnAttrF** | **String**|  | [optional] 
 **invnAttrG** | **String**|  | [optional] 
 **itemAlternateCode** | **String**|  | [optional] 
 **itemBarcode** | **String**|  | [optional] 
 **itemCode** | **String**|  | [optional] 
 **locnCapacityCheckFlg** | **Boolean**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="updateCarrierLPNLabel"></a>
# **updateCarrierLPNLabel**
> Object updateCarrierLPNLabel(label, oblpnNbr, opts)

Update Carrier LPN Label



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var label = "label_example"; // String | 

var oblpnNbr = "oblpnNbr_example"; // String | 

var opts = { 
  'companyCode': "companyCode_example", // String | 
  'facilityCode': "facilityCode_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateCarrierLPNLabel(label, oblpnNbr, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **label** | **String**|  | 
 **oblpnNbr** | **String**|  | 
 **companyCode** | **String**|  | [optional] 
 **facilityCode** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="updateOBLPNDimensions"></a>
# **updateOBLPNDimensions**
> Object updateOBLPNDimensions(calcVolFlg, companyCode, facilityCode, height, length, oblpnNbr, width, opts)

Update OBLPN Dimensions



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var calcVolFlg = true; // Boolean | 

var companyCode = "companyCode_example"; // String | 

var facilityCode = "facilityCode_example"; // String | 

var height = 8.14; // Number | 

var length = 8.14; // Number | 

var oblpnNbr = "oblpnNbr_example"; // String | 

var width = 8.14; // Number | 

var opts = { 
  'shipOblpn': true, // Boolean | 
  'shippingLocation': "shippingLocation_example", // String | 
  'volume': 8.14, // Number | 
  'weight': 8.14 // Number | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateOBLPNDimensions(calcVolFlg, companyCode, facilityCode, height, length, oblpnNbr, width, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calcVolFlg** | **Boolean**|  | 
 **companyCode** | **String**|  | 
 **facilityCode** | **String**|  | 
 **height** | **Number**|  | 
 **length** | **Number**|  | 
 **oblpnNbr** | **String**|  | 
 **width** | **Number**|  | 
 **shipOblpn** | **Boolean**|  | [optional] 
 **shippingLocation** | **String**|  | [optional] 
 **volume** | **Number**|  | [optional] 
 **weight** | **Number**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="updateOBLPNTrackingNumber"></a>
# **updateOBLPNTrackingNumber**
> Object updateOBLPNTrackingNumber(companyCode, facilityCode, oblpnNbr, trackingNbr, opts)

Update OBLPN Tracking Number



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var companyCode = "companyCode_example"; // String | 

var facilityCode = "facilityCode_example"; // String | 

var oblpnNbr = "oblpnNbr_example"; // String | 

var trackingNbr = "trackingNbr_example"; // String | 

var opts = { 
  'dryIceWeight': 8.14, // Number | 
  'estimatedDeliveryTime': "estimatedDeliveryTime_example", // String | 
  'masterTrackingNbr': "masterTrackingNbr_example", // String | 
  'rate': "rate_example", // String | 
  'shipViaCode': "shipViaCode_example", // String | 
  'weight': 8.14 // Number | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateOBLPNTrackingNumber(companyCode, facilityCode, oblpnNbr, trackingNbr, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyCode** | **String**|  | 
 **facilityCode** | **String**|  | 
 **oblpnNbr** | **String**|  | 
 **trackingNbr** | **String**|  | 
 **dryIceWeight** | **Number**|  | [optional] 
 **estimatedDeliveryTime** | **String**|  | [optional] 
 **masterTrackingNbr** | **String**|  | [optional] 
 **rate** | **String**|  | [optional] 
 **shipViaCode** | **String**|  | [optional] 
 **weight** | **Number**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="updateOutputInterface"></a>
# **updateOutputInterface**
> Object updateOutputInterface(opts)

Update Output Interface



### Example
```javascript
var IntegrationApi = require('integration_api');
var defaultClient = IntegrationApi.ApiClient.instance;

// Configure HTTP basic authorization: basic
var basic = defaultClient.authentications['basic'];
basic.username = 'YOUR USERNAME';
basic.password = 'YOUR PASSWORD';

var apiInstance = new IntegrationApi.DefaultApi();

var opts = { 
  'companyCode': "companyCode_example", // String | 
  'custIntlCode': "custIntlCode_example", // String | 
  'facilityCode': "facilityCode_example", // String | 
  'filename': "filename_example", // String | 
  'interfaceTypeCode': "interfaceTypeCode_example", // String | 
  'message': "message_example", // String | 
  'runOutputInterfaceFlg': true, // Boolean | 
  'statusId': 56 // Number | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateOutputInterface(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyCode** | **String**|  | [optional] 
 **custIntlCode** | **String**|  | [optional] 
 **facilityCode** | **String**|  | [optional] 
 **filename** | **String**|  | [optional] 
 **interfaceTypeCode** | **String**|  | [optional] 
 **message** | **String**|  | [optional] 
 **runOutputInterfaceFlg** | **Boolean**|  | [optional] 
 **statusId** | **Number**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

