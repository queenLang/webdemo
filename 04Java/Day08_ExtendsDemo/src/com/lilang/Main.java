package com.lilang;

/**
 * Created by dllo on 18/5/4.
 */
public class Main {
    public static void main(String[] args) {
        /**
         *
         * 交通工具vehicle 材料 容载量 价格 公有的一个交通的方法
         * 方法中随便输出一句话
         * 车car  能在陆地交通 车轮数 车牌号
         * 船ship  能在海里交通 船的型号model 船的排水量displacement
         * 飞机 plane 一个会飞的方法 翅膀数 航线String airline
         *
         * 飞机-------->民用飞机 aircraft  战斗机 Fighter
         * 车 --------->私家车private 公共汽车
         * 船---------->游艇 yacht 游轮Cruises; 货轮freighter
         *
         *
         */

        Car car = new Car();
        car.setMoney(145600);
        System.out.println(car.getMoney());
        Cruises cruises = new Cruises();
        cruises.setMaterialsl("铁");
        System.out.println(cruises.getMaterialsl());
        cruises.method();
    }
}
