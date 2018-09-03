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
public class Test2 {
    public static void main(String[] args) {
        Document document = DocumentHelper.createDocument();
        Element library = DocumentHelper.createElement("library");
        document.setRootElement(library);
        library.addAttribute("desc","good");
        Element book = library.addElement("book");

        Element name = book.addElement("name");
        name.setText("西游记");
        Element type = book.addElement("type");
        type.setText("传记");
        Element num = book.addElement("num");
        num.setText("123");
        Element book1 = library.addElement("book");

        Element name1 = book1.addElement("name");
        name1.setText("哑舍");
        Element type1 = book1.addElement("type");
        type1.setText("传记");
        Element num1 = book1.addElement("num");
        num1.setText("1243");

        File file = new File("xml_file/bookXml.xml");
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
