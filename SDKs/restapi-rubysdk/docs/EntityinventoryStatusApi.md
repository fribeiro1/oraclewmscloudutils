# SwaggerClient::EntityinventoryStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_inventory_status_by_id_get**](EntityinventoryStatusApi.md#entity_inventory_status_by_id_get) | **GET** /entity/inventory_status/{id} | EntityInventoryStatusById_GET
[**entity_inventory_status_describe_get**](EntityinventoryStatusApi.md#entity_inventory_status_describe_get) | **GET** /entity/inventory_status/describe | EntityInventoryStatusDescribe_GET
[**entity_inventory_status_get**](EntityinventoryStatusApi.md#entity_inventory_status_get) | **GET** /entity/inventory_status | EntityInventoryStatus_GET


# **entity_inventory_status_by_id_get**
> Object entity_inventory_status_by_id_get(id, opts)

EntityInventoryStatusById_GET



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

api_instance = SwaggerClient::EntityinventoryStatusApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityInventoryStatusById_GET
  result = api_instance.entity_inventory_status_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinventoryStatusApi->entity_inventory_status_by_id_get: #{e}"
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



# **entity_inventory_status_describe_get**
> Object entity_inventory_status_describe_get

EntityInventoryStatusDescribe_GET



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

api_instance = SwaggerClient::EntityinventoryStatusApi.new

begin
  #EntityInventoryStatusDescribe_GET
  result = api_instance.entity_inventory_status_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinventoryStatusApi->entity_inventory_status_describe_get: #{e}"
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



# **entity_inventory_status_get**
> Object entity_inventory_status_get(opts)

EntityInventoryStatus_GET



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

api_instance = SwaggerClient::EntityinventoryStatusApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityInventoryStatus_GET
  result = api_instance.entity_inventory_status_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinventoryStatusApi->entity_inventory_status_get: #{e}"
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



