const http = require("http");
const fs = require("fs");
const url = require("url");
const temliate = require("art-template");
var server = http.createServer();

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

server.on("request",(req,res)=>{
    //url.parse() 将一个网址转化为node中的url对象
    //true是将url的query属性,转化为对象
    let urlObj = url.parse(req.url,true);
    if (urlObj.pathname == "/"){
        fs.readFile("01首页.html",(err,data)=>{
            let str = data.toString();
            // console.log(str);
            let json={};
            //将comments转换成json对象
            json.comments=comments;
            //template (模板id,json)
            //第二个参数 必须是一个json (对象)
            //模板中直接些json的key即可
            let resultStr = temliate.render(str,json);
            // console.log(resultStr);
            res.end(resultStr);
        })
    }else if(urlObj.pathname == "/post"){
        //如果为 "/post" 跳转到发表页面
        fs.readFile("02发表.html",(err,data)=>{
            res.end(data.toString());
        })

    }else if (urlObj.pathname == "/home"){
        //重定向 如果为"/home" 跳转到首页
        let dataJson ={
            name:urlObj.query.name,
            message: urlObj.query.message,
            dateTime : "2015-10-16"
        };
        comments.unshift(dataJson);
        res.statusCode=302;
        res.setHeader("Location","/");
        res.end();

    }

});
server.listen(8080);