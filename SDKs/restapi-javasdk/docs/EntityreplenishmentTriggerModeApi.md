# EntityreplenishmentTriggerModeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityReplenishmentTriggerModeByIdGET**](EntityreplenishmentTriggerModeApi.md#entityReplenishmentTriggerModeByIdGET) | **GET** /entity/replenishment_trigger_mode/{id} | EntityReplenishmentTriggerModeById_GET
[**entityReplenishmentTriggerModeDescribeGET**](EntityreplenishmentTriggerModeApi.md#entityReplenishmentTriggerModeDescribeGET) | **GET** /entity/replenishment_trigger_mode/describe | EntityReplenishmentTriggerModeDescribe_GET
[**entityReplenishmentTriggerModeGET**](EntityreplenishmentTriggerModeApi.md#entityReplenishmentTriggerModeGET) | **GET** /entity/replenishment_trigger_mode | EntityReplenishmentTriggerMode_GET


<a name="entityReplenishmentTriggerModeByIdGET"></a>
# **entityReplenishmentTriggerModeByIdGET**
> Object entityReplenishmentTriggerModeByIdGET(id, fields)

EntityReplenishmentTriggerModeById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityreplenishmentTriggerModeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityreplenishmentTriggerModeApi apiInstance = new EntityreplenishmentTriggerModeApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityReplenishmentTriggerModeByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityreplenishmentTriggerModeApi#entityReplenishmentTriggerModeByIdGET");
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

<a name="entityReplenishmentTriggerModeDescribeGET"></a>
# **entityReplenishmentTriggerModeDescribeGET**
> Object entityReplenishmentTriggerModeDescribeGET()

EntityReplenishmentTriggerModeDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityreplenishmentTriggerModeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityreplenishmentTriggerModeApi apiInstance = new EntityreplenishmentTriggerModeApi();
try {
    Object result = apiInstance.entityReplenishmentTriggerModeDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityreplenishmentTriggerModeApi#entityReplenishmentTriggerModeDescribeGET");
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

<a name="entityReplenishmentTriggerModeGET"></a>
# **entityReplenishmentTriggerModeGET**
> Object entityReplenishmentTriggerModeGET(fields, ordering, pageMode)

EntityReplenishmentTriggerMode_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityreplenishmentTriggerModeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityreplenishmentTriggerModeApi apiInstance = new EntityreplenishmentTriggerModeApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityReplenishmentTriggerModeGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityreplenishmentTriggerModeApi#entityReplenishmentTriggerModeGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional]
 **ordering** | **String**|  | [optional]
 **pageMode** | **String**|  | [optional] [default to paged] [enum: paged, sequenced]

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

