// enCtrl
angular.module('app')
	.controller('enCtrl', ['$scope', '$state', function($scope, $state){
		$scope.name = 'enCtrl';
		console.log("enCtrl is running");
	}])
	.controller('loginCtrl', ['$scope', function($scope){
		console.log("loginCtrl is running");
	}]);