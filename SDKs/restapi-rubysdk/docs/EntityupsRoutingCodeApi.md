# SwaggerClient::EntityupsRoutingCodeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_ups_routing_code_by_id_get**](EntityupsRoutingCodeApi.md#entity_ups_routing_code_by_id_get) | **GET** /entity/ups_routing_code/{id} | EntityUpsRoutingCodeById_GET
[**entity_ups_routing_code_describe_get**](EntityupsRoutingCodeApi.md#entity_ups_routing_code_describe_get) | **GET** /entity/ups_routing_code/describe | EntityUpsRoutingCodeDescribe_GET
[**entity_ups_routing_code_get**](EntityupsRoutingCodeApi.md#entity_ups_routing_code_get) | **GET** /entity/ups_routing_code | EntityUpsRoutingCode_GET


# **entity_ups_routing_code_by_id_get**
> Object entity_ups_routing_code_by_id_get(id, opts)

EntityUpsRoutingCodeById_GET



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

api_instance = SwaggerClient::EntityupsRoutingCodeApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityUpsRoutingCodeById_GET
  result = api_instance.entity_ups_routing_code_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityupsRoutingCodeApi->entity_ups_routing_code_by_id_get: #{e}"
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



# **entity_ups_routing_code_describe_get**
> Object entity_ups_routing_code_describe_get

EntityUpsRoutingCodeDescribe_GET



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

api_instance = SwaggerClient::EntityupsRoutingCodeApi.new

begin
  #EntityUpsRoutingCodeDescribe_GET
  result = api_instance.entity_ups_routing_code_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityupsRoutingCodeApi->entity_ups_routing_code_describe_get: #{e}"
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



# **entity_ups_routing_code_get**
> Object entity_ups_routing_code_get(opts)

EntityUpsRoutingCode_GET



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

api_instance = SwaggerClient::EntityupsRoutingCodeApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityUpsRoutingCode_GET
  result = api_instance.entity_ups_routing_code_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityupsRoutingCodeApi->entity_ups_routing_code_get: #{e}"
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



