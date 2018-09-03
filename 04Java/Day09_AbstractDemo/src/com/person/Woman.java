package com.person;

import java.util.Random;

/**
 * Created by dllo on 18/5/7.
 */
public class Woman extends Person{
    public String name;

    private Man man;
    private  Child child;

    public Woman(String name, int age, String sex) {
        super(name, age, sex);
    }

    @Override
    public String getSex() {
        return "女";
    }

    public void money(){
        System.out.println("女人为了"+man.getName()+"和"+child.getSex()+"管理家里的钱");

    }



    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
