//入口模块
//主要为基本设置 模板引擎 服务器创建 资源设置

const express = require("express");

const bodyParser = require("body-parser");

let app = express(); //创建服务

//加载路由模块
const router = require("./router");

//设置post请求体解析
app.use(bodyParser.urlencoded({extended: false}));
app.use(bodyParser.json());

//模板引擎使用
app.engine("html",require("express-art-template"));

//静态资源设置
app.use("/public",express.static("./public"));
app.use("/node_modules",express.static("./node_modules"));
//挂载路由
app.use(router);

app.listen(8080);