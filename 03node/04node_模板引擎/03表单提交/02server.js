const http = require("http");
let server = http.createServer();
const fs = require("fs");
const url = require("url");

server.on("request",(req,res)=>{
    //text/plain  文本
    //text/html  
    res.setHeader("Content-type","text/plain;charset=utf-8");
    let urlObj = url.parse(req.url,true);
    if (urlObj.pathname == "/name"){
        res.end("哈哈");
    }else if(req.url == "/"){
        fs.readFile("01表单提交.html",(error,data)=>{
            res.end(data.toString());
        })
    }else if(urlObj.pathname == "/index"){
        /*
        * 如果客户端 发现收到服务器的状态码是302,就会自动去响应中找到Location,设置的重定向路径
        * 然后发起新的请求,此时客户端页面跳转
        * */
        console.log("/index");
        res.statusCode = 302;
        res.setHeader("Location","/home");
        res.end();
    }else if (urlObj.pathname == "/home"){
        console.log("/home");
        res.end("重定向成功");
    }
});
server.listen(8000);