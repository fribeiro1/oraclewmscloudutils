# SwaggerClient::EntityuserFacilityApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_user_facility_by_id_get**](EntityuserFacilityApi.md#entity_user_facility_by_id_get) | **GET** /entity/user_facility/{id} | EntityUserFacilityById_GET
[**entity_user_facility_describe_get**](EntityuserFacilityApi.md#entity_user_facility_describe_get) | **GET** /entity/user_facility/describe | EntityUserFacilityDescribe_GET
[**entity_user_facility_get**](EntityuserFacilityApi.md#entity_user_facility_get) | **GET** /entity/user_facility | EntityUserFacility_GET


# **entity_user_facility_by_id_get**
> Object entity_user_facility_by_id_get(id, opts)

EntityUserFacilityById_GET



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

api_instance = SwaggerClient::EntityuserFacilityApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityUserFacilityById_GET
  result = api_instance.entity_user_facility_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityuserFacilityApi->entity_user_facility_by_id_get: #{e}"
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



# **entity_user_facility_describe_get**
> Object entity_user_facility_describe_get

EntityUserFacilityDescribe_GET



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

api_instance = SwaggerClient::EntityuserFacilityApi.new

begin
  #EntityUserFacilityDescribe_GET
  result = api_instance.entity_user_facility_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityuserFacilityApi->entity_user_facility_describe_get: #{e}"
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



# **entity_user_facility_get**
> Object entity_user_facility_get(opts)

EntityUserFacility_GET



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

api_instance = SwaggerClient::EntityuserFacilityApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityUserFacility_GET
  result = api_instance.entity_user_facility_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityuserFacilityApi->entity_user_facility_get: #{e}"
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



