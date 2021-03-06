# SwaggerClient::EntityparcelManifestStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_parcel_manifest_status_by_id_get**](EntityparcelManifestStatusApi.md#entity_parcel_manifest_status_by_id_get) | **GET** /entity/parcel_manifest_status/{id} | EntityParcelManifestStatusById_GET
[**entity_parcel_manifest_status_describe_get**](EntityparcelManifestStatusApi.md#entity_parcel_manifest_status_describe_get) | **GET** /entity/parcel_manifest_status/describe | EntityParcelManifestStatusDescribe_GET
[**entity_parcel_manifest_status_get**](EntityparcelManifestStatusApi.md#entity_parcel_manifest_status_get) | **GET** /entity/parcel_manifest_status | EntityParcelManifestStatus_GET


# **entity_parcel_manifest_status_by_id_get**
> Object entity_parcel_manifest_status_by_id_get(id, opts)

EntityParcelManifestStatusById_GET



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

api_instance = SwaggerClient::EntityparcelManifestStatusApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityParcelManifestStatusById_GET
  result = api_instance.entity_parcel_manifest_status_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityparcelManifestStatusApi->entity_parcel_manifest_status_by_id_get: #{e}"
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



# **entity_parcel_manifest_status_describe_get**
> Object entity_parcel_manifest_status_describe_get

EntityParcelManifestStatusDescribe_GET



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

api_instance = SwaggerClient::EntityparcelManifestStatusApi.new

begin
  #EntityParcelManifestStatusDescribe_GET
  result = api_instance.entity_parcel_manifest_status_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityparcelManifestStatusApi->entity_parcel_manifest_status_describe_get: #{e}"
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



# **entity_parcel_manifest_status_get**
> Object entity_parcel_manifest_status_get(opts)

EntityParcelManifestStatus_GET



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

api_instance = SwaggerClient::EntityparcelManifestStatusApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityParcelManifestStatus_GET
  result = api_instance.entity_parcel_manifest_status_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityparcelManifestStatusApi->entity_parcel_manifest_status_get: #{e}"
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



