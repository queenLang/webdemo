package com.test3;

/**
 * Created by dllo on 18/5/8.
 */
public class Ladder extends Shape {
    private double upBottom;
    private double downBottom;
    private double height;

    public Ladder(double upBottom, double downBottom, double height) {
        this.upBottom = upBottom;
        this.downBottom = downBottom;
        this.height = height;
    }

    @Override
    protected void printArea() {
        double area = (upBottom+downBottom)*height/2;
        System.out.println("梯形的面积为"+ area);

    }

}


