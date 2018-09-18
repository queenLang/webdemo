
const url = require("url");

let urlStr = "http://localhost:8080/name?name=马硕&usedName=马大爷#65535";

//url.parse() 将一个网址转化为node中的url对象
//true是将url的query属性,转化为对象
let urlObj = url.parse(urlStr,true);

console.log(urlObj);

console.log(urlObj.pathname);  //路径

console.log(urlObj.query.name);//urlObj.query  查询字符串

console.log(urlObj.port);  //端口号

console.log(urlObj.hash);  //锚点

/*
Url {
  protocol: 'http:',
  slashes: true,
  auth: null,
  host: 'localhost:8080',
  port: '8080',
  hostname: 'localhost',
  hash: '#65535',
  search: '?name=马硕&usedName=马大爷',
  query: { name: '马硕', usedName: '马大爷' },
  pathname: '/name',
  path: '/name?name=马硕&usedName=马大爷',
  href: 'http://localhost:8080/name?name=马硕&usedName=马大爷#65535' }
* */