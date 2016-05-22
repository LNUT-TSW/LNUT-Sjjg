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
	.state('cnlogin', {
		url: '/login',
		controller: 'loginCtrl',
		templateUrl: 'cn/tpls/cn.login.tpl.html',
		resolve: {
			load: ['$ocLazyLoad', function($ocLazyLoad){
				return $ocLazyLoad.load([
					'cn/controllers/loginCtrl.js',
					'cn/css/login.css',
					'cn/css/supersized.css',
					// 'cn/js/login/supersized.3.2.7.min.js',
			  //       'cn/js/login/supersized-init.js',
			  //       'cn/js/login/scripts.js',
					]);
			}]
		}		
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
	.state('enlogin', {
		url: '/login',
		templateUrl: 'en/tpls/en.login.tpl.html',
		controller: 'loginCtrl'
	})
	;

}]);

angular.element(document).ready(function(){
	angular.bootstrap(document, ["app"]);
});