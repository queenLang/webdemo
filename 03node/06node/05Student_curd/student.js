const http = require("http");
const fs = require("fs");
const url = require("url");
const template = require("art-template");

let json = {
    "students": [{
        "id": 7,
        "name": "田七七",
        "gender": "0",
        "age": "17",
        "hobbies": "吃饭、睡觉、打豆豆"
    }, {
        "id": 8,
        "name": "巴八八",
        "gender": "1",
        "age": "28",
        "hobbies": "吃饭、睡觉、打豆豆"
    }, {
        "id": 9,
        "name": "纪九九",
        "gender": "0",
        "age": "32",
        "hobbies": "吃饭、睡觉、打豆豆"
    }, {
        "id": 10,
        "name": "海十十",
        "gender": "1",
        "age": "22",
        "hobbies": "吃饭、睡觉、打豆豆"
    }]
};
//用来定义点击的是新增还是编辑
let choice = "";
//确定编辑时点击的下标
let subIndex = 0;
http.createServer((req, res) => {
    //确定前端传过来的值
    let urlObj = url.parse(req.url, true);
    let pathname = urlObj.pathname;
    //首页 如果什么都没有拼接,显示student页面
    if (pathname == "/") {
        //读取文件,将json数据显示在页面上
        fs.readFile("view/student.html", (err, data) => {
            let htmlStr = data.toString();
            let result = template.render(htmlStr, json);
            res.end(result);
        })
     //将引入的东西获取到
    } else if (pathname.indexOf("/public") == 0) {
        fs.readFile("." + pathname, (err, data) => {
            res.end(data);
        })
    //点击新增 在点击新增之后,跳转到addStudent
    } else if (pathname == "/home") {
        choice = "add";
        let newJson = {
            title: "新增"
        };
        fs.readFile("view/addStudent.html", (err, data) => {
            let htmlStr = data.toString();
            let result = template.render(htmlStr, newJson);
            res.end(result);
        })
        //点击编辑,
    } else if (pathname == "/compile") {
        choice = "edit";
        subIndex = urlObj.query.item; //下标为传过来的下标值
        let indexJson = {
            title: "编辑学生信息",
            name: json.students[urlObj.query.item].name,  //数组中下标为urlObj.query.item的名字
            gender: json.students[urlObj.query.item].gender,
            age: json.students[urlObj.query.item].age,
            hobbies: json.students[urlObj.query.item].hobbies
        }
        fs.readFile("view/addStudent.html", (err, data) => {
            let htmlStr = data.toString();
            let result = template.render(htmlStr, indexJson);
            res.end(result);
        })
        //在点击提交
    } else if (pathname == "/add") {

        if (choice == "add") {
            let mesObj = {
                "id": json.students.length != 0 ? json.students[json.students.length - 1].id + 1 : 1,
                "name": urlObj.query.name,
                "gender": urlObj.query.gender,
                "age": urlObj.query.age,
                "hobbies": urlObj.query.hobbies
            };
            json.students.push(mesObj);
        } else {
            let mesObj = {
                "id": json.students[subIndex].id,
                "name": urlObj.query.name,
                "gender": urlObj.query.gender,
                "age": urlObj.query.age,
                "hobbies": urlObj.query.hobbies
            };
            //如果是新增里面的提交,进行的不是添加,而是替换,将数组中下标为subIndex 替换成 mesObj
            json.students.splice(subIndex, 1, mesObj);
        }

        res.statusCode = 302;
        res.setHeader("Location", "/");
        res.end();
        //删除
    } else if (pathname == "/delete") {
        json.students.splice(urlObj.query.item, 1);
        fs.readFile("view/student.html", (err, data) => {
            let htmlStr = data.toString();
            let result = template.render(htmlStr, json);
            res.end(result);
        })
    }
}).listen(8080);