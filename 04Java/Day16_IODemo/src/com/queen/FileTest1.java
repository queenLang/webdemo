package com.queen;

import java.io.File;
import java.io.IOException;

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
public class FileTest1 {
    public static void main(String[] args) {
        /**
         * 桌面上创建一个A文件夹 A中有B文件夹和C.txt文件
         * B中有 D.MP3文件 和E文件夹 E里有F.jpg文件
         *
         * 最后全部删除
         *
         */
        createFile();

        deleteFile("/Users/dllo/Desktop/A");





    }

    private static void deleteFile(String path) {
        File file = new File(path );
        if (!file.exists()){
            System.out.println("文件不存在");
            return;
        }
        if (file.isFile()){
            file.delete();
        }
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1 : files) {
                deleteFile(file1.getAbsolutePath());

            }
           file.delete();
        }
    }

    private static void createFile() {
        File file = new File("/Users/dllo/Desktop/A/B/E/");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file1 = new File("/Users/dllo/Desktop/A/C.txt");

        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();

        }
        File file2 = new File("/Users/dllo/Desktop/A/B/D.MP3");

        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file3 = new File("/Users/dllo/Desktop/A/B/E/F.jpg");

        try {
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
