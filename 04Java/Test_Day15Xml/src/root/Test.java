package root;

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
      List<Book> books = new ArrayList<>();
        File file = new File("xml/newXml.xml");
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(file);
            Element library = document.getRootElement();
            System.out.println("根标签的名字是"+library.getName());
            Iterator<Element> libraryIterator = library.elementIterator();
            while (libraryIterator.hasNext()){
                Book book = new Book();
                Element bookElement = libraryIterator.next();

            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
