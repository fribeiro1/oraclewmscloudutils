# SwaggerClient::EntityworkOrderComponentApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_work_order_component_by_id_get**](EntityworkOrderComponentApi.md#entity_work_order_component_by_id_get) | **GET** /entity/work_order_component/{id} | EntityWorkOrderComponentById_GET
[**entity_work_order_component_describe_get**](EntityworkOrderComponentApi.md#entity_work_order_component_describe_get) | **GET** /entity/work_order_component/describe | EntityWorkOrderComponentDescribe_GET
[**entity_work_order_component_get**](EntityworkOrderComponentApi.md#entity_work_order_component_get) | **GET** /entity/work_order_component | EntityWorkOrderComponent_GET


# **entity_work_order_component_by_id_get**
> Object entity_work_order_component_by_id_get(id, opts)

EntityWorkOrderComponentById_GET



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

api_instance = SwaggerClient::EntityworkOrderComponentApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityWorkOrderComponentById_GET
  result = api_instance.entity_work_order_component_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityworkOrderComponentApi->entity_work_order_component_by_id_get: #{e}"
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



# **entity_work_order_component_describe_get**
> Object entity_work_order_component_describe_get

EntityWorkOrderComponentDescribe_GET



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

api_instance = SwaggerClient::EntityworkOrderComponentApi.new

begin
  #EntityWorkOrderComponentDescribe_GET
  result = api_instance.entity_work_order_component_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityworkOrderComponentApi->entity_work_order_component_describe_get: #{e}"
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



# **entity_work_order_component_get**
> Object entity_work_order_component_get(opts)

EntityWorkOrderComponent_GET



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

api_instance = SwaggerClient::EntityworkOrderComponentApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityWorkOrderComponent_GET
  result = api_instance.entity_work_order_component_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityworkOrderComponentApi->entity_work_order_component_get: #{e}"
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



