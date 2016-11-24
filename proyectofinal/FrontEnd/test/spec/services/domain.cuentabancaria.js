'use strict';

describe('Service: domain.CuentaBancaria', function () {

  // load the service's module
  beforeEach(module('bancosFrontApp'));

  // instantiate service
  var domain.CuentaBancaria;
  beforeEach(inject(function (_domain.CuentaBancaria_) {
    domain.CuentaBancaria = _domain.CuentaBancaria_;
  }));

  it('should do something', function () {
    expect(!!domain.CuentaBancaria).toBe(true);
  });

});
