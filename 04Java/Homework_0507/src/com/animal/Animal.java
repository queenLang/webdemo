package com.animal;

/**
 * Created by dllo on 18/5/7.
 */
public abstract class Animal {
    private String kind;
    private int num,colour;

    public void eat (){
        System.out.println("捕食");
    }
    public void environment(){//生活环境
        System.out.println("生活在地球上");
    }
     abstract public void acting();//行动方式
     abstract public void sleep();




    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }
}
