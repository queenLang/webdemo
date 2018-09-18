const express = require("express");
const bodyParser = require("body-parser");
//创建服务
const app = express();
//模板引擎使用

app.engine("html",require("express-art-template"));
//加载静态模块
app.use("/public",express.static("./public"));
//设置post请求体
app.use(bodyParser.urlencoded({extended:false}));
app.use(bodyParser.json());

//显示页面
app.get("/",(req,res)=>{
    res.render("01页面ajax.html");
});
app.listen(3000);
//get请求
app.get("/get",(req,res)=>{
    res.send("这是get请求");
});
//post请求
app.post("/post",(req,res)=>{
   res.send("这是post请求");
});