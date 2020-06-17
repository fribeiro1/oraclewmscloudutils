=begin
#REST API

#This is a sample definition of the Oracle WMS Cloud REST API.  The views expressed here are my own and do not necessarily reflect the views of Oracle.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.13

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::PickPackApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'PickPackApi' do
  before do
    # run before each test
    @instance = SwaggerClient::PickPackApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PickPackApi' do
    it 'should create an instance of PickPackApi' do
      expect(@instance).to be_instance_of(SwaggerClient::PickPackApi)
    end
  end

  # unit tests for pick_pack_close_lpn_post
  # PickPackCloseLpn_POST
  # 
  # @param to_container_nbr 
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :async_flg 
  # @option opts [String] :close_container_status 
  # @option opts [Float] :company_id 
  # @option opts [String] :company_id__code 
  # @option opts [Float] :facility_id 
  # @option opts [String] :facility_id__code 
  # @option opts [String] :reason_code 
  # @option opts [BOOLEAN] :short_on_close_flg 
  # @option opts [BOOLEAN] :update_inventory_on_short_flg 
  # @option opts [String] :to_container__code 
  # @return [Object]
  describe 'pick_pack_close_lpn_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for pick_pack_pick_confirm_post
  # PickPackPickConfirm_POST
  # 
  # @param async_flg 
  # @param mhe_mode_flg 
  # @param order_nbr 
  # @param wave_nbr 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :allocation_uom 
  # @option opts [String] :batch_nbr 
  # @option opts [String] :close_container_status 
  # @option opts [Float] :company_id 
  # @option opts [String] :company_id__code 
  # @option opts [Float] :facility_id 
  # @option opts [String] :facility_id__code 
  # @option opts [String] :from_container_nbr 
  # @option opts [String] :item_alternate_code 
  # @option opts [String] :item_barcode 
  # @option opts [String] :mhe_system_code 
  # @option opts [String] :pick_location 
  # @option opts [Float] :qty 
  # @option opts [String] :reason_code 
  # @option opts [BOOLEAN] :short_flg 
  # @option opts [BOOLEAN] :short_on_close_flg 
  # @option opts [String] :to_container_nbr 
  # @option opts [String] :uom_qty 
  # @option opts [BOOLEAN] :update_inventory_on_short_flg 
  # @return [Object]
  describe 'pick_pack_pick_confirm_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for pick_pack_wave_complete_post
  # PickPackWaveComplete_POST
  # 
  # @param wave_nbr 
  # @param [Hash] opts the optional parameters
  # @option opts [BOOLEAN] :async_flg 
  # @option opts [String] :close_container_status 
  # @option opts [Float] :company_id 
  # @option opts [String] :company_id__code 
  # @option opts [Float] :facility_id 
  # @option opts [String] :facility_id__code 
  # @option opts [String] :mhe_system_code 
  # @option opts [String] :reason_code 
  # @option opts [BOOLEAN] :update_inventory_on_short_flg 
  # @return [Object]
  describe 'pick_pack_wave_complete_post test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end