package com.queen;

/**
 * Created by dllo on 18/5/3.
 */
public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
////        person.setName("张三");
////        person.setSex("男");
////        person.setAge(15);
//        System.out.println(person);
//
//        //匿名对象
//        //这个对象只使用1次
//        // new 构造方法

//        new Person().setName("王五");
//        new Person().setAge(18);
//    }

        /**
         * 构造方法只有一个作用
         * 初始化对象
         */
        Person person = new Person("赵柳",18,"男");
        System.out.println(person);

        /**
         *
         * 创建一个家庭类
         * 家庭装有男人 女人 孩子
         * 家庭中的每一个人都有姓名 年龄 性别
         * 男人有妻子和孩子 有努力工作的方法
         * 女人有丈夫和孩子 有管理资金的方法
         * 孩子有父亲和母亲 有好好学习的方法
         *
         * 打印输出 男人妻子的孩子的名字
         * 打印 女人的丈夫的孩子的性别
         * 孩子的父亲的妻子的管理资金的方法
         * 孩子的母亲的丈夫的努力工作的方法
         * 输出这个家所有成员的个人信息(姓名 性别 年龄)
         */
    }
}