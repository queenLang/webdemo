/*
*
*
* 自定义模块
*  ../   返回上一层目录
*  ./    当前文件所在目录
*  /     磁盘根目录 (Linux macos)
*  C:    window 磁盘目录
*  .js   后缀的js可以省略
*
*/

require("./index");


/*
*
* 核心模块
* 按照名字去加载
*
* */
require("fs");
require("url");

/*
*
* 第三方模块
* 第三方模块,如果使用npm下载,使用时,直接写包名即可
*
*/


/*
* 加载顺序:
* 1. require("模块名/路径"),
*    如果模块名是核心模块或者路径 ,直接加载
*    如果不是
* 2. 去 node_modules 中查找对应的模块文件("art-template"文件夹)
* 3. 寻找文件中的package.json文件,如果有
*     3.1.查找package.json中的main属性,main属性记录了模块的入口文件
*     3.2 加载入口文件,执行其中代码,拿到其导出的对象
*
* 本质,加载文件
*
* 4. 如果没有package.json文件
*     4.1 直接寻找包文件的index.js
*     4.2 默认将命名为index的js文件当做模块的入口文件
*
*
* */

/*
* 项目中使用 require 加载第三方模块时
* 会先从该js的所在文件夹 中找 node_modules 文件
* 如果没有,会一直向上层文件查找,直到系统的跟目录
*
* 所以 在开发项目时,将node_modules文件安装在项目的根目录
*
* 目的: 项目中的 node 环境的 js文件
* 不管在项目文件夹中的任何字文件夹中,都可以找到
* */

let template = require("art-template");

console.log(template);
