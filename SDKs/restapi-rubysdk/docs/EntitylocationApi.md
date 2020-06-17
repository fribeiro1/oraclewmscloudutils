# SwaggerClient::EntitylocationApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_location_by_id_get**](EntitylocationApi.md#entity_location_by_id_get) | **GET** /entity/location/{id} | EntityLocationById_GET
[**entity_location_by_id_patch**](EntitylocationApi.md#entity_location_by_id_patch) | **PATCH** /entity/location/{id} | EntityLocationById_PATCH
[**entity_location_describe_get**](EntitylocationApi.md#entity_location_describe_get) | **GET** /entity/location/describe | EntityLocationDescribe_GET
[**entity_location_get**](EntitylocationApi.md#entity_location_get) | **GET** /entity/location | EntityLocation_GET
[**entity_location_update_active_inventory_by_id_post**](EntitylocationApi.md#entity_location_update_active_inventory_by_id_post) | **POST** /entity/location/{id}/update_active_inventory | EntityLocationUpdateActiveInventoryById_POST
[**entity_location_update_active_inventory_post**](EntitylocationApi.md#entity_location_update_active_inventory_post) | **POST** /entity/location/update_active_inventory | EntityLocationUpdateActiveInventory_POST
[**entity_location_year_first_available_get**](EntitylocationApi.md#entity_location_year_first_available_get) | **GET** /entity/location/yard/first_available | EntityLocationYearFirstAvailable_GET


# **entity_location_by_id_get**
> Object entity_location_by_id_get(id, opts)

EntityLocationById_GET



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

api_instance = SwaggerClient::EntitylocationApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityLocationById_GET
  result = api_instance.entity_location_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitylocationApi->entity_location_by_id_get: #{e}"
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



# **entity_location_by_id_patch**
> Object entity_location_by_id_patch(id, opts)

EntityLocationById_PATCH



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

api_instance = SwaggerClient::EntitylocationApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityLocationById_PATCH
  result = api_instance.entity_location_by_id_patch(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitylocationApi->entity_location_by_id_patch: #{e}"
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



# **entity_location_describe_get**
> Object entity_location_describe_get

EntityLocationDescribe_GET



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

api_instance = SwaggerClient::EntitylocationApi.new

begin
  #EntityLocationDescribe_GET
  result = api_instance.entity_location_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitylocationApi->entity_location_describe_get: #{e}"
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



# **entity_location_get**
> Object entity_location_get(opts)

EntityLocation_GET



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

api_instance = SwaggerClient::EntitylocationApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityLocation_GET
  result = api_instance.entity_location_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitylocationApi->entity_location_get: #{e}"
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



# **entity_location_update_active_inventory_by_id_post**
> Object entity_location_update_active_inventory_by_id_post(id)

EntityLocationUpdateActiveInventoryById_POST



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

api_instance = SwaggerClient::EntitylocationApi.new

id = 8.14 # Float | 


begin
  #EntityLocationUpdateActiveInventoryById_POST
  result = api_instance.entity_location_update_active_inventory_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitylocationApi->entity_location_update_active_inventory_by_id_post: #{e}"
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



# **entity_location_update_active_inventory_post**
> Object entity_location_update_active_inventory_post

EntityLocationUpdateActiveInventory_POST



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

api_instance = SwaggerClient::EntitylocationApi.new

begin
  #EntityLocationUpdateActiveInventory_POST
  result = api_instance.entity_location_update_active_inventory_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitylocationApi->entity_location_update_active_inventory_post: #{e}"
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



# **entity_location_year_first_available_get**
> Object entity_location_year_first_available_get(opts)

EntityLocationYearFirstAvailable_GET



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

api_instance = SwaggerClient::EntitylocationApi.new

opts = { 
  facility_id: 'facility_id_example', # String | 
  facility_id__code: 'facility_id__code_example' # String | 
}

begin
  #EntityLocationYearFirstAvailable_GET
  result = api_instance.entity_location_year_first_available_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitylocationApi->entity_location_year_first_available_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **facility_id** | **String**|  | [optional] 
 **facility_id__code** | **String**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



