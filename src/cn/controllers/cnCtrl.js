// cnCtrl
angular.module('app')
	.controller('cnCtrl', ['$scope', '$state', function($scope, $state){
		$scope.name = 'cnCtrl';
		console.log("cnCtrl is running");
	}])
	.controller('loginCtrl', ['$scope', function($scope){
		console.log("loginCtrl is running");
	}])
	;