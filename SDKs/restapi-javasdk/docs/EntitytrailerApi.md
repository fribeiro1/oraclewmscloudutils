# EntitytrailerApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entityTrailerByIdGET**](EntitytrailerApi.md#entityTrailerByIdGET) | **GET** /entity/trailer/{id} | EntityTrailerById_GET
[**entityTrailerDescribeGET**](EntitytrailerApi.md#entityTrailerDescribeGET) | **GET** /entity/trailer/describe | EntityTrailerDescribe_GET
[**entityTrailerGET**](EntitytrailerApi.md#entityTrailerGET) | **GET** /entity/trailer | EntityTrailer_GET
[**entityTrailerLocateToYardByIdPOST**](EntitytrailerApi.md#entityTrailerLocateToYardByIdPOST) | **POST** /entity/trailer/{id}/locate_to_yard | EntityTrailerLocateToYardById_POST
[**entityTrailerLocateToYardPOST**](EntitytrailerApi.md#entityTrailerLocateToYardPOST) | **POST** /entity/trailer/locate_to_yard | EntityTrailerLocateToYard_POST
[**entityTrailerPOST**](EntitytrailerApi.md#entityTrailerPOST) | **POST** /entity/trailer | EntityTrailer_POST
[**entityTrailerRemoveFromYardByIdPOST**](EntitytrailerApi.md#entityTrailerRemoveFromYardByIdPOST) | **POST** /entity/trailer/{id}/remove_from_yard | EntityTrailerRemoveFromYardById_POST
[**entityTrailerRemoveFromYardPOST**](EntitytrailerApi.md#entityTrailerRemoveFromYardPOST) | **POST** /entity/trailer/remove_from_yard | EntityTrailerRemoveFromYard_POST


<a name="entityTrailerByIdGET"></a>
# **entityTrailerByIdGET**
> Object entityTrailerByIdGET(id, fields)

EntityTrailerById_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitytrailerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitytrailerApi apiInstance = new EntitytrailerApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
String fields = "fields_example"; // String | 
try {
    Object result = apiInstance.entityTrailerByIdGET(id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitytrailerApi#entityTrailerByIdGET");
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

<a name="entityTrailerDescribeGET"></a>
# **entityTrailerDescribeGET**
> Object entityTrailerDescribeGET()

EntityTrailerDescribe_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitytrailerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitytrailerApi apiInstance = new EntitytrailerApi();
try {
    Object result = apiInstance.entityTrailerDescribeGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitytrailerApi#entityTrailerDescribeGET");
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

<a name="entityTrailerGET"></a>
# **entityTrailerGET**
> Object entityTrailerGET(fields, ordering, pageMode)

EntityTrailer_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitytrailerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitytrailerApi apiInstance = new EntitytrailerApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityTrailerGET(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitytrailerApi#entityTrailerGET");
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

<a name="entityTrailerLocateToYardByIdPOST"></a>
# **entityTrailerLocateToYardByIdPOST**
> Object entityTrailerLocateToYardByIdPOST(id)

EntityTrailerLocateToYardById_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitytrailerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitytrailerApi apiInstance = new EntitytrailerApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
try {
    Object result = apiInstance.entityTrailerLocateToYardByIdPOST(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitytrailerApi#entityTrailerLocateToYardByIdPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **BigDecimal**|  |

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="entityTrailerLocateToYardPOST"></a>
# **entityTrailerLocateToYardPOST**
> Object entityTrailerLocateToYardPOST()

EntityTrailerLocateToYard_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitytrailerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitytrailerApi apiInstance = new EntitytrailerApi();
try {
    Object result = apiInstance.entityTrailerLocateToYardPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitytrailerApi#entityTrailerLocateToYardPOST");
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

<a name="entityTrailerPOST"></a>
# **entityTrailerPOST**
> Object entityTrailerPOST(fields, ordering, pageMode)

EntityTrailer_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitytrailerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitytrailerApi apiInstance = new EntitytrailerApi();
String fields = "fields_example"; // String | 
String ordering = "ordering_example"; // String | 
String pageMode = "paged"; // String | 
try {
    Object result = apiInstance.entityTrailerPOST(fields, ordering, pageMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitytrailerApi#entityTrailerPOST");
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

<a name="entityTrailerRemoveFromYardByIdPOST"></a>
# **entityTrailerRemoveFromYardByIdPOST**
> Object entityTrailerRemoveFromYardByIdPOST(id)

EntityTrailerRemoveFromYardById_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitytrailerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitytrailerApi apiInstance = new EntitytrailerApi();
BigDecimal id = new BigDecimal(); // BigDecimal | 
try {
    Object result = apiInstance.entityTrailerRemoveFromYardByIdPOST(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitytrailerApi#entityTrailerRemoveFromYardByIdPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **BigDecimal**|  |

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="entityTrailerRemoveFromYardPOST"></a>
# **entityTrailerRemoveFromYardPOST**
> Object entityTrailerRemoveFromYardPOST()

EntityTrailerRemoveFromYard_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EntitytrailerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

EntitytrailerApi apiInstance = new EntitytrailerApi();
try {
    Object result = apiInstance.entityTrailerRemoveFromYardPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitytrailerApi#entityTrailerRemoveFromYardPOST");
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

