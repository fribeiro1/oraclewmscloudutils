# SwaggerClient::EntityiblpnApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_iblpn_by_id_get**](EntityiblpnApi.md#entity_iblpn_by_id_get) | **GET** /entity/iblpn/{id} | EntityIblpnById_GET
[**entity_iblpn_by_id_patch**](EntityiblpnApi.md#entity_iblpn_by_id_patch) | **PATCH** /entity/iblpn/{id} | EntityIblpnById_PATCH
[**entity_iblpn_composite_create_post**](EntityiblpnApi.md#entity_iblpn_composite_create_post) | **POST** /entity/iblpn/composite_create | EntityIblpnCompositeCreate_POST
[**entity_iblpn_describe_get**](EntityiblpnApi.md#entity_iblpn_describe_get) | **GET** /entity/iblpn/describe | EntityIblpnDescribe_GET
[**entity_iblpn_direct_consume_by_id_post**](EntityiblpnApi.md#entity_iblpn_direct_consume_by_id_post) | **POST** /entity/iblpn/{id}/direct_consume | EntityIblpnDirectConsumeById_POST
[**entity_iblpn_get**](EntityiblpnApi.md#entity_iblpn_get) | **GET** /entity/iblpn | EntityIblpn_GET
[**entity_iblpn_modify_item_qty_by_id_post**](EntityiblpnApi.md#entity_iblpn_modify_item_qty_by_id_post) | **POST** /entity/iblpn/{id}/modify_item_qty | EntityIblpnModifyItemQtyById_POST
[**entity_iblpn_modify_item_qty_post**](EntityiblpnApi.md#entity_iblpn_modify_item_qty_post) | **POST** /entity/iblpn/modify_item_qty | EntityIblpnModifyItemQty_POST
[**entity_iblpn_post**](EntityiblpnApi.md#entity_iblpn_post) | **POST** /entity/iblpn | EntityIblpn_POST


# **entity_iblpn_by_id_get**
> Object entity_iblpn_by_id_get(id, opts)

EntityIblpnById_GET



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

api_instance = SwaggerClient::EntityiblpnApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityIblpnById_GET
  result = api_instance.entity_iblpn_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityiblpnApi->entity_iblpn_by_id_get: #{e}"
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



# **entity_iblpn_by_id_patch**
> Object entity_iblpn_by_id_patch(id, opts)

EntityIblpnById_PATCH



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

api_instance = SwaggerClient::EntityiblpnApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityIblpnById_PATCH
  result = api_instance.entity_iblpn_by_id_patch(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityiblpnApi->entity_iblpn_by_id_patch: #{e}"
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



# **entity_iblpn_composite_create_post**
> Object entity_iblpn_composite_create_post

EntityIblpnCompositeCreate_POST



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

api_instance = SwaggerClient::EntityiblpnApi.new

begin
  #EntityIblpnCompositeCreate_POST
  result = api_instance.entity_iblpn_composite_create_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityiblpnApi->entity_iblpn_composite_create_post: #{e}"
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



# **entity_iblpn_describe_get**
> Object entity_iblpn_describe_get

EntityIblpnDescribe_GET



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

api_instance = SwaggerClient::EntityiblpnApi.new

begin
  #EntityIblpnDescribe_GET
  result = api_instance.entity_iblpn_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityiblpnApi->entity_iblpn_describe_get: #{e}"
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



# **entity_iblpn_direct_consume_by_id_post**
> Object entity_iblpn_direct_consume_by_id_post(id)

EntityIblpnDirectConsumeById_POST



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

api_instance = SwaggerClient::EntityiblpnApi.new

id = 8.14 # Float | 


begin
  #EntityIblpnDirectConsumeById_POST
  result = api_instance.entity_iblpn_direct_consume_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityiblpnApi->entity_iblpn_direct_consume_by_id_post: #{e}"
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



# **entity_iblpn_get**
> Object entity_iblpn_get(opts)

EntityIblpn_GET



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

api_instance = SwaggerClient::EntityiblpnApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityIblpn_GET
  result = api_instance.entity_iblpn_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityiblpnApi->entity_iblpn_get: #{e}"
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



# **entity_iblpn_modify_item_qty_by_id_post**
> Object entity_iblpn_modify_item_qty_by_id_post(id)

EntityIblpnModifyItemQtyById_POST



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

api_instance = SwaggerClient::EntityiblpnApi.new

id = 8.14 # Float | 


begin
  #EntityIblpnModifyItemQtyById_POST
  result = api_instance.entity_iblpn_modify_item_qty_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityiblpnApi->entity_iblpn_modify_item_qty_by_id_post: #{e}"
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



# **entity_iblpn_modify_item_qty_post**
> Object entity_iblpn_modify_item_qty_post

EntityIblpnModifyItemQty_POST



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

api_instance = SwaggerClient::EntityiblpnApi.new

begin
  #EntityIblpnModifyItemQty_POST
  result = api_instance.entity_iblpn_modify_item_qty_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityiblpnApi->entity_iblpn_modify_item_qty_post: #{e}"
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



# **entity_iblpn_post**
> Object entity_iblpn_post(opts)

EntityIblpn_POST



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

api_instance = SwaggerClient::EntityiblpnApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityIblpn_POST
  result = api_instance.entity_iblpn_post(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityiblpnApi->entity_iblpn_post: #{e}"
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



