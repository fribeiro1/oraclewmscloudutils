# RestApi.EntityibShipmentSerialNbrApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityIbShipmentSerialNbrByIdGET**](EntityibShipmentSerialNbrApi.md#entityIbShipmentSerialNbrByIdGET) | **GET** /entity/ib_shipment_serial_nbr/{id} | EntityIbShipmentSerialNbrById_GET
[**entityIbShipmentSerialNbrDescribeGET**](EntityibShipmentSerialNbrApi.md#entityIbShipmentSerialNbrDescribeGET) | **GET** /entity/ib_shipment_serial_nbr/describe | EntityIbShipmentSerialNbrDescribe_GET
[**entityIbShipmentSerialNbrGET**](EntityibShipmentSerialNbrApi.md#entityIbShipmentSerialNbrGET) | **GET** /entity/ib_shipment_serial_nbr | EntityIbShipmentSerialNbr_GET


<a name="entityIbShipmentSerialNbrByIdGET"></a>
# **entityIbShipmentSerialNbrByIdGET**
> Object entityIbShipmentSerialNbrByIdGET(id, opts)

EntityIbShipmentSerialNbrById_GET



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

var apiInstance = new RestApi.EntityibShipmentSerialNbrApi();

var id = 8.14; // Number | 

var opts = { 
  'fields': "fields_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entityIbShipmentSerialNbrByIdGET(id, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Number**|  | 
 **fields** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="entityIbShipmentSerialNbrDescribeGET"></a>
# **entityIbShipmentSerialNbrDescribeGET**
> Object entityIbShipmentSerialNbrDescribeGET()

EntityIbShipmentSerialNbrDescribe_GET



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

var apiInstance = new RestApi.EntityibShipmentSerialNbrApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entityIbShipmentSerialNbrDescribeGET(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="entityIbShipmentSerialNbrGET"></a>
# **entityIbShipmentSerialNbrGET**
> Object entityIbShipmentSerialNbrGET(opts)

EntityIbShipmentSerialNbr_GET



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

var apiInstance = new RestApi.EntityibShipmentSerialNbrApi();

var opts = { 
  'fields': "fields_example", // String | 
  'ordering': "ordering_example", // String | 
  'pageMode': "paged" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entityIbShipmentSerialNbrGET(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional] 
 **ordering** | **String**|  | [optional] 
 **pageMode** | **String**|  | [optional] [default to paged]

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

