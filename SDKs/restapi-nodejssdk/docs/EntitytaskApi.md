# RestApi.EntitytaskApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityTaskByIdGET**](EntitytaskApi.md#entityTaskByIdGET) | **GET** /entity/task/{id} | EntityTaskById_GET
[**entityTaskDescribeGET**](EntitytaskApi.md#entityTaskDescribeGET) | **GET** /entity/task/describe | EntityTaskDescribe_GET
[**entityTaskGET**](EntitytaskApi.md#entityTaskGET) | **GET** /entity/task | EntityTask_GET
[**entityTaskNextTaskGET**](EntitytaskApi.md#entityTaskNextTaskGET) | **GET** /entity/task/next_task | EntityTaskNextTask_GET


<a name="entityTaskByIdGET"></a>
# **entityTaskByIdGET**
> Object entityTaskByIdGET(id, opts)

EntityTaskById_GET



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

var apiInstance = new RestApi.EntitytaskApi();

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
apiInstance.entityTaskByIdGET(id, opts, callback);
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

<a name="entityTaskDescribeGET"></a>
# **entityTaskDescribeGET**
> Object entityTaskDescribeGET()

EntityTaskDescribe_GET



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

var apiInstance = new RestApi.EntitytaskApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entityTaskDescribeGET(callback);
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

<a name="entityTaskGET"></a>
# **entityTaskGET**
> Object entityTaskGET(opts)

EntityTask_GET



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

var apiInstance = new RestApi.EntitytaskApi();

var opts = { 
  'fields': "fields_example", // String | 
  'ordering': "ordering_example", // String | 
  'pageMode': "paged", // String | 
  'facilityId': 56, // Number | 
  'facilityIdCode': "facilityIdCode_example", // String | 
  'locationBarcode': "locationBarcode_example", // String | 
  'taskType': "taskType_example", // String | 
  'orderingRule': "orderingRule_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entityTaskGET(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional] 
 **ordering** | **String**|  | [optional] 
 **pageMode** | **String**|  | [optional] [default to paged]
 **facilityId** | **Number**|  | [optional] 
 **facilityIdCode** | **String**|  | [optional] 
 **locationBarcode** | **String**|  | [optional] 
 **taskType** | **String**|  | [optional] 
 **orderingRule** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="entityTaskNextTaskGET"></a>
# **entityTaskNextTaskGET**
> Object entityTaskNextTaskGET(facilityId, facilityIdCode, locationBarcode, orderingRule, taskType)

EntityTaskNextTask_GET



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

var apiInstance = new RestApi.EntitytaskApi();

var facilityId = 8.14; // Number | 

var facilityIdCode = "facilityIdCode_example"; // String | 

var locationBarcode = "locationBarcode_example"; // String | 

var orderingRule = "orderingRule_example"; // String | 

var taskType = "taskType_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entityTaskNextTaskGET(facilityId, facilityIdCode, locationBarcode, orderingRule, taskType, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **facilityId** | **Number**|  | 
 **facilityIdCode** | **String**|  | 
 **locationBarcode** | **String**|  | 
 **orderingRule** | **String**|  | 
 **taskType** | **String**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

