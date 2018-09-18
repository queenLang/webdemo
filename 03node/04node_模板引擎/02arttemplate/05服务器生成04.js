const http = require("http");

const fs = require("fs");

const temliate = require("art-template");

let server = http.createServer();

let json = {
    title: '标签',
    list: ['文艺', '博客', '摄影', '电影', '民谣', '旅行', '吉他']
};


server.on("request", (req, res) => {
    fs.readFile("04html模板.html", (err, data) => {
        let str=data.toString();
        console.log(str);
        let result = temliate.render(str, json);
        res.end(result);
    })
});

server.listen(8000);