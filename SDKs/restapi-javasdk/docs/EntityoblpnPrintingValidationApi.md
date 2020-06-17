# EntityoblpnPrintingValidationApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityOblpnPrintingValidationByIdGET**](EntityoblpnPrintingValidationApi.md#entityOblpnPrintingValidationByIdGET) | **GET** /entity/oblpn_printing_validation/{id} | EntityOblpnPrintingValidationById_GET
[**entityOblpnPrintingValidationDescribeGET**](EntityoblpnPrintingValidationApi.md#entityOblpnPrintingValidationDescribeGET) | **GET** /entity/oblpn_printing_validation/describe | EntityOblpnPrintingValidationDescribe_GET
[**entityOblpnPrintingValidationGET**](EntityoblpnPrintingValidationApi.md#entityOblpnPrintingValidationGET) | **GET** /entity/oblpn_printing_validation | EntityOblpnPrintingValidation_GET


<a name="entityOblpnPrintingValidationByIdGET"></a>
# **entityOblpnPrintingValidationByIdGET**
> Object entityOblpnPrintingValidationByIdGET(id, fields)

EntityOblpnPrintingValidationById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityoblpnPrintingValidationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityoblpnPrintingValidationApi apiInstance = new EntityoblpnPrintingValidationApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityOblpnPrintingValidationByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityoblpnPrintingValidationApi#entityOblpnPrintingValidationByIdGET");
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

<a name="entityOblpnPrintingValidationDescribeGET"></a>
# **entityOblpnPrintingValidationDescribeGET**
> Object entityOblpnPrintingValidationDescribeGET()

EntityOblpnPrintingValidationDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityoblpnPrintingValidationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityoblpnPrintingValidationApi apiInstance = new EntityoblpnPrintingValidationApi();
try {
    Object result = apiInstance.entityOblpnPrintingValidationDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityoblpnPrintingValidationApi#entityOblpnPrintingValidationDescribeGET");
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

<a name="entityOblpnPrintingValidationGET"></a>
# **entityOblpnPrintingValidationGET**
> Object entityOblpnPrintingValidationGET(fields, ordering, pageMode)

EntityOblpnPrintingValidation_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityoblpnPrintingValidationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityoblpnPrintingValidationApi apiInstance = new EntityoblpnPrintingValidationApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityOblpnPrintingValidationGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityoblpnPrintingValidationApi#entityOblpnPrintingValidationGET");
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

