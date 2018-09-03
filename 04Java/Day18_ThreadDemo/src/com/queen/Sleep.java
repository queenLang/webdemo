package com.queen;

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
public class Sleep extends Thread {
    private  String name;

    public Sleep(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(2000);
            for (int i = 100; i < 200; i++) {
                //System.out.println(name+"正在数数");
                String systemName = Thread.currentThread().getName();
                System.out.println(systemName);
                System.out.println(i );
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
