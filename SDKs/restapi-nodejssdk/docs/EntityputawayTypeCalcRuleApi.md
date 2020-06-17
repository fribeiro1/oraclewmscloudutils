# RestApi.EntityputawayTypeCalcRuleApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityPutawayTypeCalcRuleByIdGET**](EntityputawayTypeCalcRuleApi.md#entityPutawayTypeCalcRuleByIdGET) | **GET** /entity/putaway_type_calc_rule/{id} | EntityPutawayTypeCalcRuleById_GET
[**entityPutawayTypeCalcRuleGET**](EntityputawayTypeCalcRuleApi.md#entityPutawayTypeCalcRuleGET) | **GET** /entity/putaway_type_calc_rule | EntityPutawayTypeCalcRule_GET
[**entityPutawayTypeCalcRulePOST**](EntityputawayTypeCalcRuleApi.md#entityPutawayTypeCalcRulePOST) | **POST** /entity/putaway_type_calc_rule | EntityPutawayTypeCalcRule_POST


<a name="entityPutawayTypeCalcRuleByIdGET"></a>
# **entityPutawayTypeCalcRuleByIdGET**
> Object entityPutawayTypeCalcRuleByIdGET(id, opts)

EntityPutawayTypeCalcRuleById_GET



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

var apiInstance = new RestApi.EntityputawayTypeCalcRuleApi();

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
apiInstance.entityPutawayTypeCalcRuleByIdGET(id, opts, callback);
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

<a name="entityPutawayTypeCalcRuleGET"></a>
# **entityPutawayTypeCalcRuleGET**
> Object entityPutawayTypeCalcRuleGET()

EntityPutawayTypeCalcRule_GET



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

var apiInstance = new RestApi.EntityputawayTypeCalcRuleApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entityPutawayTypeCalcRuleGET(callback);
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

<a name="entityPutawayTypeCalcRulePOST"></a>
# **entityPutawayTypeCalcRulePOST**
> Object entityPutawayTypeCalcRulePOST()

EntityPutawayTypeCalcRule_POST



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

var apiInstance = new RestApi.EntityputawayTypeCalcRuleApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entityPutawayTypeCalcRulePOST(callback);
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

