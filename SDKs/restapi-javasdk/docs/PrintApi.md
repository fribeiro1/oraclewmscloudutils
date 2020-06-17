# PrintApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**printLabelIbContainerGET**](PrintApi.md#printLabelIbContainerGET) | **GET** /print/label/ib_container | PrintLabelIbContainer_GET
[**printLabelIbContainerPOST**](PrintApi.md#printLabelIbContainerPOST) | **POST** /print/label/ib_container | PrintLabelIbContainer_POST
[**printLabelPalletGET**](PrintApi.md#printLabelPalletGET) | **GET** /print/label/pallet | PrintLabelPallet_GET
[**printLabelPalletPOST**](PrintApi.md#printLabelPalletPOST) | **POST** /print/label/pallet | PrintLabelPallet_POST
[**printLabelShippingGET**](PrintApi.md#printLabelShippingGET) | **GET** /print/label/shipping | PrintLabelShipping_GET
[**printLabelShippingPOST**](PrintApi.md#printLabelShippingPOST) | **POST** /print/label/shipping | PrintLabelShipping_POST


<a name="printLabelIbContainerGET"></a>
# **printLabelIbContainerGET**
> Object printLabelIbContainerGET(companyId, containerNbr, facilityId, id, labelDesignerCode)

PrintLabelIbContainer_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PrintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PrintApi apiInstance = new PrintApi();
BigDecimal companyId = new BigDecimal(); // BigDecimal | 
String containerNbr = "containerNbr_example"; // String | 
BigDecimal facilityId = new BigDecimal(); // BigDecimal | 
BigDecimal id = new BigDecimal(); // BigDecimal | 
String labelDesignerCode = "labelDesignerCode_example"; // String | 
try {
    Object result = apiInstance.printLabelIbContainerGET(companyId, containerNbr, facilityId, id, labelDesignerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintApi#printLabelIbContainerGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **BigDecimal**|  |
 **containerNbr** | **String**|  |
 **facilityId** | **BigDecimal**|  |
 **id** | **BigDecimal**|  |
 **labelDesignerCode** | **String**|  |

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="printLabelIbContainerPOST"></a>
# **printLabelIbContainerPOST**
> Object printLabelIbContainerPOST(companyId, containerNbr, facilityId, id, labelDesignerCode)

PrintLabelIbContainer_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PrintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PrintApi apiInstance = new PrintApi();
BigDecimal companyId = new BigDecimal(); // BigDecimal | 
String containerNbr = "containerNbr_example"; // String | 
BigDecimal facilityId = new BigDecimal(); // BigDecimal | 
BigDecimal id = new BigDecimal(); // BigDecimal | 
String labelDesignerCode = "labelDesignerCode_example"; // String | 
try {
    Object result = apiInstance.printLabelIbContainerPOST(companyId, containerNbr, facilityId, id, labelDesignerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintApi#printLabelIbContainerPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **BigDecimal**|  |
 **containerNbr** | **String**|  |
 **facilityId** | **BigDecimal**|  |
 **id** | **BigDecimal**|  |
 **labelDesignerCode** | **String**|  |

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="printLabelPalletGET"></a>
# **printLabelPalletGET**
> Object printLabelPalletGET(companyId, containerNbr, facilityId, id, labelDesignerCode)

PrintLabelPallet_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PrintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PrintApi apiInstance = new PrintApi();
BigDecimal companyId = new BigDecimal(); // BigDecimal | 
String containerNbr = "containerNbr_example"; // String | 
BigDecimal facilityId = new BigDecimal(); // BigDecimal | 
BigDecimal id = new BigDecimal(); // BigDecimal | 
String labelDesignerCode = "labelDesignerCode_example"; // String | 
try {
    Object result = apiInstance.printLabelPalletGET(companyId, containerNbr, facilityId, id, labelDesignerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintApi#printLabelPalletGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **BigDecimal**|  |
 **containerNbr** | **String**|  |
 **facilityId** | **BigDecimal**|  |
 **id** | **BigDecimal**|  |
 **labelDesignerCode** | **String**|  |

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="printLabelPalletPOST"></a>
# **printLabelPalletPOST**
> Object printLabelPalletPOST(companyId, containerNbr, facilityId, id, labelDesignerCode)

PrintLabelPallet_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PrintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PrintApi apiInstance = new PrintApi();
BigDecimal companyId = new BigDecimal(); // BigDecimal | 
String containerNbr = "containerNbr_example"; // String | 
BigDecimal facilityId = new BigDecimal(); // BigDecimal | 
BigDecimal id = new BigDecimal(); // BigDecimal | 
String labelDesignerCode = "labelDesignerCode_example"; // String | 
try {
    Object result = apiInstance.printLabelPalletPOST(companyId, containerNbr, facilityId, id, labelDesignerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintApi#printLabelPalletPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **BigDecimal**|  |
 **containerNbr** | **String**|  |
 **facilityId** | **BigDecimal**|  |
 **id** | **BigDecimal**|  |
 **labelDesignerCode** | **String**|  |

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="printLabelShippingGET"></a>
# **printLabelShippingGET**
> Object printLabelShippingGET(companyId, containerNbr, facilityId, id, labelDesignerCode)

PrintLabelShipping_GET



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PrintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PrintApi apiInstance = new PrintApi();
BigDecimal companyId = new BigDecimal(); // BigDecimal | 
String containerNbr = "containerNbr_example"; // String | 
BigDecimal facilityId = new BigDecimal(); // BigDecimal | 
BigDecimal id = new BigDecimal(); // BigDecimal | 
String labelDesignerCode = "labelDesignerCode_example"; // String | 
try {
    Object result = apiInstance.printLabelShippingGET(companyId, containerNbr, facilityId, id, labelDesignerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintApi#printLabelShippingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **BigDecimal**|  |
 **containerNbr** | **String**|  |
 **facilityId** | **BigDecimal**|  |
 **id** | **BigDecimal**|  |
 **labelDesignerCode** | **String**|  |

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="printLabelShippingPOST"></a>
# **printLabelShippingPOST**
> Object printLabelShippingPOST(companyId, containerNbr, facilityId, id, labelDesignerCode)

PrintLabelShipping_POST



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PrintApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PrintApi apiInstance = new PrintApi();
BigDecimal companyId = new BigDecimal(); // BigDecimal | 
String containerNbr = "containerNbr_example"; // String | 
BigDecimal facilityId = new BigDecimal(); // BigDecimal | 
BigDecimal id = new BigDecimal(); // BigDecimal | 
String labelDesignerCode = "labelDesignerCode_example"; // String | 
try {
    Object result = apiInstance.printLabelShippingPOST(companyId, containerNbr, facilityId, id, labelDesignerCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintApi#printLabelShippingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **BigDecimal**|  |
 **containerNbr** | **String**|  |
 **facilityId** | **BigDecimal**|  |
 **id** | **BigDecimal**|  |
 **labelDesignerCode** | **String**|  |

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

