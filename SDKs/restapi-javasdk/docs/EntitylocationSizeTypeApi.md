# EntitylocationSizeTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityLocationSizeTypeByIdGET**](EntitylocationSizeTypeApi.md#entityLocationSizeTypeByIdGET) | **GET** /entity/location_size_type/{id} | EntityLocationSizeTypeById_GET
[**entityLocationSizeTypeGET**](EntitylocationSizeTypeApi.md#entityLocationSizeTypeGET) | **GET** /entity/location_size_type | EntityLocationSizeType_GET
[**entityLocationSizeTypePOST**](EntitylocationSizeTypeApi.md#entityLocationSizeTypePOST) | **POST** /entity/location_size_type | EntityLocationSizeType_POST


<a name="entityLocationSizeTypeByIdGET"></a>
# **entityLocationSizeTypeByIdGET**
> Object entityLocationSizeTypeByIdGET(id, fields)

EntityLocationSizeTypeById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitylocationSizeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitylocationSizeTypeApi apiInstance = new EntitylocationSizeTypeApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityLocationSizeTypeByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitylocationSizeTypeApi#entityLocationSizeTypeByIdGET");
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

<a name="entityLocationSizeTypeGET"></a>
# **entityLocationSizeTypeGET**
> Object entityLocationSizeTypeGET()

EntityLocationSizeType_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitylocationSizeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitylocationSizeTypeApi apiInstance = new EntitylocationSizeTypeApi();
try {
    Object result = apiInstance.entityLocationSizeTypeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitylocationSizeTypeApi#entityLocationSizeTypeGET");
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

<a name="entityLocationSizeTypePOST"></a>
# **entityLocationSizeTypePOST**
> Object entityLocationSizeTypePOST()

EntityLocationSizeType_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitylocationSizeTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitylocationSizeTypeApi apiInstance = new EntitylocationSizeTypeApi();
try {
    Object result = apiInstance.entityLocationSizeTypePOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitylocationSizeTypeApi#entityLocationSizeTypePOST");
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

