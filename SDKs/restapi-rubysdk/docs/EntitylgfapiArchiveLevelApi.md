# SwaggerClient::EntitylgfapiArchiveLevelApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_lgfapi_archive_level_by_id_get**](EntitylgfapiArchiveLevelApi.md#entity_lgfapi_archive_level_by_id_get) | **GET** /entity/lgfapi_archive_level/{id} | EntityLgfapiArchiveLevelById_GET
[**entity_lgfapi_archive_level_describe_get**](EntitylgfapiArchiveLevelApi.md#entity_lgfapi_archive_level_describe_get) | **GET** /entity/lgfapi_archive_level/describe | EntityLgfapiArchiveLevelDescribe_GET
[**entity_lgfapi_archive_level_get**](EntitylgfapiArchiveLevelApi.md#entity_lgfapi_archive_level_get) | **GET** /entity/lgfapi_archive_level | EntityLgfapiArchiveLevel_GET


# **entity_lgfapi_archive_level_by_id_get**
> Object entity_lgfapi_archive_level_by_id_get(id, opts)

EntityLgfapiArchiveLevelById_GET



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

api_instance = SwaggerClient::EntitylgfapiArchiveLevelApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityLgfapiArchiveLevelById_GET
  result = api_instance.entity_lgfapi_archive_level_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitylgfapiArchiveLevelApi->entity_lgfapi_archive_level_by_id_get: #{e}"
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



# **entity_lgfapi_archive_level_describe_get**
> Object entity_lgfapi_archive_level_describe_get

EntityLgfapiArchiveLevelDescribe_GET



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

api_instance = SwaggerClient::EntitylgfapiArchiveLevelApi.new

begin
  #EntityLgfapiArchiveLevelDescribe_GET
  result = api_instance.entity_lgfapi_archive_level_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitylgfapiArchiveLevelApi->entity_lgfapi_archive_level_describe_get: #{e}"
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



# **entity_lgfapi_archive_level_get**
> Object entity_lgfapi_archive_level_get(opts)

EntityLgfapiArchiveLevel_GET



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

api_instance = SwaggerClient::EntitylgfapiArchiveLevelApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityLgfapiArchiveLevel_GET
  result = api_instance.entity_lgfapi_archive_level_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitylgfapiArchiveLevelApi->entity_lgfapi_archive_level_get: #{e}"
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



