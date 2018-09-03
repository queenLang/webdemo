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
public class Main {
    public static void main(String[] args) {
        /**
         * 需求2
         * 将文件夹A中的所有图片 复制到另一个文件夹中
         * 需求3
         * 将一个文件夹里面的不同类型的文件进行分类处理
         * 有图片  有音频 有文档
         * 分类后 会创建出三个文件夹 一个放音乐  一个放音频  一个放文档
         */

        //复制一个文件
//        copy("/Users/dllo/Desktop/地址.","/Users/dllo/Desktop/x.txt");
        //复制文件夹
       // Test1.copyDirectory("/Users/dllo/Desktop/李浪浪","/Users/dllo/Desktop/李");


        MyIOUtils.classify("/Users/dllo/Desktop/李浪浪","/Users/dllo/Desktop/李");
    }

    private static void copy(String readFilePath, String writeFilePath) {
        File readFile = new File(readFilePath );
        File writeFile = new File(writeFilePath);
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
