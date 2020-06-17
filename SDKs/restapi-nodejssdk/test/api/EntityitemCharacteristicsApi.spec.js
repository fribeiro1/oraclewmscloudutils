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
    instance = new RestApi.EntityitemCharacteristicsApi();
  });

  describe('(package)', function() {
    describe('EntityitemCharacteristicsApi', function() {
      describe('entityItemCharacteristicsByIdGET', function() {
        it('should call entityItemCharacteristicsByIdGET successfully', function(done) {
          // TODO: uncomment, update parameter values for entityItemCharacteristicsByIdGET call and complete the assertions
          /*
          var id = 8.14;
          var opts = {};
          opts.fields = "fields_example";

          instance.entityItemCharacteristicsByIdGET(id, opts, function(error, data, response) {
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
      describe('entityItemCharacteristicsByIdPATCH', function() {
        it('should call entityItemCharacteristicsByIdPATCH successfully', function(done) {
          // TODO: uncomment, update parameter values for entityItemCharacteristicsByIdPATCH call and complete the assertions
          /*
          var id = 8.14;
          var opts = {};
          opts.fields = "fields_example";

          instance.entityItemCharacteristicsByIdPATCH(id, opts, function(error, data, response) {
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
      describe('entityItemCharacteristicsDescribeGET', function() {
        it('should call entityItemCharacteristicsDescribeGET successfully', function(done) {
          // TODO: uncomment entityItemCharacteristicsDescribeGET call and complete the assertions
          /*

          instance.entityItemCharacteristicsDescribeGET(function(error, data, response) {
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
      describe('entityItemCharacteristicsGET', function() {
        it('should call entityItemCharacteristicsGET successfully', function(done) {
          // TODO: uncomment, update parameter values for entityItemCharacteristicsGET call and complete the assertions
          /*
          var opts = {};
          opts.fields = "fields_example";
          opts.ordering = "ordering_example";
          opts.pageMode = "paged";

          instance.entityItemCharacteristicsGET(opts, function(error, data, response) {
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