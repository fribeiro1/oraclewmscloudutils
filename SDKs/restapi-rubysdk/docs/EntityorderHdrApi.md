# SwaggerClient::EntityorderHdrApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_order_hdr_bulk_lock_post**](EntityorderHdrApi.md#entity_order_hdr_bulk_lock_post) | **POST** /entity/order_hdr/bulk_lock | EntityOrderHdrBulkLock_POST
[**entity_order_hdr_bulk_unlock_post**](EntityorderHdrApi.md#entity_order_hdr_bulk_unlock_post) | **POST** /entity/order_hdr/bulk_unlock | EntityOrderHdrBulkUnlock_POST
[**entity_order_hdr_by_id_get**](EntityorderHdrApi.md#entity_order_hdr_by_id_get) | **GET** /entity/order_hdr/{id} | EntityOrderHdrById_GET
[**entity_order_hdr_by_id_patch**](EntityorderHdrApi.md#entity_order_hdr_by_id_patch) | **PATCH** /entity/order_hdr/{id} | EntityOrderHdrById_PATCH
[**entity_order_hdr_describe_get**](EntityorderHdrApi.md#entity_order_hdr_describe_get) | **GET** /entity/order_hdr/describe | EntityOrderHdrDescribe_GET
[**entity_order_hdr_get**](EntityorderHdrApi.md#entity_order_hdr_get) | **GET** /entity/order_hdr | EntityOrderHdr_GET
[**entity_order_hdr_iblpns_by_id_post**](EntityorderHdrApi.md#entity_order_hdr_iblpns_by_id_post) | **POST** /entity/order_hdr/{id}/iblpns | EntityOrderHdrIblpnsById_POST
[**entity_order_hdr_oblpns_by_id_post**](EntityorderHdrApi.md#entity_order_hdr_oblpns_by_id_post) | **POST** /entity/order_hdr/{id}/oblpns | EntityOrderHdrOblpnsById_POST


# **entity_order_hdr_bulk_lock_post**
> Object entity_order_hdr_bulk_lock_post

EntityOrderHdrBulkLock_POST



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

api_instance = SwaggerClient::EntityorderHdrApi.new

begin
  #EntityOrderHdrBulkLock_POST
  result = api_instance.entity_order_hdr_bulk_lock_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityorderHdrApi->entity_order_hdr_bulk_lock_post: #{e}"
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



# **entity_order_hdr_bulk_unlock_post**
> Object entity_order_hdr_bulk_unlock_post

EntityOrderHdrBulkUnlock_POST



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

api_instance = SwaggerClient::EntityorderHdrApi.new

begin
  #EntityOrderHdrBulkUnlock_POST
  result = api_instance.entity_order_hdr_bulk_unlock_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityorderHdrApi->entity_order_hdr_bulk_unlock_post: #{e}"
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



# **entity_order_hdr_by_id_get**
> Object entity_order_hdr_by_id_get(id, opts)

EntityOrderHdrById_GET



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

api_instance = SwaggerClient::EntityorderHdrApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityOrderHdrById_GET
  result = api_instance.entity_order_hdr_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityorderHdrApi->entity_order_hdr_by_id_get: #{e}"
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



# **entity_order_hdr_by_id_patch**
> Object entity_order_hdr_by_id_patch(id, opts)

EntityOrderHdrById_PATCH



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

api_instance = SwaggerClient::EntityorderHdrApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityOrderHdrById_PATCH
  result = api_instance.entity_order_hdr_by_id_patch(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityorderHdrApi->entity_order_hdr_by_id_patch: #{e}"
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



# **entity_order_hdr_describe_get**
> Object entity_order_hdr_describe_get

EntityOrderHdrDescribe_GET



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

api_instance = SwaggerClient::EntityorderHdrApi.new

begin
  #EntityOrderHdrDescribe_GET
  result = api_instance.entity_order_hdr_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityorderHdrApi->entity_order_hdr_describe_get: #{e}"
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



# **entity_order_hdr_get**
> Object entity_order_hdr_get(opts)

EntityOrderHdr_GET



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

api_instance = SwaggerClient::EntityorderHdrApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityOrderHdr_GET
  result = api_instance.entity_order_hdr_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityorderHdrApi->entity_order_hdr_get: #{e}"
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



# **entity_order_hdr_iblpns_by_id_post**
> Object entity_order_hdr_iblpns_by_id_post(id)

EntityOrderHdrIblpnsById_POST



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

api_instance = SwaggerClient::EntityorderHdrApi.new

id = 8.14 # Float | 


begin
  #EntityOrderHdrIblpnsById_POST
  result = api_instance.entity_order_hdr_iblpns_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityorderHdrApi->entity_order_hdr_iblpns_by_id_post: #{e}"
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



# **entity_order_hdr_oblpns_by_id_post**
> Object entity_order_hdr_oblpns_by_id_post(id)

EntityOrderHdrOblpnsById_POST



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

api_instance = SwaggerClient::EntityorderHdrApi.new

id = 8.14 # Float | 


begin
  #EntityOrderHdrOblpnsById_POST
  result = api_instance.entity_order_hdr_oblpns_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityorderHdrApi->entity_order_hdr_oblpns_by_id_post: #{e}"
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



