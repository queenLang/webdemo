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
public class TicketThread extends Thread {
    @Override
    public void run() {
        super.run();
        Ticket ticket = new Ticket();

        while (true){
            System.out.println(Thread.currentThread().getName());

           boolean flag = ticket.sale();
            if (flag){
                break;
            }
        }
    }
}
