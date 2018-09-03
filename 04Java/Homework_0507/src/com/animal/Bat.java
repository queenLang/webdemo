package com.animal;

/**
 * Created by dllo on 18/5/7.
 */
public class Bat extends Animal {

    @Override
    public void acting() {
        System.out.println("在天上飞");
    }


    @Override
    public void sleep() {
        System.out.println("白天睡觉");
    }
}
