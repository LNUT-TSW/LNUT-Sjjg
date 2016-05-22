# LNUT Sjjg
### 辽宁工业大学数据结构双语教学平台

Spring + AngularJS

***Already finished***
>1.Server side framework constructe <br>
>2.Front-end framework constructed <br>
>3.Front-end getStart page and  CN/EN entrance

***To do***
>1.Everyone in their own branch of the README added to complete the task, the use of special technology and the task to be done
>2.Try to use English for exercise
>3.Datebase design <br>
>4.Login page and so on  <br>
>5.  ...

### Project structure 
#### Front-end
<pre>
│  package.json  ——npm配置文件，配置第三方依赖插件
│
├─build  ——存放编译压缩后的发布文件
├─node_modules
│  ├─gulp
│  ├─gulp-clean
│  ├─gulp-contact
│  ├─gulp-jshint
│  ├─gulp-minify-css
│  ├─gulp-uglify
│  ├─gulp-watch
│  ├─gulp-rename
│  ├─http-server
│  └jshint
├─src
│  │  error.html  ——to do
│  │  index.html  ——项目主页面
│  │  ...
│  ├─getStart  ——起始页
│  ├─common  ——公共模块
│  │  ├─css  ——css文件
│  │  ├─img  ——图片文件
│  │  ├─tpls  ——html代码片段
│  │  ├─controllers  ——控制器
│  │  └─services  ——服务
│  ├─cn  ——中文模块
│  │  ├─css  ——css文件
│  │  ├─img  ——图片文件
│  │  ├─tpls  ——html代码片段
│  │  ├─controllers  ——控制器
│  │  └─js  ——js文件
│  ├─en  ——英文模块
│  │  ├─css  ——css文件
│  │  ├─img  ——图片文件
│  │  ├─tpls  ——html代码片段
│  │  ├─controllers  ——控制器
│  │  └─js  ——js文件
│  ├─lib  依赖的js库
│  │  ├─angularjs
│  │  │      angular.js
│  │  ├─angular-ui-router
│  │  │      angular-ui-router.js
│  │  └─ocLazyLoad
│  │         ocLazyLoad.js
│  │  ...
│  ├─to do ...
│  └─to do ...
└─test  ——测试相关目录
</pre>