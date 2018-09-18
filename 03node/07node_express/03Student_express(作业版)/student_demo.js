const express = require("express");
let app = express();
const fs = require("fs");

app.engine("html", require("express-art-template"));
app.use("/node_modules", express.static("./node_modules"));
app.use("/public", express.static("./public"));


//用来定义点击的是新增还是编辑
let choice = "";
//显示首页
app.get("/", (req, res) => {
    fs.readFile("db.json", (err, data) => {
        if (err) {
            console.log("读取文件错误");
        } else {
            // console.log(data.toString());
            //将json字符串转换成json
            let json = JSON.parse(data.toString());
            res.render("student.html", json);
        }
    });
});
//点击新增时,跳转到addStudent
app.get("/new", (req, res) => {
    choice = "add";
    let newJson = {
        title: "新增"
    };
    res.render("02addStudent.html", newJson);
});
//点击编辑时
app.get("/compile", (req, res) => {
    choice = "edit";
    fs.readFile("db.json", (err, data) => {
        if (err) {
            console.log("读取文件错误");
        } else {
            //将json字符串转换成json
            let json = JSON.parse(data.toString());
            for (let i = 0; i < json.students.length; i++) {
                if (req.query.id == json.students[i].id) {
                    let indexJson = {
                        title: "编辑学生信息",
                        id : json.students[i].id,
                        name: json.students[i].name,
                        gender: json.students[i].gender,
                        age: json.students[i].age,
                        hobbies: json.students[i].hobbies
                    }
                    res.render("02addStudent.html", indexJson);
                }
            }
        }
    });

});


//在点击提交时
app.get("/add", (req, res) => {
    fs.readFile("db.json", (err, data) => {
        //将json字符串转换成json
        let json = JSON.parse(data.toString());
        if (choice == "add") {
            let mesObj = {
                "id": json.students.length != 0 ? json.students[json.students.length - 1].id + 1 : 1,
                "name": req.query.name,
                "gender": req.query.gender,
                "age": req.query.age,
                "hobbies": req.query.hobbies
            };
            json.students.push(mesObj);
        } else {
            for (let i = 0; i < json.students.length; i++) {
                // console.log(req.query);
                if (req.query.id == json.students[i].id) {
                    console.log("111");
                    let mesObj = {
                        "id": req.query.id,
                        "name": req.query.name,
                        "gender": req.query.gender,
                        "age": req.query.age,
                        "hobbies": req.query.hobbies
                    };
                    json.students.splice(i, 1, mesObj);
                }

            }
            //JSON.stringify(json)   json转换成json字符串的方法
            // 将json字符串写入 studentJson.json
            fs.writeFile("db.json", JSON.stringify(json), (err, data) => {
                res.redirect("/");
            })
        }
    });
});
//点击删除
app.get("/delete", (req, res) => {
    fs.readFile("db.json", (err, data) => {
        let json = JSON.parse(data.toString());
        console.log(req.query);
        for (let i = 0; i < json.students.length; i++) {
            if (req.query.id == json.students[i].id) {
                json.students.splice(i, 1);
            }
        }
        fs.writeFile("db.json", JSON.stringify(json), (err, data) => {
            res.redirect("/");
        })
    })
});

app.listen(8000);
