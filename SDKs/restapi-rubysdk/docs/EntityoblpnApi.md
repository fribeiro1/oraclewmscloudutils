# SwaggerClient::EntityoblpnApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_oblpn_by_id_get**](EntityoblpnApi.md#entity_oblpn_by_id_get) | **GET** /entity/oblpn/{id} | EntityOblpnById_GET
[**entity_oblpn_by_id_patch**](EntityoblpnApi.md#entity_oblpn_by_id_patch) | **PATCH** /entity/oblpn/{id} | EntityOblpnById_PATCH
[**entity_oblpn_create_from_iblpn_post**](EntityoblpnApi.md#entity_oblpn_create_from_iblpn_post) | **POST** /entity/oblpn/create_from_iblpn | EntityOblpnCreateFromIblpn_POST
[**entity_oblpn_describe_get**](EntityoblpnApi.md#entity_oblpn_describe_get) | **GET** /entity/oblpn/describe | EntityOblpnDescribe_GET
[**entity_oblpn_get**](EntityoblpnApi.md#entity_oblpn_get) | **GET** /entity/oblpn | EntityOblpn_GET
[**entity_oblpn_link_asset_by_id_post**](EntityoblpnApi.md#entity_oblpn_link_asset_by_id_post) | **POST** /entity/oblpn/{id}/link_asset | EntityOblpnLinkAssetById_POST


# **entity_oblpn_by_id_get**
> Object entity_oblpn_by_id_get(id, opts)

EntityOblpnById_GET



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

api_instance = SwaggerClient::EntityoblpnApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityOblpnById_GET
  result = api_instance.entity_oblpn_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityoblpnApi->entity_oblpn_by_id_get: #{e}"
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



# **entity_oblpn_by_id_patch**
> Object entity_oblpn_by_id_patch(id, opts)

EntityOblpnById_PATCH



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

api_instance = SwaggerClient::EntityoblpnApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityOblpnById_PATCH
  result = api_instance.entity_oblpn_by_id_patch(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityoblpnApi->entity_oblpn_by_id_patch: #{e}"
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



# **entity_oblpn_create_from_iblpn_post**
> Object entity_oblpn_create_from_iblpn_post

EntityOblpnCreateFromIblpn_POST



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

api_instance = SwaggerClient::EntityoblpnApi.new

begin
  #EntityOblpnCreateFromIblpn_POST
  result = api_instance.entity_oblpn_create_from_iblpn_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityoblpnApi->entity_oblpn_create_from_iblpn_post: #{e}"
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



# **entity_oblpn_describe_get**
> Object entity_oblpn_describe_get

EntityOblpnDescribe_GET



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

api_instance = SwaggerClient::EntityoblpnApi.new

begin
  #EntityOblpnDescribe_GET
  result = api_instance.entity_oblpn_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityoblpnApi->entity_oblpn_describe_get: #{e}"
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



# **entity_oblpn_get**
> Object entity_oblpn_get(opts)

EntityOblpn_GET



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

api_instance = SwaggerClient::EntityoblpnApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityOblpn_GET
  result = api_instance.entity_oblpn_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityoblpnApi->entity_oblpn_get: #{e}"
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



# **entity_oblpn_link_asset_by_id_post**
> Object entity_oblpn_link_asset_by_id_post(id)

EntityOblpnLinkAssetById_POST



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

api_instance = SwaggerClient::EntityoblpnApi.new

id = 8.14 # Float | 


begin
  #EntityOblpnLinkAssetById_POST
  result = api_instance.entity_oblpn_link_asset_by_id_post(id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityoblpnApi->entity_oblpn_link_asset_by_id_post: #{e}"
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



