# SwaggerClient::EntityprinterProtocolApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_printer_protocol_by_id_get**](EntityprinterProtocolApi.md#entity_printer_protocol_by_id_get) | **GET** /entity/printer_protocol/{id} | EntityPrinterProtocolById_GET
[**entity_printer_protocol_describe_get**](EntityprinterProtocolApi.md#entity_printer_protocol_describe_get) | **GET** /entity/printer_protocol/describe | EntityPrinterProtocolDescribe_GET
[**entity_printer_protocol_get**](EntityprinterProtocolApi.md#entity_printer_protocol_get) | **GET** /entity/printer_protocol | EntityPrinterProtocol_GET


# **entity_printer_protocol_by_id_get**
> Object entity_printer_protocol_by_id_get(id, opts)

EntityPrinterProtocolById_GET



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

api_instance = SwaggerClient::EntityprinterProtocolApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityPrinterProtocolById_GET
  result = api_instance.entity_printer_protocol_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityprinterProtocolApi->entity_printer_protocol_by_id_get: #{e}"
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



# **entity_printer_protocol_describe_get**
> Object entity_printer_protocol_describe_get

EntityPrinterProtocolDescribe_GET



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

api_instance = SwaggerClient::EntityprinterProtocolApi.new

begin
  #EntityPrinterProtocolDescribe_GET
  result = api_instance.entity_printer_protocol_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityprinterProtocolApi->entity_printer_protocol_describe_get: #{e}"
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



# **entity_printer_protocol_get**
> Object entity_printer_protocol_get(opts)

EntityPrinterProtocol_GET



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

api_instance = SwaggerClient::EntityprinterProtocolApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityPrinterProtocol_GET
  result = api_instance.entity_printer_protocol_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityprinterProtocolApi->entity_printer_protocol_get: #{e}"
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



