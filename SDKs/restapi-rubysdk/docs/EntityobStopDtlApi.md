# SwaggerClient::EntityobStopDtlApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_ob_stop_dtl_by_id_get**](EntityobStopDtlApi.md#entity_ob_stop_dtl_by_id_get) | **GET** /entity/ob_stop_dtl/{id} | EntityObStopDtlById_GET
[**entity_ob_stop_dtl_describe_get**](EntityobStopDtlApi.md#entity_ob_stop_dtl_describe_get) | **GET** /entity/ob_stop_dtl/describe | EntityObStopDtlDescribe_GET
[**entity_ob_stop_dtl_get**](EntityobStopDtlApi.md#entity_ob_stop_dtl_get) | **GET** /entity/ob_stop_dtl | EntityObStopDtl_GET


# **entity_ob_stop_dtl_by_id_get**
> Object entity_ob_stop_dtl_by_id_get(id, opts)

EntityObStopDtlById_GET



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

api_instance = SwaggerClient::EntityobStopDtlApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityObStopDtlById_GET
  result = api_instance.entity_ob_stop_dtl_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityobStopDtlApi->entity_ob_stop_dtl_by_id_get: #{e}"
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



# **entity_ob_stop_dtl_describe_get**
> Object entity_ob_stop_dtl_describe_get

EntityObStopDtlDescribe_GET



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

api_instance = SwaggerClient::EntityobStopDtlApi.new

begin
  #EntityObStopDtlDescribe_GET
  result = api_instance.entity_ob_stop_dtl_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityobStopDtlApi->entity_ob_stop_dtl_describe_get: #{e}"
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



# **entity_ob_stop_dtl_get**
> Object entity_ob_stop_dtl_get(opts)

EntityObStopDtl_GET



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

api_instance = SwaggerClient::EntityobStopDtlApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityObStopDtl_GET
  result = api_instance.entity_ob_stop_dtl_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityobStopDtlApi->entity_ob_stop_dtl_get: #{e}"
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



