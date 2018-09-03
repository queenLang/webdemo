package iotest;

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
    public static void main(String[] args) {


        File file = new File("/Users/dllo/Desktop/地址.");
        File file1 = new File("/Users/dllo/Desktop/2");
        try {
            FileInputStream inputStream = new FileInputStream(file);
            FileOutputStream outputStream = new FileOutputStream(file1);
            byte[] bytes = new byte[1024];
            int length = 0;
            String result = "";
            while ((length = inputStream.read(bytes)) != -1) {
                String str = new String(bytes, 0, length);
                result += str;
            }
            outputStream.write(result.getBytes());
            outputStream.close();
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}