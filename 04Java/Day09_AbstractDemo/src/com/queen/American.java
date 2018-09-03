package com.queen;

/**
 * Created by dllo on 18/5/7.
 */
public class American extends Person{
    @Override
    public void speak() {
        System.out.println("We Speak English");
    }

    @Override
    public void behavior() {
        System.out.println("刀 叉");
    }
}
