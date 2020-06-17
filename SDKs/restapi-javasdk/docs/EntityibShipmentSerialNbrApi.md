# EntityibShipmentSerialNbrApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityIbShipmentSerialNbrByIdGET**](EntityibShipmentSerialNbrApi.md#entityIbShipmentSerialNbrByIdGET) | **GET** /entity/ib_shipment_serial_nbr/{id} | EntityIbShipmentSerialNbrById_GET
[**entityIbShipmentSerialNbrDescribeGET**](EntityibShipmentSerialNbrApi.md#entityIbShipmentSerialNbrDescribeGET) | **GET** /entity/ib_shipment_serial_nbr/describe | EntityIbShipmentSerialNbrDescribe_GET
[**entityIbShipmentSerialNbrGET**](EntityibShipmentSerialNbrApi.md#entityIbShipmentSerialNbrGET) | **GET** /entity/ib_shipment_serial_nbr | EntityIbShipmentSerialNbr_GET


<a name="entityIbShipmentSerialNbrByIdGET"></a>
# **entityIbShipmentSerialNbrByIdGET**
> Object entityIbShipmentSerialNbrByIdGET(id, fields)

EntityIbShipmentSerialNbrById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityibShipmentSerialNbrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityibShipmentSerialNbrApi apiInstance = new EntityibShipmentSerialNbrApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityIbShipmentSerialNbrByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityibShipmentSerialNbrApi#entityIbShipmentSerialNbrByIdGET");
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

<a name="entityIbShipmentSerialNbrDescribeGET"></a>
# **entityIbShipmentSerialNbrDescribeGET**
> Object entityIbShipmentSerialNbrDescribeGET()

EntityIbShipmentSerialNbrDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityibShipmentSerialNbrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityibShipmentSerialNbrApi apiInstance = new EntityibShipmentSerialNbrApi();
try {
    Object result = apiInstance.entityIbShipmentSerialNbrDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityibShipmentSerialNbrApi#entityIbShipmentSerialNbrDescribeGET");
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

<a name="entityIbShipmentSerialNbrGET"></a>
# **entityIbShipmentSerialNbrGET**
> Object entityIbShipmentSerialNbrGET(fields, ordering, pageMode)

EntityIbShipmentSerialNbr_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntityibShipmentSerialNbrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntityibShipmentSerialNbrApi apiInstance = new EntityibShipmentSerialNbrApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityIbShipmentSerialNbrGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntityibShipmentSerialNbrApi#entityIbShipmentSerialNbrGET");
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

