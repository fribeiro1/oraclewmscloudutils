# SwaggerClient::EntityinventoryLockApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_inventory_lock_by_id_get**](EntityinventoryLockApi.md#entity_inventory_lock_by_id_get) | **GET** /entity/inventory_lock/{id} | EntityInventoryLockById_GET
[**entity_inventory_lock_describe_get**](EntityinventoryLockApi.md#entity_inventory_lock_describe_get) | **GET** /entity/inventory_lock/describe | EntityInventoryLockDescribe_GET
[**entity_inventory_lock_get**](EntityinventoryLockApi.md#entity_inventory_lock_get) | **GET** /entity/inventory_lock | EntityInventoryLock_GET
[**entity_inventory_lock_post**](EntityinventoryLockApi.md#entity_inventory_lock_post) | **POST** /entity/inventory_lock | EntityInventoryLock_POST


# **entity_inventory_lock_by_id_get**
> Object entity_inventory_lock_by_id_get(id, opts)

EntityInventoryLockById_GET



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

api_instance = SwaggerClient::EntityinventoryLockApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityInventoryLockById_GET
  result = api_instance.entity_inventory_lock_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinventoryLockApi->entity_inventory_lock_by_id_get: #{e}"
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



# **entity_inventory_lock_describe_get**
> Object entity_inventory_lock_describe_get

EntityInventoryLockDescribe_GET



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

api_instance = SwaggerClient::EntityinventoryLockApi.new

begin
  #EntityInventoryLockDescribe_GET
  result = api_instance.entity_inventory_lock_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinventoryLockApi->entity_inventory_lock_describe_get: #{e}"
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



# **entity_inventory_lock_get**
> Object entity_inventory_lock_get(opts)

EntityInventoryLock_GET



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

api_instance = SwaggerClient::EntityinventoryLockApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityInventoryLock_GET
  result = api_instance.entity_inventory_lock_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinventoryLockApi->entity_inventory_lock_get: #{e}"
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



# **entity_inventory_lock_post**
> Object entity_inventory_lock_post(opts)

EntityInventoryLock_POST



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

api_instance = SwaggerClient::EntityinventoryLockApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityInventoryLock_POST
  result = api_instance.entity_inventory_lock_post(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinventoryLockApi->entity_inventory_lock_post: #{e}"
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



