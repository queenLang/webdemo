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
public class StringBufferTest1 { //安全  双线以上用
    public static void main(String[] args) {
    StringBuffer buffer = new StringBuffer("我是一个StringBuffer");
        System.out.println(buffer);

        /**
         * append() 拼接方法
         * 在原基础上尾部拼接
         */
        buffer.append(1);
        System.out.println(buffer);
        /**
         * delete (int start, int end)
         * 区间删除  左闭右开
         *
         * deleteCharAt(int index)
         * 指定删除
         */
        StringBuffer buffer1 = new StringBuffer("abcdefghijk");

//        System.out.println(buffer1.delete(4, 7));

        /**
         * insert
         * 插入  在指定位置插入字符串
         *
         * replace
         * 替换指定区间  参数1 起始位置索引 参数2 结束位置索引 参数3 替换的内容
         *
         * setCharAt(int index, char ch)
         * 替换指定位置索引
         *
         * substring(int start)
         * 截取  保留指定位置之后的字符
         */

//        System.out.println(buffer1.insert(7,"我要飞"));


//        System.out.println(buffer1.replace(2,7,"爱"));

        buffer1.setCharAt(7,'1');
        System.out.println(buffer1);
        System.out.println(buffer1.substring(3));
    }

}
