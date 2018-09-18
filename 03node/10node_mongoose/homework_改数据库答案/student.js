//链接数据库


const mongoose = require("mongoose");

mongoose.connect("mongodb://localhost/student");

let schema = mongoose.Schema;

let stuSchema = new schema({
    name:{
        type:String,
        required:true
    },
    age:{
        type:Number,
        required:true
    },
    gender:{
        type:Number,
        enum:[0,1],//值必须是0 或者 1
        default:0,//默认值为0
    },
    hobbies:{
        type:String
    }

});

let stu = mongoose.model("student",stuSchema);


module.exports = stu;




