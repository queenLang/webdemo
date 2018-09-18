//express 主要是对node.js中的http模块进行处理

const express = require('express');
// console.log(express);
//2.创建服务器,相当于 http.createServer()
let app = express();

//3. 创建路由
app.get('/', function (req, res) {
    //响应请求,express安装之后,给res添加了一些方法和属性
    res.send('Hello World!');
});

app.get("/home", function (req, res) {
    let str = `
    <!DOCTYPE html>
    <html lang="en">
    <head>
      <meta charset="UTF-8">
      <title>Title</title>

    </head>
    <body>
        <a href="#">百度</a>
    </body>
    </html>
`;
    res.send(str);
});


//处理静态资源
//express.static("./public") 静态资源文件
// /01 自己定义的一个路径
// 当url上出现01时,express会去找他代表的服务器上静态资源文件目录
//express 本身具有处理静态资源的能力,不需要我们做太多操作,只需要设置即可
// app.use("/01",express.static("./public"));
// app.use("/01",express.static("./public/img"));
app.use("/public",express.static("./public"));

app.listen(3000);
// var server = app.listen(3000, function () {
//     var host = server.address().address;
//     var port = server.address().port;
//
//     console.log('Example app listening at http://%s:%s', host, port);
// });
