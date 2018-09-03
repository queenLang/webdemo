package com.lang;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

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
public class Main {
    public static void main(String[] args) {
        Document document = DocumentHelper.createDocument();
        Element root = DocumentHelper.createElement("root");
        document.setRootElement(root);
        root.addAttribute("desc","这是一个根标签");
        Element traffic = root.addElement("traffic");
        Element brand = traffic.addElement("brand");
        brand.setText("五菱");
        Element price = traffic.addElement("price");
        price.setText("4万元");
        Element color = traffic.addElement("color");
        color.setText("茶色");

        File file = new File("xml_file/newsXml.xml");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            OutputFormat format = new OutputFormat();
            format.setNewlines(true);
            format.setEncoding("utf-8");
            format.setIndent("      ");
            XMLWriter writer = new XMLWriter(fos,format);
            writer.write(document);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
