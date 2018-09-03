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
public class ListTest2 {

    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("abc");
        list1.add("abc");
        list1.add("abc");
        lists.add(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("ABC1");
        list2.add("ABC2");
        list2.add("ABC3");
        lists.add(list2);
        for (List<String> list : lists) {
            for (String s : list) {
                System.out.println(s );
            }
        }

        System.out.println(list2.get(1));
        System.out.println(lists.get(1).get(2));

        /**
         * 创建一个交通类
         * 交通类里有三个子类 汽车类  飞机类 轮船类
         * 三种交通工具都有品牌和价格
         * 创建一个交通部
         * 交通部包含飞机集合,汽车的集合 ,轮船的集合 每个集合中至少有两个对象
         * 最后将交通部这个集合里面的内容打印出来
         *
         */
    }

}
