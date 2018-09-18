//router.js 存放所有路由

const express = require("express");

const student = require("./student");

//创建一个路由容器
let theRouter = express.Router();

let choice = "";

//把路由挂载到 theRouter(路由器)中
//首页渲染
theRouter.get("/", (req, res) => {
    student.findAll((result) => {
        res.render("student.html", result);
    });
});
//新增
theRouter.get("/new", (req, res) => {
    choice = "add";
    student.addStudent((add) => {
        res.render("information.html", add);
    });

});
//编辑
theRouter.get("/compile", (req, res) => {
    choice = "edit";
    student.editStudent(req.query.id, (edit) => {
        res.render("information.html", edit);
    })
});

theRouter.get("/submit",(req,res)=>{
    let id = req.query.id;
    let name = req.query.name;
    let gender = req.query.gender;
    let age = req.query.age;
    let hobbies = req.query.hobbies;
    if (choice == "add"){
        student.add(name, age, gender, hobbies);
    } else {
        student.edit(id,name, age, gender, hobbies);
    }
    res.redirect("/");
});

// //新增提交
// theRouter.get("/submit", (req, res) => {
//     let name = req.query.name;
//     let gender = req.query.gender;
//     let age = req.query.age;
//     let hobbies = req.query.hobbies;
//     student.add(name, age, gender, hobbies);
//     res.redirect("/");
//
// });
//
// //编辑提交
// theRouter.get("/edit",(req,res)=>{
//     // console.log(req.query.id);
//     let id = req.query.id;
//     let name = req.query.name;
//     let gender = req.query.gender;
//     let age = req.query.age;
//     let hobbies = req.query.hobbies;
//     student.edit(id,name, age, gender, hobbies);
//     res.redirect("/");
// });

//删除
theRouter.get("/delete",(req,res)=>{
    student.delete(req.query.id);
    res.redirect("/");
});



// console.log(theRouter);
module.exports = theRouter;