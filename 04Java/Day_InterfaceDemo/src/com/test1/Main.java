package com.test1;

/**
 * Created by dllo on 18/5/8.
 */
public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Tank();
        Weapon weapon1 = new MissileTurret();
        Weapon weapon2 = new Flighter();
        Army army = new Army(3);
        army.addWeapon(weapon);
        army.addWeapon(weapon1);
        army.addWeapon(weapon2);
        army.attackAll();
        army.moveAll();
    }
}
