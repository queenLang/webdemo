<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/21
 * Time: 下午3:25
 */
header("content-type:text/html;charset=utf-8");

class Person{
    protected $name;
    protected $age;
    protected $sex;

    protected function eat(){
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
    protected $score;

    function __construct($name,$age,$sex,$score)
    {
        parent::__construct($name,$age,$sex);
        $this->score = $score;
    }

    function sleep(){
        $this->eat();
        echo $this->name."!!";
    }

}

$theStudent = new Student("鲸鱼","13","男","99");
//print_r($theStudent);
$theStudent->score;

$theStudent->sleep();


//protected   受保护的 父类和子类内部可以调用,类外部不可使用





?>
