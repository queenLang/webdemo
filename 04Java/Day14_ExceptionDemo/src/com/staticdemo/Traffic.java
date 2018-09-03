package com.staticdemo;

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
public class Traffic {
    private  Car car = new Car("奔驰",4);
    //静态代码块
    static {
        Car car1 = new Car("宝马",5);

    }
    public  Traffic(){
        Car car2 = new Car("五菱宏光",6);
    }
}
