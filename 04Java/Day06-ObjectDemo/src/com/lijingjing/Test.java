package com.lijingjing;

/**
 * Created by dllo on 18/5/2.
 */
public class Test {
    public static void main(String[] args) {
//        com.lijingjing.Method method = new com.lijingjing.Method();
//        method.fun1();
//        //哈哈哈  呵呵呵 是实参(实际参数)
//        method.fun2("hahaha", "hehehe");
//
//        System.out.println(method.fun3());
//
//        int value = method.getSum(10, 20);
//        System.out.println(value);
//
//
//        com.lijingjing.Fruit fruit = new com.lijingjing.Fruit();
//        fruit.setName("桑葚");
//        fruit.setColor("紫黑");
//        fruit.setTaste("酸甜");
//        fruit.setName("草莓");
//        fruit.eat();


        //创建一个书名 有书名 页数 书的价格和简介
        //要求  书名不可以为西游记 页数不能少于200页 价格不能低于20
        //简介就是打印书名  页数 价格

        Book book = new Book();
        book.setName("盗墓笔记");
        book.setPages(400);
        book.setPrice(10);
        book.introduction();

    }
}