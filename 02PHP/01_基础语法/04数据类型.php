<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/15
 * Time: 下午5:29
 */
header("content-type:text/html;charset=utf-8");

/*
 * 数据类型
 * 1.标量类型
 *    整型 inter   浮点型 float/double
 *   字符串 string  布尔值  boolean true / false
 *
 * 2.复合类型
 *    数组  对象
 * 3.特殊类型
 *   资源类型  null
 *
 *
 */

//1.获取数据类型
$str = "今天不上晚自习";

echo gettype($str);
echo "<br>";

//2.强制类型转换
$m = "123";
$n = (int)$m;
var_dump($n);
echo "<br>";

$x = (array)$m;
var_dump($x);

?>
