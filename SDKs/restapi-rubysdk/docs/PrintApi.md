# SwaggerClient::PrintApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**print_label_ib_container_get**](PrintApi.md#print_label_ib_container_get) | **GET** /print/label/ib_container | PrintLabelIbContainer_GET
[**print_label_ib_container_post**](PrintApi.md#print_label_ib_container_post) | **POST** /print/label/ib_container | PrintLabelIbContainer_POST
[**print_label_pallet_get**](PrintApi.md#print_label_pallet_get) | **GET** /print/label/pallet | PrintLabelPallet_GET
[**print_label_pallet_post**](PrintApi.md#print_label_pallet_post) | **POST** /print/label/pallet | PrintLabelPallet_POST
[**print_label_shipping_get**](PrintApi.md#print_label_shipping_get) | **GET** /print/label/shipping | PrintLabelShipping_GET
[**print_label_shipping_post**](PrintApi.md#print_label_shipping_post) | **POST** /print/label/shipping | PrintLabelShipping_POST


# **print_label_ib_container_get**
> Object print_label_ib_container_get(company_id, container_nbr, facility_id, id, label_designer_code)

PrintLabelIbContainer_GET



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

api_instance = SwaggerClient::PrintApi.new

company_id = 8.14 # Float | 

container_nbr = 'container_nbr_example' # String | 

facility_id = 8.14 # Float | 

id = 8.14 # Float | 

label_designer_code = 'label_designer_code_example' # String | 


begin
  #PrintLabelIbContainer_GET
  result = api_instance.print_label_ib_container_get(company_id, container_nbr, facility_id, id, label_designer_code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PrintApi->print_label_ib_container_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **Float**|  | 
 **container_nbr** | **String**|  | 
 **facility_id** | **Float**|  | 
 **id** | **Float**|  | 
 **label_designer_code** | **String**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **print_label_ib_container_post**
> Object print_label_ib_container_post(company_id, container_nbr, facility_id, id, label_designer_code)

PrintLabelIbContainer_POST



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

api_instance = SwaggerClient::PrintApi.new

company_id = 8.14 # Float | 

container_nbr = 'container_nbr_example' # String | 

facility_id = 8.14 # Float | 

id = 8.14 # Float | 

label_designer_code = 'label_designer_code_example' # String | 


begin
  #PrintLabelIbContainer_POST
  result = api_instance.print_label_ib_container_post(company_id, container_nbr, facility_id, id, label_designer_code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PrintApi->print_label_ib_container_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **Float**|  | 
 **container_nbr** | **String**|  | 
 **facility_id** | **Float**|  | 
 **id** | **Float**|  | 
 **label_designer_code** | **String**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **print_label_pallet_get**
> Object print_label_pallet_get(company_id, container_nbr, facility_id, id, label_designer_code)

PrintLabelPallet_GET



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

api_instance = SwaggerClient::PrintApi.new

company_id = 8.14 # Float | 

container_nbr = 'container_nbr_example' # String | 

facility_id = 8.14 # Float | 

id = 8.14 # Float | 

label_designer_code = 'label_designer_code_example' # String | 


begin
  #PrintLabelPallet_GET
  result = api_instance.print_label_pallet_get(company_id, container_nbr, facility_id, id, label_designer_code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PrintApi->print_label_pallet_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **Float**|  | 
 **container_nbr** | **String**|  | 
 **facility_id** | **Float**|  | 
 **id** | **Float**|  | 
 **label_designer_code** | **String**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **print_label_pallet_post**
> Object print_label_pallet_post(company_id, container_nbr, facility_id, id, label_designer_code)

PrintLabelPallet_POST



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

api_instance = SwaggerClient::PrintApi.new

company_id = 8.14 # Float | 

container_nbr = 'container_nbr_example' # String | 

facility_id = 8.14 # Float | 

id = 8.14 # Float | 

label_designer_code = 'label_designer_code_example' # String | 


begin
  #PrintLabelPallet_POST
  result = api_instance.print_label_pallet_post(company_id, container_nbr, facility_id, id, label_designer_code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PrintApi->print_label_pallet_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **Float**|  | 
 **container_nbr** | **String**|  | 
 **facility_id** | **Float**|  | 
 **id** | **Float**|  | 
 **label_designer_code** | **String**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **print_label_shipping_get**
> Object print_label_shipping_get(company_id, container_nbr, facility_id, id, label_designer_code)

PrintLabelShipping_GET



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

api_instance = SwaggerClient::PrintApi.new

company_id = 8.14 # Float | 

container_nbr = 'container_nbr_example' # String | 

facility_id = 8.14 # Float | 

id = 8.14 # Float | 

label_designer_code = 'label_designer_code_example' # String | 


begin
  #PrintLabelShipping_GET
  result = api_instance.print_label_shipping_get(company_id, container_nbr, facility_id, id, label_designer_code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PrintApi->print_label_shipping_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **Float**|  | 
 **container_nbr** | **String**|  | 
 **facility_id** | **Float**|  | 
 **id** | **Float**|  | 
 **label_designer_code** | **String**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



# **print_label_shipping_post**
> Object print_label_shipping_post(company_id, container_nbr, facility_id, id, label_designer_code)

PrintLabelShipping_POST



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

api_instance = SwaggerClient::PrintApi.new

company_id = 8.14 # Float | 

container_nbr = 'container_nbr_example' # String | 

facility_id = 8.14 # Float | 

id = 8.14 # Float | 

label_designer_code = 'label_designer_code_example' # String | 


begin
  #PrintLabelShipping_POST
  result = api_instance.print_label_shipping_post(company_id, container_nbr, facility_id, id, label_designer_code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling PrintApi->print_label_shipping_post: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company_id** | **Float**|  | 
 **container_nbr** | **String**|  | 
 **facility_id** | **Float**|  | 
 **id** | **Float**|  | 
 **label_designer_code** | **String**|  | 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



