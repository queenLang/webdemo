const fs = require("fs");

let str = "明天没有大小";

fs.writeFile("01.txt",str,(err)=>{
    if (err){

    } else{
        console.log("写入成功~~");
    }
})


