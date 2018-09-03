package com.lilang;

/**
 * Created by dllo on 18/5/3.
 */
public class Num {

//    public void meound2(int num1 ,int num2, int num3) {
//        System.out.println(   "计算的结果是"+(num1 + num2 + num3));
//
//    }
//    public int meound1 (int num1 ,int num2, int num3){
//        return num1+num2+num3;
//
//    }

    //    public void meoud3 (int num1 ,int num2){
//        if (num2!=0){
//            System.out.println("计算的结果是"+(num1 / num2));
//        }else{
//            System.out.println("不能计算");
//        }
//    }
//    public int meoud4 (int num1 ,int num2){
//        if (num2!=0){
//            return num1 / num2;
//        }else{
//            System.out.println("不能计算");
//            return 0;
//        }
//    }
    public void meoud3(int num1, String symbol, int num2) {
        switch (symbol) {
            case "+":
                System.out.println("计算的结果是" + (num1 + num2));
                break;
            case "-":
                System.out.println("计算的结果是" + (num1 - num2));
                break;
            case "*":
                System.out.println("计算的结果是" + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("计算的结果是" + (num1 / num2));
                } else {
                    System.out.println("不能计算");
                }
                break;
            case "%":
                if (num2 != 0) {
                    System.out.println("计算的结果是" + (num1 % num2));
                } else {
                    System.out.println("不能计算");
                }
                break;
            default:
                System.out.println("您输入有误");
                break;
        }

    }
}