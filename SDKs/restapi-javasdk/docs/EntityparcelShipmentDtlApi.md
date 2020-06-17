# EntityparcelShipmentDtlApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityParcelShipmentDtlByIdGET**](EntityparcelShipmentDtlApi.md#entityParcelShipmentDtlByIdGET) | **GET** /entity/parcel_shipment_dtl/{id} | EntityParcelShipmentDtlById_GET
[**entityParcelShipmentDtlDescribeGET**](EntityparcelShipmentDtlApi.md#entityParcelShipmentDtlDescribeGET) | **GET** /entity/parcel_shipment_dtl/describe | EntityParcelShipmentDtlDescribe_GET
[**entityParcelShipmentDtlGET**](EntityparcelShipmentDtlApi.md#entityParcelShipmentDtlGET) | **GET** /entity/parcel_shipment_dtl | EntityParcelShipmentDtl_GET


<a name="entityParcelShipmentDtlByIdGET"></a>
# **entityParcelShipmentDtlByIdGET**
> Object entityParcelShipmentDtlByIdGET(id, fields)

EntityParcelShipmentDtlById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityparcelShipmentDtlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityparcelShipmentDtlApi apiInstance = new EntityparcelShipmentDtlApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityParcelShipmentDtlByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityparcelShipmentDtlApi#entityParcelShipmentDtlByIdGET");
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

<a name="entityParcelShipmentDtlDescribeGET"></a>
# **entityParcelShipmentDtlDescribeGET**
> Object entityParcelShipmentDtlDescribeGET()

EntityParcelShipmentDtlDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityparcelShipmentDtlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityparcelShipmentDtlApi apiInstance = new EntityparcelShipmentDtlApi();
try {
    Object result = apiInstance.entityParcelShipmentDtlDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityparcelShipmentDtlApi#entityParcelShipmentDtlDescribeGET");
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

<a name="entityParcelShipmentDtlGET"></a>
# **entityParcelShipmentDtlGET**
> Object entityParcelShipmentDtlGET(fields, ordering, pageMode)

EntityParcelShipmentDtl_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityparcelShipmentDtlApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityparcelShipmentDtlApi apiInstance = new EntityparcelShipmentDtlApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityParcelShipmentDtlGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityparcelShipmentDtlApi#entityParcelShipmentDtlGET");
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

