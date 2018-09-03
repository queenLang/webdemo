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
public class Ticket {
    public static int totals = 100;
    public  boolean sale(){
        //同步代码块
        synchronized (Ticket.class){
            if (totals>0){
                System.out.println("卖了一张票"+(--totals)+"张");
                return false;
            }else {
                System.out.println("卖没了");
                return true;
            }
        }
    }
}
