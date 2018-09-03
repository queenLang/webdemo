<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/15
 * Time: 下午4:33
 */
header("content-type:text/html;charset=utf-8");

//常量与变量
//常量 不可以变化的量
define("NAME","马大爷");

//define("NAME","马硕");

echo NAME;
echo "<hr/>";


//变量   弱类型语言

$name = "姜一亲";

$age = 66;

echo $name;

echo "<hr/>";

//布尔值在浏览器上显示0或者1,通过echo输出0不显示
$flag = true;

echo $flag;

//调试,可以打印数组和对象
//打印变量所有的具体信息,比如 类型,长度,值等
var_dump($flag);

echo "<hr/>";
var_dump("12345");

echo "<hr/>";
//输出语句,可以输出对象和数组
print_r($flag);

?>


