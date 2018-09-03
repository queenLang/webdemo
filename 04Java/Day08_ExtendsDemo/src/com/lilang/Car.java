package com.lilang;

/**
 * Created by dllo on 18/5/4.
 */
public class Car extends Vehicle {
    private int num1;
    private String num2;

    public void lungDrive(){
        System.out.println("能在地上跑");
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }
}
