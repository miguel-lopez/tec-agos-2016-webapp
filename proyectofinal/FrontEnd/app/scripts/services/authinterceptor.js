'use strict';

/**
 * @ngdoc service
 * @name bancosFrontApp.authInterceptor
 * @description
 * # authInterceptor
 * Factory in the bancosFrontApp.
 */
angular.module('bancosFrontApp')
  .factory('authInterceptor', function ($rootScope, $window,$log) {
     return {
            request: function (config) {
                config.headers = config.headers || {};
                if ($window.sessionStorage.token) {

                    config.headers.Authorization = 'Bearer ' + $window.sessionStorage.token;
                    $log.debug(config.headers.Authorization);
                }
                return config;
            }
        };
  });
