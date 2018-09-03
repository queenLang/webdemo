package com.test2;

/**
 * Created by dllo on 18/5/8.
 */
public abstract class Person implements Attackable,LifeThing,Move {
     private int lifeValue;
     private int attackPower;
     private int needSupportting;
     private int needResource;

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        this.lifeValue = lifeValue;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getNeedSupportting() {
        return needSupportting;
    }

    public void setNeedSupportting(int needSupportting) {
        this.needSupportting = needSupportting;
    }

    public int getNeedResource() {
        return needResource;
    }

    public void setNeedResource(int needResource) {
        this.needResource = needResource;
    }
}
