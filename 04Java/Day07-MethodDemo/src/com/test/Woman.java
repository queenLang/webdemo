package com.test;

/**
 * Created by dllo on 18/5/3.
 */
public class Woman {
    private String name, sex;
    private int age;
    private Man husband;
    private Child child;

    public Woman(String name,  int age) {
        this.name = name;
        this.sex = "女";
        this.age = age;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public void mangeMoney(){
        System.out.println(this.name+"为了这家里的"+husband.getName()+ "和"+child.getName()+ "管理金钱");
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

    public Man getHusband() {
        return husband;
    }

    public void setHusband(Man husband) {
        this.husband = husband;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
