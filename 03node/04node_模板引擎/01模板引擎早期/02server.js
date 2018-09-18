const http = require("http");
const  fs = require("fs");

let server = http.createServer();

//读取文件->更改ul里面的内容
server.on("request",(req,res)=>{
    fs.readFile("01页面.html",(err,data)=>{
       let arr = ["东哥回来啦","马化腾","马云","李易峰","黄景瑜"];
       let content = "";
        // console.log(data.toString());
        arr.forEach(function (value, index, array) {
           console.log(value, index, array);
           content += `<li>${value}</li>`;
       })
        let htmlStr = data.toString();
        let resultStr = htmlStr.replace("!!!",content);
        console.log(resultStr);
        // res.write(resultStr);
        // res.end();

        res.end(resultStr);
    })
});
server.listen(8080);