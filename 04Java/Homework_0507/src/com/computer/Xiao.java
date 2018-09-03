package com.computer;

/**
 * Created by dllo on 18/5/7.
 */
public class Xiao extends Game {
    @Override
    public void person() {
        System.out.println("只能一个人玩");
    }

    @Override
    public void line() {
        System.out.println("单机游戏");
    }
}
