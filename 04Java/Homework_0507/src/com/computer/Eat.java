package com.computer;

/**
 * Created by dllo on 18/5/7.
 */
public class Eat extends Game {
    @Override
    public void person() {
        System.out.println("可以一个人,两个人 ,或者四个人玩");
    }

    @Override
    public void line() {
        System.out.println("在线游戏");
    }
}
