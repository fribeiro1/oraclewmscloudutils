# SwaggerClient::EntityorderInstructionLevelApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_order_instruction_level_by_id_get**](EntityorderInstructionLevelApi.md#entity_order_instruction_level_by_id_get) | **GET** /entity/order_instruction_level/{id} | EntityOrderInstructionLevelById_GET
[**entity_order_instruction_level_describe_get**](EntityorderInstructionLevelApi.md#entity_order_instruction_level_describe_get) | **GET** /entity/order_instruction_level/describe | EntityOrderInstructionLevelDescribe_GET
[**entity_order_instruction_level_get**](EntityorderInstructionLevelApi.md#entity_order_instruction_level_get) | **GET** /entity/order_instruction_level | EntityOrderInstructionLevel_GET


# **entity_order_instruction_level_by_id_get**
> Object entity_order_instruction_level_by_id_get(id, opts)

EntityOrderInstructionLevelById_GET



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

api_instance = SwaggerClient::EntityorderInstructionLevelApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityOrderInstructionLevelById_GET
  result = api_instance.entity_order_instruction_level_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityorderInstructionLevelApi->entity_order_instruction_level_by_id_get: #{e}"
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



# **entity_order_instruction_level_describe_get**
> Object entity_order_instruction_level_describe_get

EntityOrderInstructionLevelDescribe_GET



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

api_instance = SwaggerClient::EntityorderInstructionLevelApi.new

begin
  #EntityOrderInstructionLevelDescribe_GET
  result = api_instance.entity_order_instruction_level_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityorderInstructionLevelApi->entity_order_instruction_level_describe_get: #{e}"
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



# **entity_order_instruction_level_get**
> Object entity_order_instruction_level_get(opts)

EntityOrderInstructionLevel_GET



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

api_instance = SwaggerClient::EntityorderInstructionLevelApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityOrderInstructionLevel_GET
  result = api_instance.entity_order_instruction_level_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityorderInstructionLevelApi->entity_order_instruction_level_get: #{e}"
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



