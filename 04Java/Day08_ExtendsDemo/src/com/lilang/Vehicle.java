package com.lilang;

/**
 * Created by dllo on 18/5/4.
 */
public class Vehicle {
     // 交通工具vehicle 材料materials 容载量ShouldTheLoads 价格 公有的一个交通的方法
    private String materialsl;
    private int ShouldTheLoads, money;

    public void  method(){
        System.out.println("交通工具有交通方法");
    }

    public String getMaterialsl() {
        return materialsl;
    }

    public void setMaterialsl(String materialsl) {
        this.materialsl = materialsl;
    }

    public int getShouldTheLoads() {
        return ShouldTheLoads;
    }

    public void setShouldTheLoads(int shouldTheLoads) {
        ShouldTheLoads = shouldTheLoads;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
