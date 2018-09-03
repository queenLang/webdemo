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
public class Test {
    /**
     * 复制一个文件夹 文件里面有三张图片
     *
     * 分析思路
     * 首先判断路径是否存在
     * 再判断是否是文件夹 创建一个文件夹
     * 若果是文件夹 n那么获取里面的内容  复制内容到新的文件夹
     */



   public static void copyDirectory(String readPath,String writePath) {
        File readFile = new File(readPath);
        if (!readFile.exists()) {
            System.out.println("不存在");
            return;
        }
        File writeFile = new File(writePath);
        if (!writeFile.exists()){
            writeFile.mkdir();
        }
        if(readFile.isDirectory()){
            //获取文件夹中的内容
            File[] files = readFile.listFiles();
            for (File file : files) {
                copy(file,writePath+"/"+file.getName());
               //file.delete();
            }

        }


    }

    private static void copy(File file, String s) {
        try {
            FileInputStream inputStream = new FileInputStream(file);
            FileOutputStream outputStream = new FileOutputStream(s);
            byte[] bytes = new byte[1024];
            int length = 0;
            while ((length= inputStream.read(bytes))!= -1) {
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
