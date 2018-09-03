package com.homework;

import javax.lang.model.element.Name;

/**
 * Created by dllo on 18/5/2.
 */
public class Main {
    public static void main(String[] args) {

        //创建一个交通工具类  包含汽车类  飞机类  火车类 轮船类
        //每一种交通工具类都包含型号 价格 承载量(以吨为单位) 以及一个人(驾驶员)
        //人要有姓名 年龄 性别 工作
        //每种交通工具都要有一个驾驶的方法
        //驾驶方法中输出驾驶员的姓名 性别 年龄
        //通过交通工具类 打印出所有驾驶员的工作

        Car car = new Car();
        car.setMosel("公交车");
        car.setPrice("1万元");
        car.setBearingCapacity(10);
        Person person = new Person();
        person.setName("刘红");


        Transsport transsport = new Transsport();
        transsport.setCar(car);
    }
    }





