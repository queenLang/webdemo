package com.queen;

/**
 * Created by dllo on 18/5/3.
 */
public class Person {
    private String name,sex;
    private int age;

    //构造方法
    //初始化对象

    // 语法格式
    //修饰符 类名 (参数类型 参数1, 参数类型 参数2,...){}

    /**
     *
     * 无参数的构造方法
     * 每创建一个类 系统都会默认的创建一个无参数的构造方法
     *
     */
        public Person(){
        this.name = "张三";
            this.age = 15 ;
            this.sex = "nan";
    }

        public Person(String name){
           this.name= name;
            this.age = 15;
            this.sex = "女";
        }

    public Person(String name,int age,String sex){
        this.name= name;
        this.age = age;
        this.sex = sex;
    }








    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
