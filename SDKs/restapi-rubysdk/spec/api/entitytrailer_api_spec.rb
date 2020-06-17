=begin
#REST API

#This is a sample definition of the Oracle WMS Cloud REST API.  The views expressed here are my own and do not necessarily reflect the views of Oracle.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.13

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::EntitytrailerApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'EntitytrailerApi' do
  before do
    # run before each test
    @instance = SwaggerClient::EntitytrailerApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of EntitytrailerApi' do
    it 'should create an instance of EntitytrailerApi' do
      expect(@instance).to be_instance_of(SwaggerClient::EntitytrailerApi)
    end
  end

  # unit tests for entity_trailer_by_id_get
  # EntityTrailerById_GET
  # 
  # @param id 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :fields 
  # @return [Object]
  describe 'entity_trailer_by_id_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_trailer_describe_get
  # EntityTrailerDescribe_GET
  # 
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'entity_trailer_describe_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_trailer_get
  # EntityTrailer_GET
  # 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :fields 
  # @option opts [String] :ordering 
  # @option opts [String] :page_mode 
  # @return [Object]
  describe 'entity_trailer_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_trailer_locate_to_yard_by_id_post
  # EntityTrailerLocateToYardById_POST
  # 
  # @param id 
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'entity_trailer_locate_to_yard_by_id_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_trailer_locate_to_yard_post
  # EntityTrailerLocateToYard_POST
  # 
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'entity_trailer_locate_to_yard_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_trailer_post
  # EntityTrailer_POST
  # 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :fields 
  # @option opts [String] :ordering 
  # @option opts [String] :page_mode 
  # @return [Object]
  describe 'entity_trailer_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_trailer_remove_from_yard_by_id_post
  # EntityTrailerRemoveFromYardById_POST
  # 
  # @param id 
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'entity_trailer_remove_from_yard_by_id_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for entity_trailer_remove_from_yard_post
  # EntityTrailerRemoveFromYard_POST
  # 
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'entity_trailer_remove_from_yard_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
