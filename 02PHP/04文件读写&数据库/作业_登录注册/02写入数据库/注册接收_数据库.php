<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/23
 * Time: 上午9:35
 */
header("content-type:text/html;charset=utf-8");

$name = $_POST["uname"];
$pass = $_POST["pass"];
print_r($name);
echo "<br>";

//1.连接数据库
$mysqli = new mysqli("localhost","root","","PHP0502");
//2.判断数据库是否连接成功
if ($mysqli->connect_errno){
    die($mysqli->connect_errno);
}
//3.执行数据库操作
$mysqli->query("set names utf8");

//查找
$find = "SELECT * FROM login ";
//判断
$follow = $mysqli->query($find);

if ($follow){
    $arr = $follow->fetch_all(MYSQLI_ASSOC);
//    print_r($arr);


    if ($arr == null){
        //增加
        $sql = "INSERT INTO login (name,password) VALUES ('$name','$pass')";
        $mysqli->query($sql);
        echo "注册成功!!";
    }else{
        $flag=true;
        for ($i = 0;$i < count($arr);$i++){
            if ($name == $arr[$i]["name"]){
                echo "用户名已存在~~";
                $flag=false;
                break;
            }
        }

        if($flag==true){
            $sql = "INSERT INTO login (name,password) VALUES ('$name','$pass')";
            $mysqli->query($sql);
            echo "注册成功!!";
        }
    }



}



$mysqli->close();














?>
