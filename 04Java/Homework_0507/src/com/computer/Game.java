package com.computer;

/**
 * Created by dllo on 18/5/7.
 */
public abstract class Game {
    private String name, type;
    private int num;

    public void mean (){
        System.out.println("可以打发时间");
    }
    public void bad (){
        System.out.println("沉迷游戏");
    }

     public abstract void person();
     public abstract void line ();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
