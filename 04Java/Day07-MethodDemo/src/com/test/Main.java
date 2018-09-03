package com.test;

/**
 * Created by dllo on 18/5/3.
 */
public class Main {
    public static void main(String[] args) {
        /**
         *
         * 创建一个家庭类
         * 家庭装有男人 女人 孩子
         * 家庭中的每一个人都有姓名 年龄 性别
         * 男人有妻子和孩子 有努力工作的方法
         * 女人有丈夫和孩子 有管理资金的方法
         * 孩子有父亲和母亲 有好好学习的方法
         *
         * 打印输出 男人妻子的孩子的名字
         * 打印 女人的丈夫的孩子的性别
         * 孩子的父亲的妻子的管理资金的方法
         * 孩子的母亲的丈夫的努力工作的方法
         * 输出这个家所有成员的个人信息(姓名 性别 年龄)
         */
        Family family = new Family();
        Man man = new Man("小头爸爸",48);
        Woman woman = new Woman("围裙妈妈",46);
        Child child = new Child("大头儿子","男",22);
        man.setWife(woman);
        man.setChild(child);
        woman.setHusband(man);
        woman.setChild(child);
        child.setFather(man);
        child.setMother(woman);
        System.out.println(man.getWife().getChild().getName());
        System.out.println(woman.getHusband().getChild().getSex());
        child.getFather().getWife().mangeMoney();
        child.getMother().getHusband().work();
        family.setMan(man);
        family.setWoman(woman);
        family.setChild(child);
        System.out.println(family);
    }
}
