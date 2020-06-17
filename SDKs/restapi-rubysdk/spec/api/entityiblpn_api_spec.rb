=begin
#REST API

#This is a sample definition of the Oracle WMS Cloud REST API.  The views expressed here are my own and do not necessarily reflect the views of Oracle.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.13

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::EntityiblpnApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'EntityiblpnApi' do
  before do
    # run before each test
    @instance = SwaggerClient::EntityiblpnApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of EntityiblpnApi' do
    it 'should create an instance of EntityiblpnApi' do
      expect(@instance).to be_instance_of(SwaggerClient::EntityiblpnApi)
    end
  end

  # unit tests for entity_iblpn_by_id_get
  # EntityIblpnById_GET
  # 
  # @param id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :fields 
  # @return [Object]
  describe 'entity_iblpn_by_id_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_iblpn_by_id_patch
  # EntityIblpnById_PATCH
  # 
  # @param id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :fields 
  # @return [Object]
  describe 'entity_iblpn_by_id_patch test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_iblpn_composite_create_post
  # EntityIblpnCompositeCreate_POST
  # 
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'entity_iblpn_composite_create_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_iblpn_describe_get
  # EntityIblpnDescribe_GET
  # 
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'entity_iblpn_describe_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_iblpn_direct_consume_by_id_post
  # EntityIblpnDirectConsumeById_POST
  # 
  # @param id 
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'entity_iblpn_direct_consume_by_id_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_iblpn_get
  # EntityIblpn_GET
  # 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :fields 
  # @option opts [String] :ordering 
  # @option opts [String] :page_mode 
  # @return [Object]
  describe 'entity_iblpn_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_iblpn_modify_item_qty_by_id_post
  # EntityIblpnModifyItemQtyById_POST
  # 
  # @param id 
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'entity_iblpn_modify_item_qty_by_id_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_iblpn_modify_item_qty_post
  # EntityIblpnModifyItemQty_POST
  # 
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'entity_iblpn_modify_item_qty_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_iblpn_post
  # EntityIblpn_POST
  # 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :fields 
  # @option opts [String] :ordering 
  # @option opts [String] :page_mode 
  # @return [Object]
  describe 'entity_iblpn_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end