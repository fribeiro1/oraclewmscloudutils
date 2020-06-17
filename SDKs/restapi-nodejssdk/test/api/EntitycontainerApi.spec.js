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
    instance = new RestApi.EntitycontainerApi();
  });

  describe('(package)', function() {
    describe('EntitycontainerApi', function() {
      describe('entityContainerBulkLockPOST', function() {
        it('should call entityContainerBulkLockPOST successfully', function(done) {
          // TODO: uncomment entityContainerBulkLockPOST call and complete the assertions
          /*

          instance.entityContainerBulkLockPOST(function(error, data, response) {
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
      describe('entityContainerBulkUnlockPOST', function() {
        it('should call entityContainerBulkUnlockPOST successfully', function(done) {
          // TODO: uncomment entityContainerBulkUnlockPOST call and complete the assertions
          /*

          instance.entityContainerBulkUnlockPOST(function(error, data, response) {
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
      describe('entityContainerByIdGET', function() {
        it('should call entityContainerByIdGET successfully', function(done) {
          // TODO: uncomment, update parameter values for entityContainerByIdGET call and complete the assertions
          /*
          var id = 8.14;
          var opts = {};
          opts.fields = "fields_example";

          instance.entityContainerByIdGET(id, opts, function(error, data, response) {
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
      describe('entityContainerByIdPATCH', function() {
        it('should call entityContainerByIdPATCH successfully', function(done) {
          // TODO: uncomment, update parameter values for entityContainerByIdPATCH call and complete the assertions
          /*
          var id = 8.14;
          var opts = {};
          opts.fields = "fields_example";

          instance.entityContainerByIdPATCH(id, opts, function(error, data, response) {
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
      describe('entityContainerDepalletizeByIdPOST', function() {
        it('should call entityContainerDepalletizeByIdPOST successfully', function(done) {
          // TODO: uncomment, update parameter values for entityContainerDepalletizeByIdPOST call and complete the assertions
          /*
          var id = 8.14;

          instance.entityContainerDepalletizeByIdPOST(id, function(error, data, response) {
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
      describe('entityContainerDepalletizePOST', function() {
        it('should call entityContainerDepalletizePOST successfully', function(done) {
          // TODO: uncomment entityContainerDepalletizePOST call and complete the assertions
          /*

          instance.entityContainerDepalletizePOST(function(error, data, response) {
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
      describe('entityContainerDescribeGET', function() {
        it('should call entityContainerDescribeGET successfully', function(done) {
          // TODO: uncomment entityContainerDescribeGET call and complete the assertions
          /*

          instance.entityContainerDescribeGET(function(error, data, response) {
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
      describe('entityContainerGET', function() {
        it('should call entityContainerGET successfully', function(done) {
          // TODO: uncomment, update parameter values for entityContainerGET call and complete the assertions
          /*
          var opts = {};
          opts.fields = "fields_example";
          opts.ordering = "ordering_example";
          opts.pageMode = "paged";

          instance.entityContainerGET(opts, function(error, data, response) {
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
      describe('entityContainerLockByIdPOST', function() {
        it('should call entityContainerLockByIdPOST successfully', function(done) {
          // TODO: uncomment, update parameter values for entityContainerLockByIdPOST call and complete the assertions
          /*
          var id = 8.14;

          instance.entityContainerLockByIdPOST(id, function(error, data, response) {
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
      describe('entityContainerOrdersByIdGET', function() {
        it('should call entityContainerOrdersByIdGET successfully', function(done) {
          // TODO: uncomment, update parameter values for entityContainerOrdersByIdGET call and complete the assertions
          /*
          var id = 8.14;

          instance.entityContainerOrdersByIdGET(id, function(error, data, response) {
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
      describe('entityContainerPalletizeByIdPOST', function() {
        it('should call entityContainerPalletizeByIdPOST successfully', function(done) {
          // TODO: uncomment, update parameter values for entityContainerPalletizeByIdPOST call and complete the assertions
          /*
          var id = 8.14;

          instance.entityContainerPalletizeByIdPOST(id, function(error, data, response) {
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
      describe('entityContainerUnlockByIdPOST', function() {
        it('should call entityContainerUnlockByIdPOST successfully', function(done) {
          // TODO: uncomment, update parameter values for entityContainerUnlockByIdPOST call and complete the assertions
          /*
          var id = 8.14;

          instance.entityContainerUnlockByIdPOST(id, function(error, data, response) {
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
