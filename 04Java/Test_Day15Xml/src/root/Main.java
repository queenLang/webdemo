package root;

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
public class Main {
    public static void main(String[] args) {
        Map<String,Book> bookMap = new HashMap<>();
        bookMap.put("玄幻",new Book("诛仙","修仙","20","400页"));
        bookMap.put("爱情",new Book("悲伤逆流","修仙","20","400页"));
        bookMap.put("悬疑",new Book("嫌疑人","修仙","20","400页"));
        bookMap.put("史书",new Book("史记","修仙","20","400页"));

       Document document = DocumentHelper.createDocument();
        Element library = DocumentHelper.createElement("library");
        document.setRootElement(library);

        for (String s : bookMap.keySet()) {
            Element book = library.addElement("book");
            book.addAttribute("type",s );
            Book books = bookMap.get(s );
            Element name = book.addElement("name");
            name.setText(books.getName());
            Element kind = book.addElement("kind");
            kind.setText(books.getKind());
            Element price = book.addElement("price");
            price.setText(books.getPrice());
            Element num = book.addElement("num");
            num.setText(books.getNum());

        }
        File file = new File("xml/qqXml.xml");
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
