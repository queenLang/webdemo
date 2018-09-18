
const fs = require("fs");
//加载首页
module.exports.findAll = (callback)=>{
    fs.readFile("./db.json",(err,data)=>{
        // console.log(data.toString());
        let stuJson = JSON.parse(data.toString());
        callback(stuJson);
    })
};
//编辑页面
//通过id寻找对应的学生信息
module.exports.findById = (id,callback)=>{
    //查找到所有的数据
    //找到和传入id相同的学生信息
    module.exports.findAll((stuInfo)=>{
        let stuArr = stuInfo["students"];
        let info = stuArr.find((item)=>{  //find()  方法里面是一个函数,返回 id相等的那条json数据
            return item["id"] == id;
        });
        //找到和传入id相同的学生信息
        callback(info);  //带参数的回调函数
    })
};
//编辑提交
module.exports.updateById = (submitInfo,callback)=>{
    module.exports.findAll((stuInfo)=>{
        //stuArr 为db.json 中的 students 数组
        let stuArr = stuInfo["students"];
        //找到和传入id相同的学生信息
        let info = stuArr.find((item)=>{
            return item["id"] == submitInfo["id"];
        });
        //对象不能直接相等
        // console.log(key);  id name age ...
        for (let key in submitInfo){
            //因为info所指向的地址与stuArr json的地址相同 所以info的值改变,对应的strArr的值也会改变
            info[key] = submitInfo[key];
        }
        let writeValue = {students: stuArr};
        fs.writeFile("./db.json",JSON.stringify(writeValue),(err)=>{

            callback();
        })

    })
};

//添加提交
module.exports.inertStu = (submitInfo,callback)=>{
    module.exports.findAll ((stuInfo)=>{
        stuInfo = stuInfo["students"];
        //给新添加的设置id
        //数组中的最后一个元素
        let newId = stuInfo[stuInfo.length -1]["id"];
        submitInfo["id"] = parseInt(newId) + 1;
        stuInfo.push(submitInfo);
        console.log(stuInfo);
        let writeInfo = {students : stuInfo};

        fs.writeFile("./db.json",JSON.stringify(writeInfo),(err)=>{
             callback();
        })
    })
};

//删除
module.exports.deleteById = (id,callback)=>{
    module.exports.findAll((stuInfo)=>{
        stuInfo = stuInfo["students"];
        let stuIndex = stuInfo.findIndex((item)=>{
            return item["id"] == id;
        })
        stuInfo.splice(stuIndex,1);

        let stuJson = {
            students: stuInfo
        };

        fs.writeFile("./db.json",JSON.stringify(stuJson),(err)=>{
            callback();
        })
    })
};