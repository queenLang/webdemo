package com.homework;

/**
 * Created by dllo on 18/5/2.
 */
public class Person {
    //人要有姓名 年龄 性别 工作
    //每种交通工具都要有一个驾驶的方法
    //驾驶方法中输出驾驶员的姓名 性别 年龄
   private String name;
    private double age;
    private String sex;
    private String work;





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
