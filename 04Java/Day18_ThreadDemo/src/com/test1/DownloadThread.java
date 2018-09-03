package com.test1;

import org.dom4j.io.OutputFormat;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

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
public class DownloadThread extends Thread {
    private Book book;

    protected DownloadThread(Book book){
      this.book = book;

    }

    @Override
    public void run() {
        super.run();
        download(book);
    }

    private void download(Book book) {
        try {
            URL url =new URL(book.getPicUrl());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int code = connection.getResponseCode();
            if (code==200){
                InputStream inputStream = connection.getInputStream();
                OutputStream outputStream = new FileOutputStream("xml_file/"+book.getName()+".jpg");
                byte[] bytes = new byte[1024];
                int length = 0;
                while ((length = inputStream.read(bytes))!= -1){
                    outputStream.write(bytes,0,length);

                }
                outputStream.close();
                inputStream.close();
                connection.disconnect();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
