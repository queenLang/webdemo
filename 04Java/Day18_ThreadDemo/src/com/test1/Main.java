package com.test1;

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
public class Main {
    public static void main(String[] args) {
        /**
         * 生成一个XML数据包含library根标签
         * book子标签 namepicUrl标签
         * 然后解析该标签
         * 将每本书的图片 图片名称就是name里面的内容
         */
        new CreateXml().create();
        List<Book> books = new ParseXml().parse("xml_file/library.xml");

        for (Book book : books) {
            new DownloadThread(book).start();

        }











    }
}
