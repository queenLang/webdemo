<?php
/**
 * Created by PhpStorm.
 * User: HeXin
 * Date: 18/3/16
 * Time: 上午9:23
 */
header("content-type:text/html;charset=utf-8");

//增删改
//$mysqli =  new mysqli("localhost","root","","PHP1211");
//$sql = "INSERT INTO user";
//sql_operation($mysqli,$sql);

//增删改
function sql_operation($mysqli,$sql) {

    if($mysqli->connect_errno){
        die($mysqli->connect_errno);
    }

    $mysqli->query("set names utf8");

    $result = $mysqli->query($sql);
    $mysqli->close();
    return $result;

}


function http_Get($url) {
    //1.创建curl对象
    $curl = curl_init();
    //2.设置$curl的请求网址，返回数据形式等属性
    curl_setopt($curl,CURLOPT_URL,$url);
    curl_setopt($curl,CURLOPT_RETURNTRANSFER,true);
    //3.执行网络请求
    $res = curl_exec($curl);
    //4.关闭网络请求
    curl_close($curl);
    //返回结果
    return $res;

}

function sql_select($mysqli,$sql){
    if($mysqli->connect_errno){
        die($mysqli->connect_errno);
    }
    $mysqli->query("set names utf8");
    /*执行查询语句操作
    $result查询失败 值为false 查询成功值为mysqli_result对象*/

    $result = $mysqli->query($sql);
    $mysqli->close();
    /*
     如果$result的类型是布尔值，值必然是false 直接返回本身
    否则对$result处理，让其返回为查询后的结果(array);
    */
    if(is_bool($result)){
        return $result;
    } else {
        return $result->fetch_all(MYSQLI_ASSOC);
    }

}

function http_post($url,$data){
    $curl = curl_init();
    //设置请求方式
    curl_setopt($curl,CURLOPT_POST,true);
    //设置请求网址
    curl_setopt($curl,CURLOPT_URL,$url);
    //设置请求参数
    curl_setopt($curl,CURLOPT_POSTFIELDS,$data);

    curl_setopt($curl,CURLOPT_RETURNTRANSFER,true);

    //执行网络请求
    $res = curl_exec($curl);
    curl_close($curl);

    return $res;


}


?>
