package com.test;

/**
 * Created by dllo on 18/5/8.
 */
public class Fish extends Animal implements Water,Behavior {
    public Fish(int length, int weight, String sex) {
        super(length, weight, sex);
    }

    @Override
    public void swim() {
        System.out.println("我可以在水里游");
    }

    @Override
    public void eat() {
        System.out.println("我吃虾米");
    }

    @Override
    public void sleep() {
        System.out.println("我不睡觉");

    }
}
