package com.queen;

/***
 *
 *  .--,       .--,
 * ( (  \.---./  ) )
 *  '.__/o   o\__.'
 *     {=  ^  =}
 *      >  -  <
 *     /       \
 *    //       \\
 *   //|   .   |\\
 *   "'\       /'"_.-~^`'-.
 *      \  _  /--'         `
 *    ___)( )(___
 *   (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 异常和错误
         * Exception 异常
         * Error 错误
         *
         * 常见异常
         * 数组(字符串)越界异常
         * 空指针异常
         * 算数异常
         *
         */

        //只有try代码块中得代码出现异常才会出现catch语句
        //若出现异常才会有一个异常对象
        //异常被catch语句捕捉 进行相应处理
         //try语句中若有多个异常则可以写多个catch语句
        //不同的catch语句处理不同的异常
        //处理异常  我们要讲子类异常放在前面 父类异常放在后面


        /**
         * !!!!!
         * 异常和错误的父类Throwable
         */
        int[] b = {1,2,3,5};
        try{
            int a = 5/1;
            int num= b[8];
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
            //异常错误信息
            System.out.println(e.getMessage());
            e.printStackTrace();//打印异常
        }catch (IndexOutOfBoundsException c){
            System.out.println("数组越界了" );
            }finally {
            System.out.println("最终的内容");
        }
        //finally 无论是否出现异常 finally里面的代码都会执行

        //和finall 毫无关系









    }
}
