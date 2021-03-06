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
    instance = new RestApi.PickPackApi();
  });

  describe('(package)', function() {
    describe('PickPackApi', function() {
      describe('pickPackCloseLpnPOST', function() {
        it('should call pickPackCloseLpnPOST successfully', function(done) {
          // TODO: uncomment, update parameter values for pickPackCloseLpnPOST call and complete the assertions
          /*
          var toContainerNbr = "toContainerNbr_example";
          var opts = {};
          opts.asyncFlg = true;
          opts.closeContainerStatus = "closeContainerStatus_example";
          opts.companyId = 8.14;
          opts.companyIdCode = "companyIdCode_example";
          opts.facilityId = 8.14;
          opts.facilityIdCode = "facilityIdCode_example";
          opts.reasonCode = "reasonCode_example";
          opts.shortOnCloseFlg = true;
          opts.updateInventoryOnShortFlg = true;
          opts.toContainerCode = "toContainerCode_example";

          instance.pickPackCloseLpnPOST(toContainerNbr, opts, function(error, data, response) {
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
      describe('pickPackPickConfirmPOST', function() {
        it('should call pickPackPickConfirmPOST successfully', function(done) {
          // TODO: uncomment, update parameter values for pickPackPickConfirmPOST call and complete the assertions
          /*
          var asyncFlg = true;
          var mheModeFlg = true;
          var orderNbr = "orderNbr_example";
          var waveNbr = "waveNbr_example";
          var opts = {};
          opts.allocationUom = "allocationUom_example";
          opts.batchNbr = "batchNbr_example";
          opts.closeContainerStatus = "closeContainerStatus_example";
          opts.companyId = 8.14;
          opts.companyIdCode = "companyIdCode_example";
          opts.facilityId = 8.14;
          opts.facilityIdCode = "facilityIdCode_example";
          opts.fromContainerNbr = "fromContainerNbr_example";
          opts.itemAlternateCode = "itemAlternateCode_example";
          opts.itemBarcode = "itemBarcode_example";
          opts.mheSystemCode = "mheSystemCode_example";
          opts.pickLocation = "pickLocation_example";
          opts.qty = 8.14;
          opts.reasonCode = "reasonCode_example";
          opts.shortFlg = true;
          opts.shortOnCloseFlg = true;
          opts.toContainerNbr = "toContainerNbr_example";
          opts.uomQty = "uomQty_example";
          opts.updateInventoryOnShortFlg = true;

          instance.pickPackPickConfirmPOST(asyncFlg, mheModeFlg, orderNbr, waveNbr, opts, function(error, data, response) {
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
      describe('pickPackWaveCompletePOST', function() {
        it('should call pickPackWaveCompletePOST successfully', function(done) {
          // TODO: uncomment, update parameter values for pickPackWaveCompletePOST call and complete the assertions
          /*
          var waveNbr = "waveNbr_example";
          var opts = {};
          opts.asyncFlg = true;
          opts.closeContainerStatus = "closeContainerStatus_example";
          opts.companyId = 8.14;
          opts.companyIdCode = "companyIdCode_example";
          opts.facilityId = 8.14;
          opts.facilityIdCode = "facilityIdCode_example";
          opts.mheSystemCode = "mheSystemCode_example";
          opts.reasonCode = "reasonCode_example";
          opts.updateInventoryOnShortFlg = true;

          instance.pickPackWaveCompletePOST(waveNbr, opts, function(error, data, response) {
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
