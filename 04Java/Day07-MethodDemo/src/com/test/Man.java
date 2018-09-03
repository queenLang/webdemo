package com.test;

/**
 * Created by dllo on 18/5/3.
 */
public class Man {
    private String name, sex;
    private int age;
    private Woman wife;
    private Child child;

    public Man(String name, int age) {
        this.name = name;
        this.sex = "男";
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public void work() {
        System.out.println(this.name + "为了自己的妻子" +wife.getName() + "和孩子"+child.getName()+"努力工作");
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

    public Woman getWife() {
        return wife;
    }

    public void setWife(Woman wife) {
        this.wife = wife;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

}