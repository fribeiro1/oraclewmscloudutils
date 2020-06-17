# SwaggerClient::EntitycontainerApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_container_bulk_lock_post**](EntitycontainerApi.md#entity_container_bulk_lock_post) | **POST** /entity/container/bulk_lock | EntityContainerBulkLock_POST
[**entity_container_bulk_unlock_post**](EntitycontainerApi.md#entity_container_bulk_unlock_post) | **POST** /entity/container/bulk_unlock | EntityContainerBulkUnlock_POST
[**entity_container_by_id_get**](EntitycontainerApi.md#entity_container_by_id_get) | **GET** /entity/container/{id} | EntityContainerById_GET
[**entity_container_by_id_patch**](EntitycontainerApi.md#entity_container_by_id_patch) | **PATCH** /entity/container/{id} | EntityContainerById_PATCH
[**entity_container_depalletize_by_id_post**](EntitycontainerApi.md#entity_container_depalletize_by_id_post) | **POST** /entity/container/{id}/depalletize | EntityContainerDepalletizeById_POST
[**entity_container_depalletize_post**](EntitycontainerApi.md#entity_container_depalletize_post) | **POST** /entity/container/depalletize | EntityContainerDepalletize_POST
[**entity_container_describe_get**](EntitycontainerApi.md#entity_container_describe_get) | **GET** /entity/container/describe | EntityContainerDescribe_GET
[**entity_container_get**](EntitycontainerApi.md#entity_container_get) | **GET** /entity/container | EntityContainer_GET
[**entity_container_lock_by_id_post**](EntitycontainerApi.md#entity_container_lock_by_id_post) | **POST** /entity/container/{id}/lock | EntityContainerLockById_POST
[**entity_container_orders_by_id_get**](EntitycontainerApi.md#entity_container_orders_by_id_get) | **GET** /entity/container/{id}/orders | EntityContainerOrdersById_GET
[**entity_container_palletize_by_id_post**](EntitycontainerApi.md#entity_container_palletize_by_id_post) | **POST** /entity/container/{id}/palletize | EntityContainerPalletizeById_POST
[**entity_container_unlock_by_id_post**](EntitycontainerApi.md#entity_container_unlock_by_id_post) | **POST** /entity/container/{id}/unlock | EntityContainerUnlockById_POST


# **entity_container_bulk_lock_post**
> Object entity_container_bulk_lock_post

EntityContainerBulkLock_POST



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

api_instance = SwaggerClient::EntitycontainerApi.new

begin
  #EntityContainerBulkLock_POST
  result = api_instance.entity_container_bulk_lock_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycontainerApi->entity_container_bulk_lock_post: #{e}"
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



# **entity_container_bulk_unlock_post**
> Object entity_container_bulk_unlock_post

EntityContainerBulkUnlock_POST



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

api_instance = SwaggerClient::EntitycontainerApi.new

begin
  #EntityContainerBulkUnlock_POST
  result = api_instance.entity_container_bulk_unlock_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycontainerApi->entity_container_bulk_unlock_post: #{e}"
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



# **entity_container_by_id_get**
> Object entity_container_by_id_get(id, opts)

EntityContainerById_GET



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

api_instance = SwaggerClient::EntitycontainerApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityContainerById_GET
  result = api_instance.entity_container_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycontainerApi->entity_container_by_id_get: #{e}"
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



# **entity_container_by_id_patch**
> Object entity_container_by_id_patch(id, opts)

EntityContainerById_PATCH



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

api_instance = SwaggerClient::EntitycontainerApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityContainerById_PATCH
  result = api_instance.entity_container_by_id_patch(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycontainerApi->entity_container_by_id_patch: #{e}"
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



# **entity_container_depalletize_by_id_post**
> Object entity_container_depalletize_by_id_post(id)

EntityContainerDepalletizeById_POST



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

api_instance = SwaggerClient::EntitycontainerApi.new

id = 8.14 # Float | 


begin
  #EntityContainerDepalletizeById_POST
  result = api_instance.entity_container_depalletize_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycontainerApi->entity_container_depalletize_by_id_post: #{e}"
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



# **entity_container_depalletize_post**
> Object entity_container_depalletize_post

EntityContainerDepalletize_POST



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

api_instance = SwaggerClient::EntitycontainerApi.new

begin
  #EntityContainerDepalletize_POST
  result = api_instance.entity_container_depalletize_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycontainerApi->entity_container_depalletize_post: #{e}"
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



# **entity_container_describe_get**
> Object entity_container_describe_get

EntityContainerDescribe_GET



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

api_instance = SwaggerClient::EntitycontainerApi.new

begin
  #EntityContainerDescribe_GET
  result = api_instance.entity_container_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycontainerApi->entity_container_describe_get: #{e}"
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



# **entity_container_get**
> Object entity_container_get(opts)

EntityContainer_GET



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

api_instance = SwaggerClient::EntitycontainerApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityContainer_GET
  result = api_instance.entity_container_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycontainerApi->entity_container_get: #{e}"
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



# **entity_container_lock_by_id_post**
> Object entity_container_lock_by_id_post(id)

EntityContainerLockById_POST



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

api_instance = SwaggerClient::EntitycontainerApi.new

id = 8.14 # Float | 


begin
  #EntityContainerLockById_POST
  result = api_instance.entity_container_lock_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycontainerApi->entity_container_lock_by_id_post: #{e}"
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



# **entity_container_orders_by_id_get**
> Object entity_container_orders_by_id_get(id)

EntityContainerOrdersById_GET



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

api_instance = SwaggerClient::EntitycontainerApi.new

id = 8.14 # Float | 


begin
  #EntityContainerOrdersById_GET
  result = api_instance.entity_container_orders_by_id_get(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycontainerApi->entity_container_orders_by_id_get: #{e}"
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



# **entity_container_palletize_by_id_post**
> Object entity_container_palletize_by_id_post(id)

EntityContainerPalletizeById_POST



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

api_instance = SwaggerClient::EntitycontainerApi.new

id = 8.14 # Float | 


begin
  #EntityContainerPalletizeById_POST
  result = api_instance.entity_container_palletize_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycontainerApi->entity_container_palletize_by_id_post: #{e}"
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



# **entity_container_unlock_by_id_post**
> Object entity_container_unlock_by_id_post(id)

EntityContainerUnlockById_POST



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

api_instance = SwaggerClient::EntitycontainerApi.new

id = 8.14 # Float | 


begin
  #EntityContainerUnlockById_POST
  result = api_instance.entity_container_unlock_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycontainerApi->entity_container_unlock_by_id_post: #{e}"
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



