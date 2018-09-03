<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/21
 * Time: 上午10:55
 */
header("content-type:text/html;charset=utf-8");

class Person{
    //类常量 在类中 不可以改变的量
    const COUNTRY = "CHINA";
    public $name;
    function sayHello(){
        echo "<br>";
        //在类中使用
        //::范围解析符
        echo self::COUNTRY;
    }
}

$thePerson = new Person();
$thePerson->sayHello();
echo "<hr>";

//在类外面使用

//通过对象获取

echo $thePerson::COUNTRY;

echo "<hr>";


//通过类名获取

echo Person::COUNTRY;


?>
