package com.queen;

import java.io.*;

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
public class MyRunnable implements Runnable {
    private String readPath,writePath;
    private int time;

    public MyRunnable(String readPath, String writePath, int time) {
        this.readPath = readPath;
        this.writePath = writePath;
        this.time = time;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(time);
            copy(readPath,writePath);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void copy(String readPath,String writePath) {

        File readFile = new File(readPath);
        File writeFile = new File(writePath);
        try {
            FileInputStream inputStream = new FileInputStream(readFile);
            FileOutputStream outputStream = new FileOutputStream(writeFile);
            int length = 0;
            byte[] bytes = new byte[1024];
            while ((length = inputStream.read(bytes))!= -1){
                outputStream.write(bytes,0,length);
            }
            outputStream.close();
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }


    }


}
