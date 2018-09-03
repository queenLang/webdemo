<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/16
 * Time: 上午10:03
 */
header("content-type:text/html;charset=utf-8");

//内部变量
echo PHP_OS;

echo "<hr>";

echo PHP_VERSION;

echo "<hr>";

//魔术变量
//当前文件所在的路径
echo  __FILE__;

echo "<hr>";

//当前行数
echo __LINE__;

echo "<hr>";

function aaa(){
//    获取当前函数的函数名
    echo __FUNCTION__;
}

aaa();








?>
