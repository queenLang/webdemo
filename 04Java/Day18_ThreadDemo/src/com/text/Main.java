package com.text;

/***
 *
 *  .--,       .--,
 * ( (  \.---./  ) )
 *  '.__/o   o\__.'
 *     {=  ^  =}
 *      >  -  <
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
         * 卖票
         *
         */
        new TicketThread().start();
        new TicketThread().start();
        new TicketThread().start();
        new TicketThread().start();
        new TicketThread().start();
        new TicketThread().start();
    }
}
