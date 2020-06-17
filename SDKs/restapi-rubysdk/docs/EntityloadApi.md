# SwaggerClient::EntityloadApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_load_by_id_get**](EntityloadApi.md#entity_load_by_id_get) | **GET** /entity/load/{id} | EntityLoadById_GET
[**entity_load_by_id_patch**](EntityloadApi.md#entity_load_by_id_patch) | **PATCH** /entity/load/{id} | EntityLoadById_PATCH
[**entity_load_check_in_by_id_post**](EntityloadApi.md#entity_load_check_in_by_id_post) | **POST** /entity/load/{id}/check_in | EntityLoadCheckInById_POST
[**entity_load_check_in_post**](EntityloadApi.md#entity_load_check_in_post) | **POST** /entity/load/check_in | EntityLoadCheckIn_POST
[**entity_load_check_out_by_id_post**](EntityloadApi.md#entity_load_check_out_by_id_post) | **POST** /entity/load/{id}/check_out | EntityLoadCheckOutById_POST
[**entity_load_check_out_post**](EntityloadApi.md#entity_load_check_out_post) | **POST** /entity/load/check_out | EntityLoadCheckOut_POST
[**entity_load_describe_get**](EntityloadApi.md#entity_load_describe_get) | **GET** /entity/load/describe | EntityLoadDescribe_GET
[**entity_load_get**](EntityloadApi.md#entity_load_get) | **GET** /entity/load | EntityLoad_GET
[**entity_load_ship_by_id_post**](EntityloadApi.md#entity_load_ship_by_id_post) | **POST** /entity/load/{id}/ship | EntityLoadShipById_POST
[**entity_load_ship_post**](EntityloadApi.md#entity_load_ship_post) | **POST** /entity/load/ship | EntityLoadShip_POST


# **entity_load_by_id_get**
> Object entity_load_by_id_get(id, opts)

EntityLoadById_GET



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

api_instance = SwaggerClient::EntityloadApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityLoadById_GET
  result = api_instance.entity_load_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityloadApi->entity_load_by_id_get: #{e}"
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



# **entity_load_by_id_patch**
> Object entity_load_by_id_patch(id, opts)

EntityLoadById_PATCH



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

api_instance = SwaggerClient::EntityloadApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityLoadById_PATCH
  result = api_instance.entity_load_by_id_patch(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityloadApi->entity_load_by_id_patch: #{e}"
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



# **entity_load_check_in_by_id_post**
> Object entity_load_check_in_by_id_post(id)

EntityLoadCheckInById_POST



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

api_instance = SwaggerClient::EntityloadApi.new

id = 8.14 # Float | 


begin
  #EntityLoadCheckInById_POST
  result = api_instance.entity_load_check_in_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityloadApi->entity_load_check_in_by_id_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Float**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **entity_load_check_in_post**
> Object entity_load_check_in_post

EntityLoadCheckIn_POST



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

api_instance = SwaggerClient::EntityloadApi.new

begin
  #EntityLoadCheckIn_POST
  result = api_instance.entity_load_check_in_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityloadApi->entity_load_check_in_post: #{e}"
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



# **entity_load_check_out_by_id_post**
> Object entity_load_check_out_by_id_post(id)

EntityLoadCheckOutById_POST



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

api_instance = SwaggerClient::EntityloadApi.new

id = 8.14 # Float | 


begin
  #EntityLoadCheckOutById_POST
  result = api_instance.entity_load_check_out_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityloadApi->entity_load_check_out_by_id_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Float**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **entity_load_check_out_post**
> Object entity_load_check_out_post

EntityLoadCheckOut_POST



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

api_instance = SwaggerClient::EntityloadApi.new

begin
  #EntityLoadCheckOut_POST
  result = api_instance.entity_load_check_out_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityloadApi->entity_load_check_out_post: #{e}"
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



# **entity_load_describe_get**
> Object entity_load_describe_get

EntityLoadDescribe_GET



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

api_instance = SwaggerClient::EntityloadApi.new

begin
  #EntityLoadDescribe_GET
  result = api_instance.entity_load_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityloadApi->entity_load_describe_get: #{e}"
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



# **entity_load_get**
> Object entity_load_get(opts)

EntityLoad_GET



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

api_instance = SwaggerClient::EntityloadApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityLoad_GET
  result = api_instance.entity_load_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityloadApi->entity_load_get: #{e}"
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



# **entity_load_ship_by_id_post**
> Object entity_load_ship_by_id_post(id)

EntityLoadShipById_POST



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

api_instance = SwaggerClient::EntityloadApi.new

id = 8.14 # Float | 


begin
  #EntityLoadShipById_POST
  result = api_instance.entity_load_ship_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityloadApi->entity_load_ship_by_id_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Float**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **entity_load_ship_post**
> Object entity_load_ship_post

EntityLoadShip_POST



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

api_instance = SwaggerClient::EntityloadApi.new

begin
  #EntityLoadShip_POST
  result = api_instance.entity_load_ship_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityloadApi->entity_load_ship_post: #{e}"
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



