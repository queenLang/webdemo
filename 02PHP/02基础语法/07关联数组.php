<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/16
 * Time: 下午3:18
 */
header("content-type:text/html;charset=utf-8");


$arr = ["name" => "龙哥", "job" => "修电脑", "age" => "58"];

print_r($arr);

//取值

echo "<hr>";

echo $arr["name"];

//更改或者添加健值对
$arr["sex"] = "男";

$arr["age"] = "18";


echo "<hr>";
print_r($arr);
echo "<hr>";


//遍历
foreach ($arr as $k => $i) {
    echo $k . ":" . $i . "<br/>";
}

echo "<hr>";

$arr1 = ["666","999","888"];
foreach ($arr1 as $i){
    echo $i . "<br/>";
}


//取出所有的value 和 key值

$valueArr = array_values($arr);
$keyArr = array_keys($arr);

echo "<hr>";
print_r($valueArr);
echo "<hr>";
print_r($keyArr);


//判断某个key在关联数组中是否存在
echo "<hr>";

$flag1 = isset($arr["name"]);

print_r($flag1);











?>
