package com.test3;

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
        Shape square = new Square(3,24);
         square.printArea();
        Shape ladder = new Ladder(2,4,7);
          ladder.printArea();
        Shape circle = new Circle(2);
          circle.printArea();
    }
}
