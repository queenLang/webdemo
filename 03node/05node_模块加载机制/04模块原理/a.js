/*
*
* 模块
*
* 1.每个模块都有一个 module 对象
* 2.module对象有属性 exports
* module.exports
*
* 3.每个模块也有一个exports对象
* 最后导出的是module.exports
*
* module.exports 和 exports 的关系
* module.exports.XXX 比较繁琐,node简化操作,
* 提供了一个变量 exports 与 module.exports 相等 (内存地址相同)
* 模拟底层实现 let exports = module.exports
*
*
* */

let flag = module.exports == exports;

console.log(flag);  //true

//更常用的方法
module.exports = {
    count: 10,
    add: (x, y) => {
        return x + y;
    }
}

//等同于
// module.count = 10;
// module.exports.add = (x, y) => {
//     return x + y;
// }


// exports.price = 20;
// module.exports.price = 20;

