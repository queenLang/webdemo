package com.queen;

/**
 * Created by dllo on 18/5/7.
 */
public abstract class Person {
    private String name, sex;
    private int age;

    public abstract void speak();

    public abstract void behavior();


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
