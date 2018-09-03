package com.queen;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

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
public class ServerThread extends Thread {
    @Override
    public void run() {
        super.run();
        receive();//接收

    }

    private void receive() {
        System.out.println("等待连接.....");
        try {
            //服务器的serverSocket 用于接收客户端发送的请求
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket socket = serverSocket.accept();
            System.out.println("连接成功...");
            //获取socket
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int length = 0;
             String result = "";
            while ((length= inputStream.read(bytes))!= -1) {
                result+=new String(bytes,0,length);
            }
            System.out.println("接收的结果"+result);
            //释放资源
            inputStream.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
