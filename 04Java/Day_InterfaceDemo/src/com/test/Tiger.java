package com.test;

/**
 * Created by dllo on 18/5/8.
 */
public class Tiger extends Animal implements Land ,Behavior{
    public Tiger(int length, int weight, String sex) {
        super(length, weight, sex);
    }

    @Override
    public void run() {
        System.out.println("我可以在地上跑");
    }

    @Override
    public void eat() {
        System.out.println("我吃肉");
    }

    @Override
    public void sleep() {
        System.out.println("我白天睡觉");

    }
}
