# SwaggerClient::EntitysqlOperatorApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_sql_operator_by_id_get**](EntitysqlOperatorApi.md#entity_sql_operator_by_id_get) | **GET** /entity/sql_operator/{id} | EntitySqlOperatorById_GET
[**entity_sql_operator_describe_get**](EntitysqlOperatorApi.md#entity_sql_operator_describe_get) | **GET** /entity/sql_operator/describe | EntitySqlOperatorDescribe_GET
[**entity_sql_operator_get**](EntitysqlOperatorApi.md#entity_sql_operator_get) | **GET** /entity/sql_operator | EntitySqlOperator_GET


# **entity_sql_operator_by_id_get**
> Object entity_sql_operator_by_id_get(id, opts)

EntitySqlOperatorById_GET



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

api_instance = SwaggerClient::EntitysqlOperatorApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntitySqlOperatorById_GET
  result = api_instance.entity_sql_operator_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitysqlOperatorApi->entity_sql_operator_by_id_get: #{e}"
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



# **entity_sql_operator_describe_get**
> Object entity_sql_operator_describe_get

EntitySqlOperatorDescribe_GET



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

api_instance = SwaggerClient::EntitysqlOperatorApi.new

begin
  #EntitySqlOperatorDescribe_GET
  result = api_instance.entity_sql_operator_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitysqlOperatorApi->entity_sql_operator_describe_get: #{e}"
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



# **entity_sql_operator_get**
> Object entity_sql_operator_get(opts)

EntitySqlOperator_GET



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

api_instance = SwaggerClient::EntitysqlOperatorApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntitySqlOperator_GET
  result = api_instance.entity_sql_operator_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitysqlOperatorApi->entity_sql_operator_get: #{e}"
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



