# SwaggerClient::EntityinventoryApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_inventory_bulk_update_inventory_attributes_post**](EntityinventoryApi.md#entity_inventory_bulk_update_inventory_attributes_post) | **POST** /entity/inventory/bulk_update_inventory_attributes | EntityInventoryBulkUpdateInventoryAttributes_POST
[**entity_inventory_by_id_get**](EntityinventoryApi.md#entity_inventory_by_id_get) | **GET** /entity/inventory/{id} | EntityInventoryById_GET
[**entity_inventory_describe_get**](EntityinventoryApi.md#entity_inventory_describe_get) | **GET** /entity/inventory/describe | EntityInventoryDescribe_GET
[**entity_inventory_get**](EntityinventoryApi.md#entity_inventory_get) | **GET** /entity/inventory | EntityInventory_GET
[**entity_inventory_link_serial_nbrs_by_id_post**](EntityinventoryApi.md#entity_inventory_link_serial_nbrs_by_id_post) | **POST** /entity/inventory/{id}/link_serial_nbrs | EntityInventoryLinkSerialNbrsById_POST
[**entity_inventory_post**](EntityinventoryApi.md#entity_inventory_post) | **POST** /entity/inventory | EntityInventory_POST


# **entity_inventory_bulk_update_inventory_attributes_post**
> Object entity_inventory_bulk_update_inventory_attributes_post

EntityInventoryBulkUpdateInventoryAttributes_POST



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

api_instance = SwaggerClient::EntityinventoryApi.new

begin
  #EntityInventoryBulkUpdateInventoryAttributes_POST
  result = api_instance.entity_inventory_bulk_update_inventory_attributes_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinventoryApi->entity_inventory_bulk_update_inventory_attributes_post: #{e}"
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



# **entity_inventory_by_id_get**
> Object entity_inventory_by_id_get(id, opts)

EntityInventoryById_GET



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

api_instance = SwaggerClient::EntityinventoryApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityInventoryById_GET
  result = api_instance.entity_inventory_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinventoryApi->entity_inventory_by_id_get: #{e}"
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



# **entity_inventory_describe_get**
> Object entity_inventory_describe_get

EntityInventoryDescribe_GET



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

api_instance = SwaggerClient::EntityinventoryApi.new

begin
  #EntityInventoryDescribe_GET
  result = api_instance.entity_inventory_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinventoryApi->entity_inventory_describe_get: #{e}"
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



# **entity_inventory_get**
> Object entity_inventory_get(opts)

EntityInventory_GET



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

api_instance = SwaggerClient::EntityinventoryApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityInventory_GET
  result = api_instance.entity_inventory_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinventoryApi->entity_inventory_get: #{e}"
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



# **entity_inventory_link_serial_nbrs_by_id_post**
> Object entity_inventory_link_serial_nbrs_by_id_post(id)

EntityInventoryLinkSerialNbrsById_POST



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

api_instance = SwaggerClient::EntityinventoryApi.new

id = 8.14 # Float | 


begin
  #EntityInventoryLinkSerialNbrsById_POST
  result = api_instance.entity_inventory_link_serial_nbrs_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinventoryApi->entity_inventory_link_serial_nbrs_by_id_post: #{e}"
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



# **entity_inventory_post**
> Object entity_inventory_post(opts)

EntityInventory_POST



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

api_instance = SwaggerClient::EntityinventoryApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityInventory_POST
  result = api_instance.entity_inventory_post(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinventoryApi->entity_inventory_post: #{e}"
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



