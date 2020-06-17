# SwaggerClient::EntityuserCompanyApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_user_company_by_id_get**](EntityuserCompanyApi.md#entity_user_company_by_id_get) | **GET** /entity/user_company/{id} | EntityUserCompanyById_GET
[**entity_user_company_describe_get**](EntityuserCompanyApi.md#entity_user_company_describe_get) | **GET** /entity/user_company/describe | EntityUserCompanyDescribe_GET
[**entity_user_company_get**](EntityuserCompanyApi.md#entity_user_company_get) | **GET** /entity/user_company | EntityUserCompany_GET


# **entity_user_company_by_id_get**
> Object entity_user_company_by_id_get(id, opts)

EntityUserCompanyById_GET



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

api_instance = SwaggerClient::EntityuserCompanyApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityUserCompanyById_GET
  result = api_instance.entity_user_company_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityuserCompanyApi->entity_user_company_by_id_get: #{e}"
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



# **entity_user_company_describe_get**
> Object entity_user_company_describe_get

EntityUserCompanyDescribe_GET



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

api_instance = SwaggerClient::EntityuserCompanyApi.new

begin
  #EntityUserCompanyDescribe_GET
  result = api_instance.entity_user_company_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityuserCompanyApi->entity_user_company_describe_get: #{e}"
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



# **entity_user_company_get**
> Object entity_user_company_get(opts)

EntityUserCompany_GET



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

api_instance = SwaggerClient::EntityuserCompanyApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityUserCompany_GET
  result = api_instance.entity_user_company_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityuserCompanyApi->entity_user_company_get: #{e}"
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



