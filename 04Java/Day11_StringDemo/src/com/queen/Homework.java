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
public class Homework {
    public static void main(String[] args) {
        String a = "123";
        int b = 123;
        System.out.println(Integer.parseInt(a));

        String s = String.valueOf(b);


        if (s.equals(a)){
            System.out.println(s);
        }
        /**
         *
         * Integer类
         * 能在 int 类型和 String 类型之间互相转换
          */
        /**
         * decode (String nm)
         *  将 String 解码为 Integer
         */
       // System.out.println(Integer.decode(a));

        /**
         * doubleValue()
         * 以 double 类型返回该 Integer 的值
         */
//        System.out.println(Integer.decode(a).doubleValue());

        /**
         *  byteValue() floatValue() intValue()
         *  以 byte/float 类型返回该 Integer 的值。
         */

       // System.out.println(Integer.decode(a).floatValue());
        /**
         * getInteger(String nm, int val)
         *  返回具有指定名称的系统属性的整数值。
         */
       // System.out.println(Integer.getInteger(a,123));

    }
}
