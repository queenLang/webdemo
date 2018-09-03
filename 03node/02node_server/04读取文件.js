//模块

const fs = require("fs");

fs.readFile("00.txt", (error, data) => {
    console.log(error);
    //data butter类型
    console.log(data);
    console.log(data.toString());

    if (error) {
        console.log("读取文件错误");
    } else {
        console.log("读取到的内容是:" + data.toString());
    }
});

console.log(1);















