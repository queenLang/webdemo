<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/22
 * Time: 下午4:30
 */
header("content-type:text/html;charset=utf-8");

$mysquli = new mysqli("localhost","root","","PHP0502");

if ($mysquli->connect_errno){
    die($mysquli->connect_errno);
}

$mysquli->query("set names utf8");

$sql = "SELECT * FROM user";

//query 执行sql语句时,
//如果是 增删改,返回 true/false
//如果是查找的sql,错误时, 返回false ,否则, 返回的是 mysqli_result
$result = $mysquli->query($sql);

if ($result){
    $arr = $result->fetch_all(MYSQLI_ASSOC);
    print_r($arr);
}else{
    echo "查找失败";
}

var_dump($result);

$mysquli->close();


















?>
