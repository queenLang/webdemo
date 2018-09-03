
/*

模块
    自定义模块 核心模块 第三方模块

引入
核心模块  第三方模块
      require("模块名")
自定义模块
      可以省略后缀名
      require("./模块的相对路径")

作用域
   node 中 是模块作用域
   模块内部的函数和变量 , 外部不能直接访问

exports
   任何一个模块,都有一个exports对象,默认为一个空对象

   如果A模块想要使用B模块的变量和函数,
   可以把B模块的变量核函数变成B模块中exports对象的属性和方法到处


*
* */

console.log("02 start");
//在引用自定义模块时 需要加 ./
// ./找到当前文件所在的文件夹
const three = require("./03引用");

console.log(three);

console.log(three.add(10, 20));

console.log("02 end");



