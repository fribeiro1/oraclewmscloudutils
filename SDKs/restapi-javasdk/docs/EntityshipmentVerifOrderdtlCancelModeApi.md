# EntityshipmentVerifOrderdtlCancelModeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityShipmentVerifOrderdtlCancelModeDescribeGET**](EntityshipmentVerifOrderdtlCancelModeApi.md#entityShipmentVerifOrderdtlCancelModeDescribeGET) | **GET** /entity/shipment_verif_orderdtl_cancel_mode/describe | EntityShipmentVerifOrderdtlCancelModeDescribe_GET
[**entityShipmentVerifOrderdtlCancelModeGET**](EntityshipmentVerifOrderdtlCancelModeApi.md#entityShipmentVerifOrderdtlCancelModeGET) | **GET** /entity/shipment_verif_orderdtl_cancel_mode | EntityShipmentVerifOrderdtlCancelMode_GET
[**getEntityShipmentVerifOrderdtlCancelModeGET**](EntityshipmentVerifOrderdtlCancelModeApi.md#getEntityShipmentVerifOrderdtlCancelModeGET) | **GET** /entity/shipment_verif_orderdtl_cancel_mode/{id} | EntityShipmentVerifOrderdtlCancelMode_GET


<a name="entityShipmentVerifOrderdtlCancelModeDescribeGET"></a>
# **entityShipmentVerifOrderdtlCancelModeDescribeGET**
> Object entityShipmentVerifOrderdtlCancelModeDescribeGET()

EntityShipmentVerifOrderdtlCancelModeDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityshipmentVerifOrderdtlCancelModeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityshipmentVerifOrderdtlCancelModeApi apiInstance = new EntityshipmentVerifOrderdtlCancelModeApi();
try {
    Object result = apiInstance.entityShipmentVerifOrderdtlCancelModeDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityshipmentVerifOrderdtlCancelModeApi#entityShipmentVerifOrderdtlCancelModeDescribeGET");
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

<a name="entityShipmentVerifOrderdtlCancelModeGET"></a>
# **entityShipmentVerifOrderdtlCancelModeGET**
> Object entityShipmentVerifOrderdtlCancelModeGET(fields, ordering, pageMode)

EntityShipmentVerifOrderdtlCancelMode_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityshipmentVerifOrderdtlCancelModeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityshipmentVerifOrderdtlCancelModeApi apiInstance = new EntityshipmentVerifOrderdtlCancelModeApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityShipmentVerifOrderdtlCancelModeGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityshipmentVerifOrderdtlCancelModeApi#entityShipmentVerifOrderdtlCancelModeGET");
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

<a name="getEntityShipmentVerifOrderdtlCancelModeGET"></a>
# **getEntityShipmentVerifOrderdtlCancelModeGET**
> Object getEntityShipmentVerifOrderdtlCancelModeGET(id, fields)

EntityShipmentVerifOrderdtlCancelMode_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityshipmentVerifOrderdtlCancelModeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityshipmentVerifOrderdtlCancelModeApi apiInstance = new EntityshipmentVerifOrderdtlCancelModeApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.getEntityShipmentVerifOrderdtlCancelModeGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityshipmentVerifOrderdtlCancelModeApi#getEntityShipmentVerifOrderdtlCancelModeGET");
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

