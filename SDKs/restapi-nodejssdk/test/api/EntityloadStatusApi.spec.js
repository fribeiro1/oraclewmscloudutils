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
    instance = new RestApi.EntityloadStatusApi();
  });

  describe('(package)', function() {
    describe('EntityloadStatusApi', function() {
      describe('entityLoadStatusByIdGET', function() {
        it('should call entityLoadStatusByIdGET successfully', function(done) {
          // TODO: uncomment, update parameter values for entityLoadStatusByIdGET call and complete the assertions
          /*
          var id = 8.14;
          var opts = {};
          opts.fields = "fields_example";

          instance.entityLoadStatusByIdGET(id, opts, function(error, data, response) {
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
      describe('entityLoadStatusDescribeGET', function() {
        it('should call entityLoadStatusDescribeGET successfully', function(done) {
          // TODO: uncomment entityLoadStatusDescribeGET call and complete the assertions
          /*

          instance.entityLoadStatusDescribeGET(function(error, data, response) {
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
      describe('entityLoadStatusGET', function() {
        it('should call entityLoadStatusGET successfully', function(done) {
          // TODO: uncomment, update parameter values for entityLoadStatusGET call and complete the assertions
          /*
          var opts = {};
          opts.fields = "fields_example";
          opts.ordering = "ordering_example";
          opts.pageMode = "paged";

          instance.entityLoadStatusGET(opts, function(error, data, response) {
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