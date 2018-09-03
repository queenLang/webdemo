package com.test1;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/***
 *
 *  .--,       .--,
 * ( (  \.---./  ) )
 *  '.__/o   o\__.'
 *     {=  ^  =}
 *      >  -  <
 *    //       \\
 *   //|   .   |\\
 *   "'\       /'"_.-~^`'-.
 *      \  _  /--'         `
 *    ___)( )(___
 *   (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 */
public class CreateXml {
    public void create() {
        Map<String, Book> bookMap = new HashMap<>();
        bookMap.put("a", new Book("书1", "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1843107695,1173205572&fm=27&gp=0.jpg"));
        bookMap.put("b", new Book("书2", "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1843107695,1173205572&fm=27&gp=0.jpg"));
        bookMap.put("c", new Book("书3", "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1843107695,1173205572&fm=27&gp=0.jpg"));

        Document document = DocumentHelper.createDocument();
        Element root = DocumentHelper.createElement("library");
        document.setRootElement(root);
        for (String s : bookMap.keySet()) {
            Book book = bookMap.get(s);
            Element bookElement = root.addElement("book");
            Element name = bookElement.addElement("name");
            name.setText(book.getName());
            Element picUrl = bookElement.addElement("picUrl");
            picUrl.setText(book.getPicUrl());
        }
        try {
            FileOutputStream outputStream = new FileOutputStream("xml_file/library.xml");
            OutputFormat format =new OutputFormat();
            format.setIndent("      ");
            format.setNewlines(true);
            format.setEncoding("utf-8");
            XMLWriter writer = new XMLWriter(outputStream,format);
            writer.write(document);
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
