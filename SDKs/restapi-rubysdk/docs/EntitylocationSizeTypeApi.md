# SwaggerClient::EntitylocationSizeTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_location_size_type_by_id_get**](EntitylocationSizeTypeApi.md#entity_location_size_type_by_id_get) | **GET** /entity/location_size_type/{id} | EntityLocationSizeTypeById_GET
[**entity_location_size_type_get**](EntitylocationSizeTypeApi.md#entity_location_size_type_get) | **GET** /entity/location_size_type | EntityLocationSizeType_GET
[**entity_location_size_type_post**](EntitylocationSizeTypeApi.md#entity_location_size_type_post) | **POST** /entity/location_size_type | EntityLocationSizeType_POST


# **entity_location_size_type_by_id_get**
> Object entity_location_size_type_by_id_get(id, opts)

EntityLocationSizeTypeById_GET



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

api_instance = SwaggerClient::EntitylocationSizeTypeApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityLocationSizeTypeById_GET
  result = api_instance.entity_location_size_type_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitylocationSizeTypeApi->entity_location_size_type_by_id_get: #{e}"
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



# **entity_location_size_type_get**
> Object entity_location_size_type_get

EntityLocationSizeType_GET



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

api_instance = SwaggerClient::EntitylocationSizeTypeApi.new

begin
  #EntityLocationSizeType_GET
  result = api_instance.entity_location_size_type_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitylocationSizeTypeApi->entity_location_size_type_get: #{e}"
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



# **entity_location_size_type_post**
> Object entity_location_size_type_post

EntityLocationSizeType_POST



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

api_instance = SwaggerClient::EntitylocationSizeTypeApi.new

begin
  #EntityLocationSizeType_POST
  result = api_instance.entity_location_size_type_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitylocationSizeTypeApi->entity_location_size_type_post: #{e}"
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



