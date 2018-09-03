<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/24
 * Time: 上午9:20
 */
header("content-type:text/html;charset=utf-8");

include_once "tool.php";

$uName = $_POST["username"];
$password = $_POST["password"];

$sql = "SELECT * FROM login WHERE name = '$uName'";

$mysqli = new mysqli("localhost","root","","PHP0502");

$result = sql_select($mysqli,$sql);

if (is_array($result)){
    if (count($result) == 0){
        echo "用户名不存在,请输入正确的用户名";
    }else{
//        print_r($result[0]);
        if ($password == $result[0]["password"]){
            echo "登录成功~";
        }else{
            echo "密码错误~";
        }

    }
}




?>
