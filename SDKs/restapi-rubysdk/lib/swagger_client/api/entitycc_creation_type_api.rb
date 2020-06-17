=begin
#REST API

#This is a sample definition of the Oracle WMS Cloud REST API.  The views expressed here are my own and do not necessarily reflect the views of Oracle.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.13

=end

require 'uri'

module SwaggerClient
  class EntityccCreationTypeApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # EntityCcCreationTypeById_GET
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :fields 
    # @return [Object]
    def entity_cc_creation_type_by_id_get(id, opts = {})
      data, _status_code, _headers = entity_cc_creation_type_by_id_get_with_http_info(id, opts)
      data
    end

    # EntityCcCreationTypeById_GET
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :fields 
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_cc_creation_type_by_id_get_with_http_info(id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntityccCreationTypeApi.entity_cc_creation_type_by_id_get ...'
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling EntityccCreationTypeApi.entity_cc_creation_type_by_id_get"
      end
      # resource path
      local_var_path = '/entity/cc_creation_type/{id}'.sub('{' + 'id' + '}', id.to_s)

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
        @api_client.config.logger.debug "API called: EntityccCreationTypeApi#entity_cc_creation_type_by_id_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # EntityCcCreationTypeDescribe_GET
    # 
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def entity_cc_creation_type_describe_get(opts = {})
      data, _status_code, _headers = entity_cc_creation_type_describe_get_with_http_info(opts)
      data
    end

    # EntityCcCreationTypeDescribe_GET
    # 
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_cc_creation_type_describe_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntityccCreationTypeApi.entity_cc_creation_type_describe_get ...'
      end
      # resource path
      local_var_path = '/entity/cc_creation_type/describe'

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
        @api_client.config.logger.debug "API called: EntityccCreationTypeApi#entity_cc_creation_type_describe_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # EntityCcCreationType_GET
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :fields 
    # @option opts [String] :ordering 
    # @option opts [String] :page_mode  (default to paged)
    # @return [Object]
    def entity_cc_creation_type_get(opts = {})
      data, _status_code, _headers = entity_cc_creation_type_get_with_http_info(opts)
      data
    end

    # EntityCcCreationType_GET
    # 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :fields 
    # @option opts [String] :ordering 
    # @option opts [String] :page_mode 
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_cc_creation_type_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntityccCreationTypeApi.entity_cc_creation_type_get ...'
      end
      if @api_client.config.client_side_validation && opts[:'page_mode'] && !['paged', 'sequenced'].include?(opts[:'page_mode'])
        fail ArgumentError, 'invalid value for "page_mode", must be one of paged, sequenced'
      end
      # resource path
      local_var_path = '/entity/cc_creation_type'

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
        @api_client.config.logger.debug "API called: EntityccCreationTypeApi#entity_cc_creation_type_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
