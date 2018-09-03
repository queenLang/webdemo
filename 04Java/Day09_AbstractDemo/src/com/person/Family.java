package com.person;

/**
 * Created by dllo on 18/5/7.
 */
public class Family {
    private Man man;
    private Woman woman;
    private Child child;

    public void party(){
        int n1 = man.getAge();
        int n2 = woman.getAge();
        int c = child.getAge();
        if (n1 - c >22 && n2 - c >20){
            System.out.println("孩子的名字"+child.getName()+"年龄"+c + "性别"+ child.getSex());
        }
        System.out.println("男人的姓名"+man.getName()+"年龄"+n1);
        System.out.println( "女人的姓名"+woman.getName()+"年龄"+n2);


    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
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
