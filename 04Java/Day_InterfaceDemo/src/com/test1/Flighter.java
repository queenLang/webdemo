package com.test1;

/**
 * Created by dllo on 18/5/8.
 */
public class Flighter extends Weapon implements Mobile {
    @Override
    public void attack() {
        System.out.println("为了国家而战斗");
    }//战斗机

    @Override
    public void move() {
        System.out.println("在天上飞");
    }
}
