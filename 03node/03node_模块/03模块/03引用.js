
console.log("03 start");

let a = 10;

console.log("03中a的值:" + a);

exports.age = a;

exports.add = (x,y)=>{
    return x + y;
}

console.log(exports);

console.log("03 end");


