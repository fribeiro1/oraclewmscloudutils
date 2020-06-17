# EntityreplenishmentZoneApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityReplenishmentZoneByIdGET**](EntityreplenishmentZoneApi.md#entityReplenishmentZoneByIdGET) | **GET** /entity/replenishment_zone/{id} | EntityReplenishmentZoneById_GET
[**entityReplenishmentZoneGET**](EntityreplenishmentZoneApi.md#entityReplenishmentZoneGET) | **GET** /entity/replenishment_zone | EntityReplenishmentZone_GET
[**entityReplenishmentZonePOST**](EntityreplenishmentZoneApi.md#entityReplenishmentZonePOST) | **POST** /entity/replenishment_zone | EntityReplenishmentZone_POST


<a name="entityReplenishmentZoneByIdGET"></a>
# **entityReplenishmentZoneByIdGET**
> Object entityReplenishmentZoneByIdGET(id, fields)

EntityReplenishmentZoneById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityreplenishmentZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityreplenishmentZoneApi apiInstance = new EntityreplenishmentZoneApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityReplenishmentZoneByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityreplenishmentZoneApi#entityReplenishmentZoneByIdGET");
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

<a name="entityReplenishmentZoneGET"></a>
# **entityReplenishmentZoneGET**
> Object entityReplenishmentZoneGET()

EntityReplenishmentZone_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityreplenishmentZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityreplenishmentZoneApi apiInstance = new EntityreplenishmentZoneApi();
try {
    Object result = apiInstance.entityReplenishmentZoneGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityreplenishmentZoneApi#entityReplenishmentZoneGET");
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

<a name="entityReplenishmentZonePOST"></a>
# **entityReplenishmentZonePOST**
> Object entityReplenishmentZonePOST()

EntityReplenishmentZone_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityreplenishmentZoneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityreplenishmentZoneApi apiInstance = new EntityreplenishmentZoneApi();
try {
    Object result = apiInstance.entityReplenishmentZonePOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityreplenishmentZoneApi#entityReplenishmentZonePOST");
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

