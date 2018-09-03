package com.queen;

import java.io.IOException;
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
        //IP地址
        String ip = "172.16.16.119";
        //端口号 (同一个IP地址可以有多个端口号进行不同操作)
        int port = 8080;
        try {
            Socket socket = new Socket(ip,port);
            System.out.println("正在连接......");
            OutputStream outputStream = socket.getOutputStream();
            System.out.println("请输入内容,点击回车后发送");
            String msg = new Scanner(System.in).nextLine();
            //转化成数组
            outputStream.write(msg.getBytes());
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
