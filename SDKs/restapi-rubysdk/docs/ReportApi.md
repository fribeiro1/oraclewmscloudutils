# SwaggerClient::ReportApi

All URIs are relative to *https://demo.wms.ocs.oraclecloud.com/demo_a9/wms/lgfapi/v10*

Method | HTTP request | Description
------------- | ------------- | -------------
[**report_custom_inventory_summary_get**](ReportApi.md#report_custom_inventory_summary_get) | **GET** /report/custom_inventory_summary | ReportCustomInventorySummary_GET


# **report_custom_inventory_summary_get**
> Object report_custom_inventory_summary_get(item_code, opts)

ReportCustomInventorySummary_GET



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

api_instance = SwaggerClient::ReportApi.new

item_code = 'item_code_example' # String | 

opts = { 
  company_id: 8.14, # Float | 
  company_id__code: 'company_id__code_example', # String | 
  facility_id: 8.14, # Float | 
  facility_id__code: 'facility_id__code_example', # String | 
  write_header_line_flg: true # BOOLEAN | 
}

begin
  #ReportCustomInventorySummary_GET
  result = api_instance.report_custom_inventory_summary_get(item_code, opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling ReportApi->report_custom_inventory_summary_get: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item_code** | **String**|  | 
 **company_id** | **Float**|  | [optional] 
 **company_id__code** | **String**|  | [optional] 
 **facility_id** | **Float**|  | [optional] 
 **facility_id__code** | **String**|  | [optional] 
 **write_header_line_flg** | **BOOLEAN**|  | [optional] 

### Return type

**Object**

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml



