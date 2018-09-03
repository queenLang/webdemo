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
public class MyIOUtils {
        /* 需求3
         * 将一个文件夹里面的不同类型的文件进行分类处理
         * 有图片  有音频 有文档
         * 分类后 会创建出三个文件夹 一个放音乐  一个放音频  一个放文档\
         *
         * 分析
         *  首先要对所有文件进行遍历 判断后缀
         *  再创建与之对应的文件夹
         *  将文件放到文件夹中
         */

    public static void classify(String readPath,String basePath){
        File file = new File(readPath);
        //所有文件
        File[] allFile  = file.listFiles();
        for (File singleFile : allFile) {

            String fileName =  singleFile.getName();
            if (fileName.endsWith(".jpg")
                    || fileName.endsWith(".png")
                    || fileName.endsWith(".jpeg")
                    ||fileName.endsWith(".gif")){
                sort(basePath, singleFile,"图片");
            }else if (fileName.endsWith(".mp3")
                    || fileName.endsWith(".mp4")
                    || fileName.endsWith(".avi")
                    ||fileName.endsWith(".rmvb")){
                sort(basePath, singleFile,"媒体");
            }else if (fileName.endsWith(".ppt")
                    || fileName.endsWith(".doc")
                    || fileName.endsWith(".pdf")
                    ||fileName.endsWith(".txt")){
                sort(basePath, singleFile,"文档");
            }else {
                sort(basePath, singleFile,"其他");
            }
        }


    }

    private static void sort(String basePath, File singleFile,String directoryName) {
        File picFile = new File(basePath+"/"+directoryName);
        picFile.mkdir();
        copy(singleFile,picFile.getAbsolutePath());
    }

    private static void copy(File singleFile, String outPath) {
        try {
            FileInputStream inputStream = new FileInputStream(singleFile);
            FileOutputStream outputStream = new FileOutputStream
                    (outPath+"/"+singleFile.getName());
            byte[] bytes = new byte[1024];
            int length = 0;
            while ((length = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, length);
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
