# SwaggerClient::EntitysqlSelectionApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_sql_selection_by_id_get**](EntitysqlSelectionApi.md#entity_sql_selection_by_id_get) | **GET** /entity/sql_selection/{id} | EntitySqlSelectionById_GET
[**entity_sql_selection_get**](EntitysqlSelectionApi.md#entity_sql_selection_get) | **GET** /entity/sql_selection | EntitySqlSelection_GET
[**entity_sql_selection_post**](EntitysqlSelectionApi.md#entity_sql_selection_post) | **POST** /entity/sql_selection | EntitySqlSelection_POST


# **entity_sql_selection_by_id_get**
> Object entity_sql_selection_by_id_get(id, opts)

EntitySqlSelectionById_GET



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

api_instance = SwaggerClient::EntitysqlSelectionApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntitySqlSelectionById_GET
  result = api_instance.entity_sql_selection_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitysqlSelectionApi->entity_sql_selection_by_id_get: #{e}"
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



# **entity_sql_selection_get**
> Object entity_sql_selection_get

EntitySqlSelection_GET



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

api_instance = SwaggerClient::EntitysqlSelectionApi.new

begin
  #EntitySqlSelection_GET
  result = api_instance.entity_sql_selection_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitysqlSelectionApi->entity_sql_selection_get: #{e}"
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



# **entity_sql_selection_post**
> Object entity_sql_selection_post

EntitySqlSelection_POST



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

api_instance = SwaggerClient::EntitysqlSelectionApi.new

begin
  #EntitySqlSelection_POST
  result = api_instance.entity_sql_selection_post
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitysqlSelectionApi->entity_sql_selection_post: #{e}"
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



