/*
 * REST API
 * This is a sample definition of the Oracle WMS Cloud REST API.  The views expressed here are my own and do not necessarily reflect the views of Oracle.
 *
 * OpenAPI spec version: 1.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.13
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.RestApi) {
      root.RestApi = {};
    }
    root.RestApi.EntityshippingBlockedSelectionCriteriaApi = factory(root.RestApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * EntityshippingBlockedSelectionCriteria service.
   * @module api/EntityshippingBlockedSelectionCriteriaApi
   * @version 1.0
   */

  /**
   * Constructs a new EntityshippingBlockedSelectionCriteriaApi. 
   * @alias module:api/EntityshippingBlockedSelectionCriteriaApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the entityShippingBlockedSelectionCriteriaDescribeGET operation.
     * @callback module:api/EntityshippingBlockedSelectionCriteriaApi~entityShippingBlockedSelectionCriteriaDescribeGETCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * EntityShippingBlockedSelectionCriteriaDescribe_GET
     * 
     * @param {module:api/EntityshippingBlockedSelectionCriteriaApi~entityShippingBlockedSelectionCriteriaDescribeGETCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.entityShippingBlockedSelectionCriteriaDescribeGET = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['basic', 'oauth2'];
      var contentTypes = ['application/json', 'application/xml'];
      var accepts = ['application/json', 'application/xml'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/entity/shipping_blocked_selection_criteria/describe', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the entityShippingBlockedSelectionCriteriaGET operation.
     * @callback module:api/EntityshippingBlockedSelectionCriteriaApi~entityShippingBlockedSelectionCriteriaGETCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * EntityShippingBlockedSelectionCriteria_GET
     * 
     * @param {Object} opts Optional parameters
     * @param {String} opts.fields 
     * @param {String} opts.ordering 
     * @param {module:model/String} opts.pageMode  (default to paged)
     * @param {module:api/EntityshippingBlockedSelectionCriteriaApi~entityShippingBlockedSelectionCriteriaGETCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.entityShippingBlockedSelectionCriteriaGET = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'fields': opts['fields'],
        'ordering': opts['ordering'],
        'page_mode': opts['pageMode'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['basic', 'oauth2'];
      var contentTypes = ['application/json', 'application/xml'];
      var accepts = ['application/json', 'application/xml'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/entity/shipping_blocked_selection_criteria', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getEntityShippingBlockedSelectionCriteriaGET operation.
     * @callback module:api/EntityshippingBlockedSelectionCriteriaApi~getEntityShippingBlockedSelectionCriteriaGETCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * EntityShippingBlockedSelectionCriteria_GET
     * 
     * @param {Number} id 
     * @param {Object} opts Optional parameters
     * @param {String} opts.fields 
     * @param {module:api/EntityshippingBlockedSelectionCriteriaApi~getEntityShippingBlockedSelectionCriteriaGETCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.getEntityShippingBlockedSelectionCriteriaGET = function(id, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getEntityShippingBlockedSelectionCriteriaGET");
      }


      var pathParams = {
        'id': id
      };
      var queryParams = {
        'fields': opts['fields'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['basic', 'oauth2'];
      var contentTypes = ['application/json', 'application/xml'];
      var accepts = ['application/json', 'application/xml'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/entity/shipping_blocked_selection_criteria/{id}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));