//node 中的模块
/*
* 核心模块 : fs http path os
* 用户自定义的模块
* 第三方模块
*
* */

//核心模块
const os = require("os");

let info = os.cpus();
//1G = 1024Mb 1Mb = 1024kb  1kb = 1024b 字节
let memory = os.totalmem();

console.log(memory);

console.log(info);


let bs = require("bootstrap");

console.log(bs);