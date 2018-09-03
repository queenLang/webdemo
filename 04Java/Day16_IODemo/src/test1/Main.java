package test1;

import java.io.*;
import java.util.Scanner;

/***
 *
 *  .--,       .--,
 * ( (  \.---./  ) )
 *  '.__/o   o\__.'
 *     {=  ^  =}
 *      >  -  <
 *   //|   .   |\\
 *   "'\       /'"_.-~^`'-.
 *      \  _  /--'         `
 *    ___)( )(___
 *   (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 */
public class Main {
    public static void main(String[] args) {
        //read("/Users/dllo/Desktop/地址.");
        write("aaa/hehehe.txt");
    }

    private static void write(String outpath) {
        File file = new File(outpath);
        try {
            FileOutputStream outputStream = new FileOutputStream(file);
            System.out.println("请输入要输出的内容");
            String str = new Scanner(System.in).nextLine();
            outputStream.write(str.getBytes());
            outputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read(String path) {
        File file = new File(path);
        try {
            FileInputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int length = 0;
            String result = "";
            while ((length =inputStream.read(bytes))!= -1){
               String str = new String(bytes,0,length);
                result+=str;
            }

            System.out.println(result);
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
