package con.homework;

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
public class Main {
    public static void main(String[] args) {
        /**
         * 创建一个交通类
         * 交通类里有三个子类 汽车类  飞机类 轮船类
         * 三种交通工具都有品牌和价格
         * 创建一个交通部
         * 交通部包含飞机集合,汽车的集合 ,轮船的集合 每个集合中至少有两个对象
         * 最后将交通部这个集合里面的内容打印出来
         *
         */


       List<List<Traffic>> trafficList = new ArrayList<>();



        List<Traffic> List = new ArrayList<>();
        List.add(new Car("宝马","1122万"));
        List.add(new Car("奔驰","10万"));

        List<Traffic> planeList = new ArrayList<>();
        planeList.add(new Plane("战斗机","1千万"));
        planeList.add(new Plane("直升机","100万"));

        List<Traffic> shipList = new ArrayList<>();
        shipList.add(new Ship("大轮船","1000000"));
        shipList.add(new Ship("小轮船","1000"));

        trafficList.add(List);
        trafficList.add(shipList);
        trafficList.add(planeList);

        for (List<Traffic> traffics : trafficList) {
            for (Traffic traffic : traffics) {
                System.out.println(traffic);
            }
        }

        /**
         * 创建一个大洲集合
         * 2大洲
         * 每一个大洲包含两个国家
         * 每个国家写出两个省
         * 每个省写出一个省会城市
         * 一个省会城市一个区
         */

    }
}
