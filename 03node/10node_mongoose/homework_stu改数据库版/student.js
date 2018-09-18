const fs = require("fs");

const mogoose = require("mongoose");
mogoose.connect("mongodb://localhost/allStudent", {useNewUrlParser: true});
let Schema = mogoose.Schema;
//定义字段和字段约束
let tableStruct = {
    id: {
        type: Number,
        required: true
    },
    name: {
        type: String,
        required: true
    },
    age: {
        type: Number,
        required: true
    },
    gender: {
        type: Number,
    },
    hobbies: {
        type: String,
        required: true
    }
};

let userSchema = new Schema(tableStruct);
let user = mogoose.model("user", userSchema);

//加载首页
module.exports.findAll = (callback) => {
    user.find((err, data) => {
        if (!err) {
            //data返回的是
            let stuInfo = {
                students: data
            };
            callback(stuInfo);
        }
    });
};
//编辑页面
//通过id寻找对应的学生信息
module.exports.findById = (id, callback) => {
    //查找到所有的数据
    //找到和传入id相同的学生信息
    user.find({id:id},(err,data)=>{
        if (!err){
            callback(JSON.parse(JSON.stringify(data[0])));
        }

    })
};
//编辑提交
module.exports.updateById = (submitInfo, callback) => {
   user.findOneAndUpdate({id:submitInfo["id"]},submitInfo,(err)=>{
       if (!err){
           callback();
       }
       }
   )
};

//添加提交
module.exports.inertStu = (submitInfo, callback) => {
    module.exports.findAll((stuInfo) => {
        let stuArr = stuInfo.students;
        submitInfo["id"] = stuArr.length != 0 ? parseInt(stuArr[stuArr.length - 1]["id"]) + 1 : 1;
        let userInfo = new user(submitInfo);
        //将数据存到数据库中
        userInfo.save((err)=>{
            if (!err){
                callback();
            }
        });
    })
};

//删除
module.exports.deleteById = (id, callback) => {
    user.deleteOne({id:id},(err)=>{
        if (!err){
            callback();
        }
    })
};