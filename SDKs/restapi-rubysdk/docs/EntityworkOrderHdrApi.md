# SwaggerClient::EntityworkOrderHdrApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_work_order_hdr_by_id_get**](EntityworkOrderHdrApi.md#entity_work_order_hdr_by_id_get) | **GET** /entity/work_order_hdr/{id} | EntityWorkOrderHdrById_GET
[**entity_work_order_hdr_by_id_patch**](EntityworkOrderHdrApi.md#entity_work_order_hdr_by_id_patch) | **PATCH** /entity/work_order_hdr/{id} | EntityWorkOrderHdrById_PATCH
[**entity_work_order_hdr_describe_get**](EntityworkOrderHdrApi.md#entity_work_order_hdr_describe_get) | **GET** /entity/work_order_hdr/describe | EntityWorkOrderHdrDescribe_GET
[**entity_work_order_hdr_get**](EntityworkOrderHdrApi.md#entity_work_order_hdr_get) | **GET** /entity/work_order_hdr | EntityWorkOrderHdr_GET


# **entity_work_order_hdr_by_id_get**
> Object entity_work_order_hdr_by_id_get(id, opts)

EntityWorkOrderHdrById_GET



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

api_instance = SwaggerClient::EntityworkOrderHdrApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityWorkOrderHdrById_GET
  result = api_instance.entity_work_order_hdr_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityworkOrderHdrApi->entity_work_order_hdr_by_id_get: #{e}"
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



# **entity_work_order_hdr_by_id_patch**
> Object entity_work_order_hdr_by_id_patch(id, opts)

EntityWorkOrderHdrById_PATCH



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

api_instance = SwaggerClient::EntityworkOrderHdrApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityWorkOrderHdrById_PATCH
  result = api_instance.entity_work_order_hdr_by_id_patch(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityworkOrderHdrApi->entity_work_order_hdr_by_id_patch: #{e}"
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



# **entity_work_order_hdr_describe_get**
> Object entity_work_order_hdr_describe_get

EntityWorkOrderHdrDescribe_GET



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

api_instance = SwaggerClient::EntityworkOrderHdrApi.new

begin
  #EntityWorkOrderHdrDescribe_GET
  result = api_instance.entity_work_order_hdr_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityworkOrderHdrApi->entity_work_order_hdr_describe_get: #{e}"
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



# **entity_work_order_hdr_get**
> Object entity_work_order_hdr_get(opts)

EntityWorkOrderHdr_GET



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

api_instance = SwaggerClient::EntityworkOrderHdrApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityWorkOrderHdr_GET
  result = api_instance.entity_work_order_hdr_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityworkOrderHdrApi->entity_work_order_hdr_get: #{e}"
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



