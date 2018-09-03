package com.test;

/**
 * Created by dllo on 18/5/8.
 */
public class Main {


    public static void main(String[] args) {
        /**
         *
         * 创建一个动物类
         * 动物要有身长 体重 sex
         * 创建一个接口Behavior  接口 接口中有吃 睡的方法
         * 再创建水陆空三个接口  水里可以游 陆地可以跑  空中可以飞
         * 要求创建水路空的三种动物  实现对应的接口\
         * 复写接口里的方法
         */


     new Bird(100,40,"母狗").sleep();
        new Fish(2,4,"ci").eat();
        System.out.println();
         Animal animal1 = new Bird();
        Bird bird1 = (Bird) new Animal();



        /**
         *
         * 多态----->1. 必须要有的条件继承
         *          2.要有复写
         *          3.父类引用指向子类对象
         * Animal animal1 = new Bird();向下转型
         *  Bird bird1 = (Bird) new Animal();向上转型
         *  向上转型 强制类型转换操作
         *
         *  创建接口对象使用的是其 实现类
         *
         *
         *  java 三大特性
         *  封装  继承  多态
         *  1.封装 : 隐藏内部细节对外提供接口 ,方法
         *    封装是一种思想
         *    使用场景
         *    将复杂的逻辑功能写在某个类中
         *    只要创建该类对象(也可以不创建对象)调用方法就可以完成需求
         */
         //   \n换行

    }


}
