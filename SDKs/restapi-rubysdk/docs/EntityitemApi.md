# SwaggerClient::EntityitemApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_item_by_id_get**](EntityitemApi.md#entity_item_by_id_get) | **GET** /entity/item/{id} | EntityItemById_GET
[**entity_item_describe_get**](EntityitemApi.md#entity_item_describe_get) | **GET** /entity/item/describe | EntityItemDescribe_GET
[**entity_item_get**](EntityitemApi.md#entity_item_get) | **GET** /entity/item | EntityItem_GET
[**entity_item_image_upload_by_id_post**](EntityitemApi.md#entity_item_image_upload_by_id_post) | **POST** /entity/item/{id}/image_upload | EntityItemImageUploadById_POST
[**entity_item_image_upload_post**](EntityitemApi.md#entity_item_image_upload_post) | **POST** /entity/item/image_upload | EntityItemImageUpload_POST


# **entity_item_by_id_get**
> Object entity_item_by_id_get(id, opts)

EntityItemById_GET



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

api_instance = SwaggerClient::EntityitemApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityItemById_GET
  result = api_instance.entity_item_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityitemApi->entity_item_by_id_get: #{e}"
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



# **entity_item_describe_get**
> Object entity_item_describe_get

EntityItemDescribe_GET



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

api_instance = SwaggerClient::EntityitemApi.new

begin
  #EntityItemDescribe_GET
  result = api_instance.entity_item_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityitemApi->entity_item_describe_get: #{e}"
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



# **entity_item_get**
> Object entity_item_get(opts)

EntityItem_GET



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

api_instance = SwaggerClient::EntityitemApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityItem_GET
  result = api_instance.entity_item_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityitemApi->entity_item_get: #{e}"
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



# **entity_item_image_upload_by_id_post**
> Object entity_item_image_upload_by_id_post(id)

EntityItemImageUploadById_POST



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

api_instance = SwaggerClient::EntityitemApi.new

id = 8.14 # Float | 


begin
  #EntityItemImageUploadById_POST
  result = api_instance.entity_item_image_upload_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityitemApi->entity_item_image_upload_by_id_post: #{e}"
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



# **entity_item_image_upload_post**
> Object entity_item_image_upload_post

EntityItemImageUpload_POST



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

api_instance = SwaggerClient::EntityitemApi.new

begin
  #EntityItemImageUpload_POST
  result = api_instance.entity_item_image_upload_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityitemApi->entity_item_image_upload_post: #{e}"
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



