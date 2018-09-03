<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/16
 * Time: 上午10:16
 */
header("content-type:text/html;charset=utf-8");


$name = "姜一亲";
$age = "5";

/****************   1.拼接   *******************/


$value = $name . "今年" . $age . "岁了";

echo $value . "<br>";

$value1 = "姜国壮是$name,今年{$age}岁了";

echo $value1 . "<br>";

$value2 = "姜国壮是$name";

echo $value2 . "<br>";


/****************   2.定界符   *******************/

//以<<<开头   命名可以随意,结束前不能有空格
$str = "<a href='http://www.baidu.com'>百度一下</a><p>这是一个P标签</p>";

echo $str . "<br/>";

$str1 = <<<flag
    <a href='http://www.baidu.com'>百度一下</a>
    <div>
       <p>这是一个P标签</p>
    </div>
flag;

echo $str1 . "<br/>";


/****************   3.长度   *******************/


$str2 = "吴大渣";
//获取字节个数, 汉字 一个字占三个字节
echo strlen($str2) . "<br/>";


/****************   4.去首尾空格   *******************/


$str3 = "  Hello word    ";

echo "~~~~~" . trim($str3) . "~~~~~~~~<br>";

echo "~~~~~" . ltrim($str3) . "~~~~~~~~<br>";

echo "~~~~~" . rtrim($str3) . "~~~~~~~~<br>";


/****************   5.大小写转换   *******************/


$str4 = "wu da zha";
$str5 = "JIANG YI QIN";

echo strtolower($str5) . "<br/>";

echo strtoupper($str4) . "<br/>";
//每个单词的首字母大写
echo ucwords($str4) . "<br/>";
//第一个单词的首字母大写
echo ucfirst($str4) . "<br/>";


/****************   6.倒序输出   *******************/


echo strrev($str5) . "<br>";


/****************   7.拆分字符串   *******************/


$str6 = "延禧攻略,甜蜜暴击,一出好戏";

$arr = explode(",", $str6);

print_r($arr) . "<br/>";
echo "<br>";

$str7 = implode("~", $arr);
echo $str7 . "<br/>";


/**************   8.子符在字符串中的位置    *****************/

$s1 = "hello wold";

echo strpos($s1, "o") . "<br>";   //4

echo strpos($s1, "lo") . "<br>";    //3
//不存在 bool值 false
var_dump(strpos($s1,"a"));

echo "<br>";


/**************   9.取子串    *****************/


$s2 = "Good Good Study";

//从字节数3开始截取到最后,包含第三个字节
echo substr($s2,3) . "<br>";    //d Good Study
//从字节数3开始截取8个
echo substr($s2,3,8) . "<br>";   //d Good S

//字符在字符串中的个数
echo substr_count($s2,"o") . "<br>";  //4
echo substr_count($s2,"oo") . "<br>";  //42

//将123从第二个字节开始替换到最后
echo substr_replace($s2,"123",2) . "<br>";
//将123从第二个字节开始替换四个字节
echo substr_replace($s2,"123",2,4) . "<br>";

//删除2到4字节
echo substr_replace($s2,"",2,4) . "<br>";

//插入
echo substr_replace($s2,"123",2,0) . "<br>";


?>
