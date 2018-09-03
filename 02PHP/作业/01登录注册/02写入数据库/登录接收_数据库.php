<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/23
 * Time: 下午5:00
 */
header("content-type:text/html;charset=utf-8");


$name = $_POST["uname"];
$pass = $_POST["pass"];

$mysquli = new mysqli("localhost","root","","PHP0502");

if ($mysquli->connect_errno){
    die($mysquli->connect_errno);
}

$mysquli->query("set names utf8");

$sql = "SELECT * FROM login";

$result = $mysquli->query($sql);

$arr = $result->fetch_all(MYSQLI_ASSOC);
//print_r($arr);


$noFlag = true;
$index = 0;
for ($i = 0; $i < count($arr); $i++){
//    print_r($arr[$i]);
    if (in_array($name,$arr[$i])){
        $index = $i;
//        echo "在";
        $noFlag = false;
        break;
    }
}

if ($noFlag == true){
    echo "用户名不存在~~";
}else{
    if ($pass == $arr[$index]["password"]){
        echo "登录成功~~";
    }else{
        echo "密码错误";
    }
}








?>
