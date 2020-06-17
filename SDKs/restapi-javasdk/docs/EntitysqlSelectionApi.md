# EntitysqlSelectionApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entitySqlSelectionByIdGET**](EntitysqlSelectionApi.md#entitySqlSelectionByIdGET) | **GET** /entity/sql_selection/{id} | EntitySqlSelectionById_GET
[**entitySqlSelectionGET**](EntitysqlSelectionApi.md#entitySqlSelectionGET) | **GET** /entity/sql_selection | EntitySqlSelection_GET
[**entitySqlSelectionPOST**](EntitysqlSelectionApi.md#entitySqlSelectionPOST) | **POST** /entity/sql_selection | EntitySqlSelection_POST


<a name="entitySqlSelectionByIdGET"></a>
# **entitySqlSelectionByIdGET**
> Object entitySqlSelectionByIdGET(id, fields)

EntitySqlSelectionById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitysqlSelectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitysqlSelectionApi apiInstance = new EntitysqlSelectionApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entitySqlSelectionByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitysqlSelectionApi#entitySqlSelectionByIdGET");
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

<a name="entitySqlSelectionGET"></a>
# **entitySqlSelectionGET**
> Object entitySqlSelectionGET()

EntitySqlSelection_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitysqlSelectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitysqlSelectionApi apiInstance = new EntitysqlSelectionApi();
try {
    Object result = apiInstance.entitySqlSelectionGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitysqlSelectionApi#entitySqlSelectionGET");
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

<a name="entitySqlSelectionPOST"></a>
# **entitySqlSelectionPOST**
> Object entitySqlSelectionPOST()

EntitySqlSelection_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitysqlSelectionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitysqlSelectionApi apiInstance = new EntitysqlSelectionApi();
try {
    Object result = apiInstance.entitySqlSelectionPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitysqlSelectionApi#entitySqlSelectionPOST");
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

