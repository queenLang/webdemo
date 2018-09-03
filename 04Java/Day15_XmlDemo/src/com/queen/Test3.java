package com.queen;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

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
public class Test3 {
    public static void main(String[] args) {
        Map<String,Book> bookMap = new HashMap<>();

        bookMap.put("玄幻",new Book("诛仙","修仙","20","500页"));
        bookMap.put("爱情",new Book("悲伤逆流","言情","240","5020页"));
        bookMap.put("悬疑",new Book("嫌疑人","悬疑","120","5050页"));
        bookMap.put("史书",new Book("史记","历史","210","5000页"));
        Document document = DocumentHelper.createDocument();
        Element library = DocumentHelper.createElement("library");
        document.setRootElement(library);
        for (String s : bookMap.keySet()) {
            Element book=library.addElement("book");
            book.addAttribute("type",s);

            //通过key值获取对应的value
            Book book1=bookMap.get(s);

            Element name=book.addElement("name");
            name.setText(book1.getName());
            Element kind=book.addElement("kind");
            kind.setText(book1.getKind());
            Element num=book.addElement("num");
            num.setText(book1.getNum());
            Element price=book.addElement("price");
            price.setText(book1.getPrice());
        }

        File file=new File("xml_file/book1test.xml");
        try {
            FileOutputStream fos=new FileOutputStream(file);
            OutputFormat format=new OutputFormat();
            format.setNewlines(true);
            format.setIndent("      ");
            format.setEncoding("utf-8");

            XMLWriter xmlWriter=new XMLWriter(fos,format);
            xmlWriter.write(document);

            xmlWriter.close();
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

