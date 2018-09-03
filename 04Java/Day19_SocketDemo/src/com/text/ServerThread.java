package com.text;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
        send();
    }

    private void send() {
        try {
            ServerSocket serverSocket = new ServerSocket(9090);
            Socket socket = serverSocket.accept();
            InputStream inputStream = new FileInputStream("/Users/dllo/Desktop/ff.jpg");
            OutputStream outputStream = socket.getOutputStream();
            byte[] bytes = new byte[1024];
            int lenght = 0;
            while ((lenght = inputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,lenght);
            }
            outputStream.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
