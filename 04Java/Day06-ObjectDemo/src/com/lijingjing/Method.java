package com.lijingjing;

/**
 * Created by dllo on 18/5/2.
 */
public class Method {
    /**
     * 方法
     * 方法分为4大类
     *
     * 无返回值无参数
     * 无返回值有参数
     * 有返回值无参数
     * 有返回值有参数
     *
     * 语法格式:
     * 修饰符 返回值类型 方法名 (参数类型 参数1,参数类型 参数2,....){
     *     方法体
     *     return 返回值;
     * }
     */


    //无返回值无参数
    public void fun1(){
        System.out.println("我是无返回值无参数的方法");
    }
    //无返回值有参数
    //a b 都是行参 (行动参数)
    public void fun2(String a,String b){
        System.out.println("我是无返回值有参数的方法");
        System.out.println(a);
        System.out.println(b);
    }
    //有返回值无参数
    public String fun3() {
        return " 我是有返回值无参数的方法";
    }
     //有返回值有参数



    public int getSum (int a,int b){
        return a+b;
    }
}
