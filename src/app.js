angular.module('app', ['ui.router', 'oc.lazyLoad', 'ui.bootstrap'])
.config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider) {
	$urlRouterProvider.when("", "/getStart");
	$urlRouterProvider.otherwise("/getStart");
	$stateProvider.state('getStart', {
		url: '/getStart',
		controller: 'getStartCtrl',
		templateUrl: 'getStart/tpls/getStart.tpl.html',
		resolve: {
			load: ['$ocLazyLoad', function($ocLazyLoad){
				return $ocLazyLoad.load([
					'getStart/controllers/getStartCtrl.js',
					'getStart/css/getStart.css'
					]);
			}]
		}
	})
	.state('cn', {
		url: '/cn',
		controller: 'cnCtrl',
		templateUrl: 'cn/tpls/cn.main.tpl.html',
		resolve: {
			load: ['$ocLazyLoad', function($ocLazyLoad){
				return $ocLazyLoad.load([
					'cn/controllers/cnCtrl.js',
					'cn/css/cn.css',
					]);
			}]
		}		
	})
	.state('cn.login', {
		url: '/login',
		templateUrl: 'cn/tpls/cn.login.tpl.html',
		controller: 'loginCtrl'
	})


	.state('en', {
		url: '/en',
		controller: 'enCtrl',
		templateUrl: 'en/tpls/en.main.tpl.html',
		resolve: {
			load: ['$ocLazyLoad', function($ocLazyLoad){
				return $ocLazyLoad.load([
					'en/controllers/enCtrl.js',
					'en/css/en.css',

					]);
			}]
		}		
	})
	.state('en.login', {
		url: '/login',
		templateUrl: 'en/tpls/en.login.tpl.html',
		controller: 'loginCtrl'
	})
	;

}]);

angular.element(document).ready(function(){
	angular.bootstrap(document, ["app"]);
});