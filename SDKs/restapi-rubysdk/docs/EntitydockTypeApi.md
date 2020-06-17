# SwaggerClient::EntitydockTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_dock_type_by_id_get**](EntitydockTypeApi.md#entity_dock_type_by_id_get) | **GET** /entity/dock_type/{id} | EntityDockTypeById_GET
[**entity_dock_type_describe_get**](EntitydockTypeApi.md#entity_dock_type_describe_get) | **GET** /entity/dock_type/describe | EntityDockTypeDescribe_GET
[**entity_dock_type_get**](EntitydockTypeApi.md#entity_dock_type_get) | **GET** /entity/dock_type | EntityDockType_GET


# **entity_dock_type_by_id_get**
> Object entity_dock_type_by_id_get(id, opts)

EntityDockTypeById_GET



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

api_instance = SwaggerClient::EntitydockTypeApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityDockTypeById_GET
  result = api_instance.entity_dock_type_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitydockTypeApi->entity_dock_type_by_id_get: #{e}"
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



# **entity_dock_type_describe_get**
> Object entity_dock_type_describe_get

EntityDockTypeDescribe_GET



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

api_instance = SwaggerClient::EntitydockTypeApi.new

begin
  #EntityDockTypeDescribe_GET
  result = api_instance.entity_dock_type_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitydockTypeApi->entity_dock_type_describe_get: #{e}"
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



# **entity_dock_type_get**
> Object entity_dock_type_get(opts)

EntityDockType_GET



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

api_instance = SwaggerClient::EntitydockTypeApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityDockType_GET
  result = api_instance.entity_dock_type_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitydockTypeApi->entity_dock_type_get: #{e}"
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



