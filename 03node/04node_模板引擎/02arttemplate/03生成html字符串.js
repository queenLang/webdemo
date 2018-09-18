const temliate = require("art-template");

let str = `
    <h1>{{title}}</h1>
    <ul>
        {{each list item i}}
        <li>索引 {{i + 1}} ：{{item}}</li>
        {{/each}}
    </ul>
`;

var data = {
    title: '标签',
    list: ['文艺', '博客', '摄影', '电影', '民谣', '旅行', '吉他'],
    flag: true,
    html: "<h1>哈哈</h1>",
    count : 100,
    theJson : {
        "name" : "李易峰",
        "age"  : 20
    }
};

let result = temliate.render(str,data);

console.log(result);