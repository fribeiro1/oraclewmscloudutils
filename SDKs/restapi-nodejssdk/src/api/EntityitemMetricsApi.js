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
    root.RestApi.EntityitemMetricsApi = factory(root.RestApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * EntityitemMetrics service.
   * @module api/EntityitemMetricsApi
   * @version 1.0
   */

  /**
   * Constructs a new EntityitemMetricsApi. 
   * @alias module:api/EntityitemMetricsApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the entityItemMetricsByIdGET operation.
     * @callback module:api/EntityitemMetricsApi~entityItemMetricsByIdGETCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * EntityItemMetricsById_GET
     * 
     * @param {Number} id 
     * @param {Object} opts Optional parameters
     * @param {String} opts.fields 
     * @param {module:api/EntityitemMetricsApi~entityItemMetricsByIdGETCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.entityItemMetricsByIdGET = function(id, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling entityItemMetricsByIdGET");
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
        '/entity/item_metrics/{id}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the entityItemMetricsDescribeGET operation.
     * @callback module:api/EntityitemMetricsApi~entityItemMetricsDescribeGETCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * EntityItemMetricsDescribe_GET
     * 
     * @param {module:api/EntityitemMetricsApi~entityItemMetricsDescribeGETCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.entityItemMetricsDescribeGET = function(callback) {
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
        '/entity/item_metrics/describe', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the entityItemMetricsGET operation.
     * @callback module:api/EntityitemMetricsApi~entityItemMetricsGETCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * EntityItemMetrics_GET
     * 
     * @param {Object} opts Optional parameters
     * @param {String} opts.fields 
     * @param {String} opts.ordering 
     * @param {module:model/String} opts.pageMode  (default to paged)
     * @param {module:api/EntityitemMetricsApi~entityItemMetricsGETCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.entityItemMetricsGET = function(opts, callback) {
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
        '/entity/item_metrics', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));