/*
* index.js 入口模块
* 作用：
*   创建服务
*   服务的一些设置
*       模板引擎
*       body-parser post请求体设置
*       资源文件
*       ...
* */

const express = require("express");
const router  = require("./router");
const bodyParser = require("body-parser");

let app = express();

app.engine('html', require('express-art-template'));

app.use("/public",express.static("./public"));
app.use("/node_modules",express.static("./node_modules"));

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

//挂载路由
app.use(router);


app.listen(7000);
