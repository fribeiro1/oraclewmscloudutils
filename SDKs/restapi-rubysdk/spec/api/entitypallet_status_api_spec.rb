=begin
#REST API

#This is a sample definition of the Oracle WMS Cloud REST API.  The views expressed here are my own and do not necessarily reflect the views of Oracle.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.13

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::EntitypalletStatusApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'EntitypalletStatusApi' do
  before do
    # run before each test
    @instance = SwaggerClient::EntitypalletStatusApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of EntitypalletStatusApi' do
    it 'should create an instance of EntitypalletStatusApi' do
      expect(@instance).to be_instance_of(SwaggerClient::EntitypalletStatusApi)
    end
  end

  # unit tests for entity_pallet_status_by_id_get
  # EntityPalletStatusById_GET
  # 
  # @param id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :fields 
  # @return [Object]
  describe 'entity_pallet_status_by_id_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_pallet_status_describe_get
  # EntityPalletStatusDescribe_GET
  # 
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'entity_pallet_status_describe_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_pallet_status_get
  # EntityPalletStatus_GET
  # 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :fields 
  # @option opts [String] :ordering 
  # @option opts [String] :page_mode 
  # @return [Object]
  describe 'entity_pallet_status_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
