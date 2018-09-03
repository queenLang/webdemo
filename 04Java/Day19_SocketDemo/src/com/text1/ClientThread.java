package com.text1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

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
public class ClientThread extends Thread {
    @Override
    public void run() {
        super.run();
        send();
    }

    private void send() {
        String ip = "172.16.16.119";
        int port = 6060;
        try {
            Socket socket = new Socket(ip,port);
            System.out.println("正在连接......");
            OutputStream outputStream = socket.getOutputStream();
            System.out.println("请输入内容,点击回车后发送");
            String msg = new Scanner(System.in).nextLine();
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int length = 0;
            while ((length = inputStream.read(bytes))!= -1){

            }
            outputStream.write(msg.getBytes());
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
