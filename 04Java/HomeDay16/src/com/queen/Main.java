package com.queen;

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
        Element province = DocumentHelper.createElement("province");
        document.setRootElement(province);

        for (int i = 1; i < 11; i++) {
            Element city = province.addElement("city"+i);
            city.addAttribute("城市"+i," ");
            Element area = city.addElement("area");
            area.setText("区1");
            Element area2 = city.addElement("area");
            area2.setText("区2");
            Element area3 = city.addElement("area");
            area3.setText("区3");
       }
        File file = new File("xml/newXml.xml");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            OutputFormat format = new OutputFormat();
            format.setNewlines(true);
            format.setEncoding("utf-8");
            format.setIndent("      ");
            XMLWriter writer = new XMLWriter(fos,format);
            writer.write(document);
            writer.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
