=begin
#REST API

#This is a sample definition of the Oracle WMS Cloud REST API.  The views expressed here are my own and do not necessarily reflect the views of Oracle.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.13

=end

require 'uri'

module SwaggerClient
  class EntitycontainerApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # EntityContainerBulkLock_POST
    # 
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def entity_container_bulk_lock_post(opts = {})
      data, _status_code, _headers = entity_container_bulk_lock_post_with_http_info(opts)
      data
    end

    # EntityContainerBulkLock_POST
    # 
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_container_bulk_lock_post_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntitycontainerApi.entity_container_bulk_lock_post ...'
      end
      # resource path
      local_var_path = '/entity/container/bulk_lock'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'application/xml'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/xml'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
#      auth_names = ['basic', 'oauth2']
      auth_names = ['basic']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EntitycontainerApi#entity_container_bulk_lock_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # EntityContainerBulkUnlock_POST
    # 
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def entity_container_bulk_unlock_post(opts = {})
      data, _status_code, _headers = entity_container_bulk_unlock_post_with_http_info(opts)
      data
    end

    # EntityContainerBulkUnlock_POST
    # 
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_container_bulk_unlock_post_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntitycontainerApi.entity_container_bulk_unlock_post ...'
      end
      # resource path
      local_var_path = '/entity/container/bulk_unlock'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'application/xml'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/xml'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
