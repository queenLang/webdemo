package com.city;

/**
 * Created by dllo on 18/5/7.
 */
public class Shanghai extends City {
    @Override
    public void condition() {
        System.out.println("在南方");
    }

    @Override
    public void speak() {
        System.out.println("说上海话");

    }
}
