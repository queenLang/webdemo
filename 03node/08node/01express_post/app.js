const express = require("express");
let app = express();
const fs = require("fs");
const bodyParser = require("body-parser");

//body-parser 是一个express的中间件(插件,解析post表单的请求体)
//npm i body-parser
//req.body 安装了body-parser之后,会给req添加属性 req.body


app.use(bodyParser.urlencoded({extended:false}));  //使用body-parser必须要写的
app.use(bodyParser.json());


//页面渲染
app.get("/",(req,res)=>{
    fs.readFile("./views/index.html",(err,data)=>{
        // console.log(data);
        res.send(data.toString());
    })
});
//数据提交相应
app.post("/submit",(req,res)=>{
    console.log(req.body.id);
    res.send("发布成功了");
});




app.listen(8000);