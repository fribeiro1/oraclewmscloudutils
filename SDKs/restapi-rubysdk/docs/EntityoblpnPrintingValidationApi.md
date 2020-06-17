# SwaggerClient::EntityoblpnPrintingValidationApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_oblpn_printing_validation_by_id_get**](EntityoblpnPrintingValidationApi.md#entity_oblpn_printing_validation_by_id_get) | **GET** /entity/oblpn_printing_validation/{id} | EntityOblpnPrintingValidationById_GET
[**entity_oblpn_printing_validation_describe_get**](EntityoblpnPrintingValidationApi.md#entity_oblpn_printing_validation_describe_get) | **GET** /entity/oblpn_printing_validation/describe | EntityOblpnPrintingValidationDescribe_GET
[**entity_oblpn_printing_validation_get**](EntityoblpnPrintingValidationApi.md#entity_oblpn_printing_validation_get) | **GET** /entity/oblpn_printing_validation | EntityOblpnPrintingValidation_GET


# **entity_oblpn_printing_validation_by_id_get**
> Object entity_oblpn_printing_validation_by_id_get(id, opts)

EntityOblpnPrintingValidationById_GET



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

api_instance = SwaggerClient::EntityoblpnPrintingValidationApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityOblpnPrintingValidationById_GET
  result = api_instance.entity_oblpn_printing_validation_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityoblpnPrintingValidationApi->entity_oblpn_printing_validation_by_id_get: #{e}"
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



# **entity_oblpn_printing_validation_describe_get**
> Object entity_oblpn_printing_validation_describe_get

EntityOblpnPrintingValidationDescribe_GET



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

api_instance = SwaggerClient::EntityoblpnPrintingValidationApi.new

begin
  #EntityOblpnPrintingValidationDescribe_GET
  result = api_instance.entity_oblpn_printing_validation_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityoblpnPrintingValidationApi->entity_oblpn_printing_validation_describe_get: #{e}"
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



# **entity_oblpn_printing_validation_get**
> Object entity_oblpn_printing_validation_get(opts)

EntityOblpnPrintingValidation_GET



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

api_instance = SwaggerClient::EntityoblpnPrintingValidationApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityOblpnPrintingValidation_GET
  result = api_instance.entity_oblpn_printing_validation_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityoblpnPrintingValidationApi->entity_oblpn_printing_validation_get: #{e}"
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



