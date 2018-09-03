package com.qqq;

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
public class Learn {

    public static void main(String[] args) {


        copy("/Users/dllo/Desktop/ww.txt","/Users/dllo/Desktop/qq.txt");
    }

    private static void copy(String readPath,String writePath) {
        try {
            FileReader fileReader = new FileReader(readPath);
            FileWriter fileWriter = new FileWriter(writePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            while ((line = bufferedReader.readLine())!= null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
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
}
