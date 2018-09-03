package com.city;

/**
 * Created by dllo on 18/5/7.
 */
public class ShenYang extends City {
    @Override
    public void condition() {
        System.out.println("在北方");
    }

    @Override
    public void speak() {
        System.out.println("说东北话");

    }
}
