package com.queen;

/**
 * Created by dllo on 18/5/7.
 */
public class Chinese extends  Person {
    @Override
    public void speak() {
        //必须要补全方法体
        System.out.println("中国人说中国话");
    }

    @Override
    public void behavior() {
        System.out.println("筷子");
    }
}
