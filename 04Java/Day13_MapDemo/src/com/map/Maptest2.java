package com.map;

import java.lang.reflect.Array;
import java.util.*;

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
public class Maptest2 {
    public static void main(String[] args) {
        //Map 里面添加集合
        Map<String,List<String>> map =new HashMap<>();
        List<String> citylist = new ArrayList<>();
        citylist.add("大连市");
        citylist.add("沈阳市");
        citylist.add("铁岭市");
        map.put("辽宁省",citylist);
        for (String s : map.get("辽宁省")) {
            System.out.println(s);
        }
        //集合里面添加Map
         List<Map<String,String>> mapList =new ArrayList<>();
        Map<String,String> map1 =new HashMap<>();
        map1.put("key1","value1");
        map1.put("key2","value2");
        map1.put("key3","value3");
        mapList.add(map1);
        System.out.println(mapList.get(0).get("key2"));

        //数组中添加集合
        List<String>[] lists = new List[50];
        for (int i = 0; i < lists.length; i++) {
            List<String> list = new ArrayList<>();
            //list.add("张"+i );
            lists[i]=list;
        }
        for (List<String> list : lists) {
            System.out.println(list);
        }
        //数组泛型的集合
         List<int[]> intlist = new ArrayList<>();
        int [] a= {1,2,3,4,5};
        int[] b= {10,100,100,1000,10000};
        int[] c= {110,1030,1050,10700,105000};
        intlist.add(a);
        intlist.add(b);
        intlist.add(c);
        for (int[] ints : intlist) {
            System.out.println(Arrays.toString(ints));//打印数组
        }

        //集合中的泛型 是集合类型(String)的数组

        List<List<String>[]> list = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        List<String>[] arr = new List[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i ]= strings;
        }
         list.add(arr);
        for (List<String>[] lists2 : list) {
            System.out.println(Arrays.toString(lists2));
        }









    }

}
