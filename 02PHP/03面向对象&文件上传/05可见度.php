<?php
/**
 * Created by PhpStorm.
 * User: dllo
 * Date: 18/8/21
 * Time: 下午2:51
 */
header("content-type:text/html;charset=utf-8");


class Person{
    public $name;
    public $age;
    public $sex;

    public function eat(){
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

    function sleep(){
        $this->eat();
        echo $this->name."!!";
    }

}

$theStudent = new Student("鲸鱼","13","男","99");
print_r($theStudent);

$theStudent->score;




//属性  方法  可见度的修饰符
//public  protected  private

//父类的方法和属性,在子类中是否可以使用
//子类的对象,是否可以使用父类的方法和属性

//public  公开的 任何情况都可以访问到属性和方法  在类外可以完成使用








?>
