# SwaggerClient::EntitypurchaseOrderHdrApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_purchase_order_hdr_by_id_get**](EntitypurchaseOrderHdrApi.md#entity_purchase_order_hdr_by_id_get) | **GET** /entity/purchase_order_hdr/{id} | EntityPurchaseOrderHdrById_GET
[**entity_purchase_order_hdr_by_id_patch**](EntitypurchaseOrderHdrApi.md#entity_purchase_order_hdr_by_id_patch) | **PATCH** /entity/purchase_order_hdr/{id} | EntityPurchaseOrderHdrById_PATCH
[**entity_purchase_order_hdr_describe_get**](EntitypurchaseOrderHdrApi.md#entity_purchase_order_hdr_describe_get) | **GET** /entity/purchase_order_hdr/describe | EntityPurchaseOrderHdrDescribe_GET
[**entity_purchase_order_hdr_get**](EntitypurchaseOrderHdrApi.md#entity_purchase_order_hdr_get) | **GET** /entity/purchase_order_hdr | EntityPurchaseOrderHdr_GET


# **entity_purchase_order_hdr_by_id_get**
> Object entity_purchase_order_hdr_by_id_get(id, opts)

EntityPurchaseOrderHdrById_GET



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

api_instance = SwaggerClient::EntitypurchaseOrderHdrApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityPurchaseOrderHdrById_GET
  result = api_instance.entity_purchase_order_hdr_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypurchaseOrderHdrApi->entity_purchase_order_hdr_by_id_get: #{e}"
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



# **entity_purchase_order_hdr_by_id_patch**
> Object entity_purchase_order_hdr_by_id_patch(id, opts)

EntityPurchaseOrderHdrById_PATCH



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

api_instance = SwaggerClient::EntitypurchaseOrderHdrApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityPurchaseOrderHdrById_PATCH
  result = api_instance.entity_purchase_order_hdr_by_id_patch(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypurchaseOrderHdrApi->entity_purchase_order_hdr_by_id_patch: #{e}"
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



# **entity_purchase_order_hdr_describe_get**
> Object entity_purchase_order_hdr_describe_get

EntityPurchaseOrderHdrDescribe_GET



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

api_instance = SwaggerClient::EntitypurchaseOrderHdrApi.new

begin
  #EntityPurchaseOrderHdrDescribe_GET
  result = api_instance.entity_purchase_order_hdr_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypurchaseOrderHdrApi->entity_purchase_order_hdr_describe_get: #{e}"
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



# **entity_purchase_order_hdr_get**
> Object entity_purchase_order_hdr_get(opts)

EntityPurchaseOrderHdr_GET



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

api_instance = SwaggerClient::EntitypurchaseOrderHdrApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityPurchaseOrderHdr_GET
  result = api_instance.entity_purchase_order_hdr_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntitypurchaseOrderHdrApi->entity_purchase_order_hdr_get: #{e}"
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