#      auth_names = ['basic', 'oauth2']
      auth_names = ['basic']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EntitycontainerApi#entity_container_bulk_unlock_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # EntityContainerById_GET
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :fields 
    # @return [Object]
    def entity_container_by_id_get(id, opts = {})
      data, _status_code, _headers = entity_container_by_id_get_with_http_info(id, opts)
      data
    end

    # EntityContainerById_GET
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :fields 
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_container_by_id_get_with_http_info(id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntitycontainerApi.entity_container_by_id_get ...'
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling EntitycontainerApi.entity_container_by_id_get"
      end
      # resource path
      local_var_path = '/entity/container/{id}'.sub('{' + 'id' + '}', id.to_s)

      # query parameters
      query_params = {}
      query_params[:'fields'] = opts[:'fields'] if !opts[:'fields'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'application/xml'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/xml'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
#      auth_names = ['basic', 'oauth2']
      auth_names = ['basic']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EntitycontainerApi#entity_container_by_id_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # EntityContainerById_PATCH
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :fields 
    # @return [Object]
    def entity_container_by_id_patch(id, opts = {})
      data, _status_code, _headers = entity_container_by_id_patch_with_http_info(id, opts)
      data
    end

    # EntityContainerById_PATCH
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :fields 
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_container_by_id_patch_with_http_info(id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntitycontainerApi.entity_container_by_id_patch ...'
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling EntitycontainerApi.entity_container_by_id_patch"
      end
      # resource path
      local_var_path = '/entity/container/{id}'.sub('{' + 'id' + '}', id.to_s)

      # query parameters
      query_params = {}
      query_params[:'fields'] = opts[:'fields'] if !opts[:'fields'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'application/xml'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/xml'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
#      auth_names = ['basic', 'oauth2']
      auth_names = ['basic']
      data, status_code, headers = @api_client.call_api(:PATCH, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EntitycontainerApi#entity_container_by_id_patch\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # EntityContainerDepalletizeById_POST
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def entity_container_depalletize_by_id_post(id, opts = {})
      data, _status_code, _headers = entity_container_depalletize_by_id_post_with_http_info(id, opts)
      data
    end

    # EntityContainerDepalletizeById_POST
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_container_depalletize_by_id_post_with_http_info(id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntitycontainerApi.entity_container_depalletize_by_id_post ...'
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling EntitycontainerApi.entity_container_depalletize_by_id_post"
      end
      # resource path
      local_var_path = '/entity/container/{id}/depalletize'.sub('{' + 'id' + '}', id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'application/xml'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/xml'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
#      auth_names = ['basic', 'oauth2']
      auth_names = ['basic']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EntitycontainerApi#entity_container_depalletize_by_id_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # EntityContainerDepalletize_POST
    # 
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def entity_container_depalletize_post(opts = {})
      data, _status_code, _headers = entity_container_depalletize_post_with_http_info(opts)
      data
    end

    # EntityContainerDepalletize_POST
    # 
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_container_depalletize_post_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntitycontainerApi.entity_container_depalletize_post ...'
      end
      # resource path
      local_var_path = '/entity/container/depalletize'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'application/xml'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/xml'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
#      auth_names = ['basic', 'oauth2']
      auth_names = ['basic']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EntitycontainerApi#entity_container_depalletize_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # EntityContainerDescribe_GET
    # 
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def entity_container_describe_get(opts = {})
      data, _status_code, _headers = entity_container_describe_get_with_http_info(opts)
      data
    end

    # EntityContainerDescribe_GET
    # 
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_container_describe_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntitycontainerApi.entity_container_describe_get ...'
      end
      # resource path
      local_var_path = '/entity/container/describe'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'application/xml'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/xml'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
#      auth_names = ['basic', 'oauth2']
      auth_names = ['basic']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EntitycontainerApi#entity_container_describe_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # EntityContainer_GET
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :fields 
    # @option opts [String] :ordering 
    # @option opts [String] :page_mode  (default to paged)
    # @return [Object]
    def entity_container_get(opts = {})
      data, _status_code, _headers = entity_container_get_with_http_info(opts)
      data
    end

    # EntityContainer_GET
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :fields 
    # @option opts [String] :ordering 
    # @option opts [String] :page_mode 
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_container_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntitycontainerApi.entity_container_get ...'
      end
      if @api_client.config.client_side_validation && opts[:'page_mode'] && !['paged', 'sequenced'].include?(opts[:'page_mode'])
        fail ArgumentError, 'invalid value for "page_mode", must be one of paged, sequenced'
      end
      # resource path
      local_var_path = '/entity/container'

      # query parameters
      query_params = {}
      query_params[:'fields'] = opts[:'fields'] if !opts[:'fields'].nil?
      query_params[:'ordering'] = opts[:'ordering'] if !opts[:'ordering'].nil?
      query_params[:'page_mode'] = opts[:'page_mode'] if !opts[:'page_mode'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'application/xml'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/xml'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
#      auth_names = ['basic', 'oauth2']
      auth_names = ['basic']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EntitycontainerApi#entity_container_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # EntityContainerLockById_POST
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def entity_container_lock_by_id_post(id, opts = {})
      data, _status_code, _headers = entity_container_lock_by_id_post_with_http_info(id, opts)
      data
    end

    # EntityContainerLockById_POST
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_container_lock_by_id_post_with_http_info(id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntitycontainerApi.entity_container_lock_by_id_post ...'
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling EntitycontainerApi.entity_container_lock_by_id_post"
      end
      # resource path
      local_var_path = '/entity/container/{id}/lock'.sub('{' + 'id' + '}', id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'application/xml'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/xml'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
#      auth_names = ['basic', 'oauth2']
      auth_names = ['basic']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EntitycontainerApi#entity_container_lock_by_id_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # EntityContainerOrdersById_GET
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def entity_container_orders_by_id_get(id, opts = {})
      data, _status_code, _headers = entity_container_orders_by_id_get_with_http_info(id, opts)
      data
    end

    # EntityContainerOrdersById_GET
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_container_orders_by_id_get_with_http_info(id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntitycontainerApi.entity_container_orders_by_id_get ...'
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling EntitycontainerApi.entity_container_orders_by_id_get"
      end
      # resource path
      local_var_path = '/entity/container/{id}/orders'.sub('{' + 'id' + '}', id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'application/xml'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/xml'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
#      auth_names = ['basic', 'oauth2']
      auth_names = ['basic']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EntitycontainerApi#entity_container_orders_by_id_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # EntityContainerPalletizeById_POST
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def entity_container_palletize_by_id_post(id, opts = {})
      data, _status_code, _headers = entity_container_palletize_by_id_post_with_http_info(id, opts)
      data
    end

    # EntityContainerPalletizeById_POST
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_container_palletize_by_id_post_with_http_info(id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntitycontainerApi.entity_container_palletize_by_id_post ...'
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling EntitycontainerApi.entity_container_palletize_by_id_post"
      end
      # resource path
      local_var_path = '/entity/container/{id}/palletize'.sub('{' + 'id' + '}', id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'application/xml'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/xml'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
#      auth_names = ['basic', 'oauth2']
      auth_names = ['basic']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EntitycontainerApi#entity_container_palletize_by_id_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # EntityContainerUnlockById_POST
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def entity_container_unlock_by_id_post(id, opts = {})
      data, _status_code, _headers = entity_container_unlock_by_id_post_with_http_info(id, opts)
      data
    end

    # EntityContainerUnlockById_POST
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_container_unlock_by_id_post_with_http_info(id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntitycontainerApi.entity_container_unlock_by_id_post ...'
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling EntitycontainerApi.entity_container_unlock_by_id_post"
      end
      # resource path
      local_var_path = '/entity/container/{id}/unlock'.sub('{' + 'id' + '}', id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'application/xml'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/xml'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
#      auth_names = ['basic', 'oauth2']
      auth_names = ['basic']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: EntitycontainerApi#entity_container_unlock_by_id_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
