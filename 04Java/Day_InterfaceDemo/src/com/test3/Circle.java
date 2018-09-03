package com.test3;

/**
 * Created by dllo on 18/5/8.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected void printArea() {
     double area = radius*radius*3.14;
        System.out.println("圆的面积为"+area);
    }
}
