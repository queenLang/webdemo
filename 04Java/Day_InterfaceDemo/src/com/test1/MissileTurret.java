package com.test1;

/**
 * Created by dllo on 18/5/8.
 */
public class MissileTurret extends Weapon implements Mobile{//导弹炮塔
    @Override
    public void attack() {
        System.out.println("发射导弹");
    }

    @Override
    public void move() {
        System.out.println("移动炮台");
    }
}
