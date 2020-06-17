# SwaggerClient::EntityinvoiceStatusApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entity_invoice_status_by_id_get**](EntityinvoiceStatusApi.md#entity_invoice_status_by_id_get) | **GET** /entity/invoice_status/{id} | EntityInvoiceStatusById_GET
[**entity_invoice_status_describe_get**](EntityinvoiceStatusApi.md#entity_invoice_status_describe_get) | **GET** /entity/invoice_status/describe | EntityInvoiceStatusDescribe_GET
[**entity_invoice_status_get**](EntityinvoiceStatusApi.md#entity_invoice_status_get) | **GET** /entity/invoice_status | EntityInvoiceStatus_GET


# **entity_invoice_status_by_id_get**
> Object entity_invoice_status_by_id_get(id, opts)

EntityInvoiceStatusById_GET



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

api_instance = SwaggerClient::EntityinvoiceStatusApi.new

id = 8.14 # Float | 

opts = { 
  fields: 'fields_example' # String | 
}

begin
  #EntityInvoiceStatusById_GET
  result = api_instance.entity_invoice_status_by_id_get(id, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinvoiceStatusApi->entity_invoice_status_by_id_get: #{e}"
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



# **entity_invoice_status_describe_get**
> Object entity_invoice_status_describe_get

EntityInvoiceStatusDescribe_GET



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

api_instance = SwaggerClient::EntityinvoiceStatusApi.new

begin
  #EntityInvoiceStatusDescribe_GET
  result = api_instance.entity_invoice_status_describe_get
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinvoiceStatusApi->entity_invoice_status_describe_get: #{e}"
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



# **entity_invoice_status_get**
> Object entity_invoice_status_get(opts)

EntityInvoiceStatus_GET



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

api_instance = SwaggerClient::EntityinvoiceStatusApi.new

opts = { 
  fields: 'fields_example', # String | 
  ordering: 'ordering_example', # String | 
  page_mode: 'paged' # String | 
}

begin
  #EntityInvoiceStatus_GET
  result = api_instance.entity_invoice_status_get(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling EntityinvoiceStatusApi->entity_invoice_status_get: #{e}"
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



