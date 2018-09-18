
const fs = require("fs");
//加载首页
module.exports.findAll = (callback)=>{
    fs.readFile("./db.json",(err,data)=>{
        // console.log(data.toString());
        let stuJson = JSON.parse(data.toString());
        callback(stuJson);
    })
};
//添加学生
module.exports.addStudent = (callback)=>{
    choice = "add";
    let addJson = {
        title : "新增"
    };
    callback(addJson);
};
//点击编辑
module.exports.editStudent = (id,callback)=>{
    fs.readFile("./db.json",(err,data)=>{
        let json = JSON.parse(data.toString());
        for (var i = 0; i < json.students.length; i++) {
            if(id == json.students[i].id){
                let indexJson = {
                    title : "编辑学生信息",
                    id : json.students[i].id,
                    name : json.students[i].name,
                    gender: json.students[i].gender,
                    age: json.students[i].age,
                    hobbies: json.students[i].hobbies
                }
                callback(indexJson);
            }
        }

    })
};
//新增提交  name age gender hobbies
module.exports.add = (name,age,gender,hobbies)=>{
    fs.readFile("./db.json",(err,data)=>{
        let json = JSON.parse(data.toString());
        let mesObj = {
            id : json.students.length != 0 ? json.students[json.students.length-1].id + 1: 1,
            name : name,
            age:age,
            gender : gender,
            hobbies : hobbies
        }
        console.log(mesObj);
        json.students.push(mesObj);

        fs.writeFile("./db.json",JSON.stringify(json),(err)=>{
        })
    })
};

//编辑提交 id name age gender hobbies
module.exports.edit = (id,name,age,gender,hobbies)=>{
    fs.readFile("./db.json",(err,data)=>{
        let json = JSON.parse(data.toString());
        let mesObj = {
            id : id,
            name : name,
            age:age,
            gender : gender,
            hobbies : hobbies
        }
        console.log(mesObj);
        for (var i = 0; i < json.students.length; i++) {
            if (json.students[i].id == mesObj.id){
                json.students.splice(i,1,mesObj);
            }
        }
        fs.writeFile("./db.json",JSON.stringify(json),(err)=>{

        })
    })
};

//删除
module.exports.delete = (id)=>{
    fs.readFile("./db.json",(err,data)=>{
        let json = JSON.parse(data.toString());
        for (var i = 0; i < json.students.length; i++) {
            if (json.students[i].id == id){
                json.students.splice(i,1);
            }
        }
        fs.writeFile("./db.json",JSON.stringify(json),(err)=>{

        })
    })
};
