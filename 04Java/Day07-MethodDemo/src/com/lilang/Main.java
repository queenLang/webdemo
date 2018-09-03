package com.lilang;

import java.util.Scanner;

/**
 * Created by dllo on 18/5/3.
 */
public class Main {
    public static void main(String[] args) {
        //创建对象的语法规则
        //类名 对象 = new 构造方法();
        //无返回值 无参数
        //无返回值 有参数

        /**用户输入三个数  计算3个数的和
         * 用一个方法来完成
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第1个数");
        int num1 = scanner.nextInt();
        System.out.println("请输入运算符 + - * / %");
        String symbol = scanner.next();
        System.out.println("请输入第2个数");
        int num2 = scanner.nextInt();
//        System.out.println("请输入第一个数");
//        int num3 = scanner.nextInt();

        Num num = new Num();
//        num.meound2(num1, num2, num3);
//
//        System.out.println(num.meound1(num1, num2, num3));

        //用户输入两个数 做除法计算 要求除数不能为0
//        num.meoud3(num1,num2);

        //step1 用户输入第一个数字
        //step1 用户输入运算符(+ - * /)
        //step1 用户输入第二个数字
        num.meoud3(num1,symbol,num2);

    }
}