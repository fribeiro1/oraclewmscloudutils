# EntitytaskApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityTaskByIdGET**](EntitytaskApi.md#entityTaskByIdGET) | **GET** /entity/task/{id} | EntityTaskById_GET
[**entityTaskDescribeGET**](EntitytaskApi.md#entityTaskDescribeGET) | **GET** /entity/task/describe | EntityTaskDescribe_GET
[**entityTaskGET**](EntitytaskApi.md#entityTaskGET) | **GET** /entity/task | EntityTask_GET
[**entityTaskNextTaskGET**](EntitytaskApi.md#entityTaskNextTaskGET) | **GET** /entity/task/next_task | EntityTaskNextTask_GET


<a name="entityTaskByIdGET"></a>
# **entityTaskByIdGET**
> Object entityTaskByIdGET(id, fields)

EntityTaskById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitytaskApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitytaskApi apiInstance = new EntitytaskApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityTaskByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitytaskApi#entityTaskByIdGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **BigDecimal**|  |
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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitytaskApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitytaskApi apiInstance = new EntitytaskApi();
try {
    Object result = apiInstance.entityTaskDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitytaskApi#entityTaskDescribeGET");
    e.printStackTrace();
}
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
> Object entityTaskGET(fields, ordering, pageMode, facilityId, facilityIdCode, locationBarcode, taskType, orderingRule)

EntityTask_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitytaskApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitytaskApi apiInstance = new EntitytaskApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
Integer facilityId = 56; // Integer | 
String facilityIdCode = "facilityIdCode_example"; // String | 
String locationBarcode = "locationBarcode_example"; // String | 
String taskType = "taskType_example"; // String | 
String orderingRule = "orderingRule_example"; // String | 
try {
    Object result = apiInstance.entityTaskGET(fields, ordering, pageMode, facilityId, facilityIdCode, locationBarcode, taskType, orderingRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitytaskApi#entityTaskGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional]
 **ordering** | **String**|  | [optional]
 **pageMode** | **String**|  | [optional] [default to paged] [enum: paged, sequenced]
 **facilityId** | **Integer**|  | [optional]
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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitytaskApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitytaskApi apiInstance = new EntitytaskApi();
BigDecimal facilityId = new BigDecimal(); // BigDecimal | 
String facilityIdCode = "facilityIdCode_example"; // String | 
String locationBarcode = "locationBarcode_example"; // String | 
String orderingRule = "orderingRule_example"; // String | 
String taskType = "taskType_example"; // String | 
try {
    Object result = apiInstance.entityTaskNextTaskGET(facilityId, facilityIdCode, locationBarcode, orderingRule, taskType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitytaskApi#entityTaskNextTaskGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **facilityId** | **BigDecimal**|  |
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

