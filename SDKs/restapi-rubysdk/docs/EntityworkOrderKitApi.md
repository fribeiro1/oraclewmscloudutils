# SwaggerClient::EntityworkOrderKitApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_work_order_kit_by_id_get**](EntityworkOrderKitApi.md#entity_work_order_kit_by_id_get) | **GET** /entity/work_order_kit/{id} | EntityWorkOrderKitById_GET
[**entity_work_order_kit_by_id_patch**](EntityworkOrderKitApi.md#entity_work_order_kit_by_id_patch) | **PATCH** /entity/work_order_kit/{id} | EntityWorkOrderKitById_PATCH
[**entity_work_order_kit_describe_get**](EntityworkOrderKitApi.md#entity_work_order_kit_describe_get) | **GET** /entity/work_order_kit/describe | EntityWorkOrderKitDescribe_GET
[**entity_work_order_kit_get**](EntityworkOrderKitApi.md#entity_work_order_kit_get) | **GET** /entity/work_order_kit | EntityWorkOrderKit_GET


# **entity_work_order_kit_by_id_get**
> Object entity_work_order_kit_by_id_get(id, opts)

EntityWorkOrderKitById_GET



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

api_instance = SwaggerClient::EntityworkOrderKitApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityWorkOrderKitById_GET
  result = api_instance.entity_work_order_kit_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityworkOrderKitApi->entity_work_order_kit_by_id_get: #{e}"
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



# **entity_work_order_kit_by_id_patch**
> Object entity_work_order_kit_by_id_patch(id, opts)

EntityWorkOrderKitById_PATCH



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

api_instance = SwaggerClient::EntityworkOrderKitApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityWorkOrderKitById_PATCH
  result = api_instance.entity_work_order_kit_by_id_patch(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityworkOrderKitApi->entity_work_order_kit_by_id_patch: #{e}"
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



# **entity_work_order_kit_describe_get**
> Object entity_work_order_kit_describe_get

EntityWorkOrderKitDescribe_GET



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

api_instance = SwaggerClient::EntityworkOrderKitApi.new

begin
  #EntityWorkOrderKitDescribe_GET
  result = api_instance.entity_work_order_kit_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityworkOrderKitApi->entity_work_order_kit_describe_get: #{e}"
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



# **entity_work_order_kit_get**
> Object entity_work_order_kit_get(opts)

EntityWorkOrderKit_GET



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

api_instance = SwaggerClient::EntityworkOrderKitApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityWorkOrderKit_GET
  result = api_instance.entity_work_order_kit_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityworkOrderKitApi->entity_work_order_kit_get: #{e}"
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



