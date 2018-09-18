const template = require("art-template");

let str = "hello {{key}}";

let data = {
    key : "node.js"
};

let result = template.render(str,data);

console.log(result);