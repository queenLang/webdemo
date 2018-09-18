const express = require("express");

let app = express();





//设置模板引擎
//第一参数 html 表示当渲染html为后缀名的文件时,使用art-template模板
//第二个参数express-art-template 作用 将art-template结合到express
app.engine("html",require("express-art-template"));

app.use("/node_modules",express.static("./node_modules"));

//res.render node本身的res是没有render方法的
//配置express-art-template 模块后,才给res 添加的此方法
//res.render
//第一个参数 默认相对项目中的views文件夹的一个相对路径

let comments = [
    {
        name: '张三',
        message: '今天天气不错！',
        dateTime: '2015-10-16'
    },
    {
        name: '张三2',
        message: '今天天气不错！',
        dateTime: '2015-10-16'
    },
    {
        name: '张三3',
        message: '今天天气不错！',
        dateTime: '2015-10-16'
    },
    {
        name: '张三4',
        message: '今天天气不错！',
        dateTime: '2015-10-16'
    },
    {
        name: '张三5',
        message: '今天天气不错！',
        dateTime: '2015-10-16'
    }
];

//发布消息页面的渲染
app.get("/",(req,res)=>{
    let commentJson = {
        mes : comments
    };
    res.render("01home.html",commentJson);
});

app.get("/sendMes",(req,res)=>{

    res.render("02comment.html");

});

app.get("/submit",(req,res)=>{
    let mesJson = {
        name : req.query.username,
        message : req.query.comment,
        dataTime : "2015-10-14"
    };

    comments.unshift(mesJson);
    //重定向
    res.redirect("/");

});


app.listen(8080);