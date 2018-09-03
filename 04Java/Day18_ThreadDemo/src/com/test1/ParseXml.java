package com.test1;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
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
 *    //       \\
 *   //|   .   |\\
 *   "'\       /'"_.-~^`'-.
 *      \  _  /--'         `
 *    ___)( )(___
 *   (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 */
public class ParseXml {
    public List<Book > parse(String path){
        List<Book> books = new ArrayList<>();

        SAXReader reader = new SAXReader();
        File file = new File(path);
        try {
            Document document = reader.read(file);
            Element libraryElement = document.getRootElement();
            Iterator<Element> libraryIterator = libraryElement.elementIterator();
            while (libraryIterator.hasNext()){
                Book book = new Book();
                Element bookElement = libraryIterator.next();
                Iterator<Element> bookIterator = bookElement.elementIterator();
                while (bookIterator.hasNext()){
                    Element element = bookIterator.next();
                    if (element.getName().equals("name")){
                        book.setName(element.getText());
                    }
                    if (element.getName().equals("picUrl")){
                        book.setPicUrl(element.getText());
                    }
                }
                books.add(book);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        for (Book book : books) {
            System.out.println(book);

        }
        return  books;
    }
}
