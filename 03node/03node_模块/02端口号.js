//端口号的范围 从 0 到 65535

const http = require("http");

let server = http.createServer();
//服务器 就是一台主机,ip是去定位服务
//端口号 是去定位应用程序的(服务器上的具体某个服务)
server.on("request",(req,res)=>{
    //获取客户端访问的地址
    console.log(req.socket.remoteAddress);
    //客户端访问的端口号
    console.log(req.socket.remotePort);
    //当客户端访问服务器时,服务器会接收到 要返回到哪的IP和端口
    res.end();

});

server.listen(8080);