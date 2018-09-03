package com.qqq;

import org.omg.CORBA.portable.InputStream;

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
public class Learn1 {
    public static void main(String[] args) {

        copy("/Users/dllo/Desktop/5805773ed2199.jpg","/Users/dllo/Desktop/bb.jpg");
    }

    private static void copy(String readPath,String writePath) {
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
