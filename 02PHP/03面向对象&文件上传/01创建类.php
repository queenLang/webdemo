<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/21
 * Time: 上午10:44
 */
header("content-type:text/html;charset=utf-8");

//定义一个类
class Person {
     //定义类的属性
    public $name;
    public $sex;
    public $age;
    //方法
    function sayHello(){
        echo $this->name."说你好";
    }

}

//创建对象
$person1 = new Person();
$person1->name = "一亲";
$person1->age = "12";
$person1->sex = "男";
$person1->sayHello();
echo "<br>";
print_r($person1);







?>
