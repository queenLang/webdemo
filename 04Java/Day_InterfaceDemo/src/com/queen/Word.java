package com.queen;

/**
 * Created by dllo on 18/5/8.
 */
public class Word extends Computer implements Office ,Draw {
    @Override
    public void office() {
        System.out.println("我用Word写材料");
    }

    @Override
    public void draw() {
        System.out.println("我还可以制图");
    }
}
