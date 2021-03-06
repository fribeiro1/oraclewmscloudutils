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
    instance = new RestApi.EntityinventoryApi();
  });

  describe('(package)', function() {
    describe('EntityinventoryApi', function() {
      describe('entityInventoryBulkUpdateInventoryAttributesPOST', function() {
        it('should call entityInventoryBulkUpdateInventoryAttributesPOST successfully', function(done) {
          // TODO: uncomment entityInventoryBulkUpdateInventoryAttributesPOST call and complete the assertions
          /*

          instance.entityInventoryBulkUpdateInventoryAttributesPOST(function(error, data, response) {
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
      describe('entityInventoryByIdGET', function() {
        it('should call entityInventoryByIdGET successfully', function(done) {
          // TODO: uncomment, update parameter values for entityInventoryByIdGET call and complete the assertions
          /*
          var id = 8.14;
          var opts = {};
          opts.fields = "fields_example";

          instance.entityInventoryByIdGET(id, opts, function(error, data, response) {
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
      describe('entityInventoryDescribeGET', function() {
        it('should call entityInventoryDescribeGET successfully', function(done) {
          // TODO: uncomment entityInventoryDescribeGET call and complete the assertions
          /*

          instance.entityInventoryDescribeGET(function(error, data, response) {
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
      describe('entityInventoryGET', function() {
        it('should call entityInventoryGET successfully', function(done) {
          // TODO: uncomment, update parameter values for entityInventoryGET call and complete the assertions
          /*
          var opts = {};
          opts.fields = "fields_example";
          opts.ordering = "ordering_example";
          opts.pageMode = "paged";

          instance.entityInventoryGET(opts, function(error, data, response) {
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
      describe('entityInventoryLinkSerialNbrsByIdPOST', function() {
        it('should call entityInventoryLinkSerialNbrsByIdPOST successfully', function(done) {
          // TODO: uncomment, update parameter values for entityInventoryLinkSerialNbrsByIdPOST call and complete the assertions
          /*
          var id = 8.14;

          instance.entityInventoryLinkSerialNbrsByIdPOST(id, function(error, data, response) {
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
      describe('entityInventoryPOST', function() {
        it('should call entityInventoryPOST successfully', function(done) {
          // TODO: uncomment, update parameter values for entityInventoryPOST call and complete the assertions
          /*
          var opts = {};
          opts.fields = "fields_example";
          opts.ordering = "ordering_example";
          opts.pageMode = "paged";

          instance.entityInventoryPOST(opts, function(error, data, response) {
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
