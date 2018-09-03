package com.queen;

import java.io.*;
import java.util.Scanner;

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
public class BufferTest {
    public static void main(String[] args) {
        /**
         * 字节流主要应用是FileInputStream FileOutputStream
         *
         * 字符流主要应用 FileRead FileWriter
         *              BufferReader BufferWriter
         *
         */
       // read("/Users/dllo/Desktop/地址.");

        //write("/Users/dllo/Desktop/qq.txt");

        copy("/Users/dllo/Desktop/地址.","/Users/dllo/Desktop/ww.txt");

    }

    private static void copy(String readPath,String writePath) {
        try {
            FileReader fileReader = new FileReader(readPath);
            FileWriter fileWriter = new FileWriter(writePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line = " ";
            while ((line= bufferedReader.readLine())!= null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.append("shu");
                bufferedWriter.flush();
            }
            bufferedWriter.flush();

            bufferedWriter.close();
            bufferedReader.close();
            fileWriter.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write(String writePath) {
        try {
            FileWriter fileWriter = new FileWriter(writePath);
           BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            System.out.println(" 请输入内容" );
            String content = new Scanner(System.in).nextLine();
            bufferedWriter.write(content);
            //换行
            bufferedWriter.newLine();
            bufferedWriter.append("署名");
            //!!!!!!!!理解成刷新
            bufferedWriter.flush();
            /**
             * flush 强制清除
             */
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void read(String readPath) {
        try {
            FileReader reader = new FileReader(readPath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String result = "";
            //记录每行的内容
            String line = "";
            while ((line= bufferedReader.readLine()) !=null){
                result+=line;
            }
            System.out.println(result);
            bufferedReader.close();
            reader.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**
         * 复制一个文件夹
         */

    }
}
