<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/21
 * Time: 上午11:49
 */
header("content-type:text/html;charset=utf-8");

class Person{
    public $name;
    public $age;
    public $sex;

    function eat(){
        echo $this->name."爱吃肉";
    }
    function __construct($name,$age,$sex)
    {
        $this->name = $name;
        $this->age = $age;
        $this->sex = $sex;

    }


}


class Student extends Person {
    public $score;
    //重写父类方法
    //使用场景: 即想实现父类的方法和功能,又想着在此方法上添加功能
    //如果不重写父类方法,可以重新定义功能,则不调用父类方法
    function __construct($name,$age,$sex,$score)
    {

       parent::__construct($name,$age,$sex);
       $this->score = $score;

    }


    function eat(){
       parent::eat();
       echo __FUNCTION__;
    }
}

$theStudent = new Student("鲸鱼","13","男","99");
print_r($theStudent);

$theStudent->eat();









?>
