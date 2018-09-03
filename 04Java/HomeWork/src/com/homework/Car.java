package com.homework;

import javax.lang.model.element.Name;

/**
 * Created by dllo on 18/5/2.
 */
public class Car {
    //每一种交通工具类都包含型号 价格 承载量(以吨为单位) 以及一个人(驾驶员)
    //人要有姓名 年龄 性别 工作
    //每种交通工具都要有一个驾驶的方法
    //驾驶方法中输出驾驶员的姓名 性别 年龄


    private String mosel;
    private  String price;
    private double  bearingCapacity;
    private Person person;

    public void method() {
        System.out.println("驾驶员姓名:" + person.getName());
        System.out.println("驾驶员性别:" + person.getAge());
        System.out.println("驾驶员年龄:" + person.getSex());
    }




    public String getMosel() {
        return mosel;
    }

    public void setMosel(String mosel) {
        this.mosel = mosel;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public double getBearingCapacity() {
        return bearingCapacity;
    }

    public void setBearingCapacity(double bearingCapacity) {
        this.bearingCapacity = bearingCapacity;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}




