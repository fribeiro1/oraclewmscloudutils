# SwaggerClient::EntitymheRouteConfigFunctionApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_mhe_route_config_function_by_id_get**](EntitymheRouteConfigFunctionApi.md#entity_mhe_route_config_function_by_id_get) | **GET** /entity/mhe_route_config_function/{id} | EntityMheRouteConfigFunctionById_GET
[**entity_mhe_route_config_function_describe_get**](EntitymheRouteConfigFunctionApi.md#entity_mhe_route_config_function_describe_get) | **GET** /entity/mhe_route_config_function/describe | EntityMheRouteConfigFunctionDescribe_GET
[**entity_mhe_route_config_function_get**](EntitymheRouteConfigFunctionApi.md#entity_mhe_route_config_function_get) | **GET** /entity/mhe_route_config_function | EntityMheRouteConfigFunction_GET


# **entity_mhe_route_config_function_by_id_get**
> Object entity_mhe_route_config_function_by_id_get(id, opts)

EntityMheRouteConfigFunctionById_GET



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

api_instance = SwaggerClient::EntitymheRouteConfigFunctionApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityMheRouteConfigFunctionById_GET
  result = api_instance.entity_mhe_route_config_function_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitymheRouteConfigFunctionApi->entity_mhe_route_config_function_by_id_get: #{e}"
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



# **entity_mhe_route_config_function_describe_get**
> Object entity_mhe_route_config_function_describe_get

EntityMheRouteConfigFunctionDescribe_GET



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

api_instance = SwaggerClient::EntitymheRouteConfigFunctionApi.new

begin
  #EntityMheRouteConfigFunctionDescribe_GET
  result = api_instance.entity_mhe_route_config_function_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitymheRouteConfigFunctionApi->entity_mhe_route_config_function_describe_get: #{e}"
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



# **entity_mhe_route_config_function_get**
> Object entity_mhe_route_config_function_get(opts)

EntityMheRouteConfigFunction_GET



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

api_instance = SwaggerClient::EntitymheRouteConfigFunctionApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityMheRouteConfigFunction_GET
  result = api_instance.entity_mhe_route_config_function_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitymheRouteConfigFunctionApi->entity_mhe_route_config_function_get: #{e}"
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



