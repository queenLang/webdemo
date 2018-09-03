package com.queen;

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
    private Music music;

    public DownloadThread(Music music) {
        this.music = music;
    }

    @Override
    public void run() {
        super.run();
        download(music);
    }

    private void download(Music music) {
        try {
            URL url = new URL(music.getPicUrl());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
