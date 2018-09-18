const http = require("http");
const fs = require("fs");
const url = require("url");
const temliate = require("art-template");

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


// let server = http.createServer()
// server.on()
// server.listen()
//简写
http.createServer((req, res) => {
    let urlObj = url.parse(req.url, true);
    let pathName = urlObj.pathname;
    if (pathName == "/") {
        fs.readFile("01home.html", (err, data) => {
            let htmlStr = data.toString();
            let commentJson = {
                mes:comments
            };
           let result = temliate.render(htmlStr,commentJson);
            res.end(result);
        })
    }else if (pathName == "/send"){
        // res.end("1111");
        fs.readFile("02comment.html",(err,data)=>{
            res.end(data.toString());
        })
    } else if (pathName == "/submit"){
        let mesObj = {
            name : urlObj.query.username,
            message : urlObj.query.comment,
            dateTime : "2018-09-09"
        }
        comments.unshift(mesObj);
        res.statusCode = 302;
        res.setHeader("Location","/");
        res.end();
    }
}).listen(8080);