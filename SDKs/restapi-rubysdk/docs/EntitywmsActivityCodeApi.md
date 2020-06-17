# SwaggerClient::EntitywmsActivityCodeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_wms_activity_code_by_id_get**](EntitywmsActivityCodeApi.md#entity_wms_activity_code_by_id_get) | **GET** /entity/wms_activity_code/{id} | EntityWmsActivityCodeById_GET
[**entity_wms_activity_code_describe_get**](EntitywmsActivityCodeApi.md#entity_wms_activity_code_describe_get) | **GET** /entity/wms_activity_code/describe | EntityWmsActivityCodeDescribe_GET
[**entity_wms_activity_code_get**](EntitywmsActivityCodeApi.md#entity_wms_activity_code_get) | **GET** /entity/wms_activity_code | EntityWmsActivityCode_GET


# **entity_wms_activity_code_by_id_get**
> Object entity_wms_activity_code_by_id_get(id, opts)

EntityWmsActivityCodeById_GET



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

api_instance = SwaggerClient::EntitywmsActivityCodeApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityWmsActivityCodeById_GET
  result = api_instance.entity_wms_activity_code_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitywmsActivityCodeApi->entity_wms_activity_code_by_id_get: #{e}"
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



# **entity_wms_activity_code_describe_get**
> Object entity_wms_activity_code_describe_get

EntityWmsActivityCodeDescribe_GET



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

api_instance = SwaggerClient::EntitywmsActivityCodeApi.new

begin
  #EntityWmsActivityCodeDescribe_GET
  result = api_instance.entity_wms_activity_code_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitywmsActivityCodeApi->entity_wms_activity_code_describe_get: #{e}"
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



# **entity_wms_activity_code_get**
> Object entity_wms_activity_code_get(opts)

EntityWmsActivityCode_GET



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

api_instance = SwaggerClient::EntitywmsActivityCodeApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityWmsActivityCode_GET
  result = api_instance.entity_wms_activity_code_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitywmsActivityCodeApi->entity_wms_activity_code_get: #{e}"
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



