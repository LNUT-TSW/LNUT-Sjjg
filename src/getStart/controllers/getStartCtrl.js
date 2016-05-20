// getStartCtrl

angular.module('app')
	.controller('getStartCtrl', ['$scope','$state', function($scope, $state){

		console.log("already running!");		

		$scope.toCn = function(){
			console.log("click");
			$state.go("cn.login");
		};
		$scope.toEn = function(){
			$state.go("en.login");
		};

	}]);