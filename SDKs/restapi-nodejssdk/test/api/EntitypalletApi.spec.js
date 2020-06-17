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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.RestApi);
  }
}(this, function(expect, RestApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new RestApi.EntitypalletApi();
  });

  describe('(package)', function() {
    describe('EntitypalletApi', function() {
      describe('entityPalletByIdGET', function() {
        it('should call entityPalletByIdGET successfully', function(done) {
          // TODO: uncomment, update parameter values for entityPalletByIdGET call and complete the assertions
          /*
          var id = 8.14;
          var opts = {};
          opts.fields = "fields_example";

          instance.entityPalletByIdGET(id, opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(Object);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('entityPalletCloseInboundSortingByIdPOST', function() {
        it('should call entityPalletCloseInboundSortingByIdPOST successfully', function(done) {
          // TODO: uncomment, update parameter values for entityPalletCloseInboundSortingByIdPOST call and complete the assertions
          /*
          var id = 8.14;

          instance.entityPalletCloseInboundSortingByIdPOST(id, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(Object);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('entityPalletCloseInboundSortingPOST', function() {
        it('should call entityPalletCloseInboundSortingPOST successfully', function(done) {
          // TODO: uncomment entityPalletCloseInboundSortingPOST call and complete the assertions
          /*

          instance.entityPalletCloseInboundSortingPOST(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(Object);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('entityPalletDescribeGET', function() {
        it('should call entityPalletDescribeGET successfully', function(done) {
          // TODO: uncomment entityPalletDescribeGET call and complete the assertions
          /*

          instance.entityPalletDescribeGET(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(Object);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('entityPalletGET', function() {
        it('should call entityPalletGET successfully', function(done) {
          // TODO: uncomment, update parameter values for entityPalletGET call and complete the assertions
          /*
          var opts = {};
          opts.fields = "fields_example";
          opts.ordering = "ordering_example";
          opts.pageMode = "paged";

          instance.entityPalletGET(opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(Object);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('entityPalletSortLpnPOST', function() {
        it('should call entityPalletSortLpnPOST successfully', function(done) {
          // TODO: uncomment entityPalletSortLpnPOST call and complete the assertions
          /*

          instance.entityPalletSortLpnPOST(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(Object);
            // expect(data).to.be(null);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));