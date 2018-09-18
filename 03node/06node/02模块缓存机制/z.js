console.log("z start");

require("./x");

const y = require("./y");

console.log(y);

console.log("z end");



//缓存机制
//优先从缓存中加载
//由于x已经加载过y,所在在z文件不会重复加载
//但是x加载y时,在缓存中记录了y 导出的对象
//所以z文件中,可以拿到y 导出的值
//但是在z文件加载 y 的时候不会进入y 文件 ,再次执行一次y中的代码

//目的(好处): 避免重复加载,提高模块的加载效率