<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/16
 * Time: 下午2:17
 */
header("content-type:text/html;charset=utf-8");

//数组分为   索引数组和关联数组
//索引数组   通过下标来取值
//关联数组   通过key value形式取值

//字面量
//1.定义
$arr = [1, 2, 3, 4, 5];
print_r($arr);
echo "<br/>";


$arr1 = array(1, 2, 3, 4, 5);
print_r($arr1);
echo "<hr/>";


//2.更改
$arr[3] = "666";
//如果不指定下标,则在数组尾部添加新元素
$arr[] = "999";
print_r($arr);
echo "<hr/>";


//3.获取指定下标的值
echo $arr[3];
echo "<hr/>";


//4.删除元素
print_r($arr);
echo "<br>";

unset($arr[2]);

print_r($arr);
echo "<hr/>";


//5.判断元素是否再数组中,返回布尔值

$flag = in_array("999", $arr);
var_dump($flag);
echo "<hr/>";


//6.数组去重
$arr2 = [1, 2, 3, 2, 3, 2, 4, 1, 5, 7, 5];
$arr3 = array_unique($arr2);

print_r($arr3);
echo "<hr/>";

//7.删除数组中最后的元素
array_pop($arr3);

print_r($arr3);
echo "<hr/>";

//8.删除数组中的首位 下标值会重新排序
array_shift($arr3);

print_r($arr3);

unset($arr3[0]);

echo "<hr/>";
print_r($arr3);


//9.首位添加元素
array_unshift($arr3, "888");
echo "<hr/>";
print_r($arr3);


//10.
$arr3[100] = "1000";
echo "<hr/>";
print_r($arr3);


//11.数组的长度
echo "<hr/>";
echo count($arr3);
echo "<hr/>";

$arr4 = [1, 2, 3, 4, 5, 6, 7];
for ($i = 0; $i < count($arr4); $i++) {
    echo $arr4[$i] . "<br>";
}


?>
