# SwaggerClient::EntityorderValidationModeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_order_validation_mode_by_id_get**](EntityorderValidationModeApi.md#entity_order_validation_mode_by_id_get) | **GET** /entity/order_validation_mode/{id} | EntityOrderValidationModeById_GET
[**entity_order_validation_mode_describe_get**](EntityorderValidationModeApi.md#entity_order_validation_mode_describe_get) | **GET** /entity/order_validation_mode/describe | EntityOrderValidationModeDescribe_GET
[**entity_order_validation_mode_get**](EntityorderValidationModeApi.md#entity_order_validation_mode_get) | **GET** /entity/order_validation_mode | EntityOrderValidationMode_GET


# **entity_order_validation_mode_by_id_get**
> Object entity_order_validation_mode_by_id_get(id, opts)

EntityOrderValidationModeById_GET



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

api_instance = SwaggerClient::EntityorderValidationModeApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityOrderValidationModeById_GET
  result = api_instance.entity_order_validation_mode_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityorderValidationModeApi->entity_order_validation_mode_by_id_get: #{e}"
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



# **entity_order_validation_mode_describe_get**
> Object entity_order_validation_mode_describe_get

EntityOrderValidationModeDescribe_GET



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

api_instance = SwaggerClient::EntityorderValidationModeApi.new

begin
  #EntityOrderValidationModeDescribe_GET
  result = api_instance.entity_order_validation_mode_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityorderValidationModeApi->entity_order_validation_mode_describe_get: #{e}"
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



# **entity_order_validation_mode_get**
> Object entity_order_validation_mode_get(opts)

EntityOrderValidationMode_GET



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

api_instance = SwaggerClient::EntityorderValidationModeApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityOrderValidationMode_GET
  result = api_instance.entity_order_validation_mode_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityorderValidationModeApi->entity_order_validation_mode_get: #{e}"
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



