package com.queen;

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
         * 创建一个交通类 交通类有三个集合  有飞机集合 轮船集合 汽车集合
         * 飞机  轮船  汽车 都有型号和价格
         */
        Plane plane1 = new Plane("737,",100);
        Plane plane2 = new Plane("747,",90);

        Car car1 = new Car("宝马",1900);
        Car car2 = new Car("奔驰",1200);

        Ship ship1 = new Ship("渤海明珠",156);
        Ship ship2 = new Ship("黄海明珠",156);

        List<Plane> planes = new ArrayList<>();
        planes.add(plane1);
        planes.add(plane2);
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        List<Ship> ships = new ArrayList<>();
        ships.add(ship1);
        ships.add(ship2);

        Traffic traffic = new Traffic(planes,cars,ships);
        //通过traffic对象打印第一个名字和价格
        System.out.println(traffic.getPlanes().get(0).getBrand());
        System.out.println(traffic);

    }
}
