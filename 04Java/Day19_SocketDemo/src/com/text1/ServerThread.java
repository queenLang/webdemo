package com.text1;

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
        receive();
    }

    private void receive() {
        try {
            ServerSocket serverSocket = new ServerSocket(6060);
            Socket socket = serverSocket.accept();
            System.out.println(" ");
            InputStream inputStream = socket.getInputStream();
            int length = 0;
            String result = "";
            byte[] bytes = new byte[1024];
            while ((length = inputStream.read(bytes))!= -1){
               result+=new String(bytes,0,length);

            }
            System.out.println("11"+result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
