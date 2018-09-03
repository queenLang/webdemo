<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/16
 * Time: 上午9:21
 */
header("content-type:text/html;charset=utf-8");

function strConcat($str1,$str2){
    return $str1.$str2;
}

echo strConcat("明天七夕","分手吧");


$a = 10;
function text(){
//    全局变量在函数内访问,需要添加关键字global
    global $a;
    $a = 100;
    echo $a;
}

text();

echo "函数外a的值是: " + $a;


function counter(){
//    静态变量 ,一直在函数中,不被释放,作用域为本函数
    static $count = 0;
    $count++;
    return $count;
}
echo "<br/>";
echo counter()."<br>";
echo counter()."<br>";
echo counter()."<br>";
echo counter()."<br>";
echo counter()."<br>";
echo counter()."<br>";
echo counter()."<br>";










?>
