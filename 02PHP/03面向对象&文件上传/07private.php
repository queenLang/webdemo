<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/21
 * Time: 下午3:35
 */
header("content-type:text/html;charset=utf-8");


class Person{
    private $name;
    private $age;
    private $sex;

    private function eat(){
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

    function __construct($name,$age,$sex,$score)
    {
        parent::__construct($name,$age,$sex);
        $this->score = $score;
    }

//    function sleep(){
//        $this->eat();
//        echo $this->name."!!";
//    }

}

$theStudent = new Student("鲸鱼","13","男","99");
print_r($theStudent);

$theStudent->score;


//private








?>
