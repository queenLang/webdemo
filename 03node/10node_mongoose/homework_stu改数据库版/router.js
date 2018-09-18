//router.js 存放所有路由

const express = require("express");

const student = require("./student");

//创建一个路由容器
let theRouter = express.Router();

//把路由挂载到 theRouter(路由器)中
//首页渲染
theRouter.get("/", (req, res) => {
    student.findAll((result) => {
        res.render("student.html", result);
    });
});


//编辑页面渲染
theRouter.get("/edit",(req,res)=>{
    student.findById(req.query.id,(stuInfo)=>{
        res.render("edit.html",stuInfo);
    })
});

//编辑页面提交
theRouter.post("/edit",(req,res)=>{
    // console.log(req.body);
    //点击的那条数据 {id : 3 ,name : 哈哈.....}
    student.updateById(req.body,()=>{
        res.redirect("/");
    })
});

//添加学生页面渲染
theRouter.get("/new",(req,res)=>{
    res.render("new.html");
});

//添加学生请求
theRouter.post("/new",(req,res)=>{
    // console.log(req.body);
    student.inertStu(req.body,()=>{
       res.redirect("/");
   })
})

//删除
theRouter.get("/delete",(req,res)=>{
    student.deleteById(req.query.id,(stuInfo)=>{
        res.redirect("/");
    })
});




// console.log(theRouter);
module.exports = theRouter;