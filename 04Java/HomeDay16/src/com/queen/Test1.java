package com.queen;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
public class Test1 {
    public static void main(String[] args) {
//        List<City> cityList = new ArrayList<>();
//        File file = new File("xml/newXml.xml");
//        SAXReader reader = new SAXReader();
//        try {
//            Document document =reader.read(file);
//            Element province = document.getRootElement();
//            System.out.println("子标签的名字"+province.getName());
//            Iterator<Element>  provinceElement
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        }

     File file = new File("/Users/dllo/Desktop/地址.");
        File file1 = new File("/Users/dllo/Desktop/2");
        try {
            FileInputStream inputStream = new FileInputStream(file);
            FileOutputStream outputStream = new FileOutputStream(file1);
            byte[] bytes = new byte[1024];
            int length = 0;
            String result = "";
            while ((length= inputStream.read(bytes))!= -1){
            String str = new String(bytes,0,length);
            result+=str;
        } outputStream.write(result.getBytes());
            outputStream.close();
        inputStream.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
