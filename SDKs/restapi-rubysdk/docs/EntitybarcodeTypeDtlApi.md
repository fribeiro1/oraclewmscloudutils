# SwaggerClient::EntitybarcodeTypeDtlApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_barcode_type_dtl_by_id_get**](EntitybarcodeTypeDtlApi.md#entity_barcode_type_dtl_by_id_get) | **GET** /entity/barcode_type_dtl/{id} | EntityBarcodeTypeDtlById_GET
[**entity_barcode_type_dtl_describe_get**](EntitybarcodeTypeDtlApi.md#entity_barcode_type_dtl_describe_get) | **GET** /entity/barcode_type_dtl/describe | EntityBarcodeTypeDtlDescribe_GET
[**entity_barcode_type_dtl_get**](EntitybarcodeTypeDtlApi.md#entity_barcode_type_dtl_get) | **GET** /entity/barcode_type_dtl | EntityBarcodeTypeDtl_GET


# **entity_barcode_type_dtl_by_id_get**
> Object entity_barcode_type_dtl_by_id_get(id, opts)

EntityBarcodeTypeDtlById_GET



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::EntitybarcodeTypeDtlApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityBarcodeTypeDtlById_GET
  result = api_instance.entity_barcode_type_dtl_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitybarcodeTypeDtlApi->entity_barcode_type_dtl_by_id_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Float**|  | 
 **fields** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **entity_barcode_type_dtl_describe_get**
> Object entity_barcode_type_dtl_describe_get

EntityBarcodeTypeDtlDescribe_GET



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::EntitybarcodeTypeDtlApi.new

begin
  #EntityBarcodeTypeDtlDescribe_GET
  result = api_instance.entity_barcode_type_dtl_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitybarcodeTypeDtlApi->entity_barcode_type_dtl_describe_get: #{e}"
end
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



# **entity_barcode_type_dtl_get**
> Object entity_barcode_type_dtl_get(opts)

EntityBarcodeTypeDtl_GET



### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure HTTP basic authorization: basic
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure OAuth2 access token for authorization: oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = SwaggerClient::EntitybarcodeTypeDtlApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityBarcodeTypeDtl_GET
  result = api_instance.entity_barcode_type_dtl_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitybarcodeTypeDtlApi->entity_barcode_type_dtl_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional] 
 **ordering** | **String**|  | [optional] 
 **page_mode** | **String**|  | [optional] [default to paged]

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



