package com.test;

/**
 * Created by dllo on 18/5/3.
 */
public class Family {
    private Man man;
    private Woman woman;
    private Child child;

    @Override
    public String toString() {
        return "Family{" +
                "man=" + man +
                ", woman=" + woman +
                ", child=" + child +
                '}';
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
