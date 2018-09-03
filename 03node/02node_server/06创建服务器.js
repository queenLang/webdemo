const http = require("http");
//创建web服务器,返回server对象
let server = http.createServer();
//当服务器,收到请求时的响应函数
//req  请求对象 比如请求网址,请求参数  (前端向后台)
//res  响应对象   (后台传给前端)
server.on("request",(req,res)=>{
    console.log("响应啦~~~好使啦~~哈哈哈");
    res.write("hello node");
    res.end();  //结束响应
});
server.listen(8000);