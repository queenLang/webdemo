/*
* 路由模块
* */

const fs = require("fs");
const express = require("express");
const student = require("./student");

//创建了一个路由容器
let router = express.Router();

//把路由都挂载到router中
/*
 * 首页渲染
 * */


router.get("/student", (req, res) => {
    student.find((err,data)=>{
        let dataSource = {
            "students":data
        }
        res.render("index.html",dataSource);
    })

})



/*
 * 添加学生页面渲染
 * */
router.get("/new", (req, res) => {
    res.render("new.html");
})


/*
 * 提交学生信息，让其持久化存储
 * */
router.post("/new", (req, res) => {

    let stuInfo = new student(req.body);
    stuInfo.save((err)=>{
        if(!err){
            res.redirect("/student");
        }
    })

})

/*
 * 编辑页面渲染
 * */
router.get("/edit", (req, res) => {
    //1.获取id
    //2.根据id获取拿到对应的所有学生数据
    //3.拿到数据，渲染页面
    let stuID = req.query["id"];
    student.findById(stuID,(err,data)=>{

        let dataSource = {
            "student" :data
        }
        res.render("edit.html",dataSource);
    })
})

/*
* 编辑提交请求
* */
router.post("/edit",(req,res)=>{

    let stuID = req.body["id"];
    student.findByIdAndUpdate(stuID,req.body,(err)=>{
        console.log(err);
        if(!err){
            res.redirect("/student");
        }
    })

})


/*
* 删除请求
* */
router.get("/delete",(req,res)=>{
    let stuID = req.query["id"];
    student.findByIdAndRemove(stuID,(err)=>{
        res.redirect("/student");
    })
})

module.exports = router;










