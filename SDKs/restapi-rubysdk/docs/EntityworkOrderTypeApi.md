# SwaggerClient::EntityworkOrderTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_work_order_type_by_id_get**](EntityworkOrderTypeApi.md#entity_work_order_type_by_id_get) | **GET** /entity/work_order_type/{id} | EntityWorkOrderTypeById_GET
[**entity_work_order_type_describe_get**](EntityworkOrderTypeApi.md#entity_work_order_type_describe_get) | **GET** /entity/work_order_type/describe | EntityWorkOrderTypeDescribe_GET
[**entity_work_order_type_get**](EntityworkOrderTypeApi.md#entity_work_order_type_get) | **GET** /entity/work_order_type | EntityWorkOrderType_GET


# **entity_work_order_type_by_id_get**
> Object entity_work_order_type_by_id_get(id, opts)

EntityWorkOrderTypeById_GET



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

api_instance = SwaggerClient::EntityworkOrderTypeApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityWorkOrderTypeById_GET
  result = api_instance.entity_work_order_type_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityworkOrderTypeApi->entity_work_order_type_by_id_get: #{e}"
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



# **entity_work_order_type_describe_get**
> Object entity_work_order_type_describe_get

EntityWorkOrderTypeDescribe_GET



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

api_instance = SwaggerClient::EntityworkOrderTypeApi.new

begin
  #EntityWorkOrderTypeDescribe_GET
  result = api_instance.entity_work_order_type_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityworkOrderTypeApi->entity_work_order_type_describe_get: #{e}"
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



# **entity_work_order_type_get**
> Object entity_work_order_type_get(opts)

EntityWorkOrderType_GET



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

api_instance = SwaggerClient::EntityworkOrderTypeApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityWorkOrderType_GET
  result = api_instance.entity_work_order_type_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityworkOrderTypeApi->entity_work_order_type_get: #{e}"
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



