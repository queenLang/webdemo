package iotest;

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
public class Main {
    public static void main(String[] args) {
        /**
         * 按类型分
         * 字节流 字符流
         * 按方向分
         * 输入流 输出流
         */
        //需求1 读取某一文件里的内容
        //需求2 将某一字符串写成一个文件
        //需求3 读取一个文件里的内容 并且复制到另一个文件中
//        read("/Users/dllo/Desktop/地址.");
        write("aaa/haha.txt");
    }
    private static void write(String outPath) {
        File file = new File(outPath);
        try {
            //创建输出流
            FileOutputStream outputStream = new FileOutputStream(file);
            System.out.println("请输入要输出的内容");
            //创建一个字符串
            String str = new Scanner(System.in).nextLine();
            //将字符串转化成字节数再进行操作
            outputStream.write(str.getBytes());
            outputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read(String path) {
        //获取要读的的文件
        File file = new File(path);
        //创建输入流
        try {
            FileInputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int length = 0; //记录读取长度
            String result = "";
           while ((length = inputStream.read(bytes))!= -1){
               //参数1 要拼接的数组 参数2 起始位置 参数3 结束位置
               String str = new String(bytes,0,length);
               result+=str;

           }
            System.out.println(result);
            //最后要做的事情  先入后出 先创建的后关 后创建的先关
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }







    }
}
