# SwaggerClient::EntityreserveLocationApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_reserve_location_by_id_get**](EntityreserveLocationApi.md#entity_reserve_location_by_id_get) | **GET** /entity/reserve_location/{id} | EntityReserveLocationById_GET
[**entity_reserve_location_by_id_patch**](EntityreserveLocationApi.md#entity_reserve_location_by_id_patch) | **PATCH** /entity/reserve_location/{id} | EntityReserveLocationById_PATCH
[**entity_reserve_location_describe_get**](EntityreserveLocationApi.md#entity_reserve_location_describe_get) | **GET** /entity/reserve_location/describe | EntityReserveLocationDescribe_GET
[**entity_reserve_location_get**](EntityreserveLocationApi.md#entity_reserve_location_get) | **GET** /entity/reserve_location | EntityReserveLocation_GET


# **entity_reserve_location_by_id_get**
> Object entity_reserve_location_by_id_get(id, opts)

EntityReserveLocationById_GET



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

api_instance = SwaggerClient::EntityreserveLocationApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityReserveLocationById_GET
  result = api_instance.entity_reserve_location_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityreserveLocationApi->entity_reserve_location_by_id_get: #{e}"
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



# **entity_reserve_location_by_id_patch**
> Object entity_reserve_location_by_id_patch(id, opts)

EntityReserveLocationById_PATCH



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

api_instance = SwaggerClient::EntityreserveLocationApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityReserveLocationById_PATCH
  result = api_instance.entity_reserve_location_by_id_patch(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityreserveLocationApi->entity_reserve_location_by_id_patch: #{e}"
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



# **entity_reserve_location_describe_get**
> Object entity_reserve_location_describe_get

EntityReserveLocationDescribe_GET



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

api_instance = SwaggerClient::EntityreserveLocationApi.new

begin
  #EntityReserveLocationDescribe_GET
  result = api_instance.entity_reserve_location_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityreserveLocationApi->entity_reserve_location_describe_get: #{e}"
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



# **entity_reserve_location_get**
> Object entity_reserve_location_get(opts)

EntityReserveLocation_GET



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

api_instance = SwaggerClient::EntityreserveLocationApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityReserveLocation_GET
  result = api_instance.entity_reserve_location_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityreserveLocationApi->entity_reserve_location_get: #{e}"
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



