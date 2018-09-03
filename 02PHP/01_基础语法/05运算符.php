<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/15
 * Time: 下午5:45
 */
header("content-type:text/html;charset=utf-8");
//算术运算符
// +-*/% ++ --

//字符串拼接
$m = "吴大渣";
$n = "痴心妄想";
//$str = $m.$n;
$m .= $n;

echo $m;

//比较运算符
// > < >= <= ==  === !=

$flag = "1" == 1;   //true
echo $flag;
$flag = "1" === 1;   //false

//逻辑运算符
// && || !

//异或   xor  一真一假才为真

$xx = true;
$yy = false;
$zz = true;
if ($xx xor $yy){
    echo "真";
}else{
    echo "假";
}

if ($xx xor $yy xor $zz){
    echo "真";
}else{
    echo "假";
}




?>
