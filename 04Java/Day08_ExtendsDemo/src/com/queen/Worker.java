package com.queen;

/**
 * Created by dllo on 18/5/4.
 */
public class Worker extends Person {
    private int num;

    public Worker(String name, String sex, int age) {
        super(name, sex, age);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
