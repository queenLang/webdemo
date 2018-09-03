package com.text;

import java.io.*;
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
public class ClientThread  extends  Thread{
    @Override
    public void run() {
        super.run();
        receive();
    }

    private void receive() {
        String ip = "172.16.16.206";
        int part = 9090;
        try {
            Socket socket = new Socket(ip,part);
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = new FileOutputStream("xmind-7-update1-macosx.dmg");
            byte[] bytes = new byte[1024];
            int lenght = 0;
            while ((lenght=inputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,lenght);

            }
            outputStream.close();
            inputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
