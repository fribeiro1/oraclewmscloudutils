=begin
#REST API

#This is a sample definition of the Oracle WMS Cloud REST API.  The views expressed here are my own and do not necessarily reflect the views of Oracle.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.13

=end

require 'uri'

module SwaggerClient
  class EntitysqlSelectionApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # EntitySqlSelectionById_GET
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :fields 
    # @return [Object]
    def entity_sql_selection_by_id_get(id, opts = {})
      data, _status_code, _headers = entity_sql_selection_by_id_get_with_http_info(id, opts)
      data
    end

    # EntitySqlSelectionById_GET
    # 
    # @param id 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :fields 
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_sql_selection_by_id_get_with_http_info(id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntitysqlSelectionApi.entity_sql_selection_by_id_get ...'
      end
      # verify the required parameter 'id' is set
      if @api_client.config.client_side_validation && id.nil?
        fail ArgumentError, "Missing the required parameter 'id' when calling EntitysqlSelectionApi.entity_sql_selection_by_id_get"
      end
      # resource path
      local_var_path = '/entity/sql_selection/{id}'.sub('{' + 'id' + '}', id.to_s)

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
        @api_client.config.logger.debug "API called: EntitysqlSelectionApi#entity_sql_selection_by_id_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # EntitySqlSelection_GET
    # 
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def entity_sql_selection_get(opts = {})
      data, _status_code, _headers = entity_sql_selection_get_with_http_info(opts)
      data
    end

    # EntitySqlSelection_GET
    # 
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_sql_selection_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntitysqlSelectionApi.entity_sql_selection_get ...'
      end
      # resource path
      local_var_path = '/entity/sql_selection'

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
        @api_client.config.logger.debug "API called: EntitysqlSelectionApi#entity_sql_selection_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # EntitySqlSelection_POST
    # 
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def entity_sql_selection_post(opts = {})
      data, _status_code, _headers = entity_sql_selection_post_with_http_info(opts)
      data
    end

    # EntitySqlSelection_POST
    # 
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def entity_sql_selection_post_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: EntitysqlSelectionApi.entity_sql_selection_post ...'
      end
      # resource path
      local_var_path = '/entity/sql_selection'

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
        @api_client.config.logger.debug "API called: EntitysqlSelectionApi#entity_sql_selection_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end