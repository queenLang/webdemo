package com.queen;

/**
 * Created by dllo on 18/5/8.
 */
public class Football implements Play {
    @Override
    public void play() {
        System.out.println(Play.A);
        System.out.println("我用脚踢");
    }
}
