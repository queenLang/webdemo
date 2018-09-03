package com.internet;



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
 *      > --- <
 *    //  @@@  \\
 *   //|      |\\
 *   "'\       /'"_.-~^`'-.
 *      \  _  /--'         `
 *    ___)( )(___
 *   (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 网络编程
         *
         */
        String urlStr ="https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2610044701,1467345168&fm=27&gp=0.jpg";
        //将字符串转化成网址
        try {
            URL url1 = new URL(urlStr);
            //建立网络连接
            HttpURLConnection connection = (HttpURLConnection) url1.openConnection();
            //获取请求码
            int code = connection.getResponseCode();
            if (code == 200){
                InputStream inputStream = connection.getInputStream();
                OutputStream outputStream = new FileOutputStream("/Users/dllo/Desktop/ff.jpg");
                byte[] bytes = new byte[1024];
                int lenght = 0;
                while ((lenght = inputStream.read(bytes))!= -1){
                    outputStream.write(bytes,0,lenght);
                }

                outputStream.close();
                inputStream.close();
                //断开链接
                connection.disconnect();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
