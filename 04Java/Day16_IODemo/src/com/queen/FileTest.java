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
public class FileTest {
    public static void main(String[] args) {
        /**
         * File类
         *
         */
        //exists()
        //测试此抽象路径名表示的文件或目录是否存在。
        //	getAbsoluteFile()
        //返回此抽象路径名的绝对路径名形式。
       // File file = new File("aaaa.xml");
        createFile();

        deleteFile("/Users/dllo/Desktop/大连-DLJ180301-何雨轩");

    }

    private static void deleteFile(String path) {
         File file = new File(path);
        if (!file.exists()){
            System.out.println("文件不存在");
            //直接结束此方法
            return;
        }
        //判断要删除的东西是否为文件  若为文件直接删除
        if (file.isFile()) {
           file.delete();
        }

        if (file.isDirectory()){
            //获取文件夹里所有的内容
            File[] files = file.listFiles();
            //递归删除
            for (File file1 : files) {
                deleteFile(file1.getAbsolutePath());

            }
            file.delete();
        }

    }

    private static void createFile() {
        //在桌面上创建一个文件夹
        //创建文件夹 参数是路径
        File file1 = new File("/Users/dllo/Desktop/李浪浪");
        //判断文件文件或文件夹是否存在 若存在返回true
        if (!file1.exists()){
            //创建文件夹
            file1.mkdir();

        }
        //创建多个文件夹 嵌套关系
        File file2 = new File("/Users/dllo/Desktop/aaa/bbb/ccc");
        if (!file2.exists()){
            file2.mkdirs();
        }
        File file3 = new File("/Users/dllo/Desktop/李浪浪/pp.png");
        if (!file3.exists()){
            try {
                file3.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(file3.getAbsolutePath());
        System.out.println(file3.getParent());
        System.out.println(file3.getAbsoluteFile());


        //快速创建
        //若想用这种方式创建文件 那么必须保证路径的正确性(必须有该文件夹)
        File file = new File("/Users/dllo/Desktop/李浪浪","aaa.txt");
        try {
            file.createNewFile();

           // file.delete();
            //file3.delete();
           // file1.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }

      //打印各个文件的相对路径和绝对路径
        //绝对路径  是最具体的路径
        //相对路径  是相对工程而言的

       File file5 = new File("aaa/小说.txt");

        System.out.println(file5.getAbsolutePath()); //绝对路径
        System.out.println(file5.getPath());  //

        /**
         * 桌面上创建一个A文件夹 A中有B文件夹 和C.txt文件
         * B中有D.MP3文件和E文件夹
          */



    }
}
