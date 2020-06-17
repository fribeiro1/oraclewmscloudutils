# SwaggerClient::EntityvendorApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_vendor_by_id_get**](EntityvendorApi.md#entity_vendor_by_id_get) | **GET** /entity/vendor/{id} | EntityVendorById_GET
[**entity_vendor_by_id_patch**](EntityvendorApi.md#entity_vendor_by_id_patch) | **PATCH** /entity/vendor/{id} | EntityVendorById_PATCH
[**entity_vendor_describe_get**](EntityvendorApi.md#entity_vendor_describe_get) | **GET** /entity/vendor/describe | EntityVendorDescribe_GET
[**entity_vendor_get**](EntityvendorApi.md#entity_vendor_get) | **GET** /entity/vendor | EntityVendor_GET


# **entity_vendor_by_id_get**
> Object entity_vendor_by_id_get(id, opts)

EntityVendorById_GET



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

api_instance = SwaggerClient::EntityvendorApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityVendorById_GET
  result = api_instance.entity_vendor_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityvendorApi->entity_vendor_by_id_get: #{e}"
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



# **entity_vendor_by_id_patch**
> Object entity_vendor_by_id_patch(id, opts)

EntityVendorById_PATCH



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

api_instance = SwaggerClient::EntityvendorApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityVendorById_PATCH
  result = api_instance.entity_vendor_by_id_patch(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityvendorApi->entity_vendor_by_id_patch: #{e}"
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



# **entity_vendor_describe_get**
> Object entity_vendor_describe_get

EntityVendorDescribe_GET



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

api_instance = SwaggerClient::EntityvendorApi.new

begin
  #EntityVendorDescribe_GET
  result = api_instance.entity_vendor_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityvendorApi->entity_vendor_describe_get: #{e}"
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



# **entity_vendor_get**
> Object entity_vendor_get(opts)

EntityVendor_GET



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

api_instance = SwaggerClient::EntityvendorApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityVendor_GET
  result = api_instance.entity_vendor_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityvendorApi->entity_vendor_get: #{e}"
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



