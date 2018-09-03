<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/21
 * Time: 上午11:06
 */
header("content-type:text/html;charset=utf-8");


class Dog{
    public $breed;
    public $name;
    public $age;
    // __construct 系统内部方法
    //创建对象时,自动调用
    function __construct($theBreed,$theName,$theAge)
    {
        $this->breed = $theBreed;
        $this->name = $theName;
        $this->age = $theAge;
        echo "<br>".__FUNCTION__;

    }

    //析构函数   系统内部的方法
    //当文件执行完毕时,将创建的对象在内存中销毁
    function __destruct()
    {
        // TODO: Implement __destruct() method.
        echo "<br>".__FUNCTION__;
    }
}



echo "~~~~~~~~~~";


$theDog = new Dog("狗","面包","2");

echo $theDog->name;


$theDog1 = new Dog("京巴","来福","3");

$theDog2 = new Dog("阿拉斯加","万彩","5");


echo "~~~~~~~~~~";
















?>
