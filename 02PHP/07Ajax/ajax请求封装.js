/**
 * Created by dllo on 18/8/27.
 */

//ajax为同域请求

// oBtn.onclick = function () {
//     var url = "02_豆瓣接口.php?phone=110&password=123";
//     //获取返回结果
//     ajax_get(url,function (result) {
//         console.log(result);
//     });
// }


function ajax_get(url,callback) {
    var xhr = null;
    if (window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else {
        xhr = ActiveXObject("Microsoft.XMLHTTP");
    }
    xhr.open("get",url,true);
    xhr.send();
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4){
            callback(xhr.responseText);
        }
    }
}


// var url = "02_豆瓣接口.php";
// var argus = "phone=110&password=123";
// ajax_post(url,argus,function (result) {
//     console.log(JSON.parse(result));
// });

function ajax_post(url,args,callback) {
    var xhr = null;
    if (window.XMLHttpRequest){
        xhr = new XMLHttpRequest();
    }else {
        xhr = ActiveXObject("Microsoft.XMLHTTP");
    }
    xhr.open("post",url,true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(args);
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4){
            callback(xhr.responseText);
        }
    }
}


