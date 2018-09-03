package com.person;

/**
 * Created by dllo on 18/5/7.
 */
public class Man extends Person {

    public String name;
    private Woman woman;
    private Child child;

    public Man(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void method (){
        System.out.println("男人为了"+woman.getName()+"和"+child.getName()+"努力工作");
    }


    public Woman getWoman() {
        return woman;
    }

    public void setWoman(Woman woman) {
        this.woman = woman;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
