'use strict';

describe('Filter: checkedItems', function () {

  // load the filter's module
  beforeEach(module('bancosFrontApp'));

  // initialize a new instance of the filter before each test
  var checkedItems;
  beforeEach(inject(function ($filter) {
    checkedItems = $filter('checkedItems');
  }));

  it('should return the input prefixed with "checkedItems filter:"', function () {
    var text = 'angularjs';
    expect(checkedItems(text)).toBe('checkedItems filter: ' + text);
  });

});
