package com.map;

import com.queen.Ship;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
public class MapTest {
    public static void main(String[] args) {
        /**
         * Map 与Collection 同级关系  也是根接口
         * Map 常用实现类 HashMap
         * 数据以映射形式存放
         * key value
         * map 存放数据 key值不能重复 value值可以重复
         * map 无序
         */
        //<key的类型 ,value的类型>
       HashMap<String,String> map = new HashMap<>();
        map.put("姓名","李易峰");
       map.put("性别","男");
        //通过key值打印value的内容
       System.out.println(map.get("姓名"));

         //是否包含某一个key值
       System.out.println(map.containsKey("性别"));
         //是否包含某一value1值
       System.out.println(map.containsValue("c"));
         //遍历map
        for (String s : map.keySet()) {
          System.out.println(s +"----->"+ map.get(s));
        }

        /**
         * 创建一个map 存放学生  学生要有姓名  年龄
         * key----->学号
         * value ------>学生
         * 遍历map 打印出学生的学号 学生的姓名 和年龄 区
         */


        Map<Integer,Student> map1 = new HashMap<>();
        map1.put(1,new Student("L",18));
        map1.put(2,new Student("x",19));
        map1.put(3,new Student("a",10));
        for (Integer integer : map1.keySet()) {
            System.out.println(integer+"----->"+map1.get(integer));
        }

        /**
         * 迭代器方式进行遍历 (重点记)
         */
         //获取迭代器对象
       Iterator<Integer> iterator= map1.keySet().iterator();
        while (iterator.hasNext()) {
            //获取key值
            Integer integer = iterator.next();
            Student student = map1.get(integer);
            System.out.println(integer+"-----"+student);
        }
        //cmd + ALt +f 将局部变量变成成员变量




        Iterator<Integer> iterator1 = map1.keySet().iterator();
        while (iterator.hasNext()){
            Integer integer= iterator.next();
        }


    }
}
