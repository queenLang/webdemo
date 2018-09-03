package com.game;

import java.util.Random;

/**
 * Created by dllo on 18/5/3.
 */
public class Main {
    public static void main(String[] args) {
        /**
         *
         * 需求 生成一个随机数 然后用户在控制台输入数字进行猜测
         * 若大了则显示大了
         * 并继续猜测
         */
        int a = new Random().nextInt(100)+1;
        new Guess().guess(a);
    }
}
