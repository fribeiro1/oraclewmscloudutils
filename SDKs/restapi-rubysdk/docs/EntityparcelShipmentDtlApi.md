# SwaggerClient::EntityparcelShipmentDtlApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_parcel_shipment_dtl_by_id_get**](EntityparcelShipmentDtlApi.md#entity_parcel_shipment_dtl_by_id_get) | **GET** /entity/parcel_shipment_dtl/{id} | EntityParcelShipmentDtlById_GET
[**entity_parcel_shipment_dtl_describe_get**](EntityparcelShipmentDtlApi.md#entity_parcel_shipment_dtl_describe_get) | **GET** /entity/parcel_shipment_dtl/describe | EntityParcelShipmentDtlDescribe_GET
[**entity_parcel_shipment_dtl_get**](EntityparcelShipmentDtlApi.md#entity_parcel_shipment_dtl_get) | **GET** /entity/parcel_shipment_dtl | EntityParcelShipmentDtl_GET


# **entity_parcel_shipment_dtl_by_id_get**
> Object entity_parcel_shipment_dtl_by_id_get(id, opts)

EntityParcelShipmentDtlById_GET



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

api_instance = SwaggerClient::EntityparcelShipmentDtlApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityParcelShipmentDtlById_GET
  result = api_instance.entity_parcel_shipment_dtl_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityparcelShipmentDtlApi->entity_parcel_shipment_dtl_by_id_get: #{e}"
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



# **entity_parcel_shipment_dtl_describe_get**
> Object entity_parcel_shipment_dtl_describe_get

EntityParcelShipmentDtlDescribe_GET



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

api_instance = SwaggerClient::EntityparcelShipmentDtlApi.new

begin
  #EntityParcelShipmentDtlDescribe_GET
  result = api_instance.entity_parcel_shipment_dtl_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityparcelShipmentDtlApi->entity_parcel_shipment_dtl_describe_get: #{e}"
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



# **entity_parcel_shipment_dtl_get**
> Object entity_parcel_shipment_dtl_get(opts)

EntityParcelShipmentDtl_GET



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

api_instance = SwaggerClient::EntityparcelShipmentDtlApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityParcelShipmentDtl_GET
  result = api_instance.entity_parcel_shipment_dtl_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityparcelShipmentDtlApi->entity_parcel_shipment_dtl_get: #{e}"
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



