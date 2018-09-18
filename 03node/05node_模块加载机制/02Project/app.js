const http = require("http");
const fs = require("fs");
const url = require("url");

http.createServer((req,res)=>{
    let urlObj = url.parse(req.url,true);
    let pathname = urlObj.pathname;
    console.log(pathname);
    if(pathname == "/"){
        fs.readFile("views/index.html",(err,data)=>{
            res.end(data.toString());
        })
    }else if (pathname.indexOf("/public") == 0){
        console.log(pathname);
            fs.readFile("." + pathname,(err,data)=>{
                res.end(data);
            })
    }
     // }else if (pathname == "/public/img/2.jpg"){
     //     res.setHeader("Content-type","img/jpg");
     //     fs.readFile("./public/img/2.jpg",(err,data)=>{
     //         res.end(data);
     //     })
     // }else if (pathname == "/public/css/index.css") {
     //     fs.readFile("./public/css/index.css",(err,data)=>{
     //         res.end(data);
     //     })
     // }else if (pathname == "/public/js/tool.js") {
     //     fs.readFile("./public/js/tool.js", (err, data) => {
     //         res.end(data);
     //     })

}).listen(8000);

let str = "/public/js/tool.js";
console.log(str.indexOf("/public"));
console.log(str.startsWith("/public"));

