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

let index = arr.findIndex(value => {
    return value["id"] == 5;
})

console.log(index);