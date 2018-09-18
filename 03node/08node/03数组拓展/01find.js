let arr = [
    {
        "id": 3,
        "name": "张三三",
        "gender": "0",
        "age": "23",
        "hobbies": "吃饭、睡觉、打豆豆"
    },
    {
        "id": 4,
        "name": "牛四四",
        "gender": "1",
        "age": "21",
        "hobbies": "吃饭、睡觉、打豆豆"
    },
    {
        "id": 5,
        "name": "辛五五",
        "gender": "0",
        "age": "19",
        "hobbies": "吃饭、睡觉、打豆豆"
    },
    {
        "id": 6,
        "name": "刘六六",
        "gender": "0",
        "age": "26",
        "hobbies": "吃饭、睡觉、打豆豆"
    }];
// let arr = ["马大爷", "李易峰", "黄景瑜", "阮经天"];
//实现find
let theValue = arr.find((value, index, obj) => {
    // console.log(value, index, obj);
    return value["id"] == 3;

});

console.log(theValue);

let find =(theArr,callback)=>{
    var resultArr = [];
    for (let i = 0; i < theArr.length; i++) {
        let item = callback(theArr[i],i,theArr);
        resultArr.push(item);
    }
    return resultArr;
};

let theValue1 = arr.find((value, index, obj) => {
    // console.log(value, index, obj);
    return value["id"] == 3;

});

console.log(theValue1);

//原型方法
Array.prototype.findfind = (callback) =>{
    let newArr = [];
    for (let j = 0; j < this.length; j++) {
        let items = callback(this[j],j,this);
        console.log(items);
        newArr.push(items);
    }
    console.log(newArr);
    return newArr;
}

let result2 = arr.findfind((value,index,obj)=>{
   return value["id"] == 3;
});

console.log(result2);