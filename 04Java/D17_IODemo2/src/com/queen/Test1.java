package com.queen;

import java.io.*;

/***
 *
 *  .--,       .--,
 * ( (  \.---./  ) )
 *  '.__/o   o\__.'
 *     {=  ^  =}
 *      >  -  <
 *     /       \
 *    //       \\
 *   //|   .   |\\
 *   "'\       /'"_.-~^`'-.
 *      \  _  /--'         `
 *    ___)( )(___
 *   (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 */
public class Test1 {


    public static void copyDirectory(String readPath, String writePath) {
        File readFile = new File(readPath);
        if (!readFile.exists()) {
            System.out.println("不存在");
            return;
        }
        File writeFile = new File(writePath);
        if (!writeFile.exists()) {
            writeFile.mkdir();

        }
        if (readFile.isDirectory()) {
            //获取文件夹中的内容
            File[] files = readFile.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    if (file.getName().endsWith("jpg")) {
                        File filePhoto = new File(String.valueOf(writeFile) + "/图片");
                        filePhoto.mkdir();
                        copy(file.getAbsoluteFile(), filePhoto + "/" + file.getName());
                    }
                    if (file.getName().endsWith("mp3")) {
                        File fileMiutic = new File(String.valueOf(writeFile) + "/音乐");
                        fileMiutic.mkdir();
                        copy(file.getAbsoluteFile(), fileMiutic + "/" + file.getName());
                    }
                    if (file.getName().endsWith("mp4")){
                        File fileMove = new File(String.valueOf(writeFile)+"/视频");
                        fileMove.mkdir();
                        copy(file.getAbsoluteFile(),  fileMove + "/" + file.getName());
                    }

                }
                //if (file.isDirectory()){
                //   copyDirectory(file.getAbsolutePath(),writePath + "/" + file.getName());
                // }
            }

        }


    }

    private static void copy(File file, String s) {
        try {
            FileInputStream inputStream = new FileInputStream(file);
            FileOutputStream outputStream = new FileOutputStream(s);
            byte[] bytes = new byte[1024];
            int length = 0;
            while ((length = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, length);

            }

            outputStream.close();
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
