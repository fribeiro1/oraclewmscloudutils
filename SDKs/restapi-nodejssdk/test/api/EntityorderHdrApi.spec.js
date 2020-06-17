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
    instance = new RestApi.EntityorderHdrApi();
  });

  describe('(package)', function() {
    describe('EntityorderHdrApi', function() {
      describe('entityOrderHdrBulkLockPOST', function() {
        it('should call entityOrderHdrBulkLockPOST successfully', function(done) {
          // TODO: uncomment entityOrderHdrBulkLockPOST call and complete the assertions
          /*

          instance.entityOrderHdrBulkLockPOST(function(error, data, response) {
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
      describe('entityOrderHdrBulkUnlockPOST', function() {
        it('should call entityOrderHdrBulkUnlockPOST successfully', function(done) {
          // TODO: uncomment entityOrderHdrBulkUnlockPOST call and complete the assertions
          /*

          instance.entityOrderHdrBulkUnlockPOST(function(error, data, response) {
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
      describe('entityOrderHdrByIdGET', function() {
        it('should call entityOrderHdrByIdGET successfully', function(done) {
          // TODO: uncomment, update parameter values for entityOrderHdrByIdGET call and complete the assertions
          /*
          var id = 8.14;
          var opts = {};
          opts.fields = "fields_example";

          instance.entityOrderHdrByIdGET(id, opts, function(error, data, response) {
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
      describe('entityOrderHdrByIdPATCH', function() {
        it('should call entityOrderHdrByIdPATCH successfully', function(done) {
          // TODO: uncomment, update parameter values for entityOrderHdrByIdPATCH call and complete the assertions
          /*
          var id = 8.14;
          var opts = {};
          opts.fields = "fields_example";

          instance.entityOrderHdrByIdPATCH(id, opts, function(error, data, response) {
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
      describe('entityOrderHdrDescribeGET', function() {
        it('should call entityOrderHdrDescribeGET successfully', function(done) {
          // TODO: uncomment entityOrderHdrDescribeGET call and complete the assertions
          /*

          instance.entityOrderHdrDescribeGET(function(error, data, response) {
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
      describe('entityOrderHdrGET', function() {
        it('should call entityOrderHdrGET successfully', function(done) {
          // TODO: uncomment, update parameter values for entityOrderHdrGET call and complete the assertions
          /*
          var opts = {};
          opts.fields = "fields_example";
          opts.ordering = "ordering_example";
          opts.pageMode = "paged";

          instance.entityOrderHdrGET(opts, function(error, data, response) {
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
      describe('entityOrderHdrIblpnsByIdPOST', function() {
        it('should call entityOrderHdrIblpnsByIdPOST successfully', function(done) {
          // TODO: uncomment, update parameter values for entityOrderHdrIblpnsByIdPOST call and complete the assertions
          /*
          var id = 8.14;

          instance.entityOrderHdrIblpnsByIdPOST(id, function(error, data, response) {
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
      describe('entityOrderHdrOblpnsByIdPOST', function() {
        it('should call entityOrderHdrOblpnsByIdPOST successfully', function(done) {
          // TODO: uncomment, update parameter values for entityOrderHdrOblpnsByIdPOST call and complete the assertions
          /*
          var id = 8.14;

          instance.entityOrderHdrOblpnsByIdPOST(id, function(error, data, response) {
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
