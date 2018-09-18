const mongoose = require("mongoose");

//链接数据库
//student 要链接的数据库
//要连接的数据库如果不存在,当插入第一条数据时,自动创建
mongoose.connect("mongodb://localhost/student",{ useNewUrlParser: true });

//创键表结构
let Schema = mongoose.Schema;
//定义字段 和 字段约束
let tableStruct = {
    username : {
        type : String,
        required : true
    },
    password : {
        type : String,
        required : true
    },
    phone : {
        type : String
    }
};

let userSchema = new Schema(tableStruct);

//创建表 user 表模型
//可以使模型对象(user) 进行无脑的增删改查操作
//mongoose.model(表名,表结构)
//user 模型(表)构造函数
let user = mongoose.model("user",userSchema);   //model 对象, 增删改查
// console.log(user);

let newValue = {
    username : "彭于晏5",
    password: "888888",
    phone : "110"
};

/********  添加数据  *********/

//创建一条新数据
let userInfo = new user(newValue);
//将数据存到数据库中
userInfo.save();

/************* **************/

/********  删除数据  *********/
//remove       老版本的 现在可以用
//deleteOne    删除一个符合条件的
//deleteMany   删除所有匹配的元素
// 第一个参数 为删除时的查找条件,为json类型,可以有多个健值对
// user.deleteOne({username: "峰峰"},(err)=>{
//     if (!err){
//         console.log("删除成功");
//     }
// })

/************* **************/

/********  更新数据  *********/

// let newValue  = {
//     username: "黄景瑜"
// };
// user.findOneAndUpdate({username:"峰峰"},newValue,(err)=>{
//     if (!err){
//         console.log("更新成功");
//     }
// });

// user.findByIdAndUpdate("5b988a6fe274420c429fbe97",newValue,(err)=>{
//     if (!err){
//         console.log("更新成功");
//     }
// });

/************* **************/

/********  查找数据  *********/

//查找表格中的所有数据
// user.find((err,data)=>{
//     if (!err){
//         console.log(data);
//     }
// });

// user.find({password: 333333},(err,data)=>{
//     if (!err){
//         console.log(data);
//     }
// });


// user.findByIdAndRemove("5b988a6fe274420c429fbe97",(err)=>{
//     if (!err){
//       console.log("删除成功");
//     }
// })

