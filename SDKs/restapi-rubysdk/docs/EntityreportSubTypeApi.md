# SwaggerClient::EntityreportSubTypeApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_report_sub_type_by_id_get**](EntityreportSubTypeApi.md#entity_report_sub_type_by_id_get) | **GET** /entity/report_sub_type/{id} | EntityReportSubTypeById_GET
[**entity_report_sub_type_describe_get**](EntityreportSubTypeApi.md#entity_report_sub_type_describe_get) | **GET** /entity/report_sub_type/describe | EntityReportSubTypeDescribe_GET
[**entity_report_sub_type_get**](EntityreportSubTypeApi.md#entity_report_sub_type_get) | **GET** /entity/report_sub_type | EntityReportSubType_GET


# **entity_report_sub_type_by_id_get**
> Object entity_report_sub_type_by_id_get(id, opts)

EntityReportSubTypeById_GET



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

api_instance = SwaggerClient::EntityreportSubTypeApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityReportSubTypeById_GET
  result = api_instance.entity_report_sub_type_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityreportSubTypeApi->entity_report_sub_type_by_id_get: #{e}"
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



# **entity_report_sub_type_describe_get**
> Object entity_report_sub_type_describe_get

EntityReportSubTypeDescribe_GET



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

api_instance = SwaggerClient::EntityreportSubTypeApi.new

begin
  #EntityReportSubTypeDescribe_GET
  result = api_instance.entity_report_sub_type_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityreportSubTypeApi->entity_report_sub_type_describe_get: #{e}"
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



# **entity_report_sub_type_get**
> Object entity_report_sub_type_get(opts)

EntityReportSubType_GET



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

api_instance = SwaggerClient::EntityreportSubTypeApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityReportSubType_GET
  result = api_instance.entity_report_sub_type_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityreportSubTypeApi->entity_report_sub_type_get: #{e}"
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



