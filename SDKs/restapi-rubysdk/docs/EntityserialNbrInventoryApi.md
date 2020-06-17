# SwaggerClient::EntityserialNbrInventoryApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_serial_nbr_inventory_by_id_get**](EntityserialNbrInventoryApi.md#entity_serial_nbr_inventory_by_id_get) | **GET** /entity/serial_nbr_inventory/{id} | EntitySerialNbrInventoryById_GET
[**entity_serial_nbr_inventory_describe_get**](EntityserialNbrInventoryApi.md#entity_serial_nbr_inventory_describe_get) | **GET** /entity/serial_nbr_inventory/describe | EntitySerialNbrInventoryDescribe_GET
[**entity_serial_nbr_inventory_get**](EntityserialNbrInventoryApi.md#entity_serial_nbr_inventory_get) | **GET** /entity/serial_nbr_inventory | EntitySerialNbrInventory_GET


# **entity_serial_nbr_inventory_by_id_get**
> Object entity_serial_nbr_inventory_by_id_get(id, opts)

EntitySerialNbrInventoryById_GET



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

api_instance = SwaggerClient::EntityserialNbrInventoryApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntitySerialNbrInventoryById_GET
  result = api_instance.entity_serial_nbr_inventory_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityserialNbrInventoryApi->entity_serial_nbr_inventory_by_id_get: #{e}"
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



# **entity_serial_nbr_inventory_describe_get**
> Object entity_serial_nbr_inventory_describe_get

EntitySerialNbrInventoryDescribe_GET



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

api_instance = SwaggerClient::EntityserialNbrInventoryApi.new

begin
  #EntitySerialNbrInventoryDescribe_GET
  result = api_instance.entity_serial_nbr_inventory_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityserialNbrInventoryApi->entity_serial_nbr_inventory_describe_get: #{e}"
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



# **entity_serial_nbr_inventory_get**
> Object entity_serial_nbr_inventory_get(opts)

EntitySerialNbrInventory_GET



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

api_instance = SwaggerClient::EntityserialNbrInventoryApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntitySerialNbrInventory_GET
  result = api_instance.entity_serial_nbr_inventory_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityserialNbrInventoryApi->entity_serial_nbr_inventory_get: #{e}"
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



