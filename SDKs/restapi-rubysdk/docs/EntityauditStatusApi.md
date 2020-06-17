# SwaggerClient::EntityauditStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_audit_status_by_id_get**](EntityauditStatusApi.md#entity_audit_status_by_id_get) | **GET** /entity/audit_status/{id} | EntityAuditStatusById_GET
[**entity_audit_status_describe_get**](EntityauditStatusApi.md#entity_audit_status_describe_get) | **GET** /entity/audit_status/describe | EntityAuditStatusDescribe_GET
[**entity_audit_status_get**](EntityauditStatusApi.md#entity_audit_status_get) | **GET** /entity/audit_status | EntityAuditStatus_GET


# **entity_audit_status_by_id_get**
> Object entity_audit_status_by_id_get(id, opts)

EntityAuditStatusById_GET



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

api_instance = SwaggerClient::EntityauditStatusApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityAuditStatusById_GET
  result = api_instance.entity_audit_status_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityauditStatusApi->entity_audit_status_by_id_get: #{e}"
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



# **entity_audit_status_describe_get**
> Object entity_audit_status_describe_get

EntityAuditStatusDescribe_GET



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

api_instance = SwaggerClient::EntityauditStatusApi.new

begin
  #EntityAuditStatusDescribe_GET
  result = api_instance.entity_audit_status_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityauditStatusApi->entity_audit_status_describe_get: #{e}"
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



# **entity_audit_status_get**
> Object entity_audit_status_get(opts)

EntityAuditStatus_GET



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

api_instance = SwaggerClient::EntityauditStatusApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityAuditStatus_GET
  result = api_instance.entity_audit_status_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityauditStatusApi->entity_audit_status_get: #{e}"
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


