package com.city;

/**
 * Created by dllo on 18/5/7.
 */
public abstract class City  {
    private String name,lenght;
    private int space;

    public void feature(){
        System.out.println("每个城市都有各自的特点");
    }
    public void num (){
        System.out.println("中国有很多个城市");
    }
    public abstract void condition();//方位
     public abstract void speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }
}
