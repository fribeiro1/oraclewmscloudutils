# SwaggerClient::EntitybreakByModifierApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_break_by_modifier_by_id_get**](EntitybreakByModifierApi.md#entity_break_by_modifier_by_id_get) | **GET** /entity/break_by_modifier/{id} | EntityBreakByModifierById_GET
[**entity_break_by_modifier_describe_get**](EntitybreakByModifierApi.md#entity_break_by_modifier_describe_get) | **GET** /entity/break_by_modifier/describe | EntityBreakByModifierDescribe_GET
[**entity_break_by_modifier_get**](EntitybreakByModifierApi.md#entity_break_by_modifier_get) | **GET** /entity/break_by_modifier | EntityBreakByModifier_GET


# **entity_break_by_modifier_by_id_get**
> Object entity_break_by_modifier_by_id_get(id, opts)

EntityBreakByModifierById_GET



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

api_instance = SwaggerClient::EntitybreakByModifierApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityBreakByModifierById_GET
  result = api_instance.entity_break_by_modifier_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitybreakByModifierApi->entity_break_by_modifier_by_id_get: #{e}"
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



# **entity_break_by_modifier_describe_get**
> Object entity_break_by_modifier_describe_get

EntityBreakByModifierDescribe_GET



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

api_instance = SwaggerClient::EntitybreakByModifierApi.new

begin
  #EntityBreakByModifierDescribe_GET
  result = api_instance.entity_break_by_modifier_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitybreakByModifierApi->entity_break_by_modifier_describe_get: #{e}"
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



# **entity_break_by_modifier_get**
> Object entity_break_by_modifier_get(opts)

EntityBreakByModifier_GET



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

api_instance = SwaggerClient::EntitybreakByModifierApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityBreakByModifier_GET
  result = api_instance.entity_break_by_modifier_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitybreakByModifierApi->entity_break_by_modifier_get: #{e}"
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



