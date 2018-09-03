<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/24
 * Time: 上午9:20
 */
header("content-type:text/html;charset=utf-8");


$uName = $_POST["username"];
$password = $_POST["password"];

//读取文件
$userArr = file("user.txt");
$userExist = false; //默认不存在

foreach ($userArr as $item){
    $userInto = explode(",",$item);
    //判断传过来的用户名是否存在
    if ($uName == $userInto[0]){
        echo "用户名已存在";
        $userExist = true;
        break;
    }
}

//判断
if (!$userExist){
    $fileW = fopen("user.txt","a+");
    $user = "$uName,$password\n";
    fwrite($fileW,$user);
    fclose($fileW);
    echo "注册成功";
}












?>
