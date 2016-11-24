'use strict';

/**
 * @ngdoc function
 * @name alumnosFrontApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the alumnosFrontApp
 */
 var model = {
             user: "Juan Velez"
        };
angular.module('alumnosFrontApp')
  .controller("ToDoCtrl", function ($scope, $interval ,$log) {
           

            var model = {
             user: "Juan Velez"
            };
            $scope.model  = model



            $scope.incompleteCount = function () {
                var count = 0;
                angular.forEach($scope.todo.items, function (item) {
                    if (!item.done) { count++ }
                });
                return count;
            }

            $scope.warningLevel = function () {
                return $scope.incompleteCount() < 3 ? "label-success" : "label-warning";
            }

            $scope.addNewItem = function (actionText) {
                $scope.todo.items.push({ action: actionText, done: false });
            }

        });


