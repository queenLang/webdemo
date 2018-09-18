


var url = "http://localhost:8080/pro?a=1&b=张三&c=aaa";

//转码
console.log(encodeURI(url));

var url1 = "http://localhost:8080/pro?a=1&b=%E5%BC%A0%E4%B8%89&c=aaa";

console.log(decodeURI(url));