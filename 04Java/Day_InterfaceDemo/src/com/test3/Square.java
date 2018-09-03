package com.test3;

import com.test3.Shape;

/**
 * Created by dllo on 18/5/8.
 */
public class Square extends Shape {

    private double length;
    private double height;

    public Square(double length, double height) {
        this.length = length;
        this.height = height;
    }


    @Override
    protected void printArea() {
        double area = (length*height) ;
        System.out.println("长方形的面积是"+area);
    }


}
