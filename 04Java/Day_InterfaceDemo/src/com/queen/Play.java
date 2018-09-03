package com.queen;

/**
 * Created by dllo on 18/5/8.
 */
public interface Play {
    /**
     *  接口是一种规则
     * 接口中只能定义抽象方法  以及全局常量\
     * 接口中的抽象方法会自动隐藏 public abstract 等关键字
     * 接口变像的实现了多继承
     */
     int A = 1000;
    void play();
}
