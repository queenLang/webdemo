package com.test;

/**
 * Created by dllo on 18/5/8.
 */
public class Animal {
    private int length ,weight;
    private String sex;

    public Animal() {
    }

    public Animal(int length, int weight, String sex) {
        this.length = length;
        this.weight = weight;
        this.sex = sex;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
