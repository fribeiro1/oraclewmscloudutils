# RestApi.EntityshippingBlockedSelectionCriteriaApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityShippingBlockedSelectionCriteriaDescribeGET**](EntityshippingBlockedSelectionCriteriaApi.md#entityShippingBlockedSelectionCriteriaDescribeGET) | **GET** /entity/shipping_blocked_selection_criteria/describe | EntityShippingBlockedSelectionCriteriaDescribe_GET
[**entityShippingBlockedSelectionCriteriaGET**](EntityshippingBlockedSelectionCriteriaApi.md#entityShippingBlockedSelectionCriteriaGET) | **GET** /entity/shipping_blocked_selection_criteria | EntityShippingBlockedSelectionCriteria_GET
[**getEntityShippingBlockedSelectionCriteriaGET**](EntityshippingBlockedSelectionCriteriaApi.md#getEntityShippingBlockedSelectionCriteriaGET) | **GET** /entity/shipping_blocked_selection_criteria/{id} | EntityShippingBlockedSelectionCriteria_GET


<a name="entityShippingBlockedSelectionCriteriaDescribeGET"></a>
# **entityShippingBlockedSelectionCriteriaDescribeGET**
> Object entityShippingBlockedSelectionCriteriaDescribeGET()

EntityShippingBlockedSelectionCriteriaDescribe_GET



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

var apiInstance = new RestApi.EntityshippingBlockedSelectionCriteriaApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.entityShippingBlockedSelectionCriteriaDescribeGET(callback);
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

<a name="entityShippingBlockedSelectionCriteriaGET"></a>
# **entityShippingBlockedSelectionCriteriaGET**
> Object entityShippingBlockedSelectionCriteriaGET(opts)

EntityShippingBlockedSelectionCriteria_GET



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

var apiInstance = new RestApi.EntityshippingBlockedSelectionCriteriaApi();

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
apiInstance.entityShippingBlockedSelectionCriteriaGET(opts, callback);
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

<a name="getEntityShippingBlockedSelectionCriteriaGET"></a>
# **getEntityShippingBlockedSelectionCriteriaGET**
> Object getEntityShippingBlockedSelectionCriteriaGET(id, opts)

EntityShippingBlockedSelectionCriteria_GET



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

var apiInstance = new RestApi.EntityshippingBlockedSelectionCriteriaApi();

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
apiInstance.getEntityShippingBlockedSelectionCriteriaGET(id, opts, callback);
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

