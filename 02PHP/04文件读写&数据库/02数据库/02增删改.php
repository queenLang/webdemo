<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/22
 * Time: 下午3:45
 */
header("content-type:text/html;charset=utf-8");

/*
 * 1.连接数据库
 * 2.判断是否连接成功
 * 3.执行数据库操作
 * 4.执行完毕,关闭数据库
 *
 * */

//1.连接数据库
$mysqli = new mysqli("localhost","root","","PHP0502");

//2.判断是否连接成功
//$mysqli->connect_errno  获取错误信息
//没有错误 返回0 有错误 返回 错误码
if ($mysqli->connect_errno){
    //终止程序,并提交错误信息
   die($mysqli->connect_errno);
}

//3.执行数据库操作
//对表中所有字段操作时,编码格式都为utf8
$mysqli->query("set names utf8");

$sql = "INSERT INTO user (name,age,sex) VALUES ('魏璎珞',50,'女')";

//执行成功,返回true 否则返回false
$return = $mysqli->query($sql);
var_dump($return);

//4.执行完毕,关闭数据库
$mysqli->close();

?>
