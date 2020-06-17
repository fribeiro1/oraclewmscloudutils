# SwaggerClient::EntitytrailerApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_trailer_by_id_get**](EntitytrailerApi.md#entity_trailer_by_id_get) | **GET** /entity/trailer/{id} | EntityTrailerById_GET
[**entity_trailer_describe_get**](EntitytrailerApi.md#entity_trailer_describe_get) | **GET** /entity/trailer/describe | EntityTrailerDescribe_GET
[**entity_trailer_get**](EntitytrailerApi.md#entity_trailer_get) | **GET** /entity/trailer | EntityTrailer_GET
[**entity_trailer_locate_to_yard_by_id_post**](EntitytrailerApi.md#entity_trailer_locate_to_yard_by_id_post) | **POST** /entity/trailer/{id}/locate_to_yard | EntityTrailerLocateToYardById_POST
[**entity_trailer_locate_to_yard_post**](EntitytrailerApi.md#entity_trailer_locate_to_yard_post) | **POST** /entity/trailer/locate_to_yard | EntityTrailerLocateToYard_POST
[**entity_trailer_post**](EntitytrailerApi.md#entity_trailer_post) | **POST** /entity/trailer | EntityTrailer_POST
[**entity_trailer_remove_from_yard_by_id_post**](EntitytrailerApi.md#entity_trailer_remove_from_yard_by_id_post) | **POST** /entity/trailer/{id}/remove_from_yard | EntityTrailerRemoveFromYardById_POST
[**entity_trailer_remove_from_yard_post**](EntitytrailerApi.md#entity_trailer_remove_from_yard_post) | **POST** /entity/trailer/remove_from_yard | EntityTrailerRemoveFromYard_POST


# **entity_trailer_by_id_get**
> Object entity_trailer_by_id_get(id, opts)

EntityTrailerById_GET



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

api_instance = SwaggerClient::EntitytrailerApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityTrailerById_GET
  result = api_instance.entity_trailer_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitytrailerApi->entity_trailer_by_id_get: #{e}"
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



# **entity_trailer_describe_get**
> Object entity_trailer_describe_get

EntityTrailerDescribe_GET



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

api_instance = SwaggerClient::EntitytrailerApi.new

begin
  #EntityTrailerDescribe_GET
  result = api_instance.entity_trailer_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitytrailerApi->entity_trailer_describe_get: #{e}"
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



# **entity_trailer_get**
> Object entity_trailer_get(opts)

EntityTrailer_GET



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

api_instance = SwaggerClient::EntitytrailerApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityTrailer_GET
  result = api_instance.entity_trailer_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitytrailerApi->entity_trailer_get: #{e}"
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



# **entity_trailer_locate_to_yard_by_id_post**
> Object entity_trailer_locate_to_yard_by_id_post(id)

EntityTrailerLocateToYardById_POST



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

api_instance = SwaggerClient::EntitytrailerApi.new

id = 8.14 # Float | 


begin
  #EntityTrailerLocateToYardById_POST
  result = api_instance.entity_trailer_locate_to_yard_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitytrailerApi->entity_trailer_locate_to_yard_by_id_post: #{e}"
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



# **entity_trailer_locate_to_yard_post**
> Object entity_trailer_locate_to_yard_post

EntityTrailerLocateToYard_POST



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

api_instance = SwaggerClient::EntitytrailerApi.new

begin
  #EntityTrailerLocateToYard_POST
  result = api_instance.entity_trailer_locate_to_yard_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitytrailerApi->entity_trailer_locate_to_yard_post: #{e}"
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



# **entity_trailer_post**
> Object entity_trailer_post(opts)

EntityTrailer_POST



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

api_instance = SwaggerClient::EntitytrailerApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityTrailer_POST
  result = api_instance.entity_trailer_post(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitytrailerApi->entity_trailer_post: #{e}"
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



# **entity_trailer_remove_from_yard_by_id_post**
> Object entity_trailer_remove_from_yard_by_id_post(id)

EntityTrailerRemoveFromYardById_POST



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

api_instance = SwaggerClient::EntitytrailerApi.new

id = 8.14 # Float | 


begin
  #EntityTrailerRemoveFromYardById_POST
  result = api_instance.entity_trailer_remove_from_yard_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitytrailerApi->entity_trailer_remove_from_yard_by_id_post: #{e}"
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



# **entity_trailer_remove_from_yard_post**
> Object entity_trailer_remove_from_yard_post

EntityTrailerRemoveFromYard_POST



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

api_instance = SwaggerClient::EntitytrailerApi.new

begin
  #EntityTrailerRemoveFromYard_POST
  result = api_instance.entity_trailer_remove_from_yard_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitytrailerApi->entity_trailer_remove_from_yard_post: #{e}"
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



