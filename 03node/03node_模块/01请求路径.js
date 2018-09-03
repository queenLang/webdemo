const http = require("http");

let server = http.createServer();

server.on("request",(req,res)=>{
    res.setHeader("Content-type","text/plain;charset=utf-8");
    // console.log(req);
    //req 获取客户端请求的相关数据
    //req.url 请求的网址  端口号之后的那部分路径
    console.log(req.url);

    if (req.url == "/"){
        res.end("首页");
    } else if (req.url == "/login"){
        res.end("登录");
    } else{
        res.end("404 NOT found");
    }

})


server.listen(8080);