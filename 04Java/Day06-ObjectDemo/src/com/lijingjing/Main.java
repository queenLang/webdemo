package com.lijingjing;

/**
 * Created by dllo on 18/5/2.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 创建对象的语法格式
         * 类名 对象名 = new 类名 ();
         */
//        com.lijingjing.Person person = new com.lijingjing.Person();
//        person.name = "吴亦凡";
//        person.age = 28;
//        person.sex = "男";
//        person.face = "非常帅";
//        person.height = 1.85;
//        person.character = "闷骚";
//        person.hobby = "玩";
//
//        person.name = "李易峰";
//
//        //调用方法
//        person.shopping();
//
//        com.lijingjing.Person person2 = new com.lijingjing.Person();
//        person2.name = "于谦";
//        person2.age = 50;
//        person2.sex = "男";
//        person2.height = 1.60;
//        person2.hobby = "抽烟喝酒烫头";
//        person2.character = "贱";
//        person2.face = "贱";
//
//        System.out.println("男友");
//        System.out.println("姓名:"+person2.name);
//        System.out.println("年龄:"+person2.age);
//        System.out.println("性别:"+person2.sex);
//        System.out.println("长相:"+person2.face);
//        System.out.println("身高:"+person2.height);
//        System.out.println("性格:"+person2.character);
//        System.out.println("爱好:"+person2.hobby);

        /**
         * 创建一个动物类
         * 动物有身高 体重 类型 名字 吃东西的行为
         *
         * 创建动物对象为其属性赋值 调用吃的方法  打印属性
         */


        //类型()------->    构造方法  用于初始化对象

        //类是具有相同属性(成员变量)或行为的抽象
        //对象是类的具体实例
        //万物皆对象
//        com.lijingjing.Animal animal = new com.lijingjing.Animal();
//        animal.name ="狗";
//        animal.form = "食肉动物";
//        animal.age =3;
//        animal.weight = 10;
//
//        System.out.println("姓名为:"+animal.name);
//        System.out.println("类型为:"+animal.form);
//        System.out.println("年龄为:"+animal.age);
//        System.out.println("体重为:"+animal.weight);
//        animal.eat();

        Fruit fruit= new Fruit();
         fruit.setName("h");
         fruit.setColor("fen");
        System.out.println(fruit.getName());
        System.out.println(fruit.getColor());
        fruit.eat();
    }
}
