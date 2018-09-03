<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/24
 * Time: 上午9:20
 */
header("content-type:text/html;charset=utf-8");
//文件引入
include_once "tool.php";

$uName = $_POST["username"];
$password = $_POST["password"];

//用户名不能重复
//查找有没有用户名  没有 插入一条新数据

$sql = "SELECT * FROM login WHERE name = '$uName'";

$mysqli = new mysqli("localhost","root","","PHP0502");

$result = sql_select($mysqli,$sql);

if (is_array($result)){
    if (count($result) == 0){
        $sqlAdd = "INSERT INTO login (name,password) VALUES ('$uName','$password')";
        $mysqli1 = new mysqli("localhost","root","","PHP0502");
        $addResult = sql_operation($mysqli1,$sqlAdd);
        if ($addResult){
            echo "注册成功~";
        }
    }else{
        echo "用户名已存在~";
    }
}






?>
