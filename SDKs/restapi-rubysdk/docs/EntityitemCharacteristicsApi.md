# SwaggerClient::EntityitemCharacteristicsApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_item_characteristics_by_id_get**](EntityitemCharacteristicsApi.md#entity_item_characteristics_by_id_get) | **GET** /entity/item_characteristics/{id} | EntityItemCharacteristicsById_GET
[**entity_item_characteristics_by_id_patch**](EntityitemCharacteristicsApi.md#entity_item_characteristics_by_id_patch) | **PATCH** /entity/item_characteristics/{id} | EntityItemCharacteristicsById_PATCH
[**entity_item_characteristics_describe_get**](EntityitemCharacteristicsApi.md#entity_item_characteristics_describe_get) | **GET** /entity/item_characteristics/describe | EntityItemCharacteristicsDescribe_GET
[**entity_item_characteristics_get**](EntityitemCharacteristicsApi.md#entity_item_characteristics_get) | **GET** /entity/item_characteristics | EntityItemCharacteristics_GET


# **entity_item_characteristics_by_id_get**
> Object entity_item_characteristics_by_id_get(id, opts)

EntityItemCharacteristicsById_GET



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

api_instance = SwaggerClient::EntityitemCharacteristicsApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityItemCharacteristicsById_GET
  result = api_instance.entity_item_characteristics_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityitemCharacteristicsApi->entity_item_characteristics_by_id_get: #{e}"
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



# **entity_item_characteristics_by_id_patch**
> Object entity_item_characteristics_by_id_patch(id, opts)

EntityItemCharacteristicsById_PATCH



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

api_instance = SwaggerClient::EntityitemCharacteristicsApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityItemCharacteristicsById_PATCH
  result = api_instance.entity_item_characteristics_by_id_patch(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityitemCharacteristicsApi->entity_item_characteristics_by_id_patch: #{e}"
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



# **entity_item_characteristics_describe_get**
> Object entity_item_characteristics_describe_get

EntityItemCharacteristicsDescribe_GET



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

api_instance = SwaggerClient::EntityitemCharacteristicsApi.new

begin
  #EntityItemCharacteristicsDescribe_GET
  result = api_instance.entity_item_characteristics_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityitemCharacteristicsApi->entity_item_characteristics_describe_get: #{e}"
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



# **entity_item_characteristics_get**
> Object entity_item_characteristics_get(opts)

EntityItemCharacteristics_GET



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

api_instance = SwaggerClient::EntityitemCharacteristicsApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityItemCharacteristics_GET
  result = api_instance.entity_item_characteristics_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityitemCharacteristicsApi->entity_item_characteristics_get: #{e}"
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



