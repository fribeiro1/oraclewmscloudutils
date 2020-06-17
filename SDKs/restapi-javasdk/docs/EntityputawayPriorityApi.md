# EntityputawayPriorityApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityPutawayPriorityByIdGET**](EntityputawayPriorityApi.md#entityPutawayPriorityByIdGET) | **GET** /entity/putaway_priority/{id} | EntityPutawayPriorityById_GET
[**entityPutawayPriorityGET**](EntityputawayPriorityApi.md#entityPutawayPriorityGET) | **GET** /entity/putaway_priority | EntityPutawayPriority_GET
[**entityPutawayPriorityPOST**](EntityputawayPriorityApi.md#entityPutawayPriorityPOST) | **POST** /entity/putaway_priority | EntityPutawayPriority_POST


<a name="entityPutawayPriorityByIdGET"></a>
# **entityPutawayPriorityByIdGET**
> Object entityPutawayPriorityByIdGET(id, fields)

EntityPutawayPriorityById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityputawayPriorityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityputawayPriorityApi apiInstance = new EntityputawayPriorityApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityPutawayPriorityByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityputawayPriorityApi#entityPutawayPriorityByIdGET");
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

<a name="entityPutawayPriorityGET"></a>
# **entityPutawayPriorityGET**
> Object entityPutawayPriorityGET()

EntityPutawayPriority_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityputawayPriorityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityputawayPriorityApi apiInstance = new EntityputawayPriorityApi();
try {
    Object result = apiInstance.entityPutawayPriorityGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityputawayPriorityApi#entityPutawayPriorityGET");
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

<a name="entityPutawayPriorityPOST"></a>
# **entityPutawayPriorityPOST**
> Object entityPutawayPriorityPOST()

EntityPutawayPriority_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityputawayPriorityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityputawayPriorityApi apiInstance = new EntityputawayPriorityApi();
try {
    Object result = apiInstance.entityPutawayPriorityPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityputawayPriorityApi#entityPutawayPriorityPOST");
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

