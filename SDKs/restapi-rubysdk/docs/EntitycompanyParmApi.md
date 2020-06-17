# SwaggerClient::EntitycompanyParmApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_company_parm_by_id_get**](EntitycompanyParmApi.md#entity_company_parm_by_id_get) | **GET** /entity/company_parm/{id} | EntityCompanyParmById_GET
[**entity_company_parm_describe_get**](EntitycompanyParmApi.md#entity_company_parm_describe_get) | **GET** /entity/company_parm/describe | EntityCompanyParmDescribe_GET
[**entity_company_parm_get**](EntitycompanyParmApi.md#entity_company_parm_get) | **GET** /entity/company_parm | EntityCompanyParm_GET
[**entity_company_parm_post**](EntitycompanyParmApi.md#entity_company_parm_post) | **POST** /entity/company_parm | EntityCompanyParm_POST


# **entity_company_parm_by_id_get**
> Object entity_company_parm_by_id_get(id, opts)

EntityCompanyParmById_GET



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

api_instance = SwaggerClient::EntitycompanyParmApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityCompanyParmById_GET
  result = api_instance.entity_company_parm_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycompanyParmApi->entity_company_parm_by_id_get: #{e}"
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



# **entity_company_parm_describe_get**
> Object entity_company_parm_describe_get

EntityCompanyParmDescribe_GET



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

api_instance = SwaggerClient::EntitycompanyParmApi.new

begin
  #EntityCompanyParmDescribe_GET
  result = api_instance.entity_company_parm_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycompanyParmApi->entity_company_parm_describe_get: #{e}"
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



# **entity_company_parm_get**
> Object entity_company_parm_get(opts)

EntityCompanyParm_GET



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

api_instance = SwaggerClient::EntitycompanyParmApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityCompanyParm_GET
  result = api_instance.entity_company_parm_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycompanyParmApi->entity_company_parm_get: #{e}"
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



# **entity_company_parm_post**
> Object entity_company_parm_post(opts)

EntityCompanyParm_POST



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

api_instance = SwaggerClient::EntitycompanyParmApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityCompanyParm_POST
  result = api_instance.entity_company_parm_post(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitycompanyParmApi->entity_company_parm_post: #{e}"
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



