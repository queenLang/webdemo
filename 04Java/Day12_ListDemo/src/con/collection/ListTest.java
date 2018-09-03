package con.collection;

import java.util.ArrayList;
import java.util.List;

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
public class ListTest {
    public static void main(String[] args) {
        /**
         * 集合与数组的差别
         * 使用数组必须要规定数组长度]
         * 集合不需要规定长度
         * 集合提供的方法更加的具体简介

         *
         */

//        List<String> stringList = new ArrayList<>();//通过实现类创造对象 多态的体现
//        stringList.add("泥娃娃");
//        stringList.add("泥娃娃");
//        stringList.add("12泥娃娃");
//        stringList.add("134泥娃娃");
//        stringList.add(2,"新内容");
//        List<String> newList = new ArrayList<>();
//        newList.add("爱你");
//        newList.add("爱你");
//        newList.add("爱你");
//        newList.add("爱你");
//        stringList.addAll(1,newList);
//        stringList.remove(3);
//        stringList.removeAll(newList);
//        stringList.clear();

//        for (int i = 0; i < stringList.size(); i++) {
//            System.out.println(stringList.get(i));
//        }
        /**
         * 增强for循环  主要应用于遍历数组或者集合
         */
         //clear 清除  set 替换
        // add addAll remove (只是移除某个元素第一次出现的地方)(也可以根据索引进行删除) removeall
//        for (String s : stringList) {
//            System.out.println(s );
//        }

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.set(2,22);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        /**
         * 创建一个水果类  水果要有名字 口味 颜色
         * 将不同的水果加入到同一个集合之中
         * 遍历集合 打印每种水果的名字 口味 颜色
         */

        Fruit fruit = new Fruit("香蕉","甜的","黄色");

        Fruit fruit1 = new Fruit("苹果","甜的","红色");

        Fruit fruit2 = new Fruit("榴莲","臭的","黄色");


        List<Fruit> list1 = new ArrayList<>();
        list1.add(fruit);
        list1.add(fruit1);
        list1.add(fruit2);

        for (Fruit fruit3 : list1) {
            System.out.println(fruit3);
        }

        /**
         *
         *
         */

    }
}
