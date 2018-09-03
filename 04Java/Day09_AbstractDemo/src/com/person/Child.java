package com.person;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by dllo on 18/5/7.
 */
public class Child extends Person {
    public String name;
    private Man man;
    private Woman woman;

    public Child(String name, int age, String sex) {
        super(name, age, sex);
    }


    public void study() {
        System.out.println("孩子为了" + man.getName() + "和" + woman.getName() + "好好学习");

    }
       public void answer(){



        int a = new Random().nextInt(100 - 1 + 1) + 1 ;
        int b = new Random().nextInt(100 - 1 + 1) + 1;

        int num1 = a + b;
        int num2 = a - b;
        int num3 = a * b;
        int num4 = a / b;
        int num5 = a % b;

        int[] arr = {num1,num2,num3,num4,num5};

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length - i-1; j++) {

                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("和为" + num1 + "差为" + num2 + "乘为" + num3 + "除为" + num4 + "余为" + num5);
            System.out.println();
            System.out.print(arr[i]);
        }
        }









    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    public Woman getWoman() {
        return woman;
    }

    public void setWoman(Woman woman) {
        this.woman = woman;
    }
}
