package com.chat;

import java.io.*;
import java.net.ServerSocket;
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
public class ChatSerrver extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("服务器开启  等待连接");
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            Socket socket = serverSocket.accept();
            System.out.println("连接成功");
            //发送消息
            OutputStream outputStream = socket.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            System.out.println("请输入要传输的数据....");
            String msg = new Scanner(System.in).nextLine();
            writer.write(msg);
            writer.flush();


            ///!!!!!!重点
            //终结输出
            socket.shutdownOutput();
            //接收客户端的内容
            System.out.println("接收到了客户端的反馈内容");
            InputStream inputStream = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String backStr = reader.readLine();
            System.out.println("内容是"+backStr);

            reader.close();
            inputStream.close();
            writer.close();
            outputStream.close();
            socket.close();
            serverSocket.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
