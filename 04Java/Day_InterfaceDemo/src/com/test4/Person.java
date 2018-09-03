package com.test4;

/***
 *
 *  .--,       .--,
 * ( (  \.---./  ) )
 *  '.__/o   o\__.'
 *     {=  ^  =}
 *      >  -  <
 *     /       \
 *    //       \\       能力
 *   //|   .   |\\
 *   "'\       /'"_.-~^`'-.
 *      \  _  /--'         `
 *    ___)( )(___
 *   (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 */
public class Person implements Swim,Car,Dance{
    @Override
    public void drive() {
        System.out.println("考的C证");
    }

    @Override
    public void swimming() {
        System.out.println("学会游泳只能游50米");
    }

    @Override
    public void jump() {
        System.out.println("只会广场舞");
    }
}
