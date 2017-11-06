(function() {

	'use strict';

	angular.module('viewer', []).controller('PeopleViewController',
			function View($scope, $http) {
				$scope.update = angular.copy.user;
				$http({
					method : "GET",
					url : "/users",
					headers : {
						'Accept' : 'application/json'
					}
				}).then(function mySuccess(response) {
					console.log("Success!");
					console.log(response.data);
					{
						$scope.users = response.data
					}
					;
				}, function myError(response) {
					console.log("Fail!");
					console.log(response);
				});
			})

	angular.module('population', []).controller('UserAddController',
			function Add($scope, $http, $window) {
				$scope.update = angular.copy.user;
				$scope.processform = function() {
					$http({
						method : "POST",
						url : "/users",
						data : $scope.user,
						headers : {
							'Content-Type' : 'application/json'
						}
					}).then(function mySuccess(response) {
						console.log("Success!");
						$window.location.href = "/confirmation.html";
					}, function myError(response) {
						console.log("Fail");
						console.log(response);
					});
				};
			});
})();
