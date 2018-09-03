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
public class Test2 {
    public static void main(String[] args) {

        write("aaa/小说.txt");
    }

    private static void write(String outPath) {
        File files = new File(outPath);
        try {
            FileOutputStream outStream = new FileOutputStream(files);
            String str =  read("/Users/dllo/Desktop/地址.");;
            outStream.write(str.getBytes());
            outStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String read(String path) {
        File file = new File(path);
        String result = "";
        try {
            FileInputStream inputStream = new FileInputStream(file);
            int length = 0;

            byte[] bytes = new byte[1024];
            while ((length= inputStream.read(bytes))!=-1) {
                String str = new String(bytes, 0, length);
                result += str;
            }
            System.out.println(result);
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
