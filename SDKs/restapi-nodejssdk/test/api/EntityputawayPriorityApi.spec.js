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
    instance = new RestApi.EntityputawayPriorityApi();
  });

  describe('(package)', function() {
    describe('EntityputawayPriorityApi', function() {
      describe('entityPutawayPriorityByIdGET', function() {
        it('should call entityPutawayPriorityByIdGET successfully', function(done) {
          // TODO: uncomment, update parameter values for entityPutawayPriorityByIdGET call and complete the assertions
          /*
          var id = 8.14;
          var opts = {};
          opts.fields = "fields_example";

          instance.entityPutawayPriorityByIdGET(id, opts, function(error, data, response) {
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
      describe('entityPutawayPriorityGET', function() {
        it('should call entityPutawayPriorityGET successfully', function(done) {
          // TODO: uncomment entityPutawayPriorityGET call and complete the assertions
          /*

          instance.entityPutawayPriorityGET(function(error, data, response) {
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
      describe('entityPutawayPriorityPOST', function() {
        it('should call entityPutawayPriorityPOST successfully', function(done) {
          // TODO: uncomment entityPutawayPriorityPOST call and complete the assertions
          /*

          instance.entityPutawayPriorityPOST(function(error, data, response) {
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
