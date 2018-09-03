package com.chat;

import java.io.*;
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
public class ChatClient extends Thread {
    //服务端向客户端发 客户端进行反馈

    private String ip;
    private int port;

    public ChatClient(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("连接中...");
        try {
            Socket socket = new Socket(ip,port);
            System.out.println("连接成功");
            InputStream inputStream =socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String msg = reader.readLine();
            System.out.println("接收到内容是"+msg);
            System.out.println("数据接收成功 进行反馈");
            //---------------上面接收 下面发送-------------------
            OutputStream outputStream = socket.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            System.out.println(" 请输入内容");
            String backStr = new Scanner(System.in).nextLine();
            writer.write(backStr);
            writer.flush();


            writer.close();
            outputStream.close();
            reader.close();
            inputStream.close();
            socket.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
