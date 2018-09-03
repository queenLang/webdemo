package com.lijingjing;

/**
 * Created by dllo on 18/5/2.
 */
public class Fruit {
    //私有化属性   只能在本类中访问 外部无法调用
    private String name;
    //公有的属性任何一个地方都可以使用
    public String color;
    String taste;

    public void eat() {
        System.out.println(name + "的颜色是" + color + "口味是" + taste);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("草莓")) {
            this.name = name;
        } else {
            System.out.println("我不喜欢吃草莓");
        }

    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
