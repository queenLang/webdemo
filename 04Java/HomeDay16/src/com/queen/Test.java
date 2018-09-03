package com.queen;

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
        List<City> cityList = new ArrayList<>();
        File file = new File("xml/newXml.xml");
        SAXReader reader = new SAXReader();

        try {
            Document document = reader.read(file);
            Element province = document.getRootElement();
            System.out.println("根标签的名字是" + province.getName());

            Iterator<Element> provinceIterator = province.elementIterator();
            while (provinceIterator.hasNext()) {
                City city = new City();
                Element cityElement = provinceIterator.next();
                System.out.println("子标签的名字" + cityElement.getName());
                city.setName(cityElement.getName());

                Iterator<Element> cityIterator = cityElement.elementIterator();

                while (cityIterator.hasNext()) {
                    Element element = cityIterator.next();
                    System.out.println("area标签的名字" + element.getName());
                    if (element.getText().equals("区1")) {
                        String area = element.getText();
                        System.out.println(area);
                        city.setArea(area);
                    }
                    if (element.getText().equals("区2")) {
                        String area = element.getText();
                        System.out.println(area);
                        city.setAera2(area);
                    }
                    if (element.getText().equals("区3")) {
                        String area = element.getText();
                        System.out.println(area);
                        city.setArea3(area);
                    }


                    cityList.add(city);

                }
            }
            for (City city : cityList) {
                System.out.println(city);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}