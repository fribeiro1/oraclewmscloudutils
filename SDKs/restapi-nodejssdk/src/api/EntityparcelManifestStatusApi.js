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
    root.RestApi.EntityparcelManifestStatusApi = factory(root.RestApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * EntityparcelManifestStatus service.
   * @module api/EntityparcelManifestStatusApi
   * @version 1.0
   */

  /**
   * Constructs a new EntityparcelManifestStatusApi. 
   * @alias module:api/EntityparcelManifestStatusApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the entityParcelManifestStatusByIdGET operation.
     * @callback module:api/EntityparcelManifestStatusApi~entityParcelManifestStatusByIdGETCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * EntityParcelManifestStatusById_GET
     * 
     * @param {Number} id 
     * @param {Object} opts Optional parameters
     * @param {String} opts.fields 
     * @param {module:api/EntityparcelManifestStatusApi~entityParcelManifestStatusByIdGETCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.entityParcelManifestStatusByIdGET = function(id, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling entityParcelManifestStatusByIdGET");
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
        '/entity/parcel_manifest_status/{id}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the entityParcelManifestStatusDescribeGET operation.
     * @callback module:api/EntityparcelManifestStatusApi~entityParcelManifestStatusDescribeGETCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * EntityParcelManifestStatusDescribe_GET
     * 
     * @param {module:api/EntityparcelManifestStatusApi~entityParcelManifestStatusDescribeGETCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.entityParcelManifestStatusDescribeGET = function(callback) {
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
        '/entity/parcel_manifest_status/describe', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the entityParcelManifestStatusGET operation.
     * @callback module:api/EntityparcelManifestStatusApi~entityParcelManifestStatusGETCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * EntityParcelManifestStatus_GET
     * 
     * @param {Object} opts Optional parameters
     * @param {String} opts.fields 
     * @param {String} opts.ordering 
     * @param {module:model/String} opts.pageMode  (default to paged)
     * @param {module:api/EntityparcelManifestStatusApi~entityParcelManifestStatusGETCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.entityParcelManifestStatusGET = function(opts, callback) {
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
        '/entity/parcel_manifest_status', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
