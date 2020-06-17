# SwaggerClient::EntityentityChangeActionApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_entity_change_action_by_id_get**](EntityentityChangeActionApi.md#entity_entity_change_action_by_id_get) | **GET** /entity/entity_change_action/{id} | EntityEntityChangeActionById_GET
[**entity_entity_change_action_describe_get**](EntityentityChangeActionApi.md#entity_entity_change_action_describe_get) | **GET** /entity/entity_change_action/describe | EntityEntityChangeActionDescribe_GET
[**entity_entity_change_action_get**](EntityentityChangeActionApi.md#entity_entity_change_action_get) | **GET** /entity/entity_change_action | EntityEntityChangeAction_GET


# **entity_entity_change_action_by_id_get**
> Object entity_entity_change_action_by_id_get(id, opts)

EntityEntityChangeActionById_GET



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

api_instance = SwaggerClient::EntityentityChangeActionApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityEntityChangeActionById_GET
  result = api_instance.entity_entity_change_action_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityentityChangeActionApi->entity_entity_change_action_by_id_get: #{e}"
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



# **entity_entity_change_action_describe_get**
> Object entity_entity_change_action_describe_get

EntityEntityChangeActionDescribe_GET



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

api_instance = SwaggerClient::EntityentityChangeActionApi.new

begin
  #EntityEntityChangeActionDescribe_GET
  result = api_instance.entity_entity_change_action_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityentityChangeActionApi->entity_entity_change_action_describe_get: #{e}"
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



# **entity_entity_change_action_get**
> Object entity_entity_change_action_get(opts)

EntityEntityChangeAction_GET



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

api_instance = SwaggerClient::EntityentityChangeActionApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityEntityChangeAction_GET
  result = api_instance.entity_entity_change_action_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityentityChangeActionApi->entity_entity_change_action_get: #{e}"
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



