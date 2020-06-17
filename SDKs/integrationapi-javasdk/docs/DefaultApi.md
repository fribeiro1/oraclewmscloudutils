# DefaultApi

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
> Object assignOBLPNtoLoad(loadNbr, oblpnNbr, carrierCode, companyCode, delimiter, facilityCode, reassignLoadFlg, requireSpecificOblpnStatus, trailerNbr)

Assign OBLPN to Load



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String loadNbr = "loadNbr_example"; // String | 
String oblpnNbr = "oblpnNbr_example"; // String | 
String carrierCode = "carrierCode_example"; // String | 
String companyCode = "companyCode_example"; // String | 
String delimiter = "delimiter_example"; // String | 
String facilityCode = "facilityCode_example"; // String | 
Boolean reassignLoadFlg = true; // Boolean | 
Integer requireSpecificOblpnStatus = 56; // Integer | 
String trailerNbr = "trailerNbr_example"; // String | 
try {
    Object result = apiInstance.assignOBLPNtoLoad(loadNbr, oblpnNbr, carrierCode, companyCode, delimiter, facilityCode, reassignLoadFlg, requireSpecificOblpnStatus, trailerNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#assignOBLPNtoLoad");
    e.printStackTrace();
}
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
 **requireSpecificOblpnStatus** | **Integer**|  | [optional]
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
> Object assignandLoadLPN(loadNbr, oblpnNbr, companyCode, dockDoorNbr, facilityCode, oblpnWeight, palletNbr, trailerNbr)

Assign and Load LPN



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String loadNbr = "loadNbr_example"; // String | 
String oblpnNbr = "oblpnNbr_example"; // String | 
String companyCode = "companyCode_example"; // String | 
String dockDoorNbr = "dockDoorNbr_example"; // String | 
String facilityCode = "facilityCode_example"; // String | 
BigDecimal oblpnWeight = new BigDecimal(); // BigDecimal | 
String palletNbr = "palletNbr_example"; // String | 
String trailerNbr = "trailerNbr_example"; // String | 
try {
    Object result = apiInstance.assignandLoadLPN(loadNbr, oblpnNbr, companyCode, dockDoorNbr, facilityCode, oblpnWeight, palletNbr, trailerNbr);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#assignandLoadLPN");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadNbr** | **String**|  |
 **oblpnNbr** | **String**|  |
 **companyCode** | **String**|  | [optional]
 **dockDoorNbr** | **String**|  | [optional]
 **facilityCode** | **String**|  | [optional]
 **oblpnWeight** | **BigDecimal**|  | [optional]
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
> Object createLPN(lpnNbr, qty, batchNumber, companyCode, destFacilityCode, dropLocnBarcode, expiryDate, facilityCode, itemAlternateCode, itemBarcode, lockCode, lpnWeight, orderType, xdockLpnFlg)

Create LPN



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String lpnNbr = "lpnNbr_example"; // String | 
Integer qty = 56; // Integer | 
String batchNumber = "batchNumber_example"; // String | 
String companyCode = "companyCode_example"; // String | 
String destFacilityCode = "destFacilityCode_example"; // String | 
String dropLocnBarcode = "dropLocnBarcode_example"; // String | 
String expiryDate = "expiryDate_example"; // String | 
String facilityCode = "facilityCode_example"; // String | 
String itemAlternateCode = "itemAlternateCode_example"; // String | 
String itemBarcode = "itemBarcode_example"; // String | 
String lockCode = "lockCode_example"; // String | 
BigDecimal lpnWeight = new BigDecimal(); // BigDecimal | 
String orderType = "orderType_example"; // String | 
Boolean xdockLpnFlg = true; // Boolean | 
try {
    Object result = apiInstance.createLPN(lpnNbr, qty, batchNumber, companyCode, destFacilityCode, dropLocnBarcode, expiryDate, facilityCode, itemAlternateCode, itemBarcode, lockCode, lpnWeight, orderType, xdockLpnFlg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createLPN");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lpnNbr** | **String**|  |
 **qty** | **Integer**|  |
 **batchNumber** | **String**|  | [optional]
 **companyCode** | **String**|  | [optional]
 **destFacilityCode** | **String**|  | [optional]
 **dropLocnBarcode** | **String**|  | [optional]
 **expiryDate** | **String**|  | [optional]
 **facilityCode** | **String**|  | [optional]
 **itemAlternateCode** | **String**|  | [optional]
 **itemBarcode** | **String**|  | [optional]
 **lockCode** | **String**|  | [optional]
 **lpnWeight** | **BigDecimal**|  | [optional]
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
> Object divertConfirm(flatData, xmlData)

Divert Confirm



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String flatData = "flatData_example"; // String | 
String xmlData = "xmlData_example"; // String | 
try {
    Object result = apiInstance.divertConfirm(flatData, xmlData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#divertConfirm");
    e.printStackTrace();
}
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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String entityName = "entityName_example"; // String | 
String key = "key_example"; // String | 
String sequenceNumber = "sequenceNumber_example"; // String | 
try {
    Object result = apiInstance.entityUpdate(entityName, key, sequenceNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#entityUpdate");
    e.printStackTrace();
}
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
> Object extendedProperty(entityName, extendedProperty, key, companyCode, facilityCode)

Extended Property



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String entityName = "entityName_example"; // String | 
String extendedProperty = "extendedProperty_example"; // String | 
String key = "key_example"; // String | 
String companyCode = "companyCode_example"; // String | 
String facilityCode = "facilityCode_example"; // String | 
try {
    Object result = apiInstance.extendedProperty(entityName, extendedProperty, key, companyCode, facilityCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#extendedProperty");
    e.printStackTrace();
}
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
> Object fromMHEDistributionPack(xmlData)

From MHE Distribution Pack



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String xmlData = "xmlData_example"; // String | 
try {
    Object result = apiInstance.fromMHEDistributionPack(xmlData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fromMHEDistributionPack");
    e.printStackTrace();
}
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
> Object fromMHEDistributionShort(flatData, xmlData)

From MHE Distribution Short



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String flatData = "flatData_example"; // String | 
String xmlData = "xmlData_example"; // String | 
try {
    Object result = apiInstance.fromMHEDistributionShort(flatData, xmlData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#fromMHEDistributionShort");
    e.printStackTrace();
}
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
> Object getNextNumbers(counterCode, companyCode, count, facilityCode)

Get Next Numbers



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String counterCode = "counterCode_example"; // String | 
String companyCode = "companyCode_example"; // String | 
Integer count = 56; // Integer | 
String facilityCode = "facilityCode_example"; // String | 
try {
    Object result = apiInstance.getNextNumbers(counterCode, companyCode, count, facilityCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getNextNumbers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **counterCode** | **String**|  |
 **companyCode** | **String**|  | [optional]
 **count** | **Integer**|  | [optional]
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
> Object getStatus(entity, key, companyCode, facilityCode)

Get Status



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String entity = "entity_example"; // String | 
String key = "key_example"; // String | 
String companyCode = "companyCode_example"; // String | 
String facilityCode = "facilityCode_example"; // String | 
try {
    Object result = apiInstance.getStatus(entity, key, companyCode, facilityCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getStatus");
    e.printStackTrace();
}
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
> Object inductLPN(flatData, xmlData)

Induct LPN



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String flatData = "flatData_example"; // String | 
String xmlData = "xmlData_example"; // String | 
try {
    Object result = apiInstance.inductLPN(flatData, xmlData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#inductLPN");
    e.printStackTrace();
}
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
> Object initStageInterface(async, entity, flatData, validateXml, xmlData)

Init Stage Interface



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Boolean async = true; // Boolean | 
String entity = "entity_example"; // String | 
String flatData = "flatData_example"; // String | 
Boolean validateXml = true; // Boolean | 
String xmlData = "xmlData_example"; // String | 
try {
    Object result = apiInstance.initStageInterface(async, entity, flatData, validateXml, xmlData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#initStageInterface");
    e.printStackTrace();
}
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
> Object lockUnlockLPN(action, companyCode, facilityCode, lockCode, lpnNbr, removeLockFromShipmentDtlFlg)

Lock/Unlock LPN



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String action = "action_example"; // String | 
String companyCode = "companyCode_example"; // String | 
String facilityCode = "facilityCode_example"; // String | 
String lockCode = "lockCode_example"; // String | 
String lpnNbr = "lpnNbr_example"; // String | 
Boolean removeLockFromShipmentDtlFlg = true; // Boolean | 
try {
    Object result = apiInstance.lockUnlockLPN(action, companyCode, facilityCode, lockCode, lpnNbr, removeLockFromShipmentDtlFlg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#lockUnlockLPN");
    e.printStackTrace();
}
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
> Object objectInquiry(entity, key, companyCode, facilityCode, minimize)

Object Inquiry



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String entity = "entity_example"; // String | 
String key = "key_example"; // String | 
String companyCode = "companyCode_example"; // String | 
String facilityCode = "facilityCode_example"; // String | 
String minimize = "minimize_example"; // String | 
try {
    Object result = apiInstance.objectInquiry(entity, key, companyCode, facilityCode, minimize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#objectInquiry");
    e.printStackTrace();
}
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
> Object pickConfirm(flatData, xmlData)

Pick Confirm



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String flatData = "flatData_example"; // String | 
String xmlData = "xmlData_example"; // String | 
try {
    Object result = apiInstance.pickConfirm(flatData, xmlData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pickConfirm");
    e.printStackTrace();
}
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
> Object receiveLPN(lpnNbr, companyCode, facilityCode, rcvdTrailerNbr, receivedTs, receivingLocation, xdockLpnFlg, xmlData)

Receive LPN



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String lpnNbr = "lpnNbr_example"; // String | 
String companyCode = "companyCode_example"; // String | 
String facilityCode = "facilityCode_example"; // String | 
String rcvdTrailerNbr = "rcvdTrailerNbr_example"; // String | 
String receivedTs = "receivedTs_example"; // String | 
String receivingLocation = "receivingLocation_example"; // String | 
Boolean xdockLpnFlg = true; // Boolean | 
String xmlData = "xmlData_example"; // String | 
try {
    Object result = apiInstance.receiveLPN(lpnNbr, companyCode, facilityCode, rcvdTrailerNbr, receivedTs, receivingLocation, xdockLpnFlg, xmlData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#receiveLPN");
    e.printStackTrace();
}
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
> Object runMHEStageInterface(companyCode, entity, facilityCode, mheVendorCode, pythonFunction)

Run MHE Stage Interface



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String companyCode = "companyCode_example"; // String | 
String entity = "entity_example"; // String | 
String facilityCode = "facilityCode_example"; // String | 
String mheVendorCode = "mheVendorCode_example"; // String | 
String pythonFunction = "pythonFunction_example"; // String | 
try {
    Object result = apiInstance.runMHEStageInterface(companyCode, entity, facilityCode, mheVendorCode, pythonFunction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#runMHEStageInterface");
    e.printStackTrace();
}
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
> Object runStageInterface(companyCode, entity, facilityCode, fileGroupNbr, async)

Run Stage Interface



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String companyCode = "companyCode_example"; // String | 
String entity = "entity_example"; // String | 
String facilityCode = "facilityCode_example"; // String | 
String fileGroupNbr = "fileGroupNbr_example"; // String | 
Boolean async = true; // Boolean | 
try {
    Object result = apiInstance.runStageInterface(companyCode, entity, facilityCode, fileGroupNbr, async);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#runStageInterface");
    e.printStackTrace();
}
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
> Object shipOBLPN(companyCode, facilityCode, locnBarcode, oblpnNbr, outputFileToGenerate)

Ship OBLPN



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String companyCode = "companyCode_example"; // String | 
String facilityCode = "facilityCode_example"; // String | 
String locnBarcode = "locnBarcode_example"; // String | 
String oblpnNbr = "oblpnNbr_example"; // String | 
String outputFileToGenerate = "outputFileToGenerate_example"; // String | 
try {
    Object result = apiInstance.shipOBLPN(companyCode, facilityCode, locnBarcode, oblpnNbr, outputFileToGenerate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#shipOBLPN");
    e.printStackTrace();
}
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
> Object updateActiveInventory(locationBarcode, reasonCode, actualQty, adjustmentQty, batchNumber, companyCode, expiryData, facilityCode, invnAttrA, invnAttrB, invnAttrC, invnAttrD, invnAttrE, invnAttrF, invnAttrG, itemAlternateCode, itemBarcode, itemCode, locnCapacityCheckFlg)

Update Active Inventory



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String locationBarcode = "locationBarcode_example"; // String | 
String reasonCode = "reasonCode_example"; // String | 
BigDecimal actualQty = new BigDecimal(); // BigDecimal | 
BigDecimal adjustmentQty = new BigDecimal(); // BigDecimal | 
String batchNumber = "batchNumber_example"; // String | 
String companyCode = "companyCode_example"; // String | 
String expiryData = "expiryData_example"; // String | 
String facilityCode = "facilityCode_example"; // String | 
String invnAttrA = "invnAttrA_example"; // String | 
String invnAttrB = "invnAttrB_example"; // String | 
String invnAttrC = "invnAttrC_example"; // String | 
String invnAttrD = "invnAttrD_example"; // String | 
String invnAttrE = "invnAttrE_example"; // String | 
String invnAttrF = "invnAttrF_example"; // String | 
String invnAttrG = "invnAttrG_example"; // String | 
String itemAlternateCode = "itemAlternateCode_example"; // String | 
String itemBarcode = "itemBarcode_example"; // String | 
String itemCode = "itemCode_example"; // String | 
Boolean locnCapacityCheckFlg = true; // Boolean | 
try {
    Object result = apiInstance.updateActiveInventory(locationBarcode, reasonCode, actualQty, adjustmentQty, batchNumber, companyCode, expiryData, facilityCode, invnAttrA, invnAttrB, invnAttrC, invnAttrD, invnAttrE, invnAttrF, invnAttrG, itemAlternateCode, itemBarcode, itemCode, locnCapacityCheckFlg);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateActiveInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationBarcode** | **String**|  |
 **reasonCode** | **String**|  |
 **actualQty** | **BigDecimal**|  | [optional]
 **adjustmentQty** | **BigDecimal**|  | [optional]
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
> Object updateCarrierLPNLabel(label, oblpnNbr, companyCode, facilityCode)

Update Carrier LPN Label



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String label = "label_example"; // String | 
String oblpnNbr = "oblpnNbr_example"; // String | 
String companyCode = "companyCode_example"; // String | 
String facilityCode = "facilityCode_example"; // String | 
try {
    Object result = apiInstance.updateCarrierLPNLabel(label, oblpnNbr, companyCode, facilityCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCarrierLPNLabel");
    e.printStackTrace();
}
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
> Object updateOBLPNDimensions(calcVolFlg, companyCode, facilityCode, height, length, oblpnNbr, width, shipOblpn, shippingLocation, volume, weight)

Update OBLPN Dimensions



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Boolean calcVolFlg = true; // Boolean | 
String companyCode = "companyCode_example"; // String | 
String facilityCode = "facilityCode_example"; // String | 
BigDecimal height = new BigDecimal(); // BigDecimal | 
BigDecimal length = new BigDecimal(); // BigDecimal | 
String oblpnNbr = "oblpnNbr_example"; // String | 
BigDecimal width = new BigDecimal(); // BigDecimal | 
Boolean shipOblpn = true; // Boolean | 
String shippingLocation = "shippingLocation_example"; // String | 
BigDecimal volume = new BigDecimal(); // BigDecimal | 
BigDecimal weight = new BigDecimal(); // BigDecimal | 
try {
    Object result = apiInstance.updateOBLPNDimensions(calcVolFlg, companyCode, facilityCode, height, length, oblpnNbr, width, shipOblpn, shippingLocation, volume, weight);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateOBLPNDimensions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calcVolFlg** | **Boolean**|  |
 **companyCode** | **String**|  |
 **facilityCode** | **String**|  |
 **height** | **BigDecimal**|  |
 **length** | **BigDecimal**|  |
 **oblpnNbr** | **String**|  |
 **width** | **BigDecimal**|  |
 **shipOblpn** | **Boolean**|  | [optional]
 **shippingLocation** | **String**|  | [optional]
 **volume** | **BigDecimal**|  | [optional]
 **weight** | **BigDecimal**|  | [optional]

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="updateOBLPNTrackingNumber"></a>
# **updateOBLPNTrackingNumber**
> Object updateOBLPNTrackingNumber(companyCode, facilityCode, oblpnNbr, trackingNbr, dryIceWeight, estimatedDeliveryTime, masterTrackingNbr, rate, shipViaCode, weight)

Update OBLPN Tracking Number



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String companyCode = "companyCode_example"; // String | 
String facilityCode = "facilityCode_example"; // String | 
String oblpnNbr = "oblpnNbr_example"; // String | 
String trackingNbr = "trackingNbr_example"; // String | 
BigDecimal dryIceWeight = new BigDecimal(); // BigDecimal | 
String estimatedDeliveryTime = "estimatedDeliveryTime_example"; // String | 
String masterTrackingNbr = "masterTrackingNbr_example"; // String | 
String rate = "rate_example"; // String | 
String shipViaCode = "shipViaCode_example"; // String | 
BigDecimal weight = new BigDecimal(); // BigDecimal | 
try {
    Object result = apiInstance.updateOBLPNTrackingNumber(companyCode, facilityCode, oblpnNbr, trackingNbr, dryIceWeight, estimatedDeliveryTime, masterTrackingNbr, rate, shipViaCode, weight);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateOBLPNTrackingNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyCode** | **String**|  |
 **facilityCode** | **String**|  |
 **oblpnNbr** | **String**|  |
 **trackingNbr** | **String**|  |
 **dryIceWeight** | **BigDecimal**|  | [optional]
 **estimatedDeliveryTime** | **String**|  | [optional]
 **masterTrackingNbr** | **String**|  | [optional]
 **rate** | **String**|  | [optional]
 **shipViaCode** | **String**|  | [optional]
 **weight** | **BigDecimal**|  | [optional]

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

<a name="updateOutputInterface"></a>
# **updateOutputInterface**
> Object updateOutputInterface(companyCode, custIntlCode, facilityCode, filename, interfaceTypeCode, message, runOutputInterfaceFlg, statusId)

Update Output Interface



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String companyCode = "companyCode_example"; // String | 
String custIntlCode = "custIntlCode_example"; // String | 
String facilityCode = "facilityCode_example"; // String | 
String filename = "filename_example"; // String | 
String interfaceTypeCode = "interfaceTypeCode_example"; // String | 
String message = "message_example"; // String | 
Boolean runOutputInterfaceFlg = true; // Boolean | 
Integer statusId = 56; // Integer | 
try {
    Object result = apiInstance.updateOutputInterface(companyCode, custIntlCode, facilityCode, filename, interfaceTypeCode, message, runOutputInterfaceFlg, statusId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateOutputInterface");
    e.printStackTrace();
}
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
 **statusId** | **Integer**|  | [optional]

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml

