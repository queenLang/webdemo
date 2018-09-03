package com.homework;

/**
 * Created by dllo on 18/5/2.
 */
public class Ship {
    private String mosel;
    private  String price;
    private double  bearingCapacity;
    private Person person;

    public void method() {
        System.out.println("驾驶员姓名:" + person.getName());
        System.out.println("驾驶员性别:" + person.getAge());
        System.out.println("驾驶员年龄:" + person.getSex());
    }
    public String getMosel() {
        return mosel;
    }

    public void setMosel(String mosel) {
        this.mosel = mosel;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public double getBearingCapacity() {
        return bearingCapacity;
    }

    public void setBearingCapacity(double bearingCapacity) {
        this.bearingCapacity = bearingCapacity;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}




