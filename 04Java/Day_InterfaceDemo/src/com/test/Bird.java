package com.test;

/**
 * Created by dllo on 18/5/8.
 */
public class Bird extends Animal implements Sky ,Behavior{
    public Bird(int length, int weight, String sex) {
        super(length, weight, sex);
    }

    public Bird() {
    }

    @Override
    public void fly() {
        System.out.println("我可以在天上飞");
    }

    @Override
    public void eat() {
        System.out.println("我吃虫子");
    }

    @Override
    public void sleep() {
        System.out.println("我白天睡觉");

    }
}
