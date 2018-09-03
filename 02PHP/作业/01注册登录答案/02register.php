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

//用户名是否存在
//密码是否正确

//读取文件
$userArr = file("user.txt");
$userExist = false;  //默认不存在

foreach ($userArr as $item){
    $userInto = explode(",",$item);
    if ($uName == $userInto[0]){
        $userExist = true;
        //判断密码
        if ($password."\n" == $userInto[1]){
            echo "登录成功";
        }else{
            echo "密码错误";
        }
        break;
    }
}

if (!$userExist){
    echo "用户名不存在";
}


?>
