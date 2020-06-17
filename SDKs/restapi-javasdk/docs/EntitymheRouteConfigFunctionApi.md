# EntitymheRouteConfigFunctionApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityMheRouteConfigFunctionByIdGET**](EntitymheRouteConfigFunctionApi.md#entityMheRouteConfigFunctionByIdGET) | **GET** /entity/mhe_route_config_function/{id} | EntityMheRouteConfigFunctionById_GET
[**entityMheRouteConfigFunctionDescribeGET**](EntitymheRouteConfigFunctionApi.md#entityMheRouteConfigFunctionDescribeGET) | **GET** /entity/mhe_route_config_function/describe | EntityMheRouteConfigFunctionDescribe_GET
[**entityMheRouteConfigFunctionGET**](EntitymheRouteConfigFunctionApi.md#entityMheRouteConfigFunctionGET) | **GET** /entity/mhe_route_config_function | EntityMheRouteConfigFunction_GET


<a name="entityMheRouteConfigFunctionByIdGET"></a>
# **entityMheRouteConfigFunctionByIdGET**
> Object entityMheRouteConfigFunctionByIdGET(id, fields)

EntityMheRouteConfigFunctionById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitymheRouteConfigFunctionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitymheRouteConfigFunctionApi apiInstance = new EntitymheRouteConfigFunctionApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityMheRouteConfigFunctionByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitymheRouteConfigFunctionApi#entityMheRouteConfigFunctionByIdGET");
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

<a name="entityMheRouteConfigFunctionDescribeGET"></a>
# **entityMheRouteConfigFunctionDescribeGET**
> Object entityMheRouteConfigFunctionDescribeGET()

EntityMheRouteConfigFunctionDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitymheRouteConfigFunctionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitymheRouteConfigFunctionApi apiInstance = new EntitymheRouteConfigFunctionApi();
try {
    Object result = apiInstance.entityMheRouteConfigFunctionDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitymheRouteConfigFunctionApi#entityMheRouteConfigFunctionDescribeGET");
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

<a name="entityMheRouteConfigFunctionGET"></a>
# **entityMheRouteConfigFunctionGET**
> Object entityMheRouteConfigFunctionGET(fields, ordering, pageMode)

EntityMheRouteConfigFunction_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitymheRouteConfigFunctionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitymheRouteConfigFunctionApi apiInstance = new EntitymheRouteConfigFunctionApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityMheRouteConfigFunctionGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitymheRouteConfigFunctionApi#entityMheRouteConfigFunctionGET");
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

