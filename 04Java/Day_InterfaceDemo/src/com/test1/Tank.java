package com.test1;

/**
 * Created by dllo on 18/5/8.
 */
public class Tank extends Weapon {
    @Override
    public void attack() {
        System.out.println("攻击力强");
    }

    @Override
    public void move() {
        System.out.println("全速前进");
    }
}
