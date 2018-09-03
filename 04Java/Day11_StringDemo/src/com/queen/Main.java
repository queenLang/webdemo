package com.queen;

import java.util.Date;

/***
 *
 *  .--,       .--,
 * ( (  \.---./  ) )
 *  '.__/o   o\__.'
 *     {=  ^  =}                ...   ...
 *      >  -  <               .     .     .
 *     /       \               .    .    .
 *    //       \\                .      .
 *   //|   .   |\\                 .   .
 *   "'\       /'"_.-~^`'-.          .
 *      \  _  /--'         `
 *    ___)( )(___
 *   (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 */
public class Main {
    public static void main(String[] args) {
        /**
         * String类
         *
         */
       String str1 = new String();
        System.out.println(str1);

        byte[] bytes = {1,2,3,4,5,6};
        String str2 = new String(bytes);
        System.out.println(str2);

        char[] chars ={'a','b','c','d'};
        String str3 = new String(chars);
        System.out.println(str3);

        /**
         *  charAt (int index)    返回值char
         * 返回对应索引的字符
         */
        String str ="abcdefg";
        System.out.println(str.charAt(2));
        /**
         *int length()返回字符串的长度
         */
        System.out.println(str.length());
        /**
         *int compareto(String str)
         *按字典顺序比较两个字符串
         * A=65 a=97
         * int compareToIgnoreCase(String str)
         * 按字典顺序比较两个字符串，不考虑大小写
         *
         * 返回值>0 则按照字典比被比较(实参)的字符打
         * 返回值=0 则字典顺序相同
         * 返回值<0 ....
         */
        System.out.println(str.compareTo("aaaaaaa"));

        /**
         * concat(String str)
         * 将指定字符串连接到此字符串的结尾
         * abcdefbcd
         */
        System.out.println(str.concat("bcd"));

        /**
         * contrains() 是否包含某一字符串或字符
         */
        String str4 = "tiger";
        System.out.println(str4.contains("i"));

        /**
         * contentEquals
         * equals
         * 判断两个字符串是否相等
         */
        System.out.println(str4.equals("tiger"));
        System.out.println(str4.contentEquals("tiger"));

        /**
         * endsWith()
         * 判断是否以指定的字符串作为后缀
         */
        System.out.println(str4.endsWith("er"));

        /**
         *indexOf(String str)
         * 某一字符串第一次出现的位置索引
         */

        System.out.println(str4.indexOf("ge"));

        /**
         * isEmpty() 判断字符串是否为空 (true)
         */

         String str5 = "";
        System.out.println(str5.isEmpty());

        /**
         * 下标都是从0开始
         *
         * lastIndexOf(String str)  返回值 int
         * 返回指定字符在此字符串中最后一次出现处的索引
         *
         *  replace(char oldChar, char newChar)
         *  用新的字符串替换旧的字符串
         *
         *  startsWith(String prefix)
         *  测试字符串是否以指定的前缀开始 结果 true 或false
         *
         *  substring(int beginIndex)     返回值 字符串
         *  它是此字符串的子字符串(截取字符串 ) 括号里面写下标
         *  截取字符串 参数1 开始位置索引  参数2 结束位置的下标
         *  注意!!! 左闭右开
         *
         *  toLowerCase()
         *  将String中的所有大写都转换为小写。
         *
         *  toUpperCase()
         *    将String中的所有小写都转换为大写。
         *
         *  trim()
         *  去除导前空白和尾部空白
         *
         */

         String str6 = "          I love you you       ";
        System.out.println(str6.lastIndexOf("you"));//1

        System.out.println(str6.replace("ou","ab"));//2

        System.out.println(str6.startsWith(""));//3

        System.out.println(str6.substring(3));// 4   3为下标

        String str7 = "ABCDEFG";
        System.out.println(str7.toLowerCase());  //5

         String str8 = "abcdefgh";
        System.out.println(str8.toUpperCase());//6

        System.out.println(str6.trim());//7
        System.out.println(str6);

        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(2018-1900,4,9);
        System.out.println(date1);
    }
}
