# SwaggerClient::EntityscreenTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_screen_type_by_id_get**](EntityscreenTypeApi.md#entity_screen_type_by_id_get) | **GET** /entity/screen_type/{id} | EntityScreenTypeById_GET
[**entity_screen_type_describe_get**](EntityscreenTypeApi.md#entity_screen_type_describe_get) | **GET** /entity/screen_type/describe | EntityScreenTypeDescribe_GET
[**entity_screen_type_get**](EntityscreenTypeApi.md#entity_screen_type_get) | **GET** /entity/screen_type | EntityScreenType_GET


# **entity_screen_type_by_id_get**
> Object entity_screen_type_by_id_get(id, opts)

EntityScreenTypeById_GET



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

api_instance = SwaggerClient::EntityscreenTypeApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityScreenTypeById_GET
  result = api_instance.entity_screen_type_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityscreenTypeApi->entity_screen_type_by_id_get: #{e}"
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



# **entity_screen_type_describe_get**
> Object entity_screen_type_describe_get

EntityScreenTypeDescribe_GET



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

api_instance = SwaggerClient::EntityscreenTypeApi.new

begin
  #EntityScreenTypeDescribe_GET
  result = api_instance.entity_screen_type_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityscreenTypeApi->entity_screen_type_describe_get: #{e}"
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



# **entity_screen_type_get**
> Object entity_screen_type_get(opts)

EntityScreenType_GET



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

api_instance = SwaggerClient::EntityscreenTypeApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityScreenType_GET
  result = api_instance.entity_screen_type_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityscreenTypeApi->entity_screen_type_get: #{e}"
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



