package com;

import com.queen.GrandSon;
import com.queen.Student;
import com.queen.Worker;

/**
 * Created by dllo on 18/5/4.
 */
public class Main {
    public static void main(String[] args) {

        /**
         *
         * 继承 被继承的是父亲 继承的事子类
         * 子类可以使用父亲的所有内容(公开的属性和方法)
         *
         * 继承 子类的内容会越来越丰富 可拓展性更强
         * java 只支持单继承(一个儿子一个亲爹)
         */

//        Son son = new Son();
//        GrandSon grandSon = new GrandSon();

        Student student = new Student("刘红","女",18);
        //student.setName("liu");
       // student.setAge(18);
       // student.setNum(12);
        student.speak();

        Worker worker = new Worker("张为","男",39);
        //worker.setName("光头强");
        //worker.setAge(19);
        //worker.setNum(11);
        //worker.setSex("男");
        /**
         *
         * 交通工具 材料 容载量 价格 公有的一个交通的方法
         * 方法中随便输出一句话
         * 车  能在陆地交通 车轮数 车牌号
         * 船  能在海里交通 船的型号 船的排水量
         * 飞机 一个会飞的方法 翅膀数 航线String
         *
         * 飞机-------->民用飞机  战斗机
         * 车 --------->私家车 公共汽车
         * 船---------->游艇 游轮 货轮
         *
         *
         */

        System.out.println(student.NUM);

    }
}
