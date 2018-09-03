package com.queen;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

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
public class CreateXml {
    public  void  createXml (){
        Map<String,Music> musicMap = new HashMap<>();
        musicMap.put("十年",new Music("陈奕迅","http://aliimg.changba.com/cache/photo/111841589_640_640.jpg"));
        musicMap.put("去大理",new Music("黄渤","http://img5.imgtn.bdimg.com/it/u=1691753904,2820749325&fm=27&gp=0.jpg"));
        musicMap.put("稻香",new Music("周杰伦","http://h.hiphotos.baidu.com/zhidao/wh%3D450%2C600/sign=20db947098504fc2a20ab801d0edcb27/08f790529822720e0306fa8278cb0a46f31fabf9.jpg"));

       Document document = DocumentHelper.createDocument();
        Element root = DocumentHelper.createElement("music");
        document.setRootElement(root);
        for (String s : musicMap.keySet()) {
           Music music = musicMap.get(s ) ;
           Element songElement = root.addElement("song");
              songElement.addAttribute("name","1");
            Element singer = songElement.addElement("singer");
            singer.setText(music.getSinger());
            Element picUrl = songElement.addElement("picUrl");
            picUrl.setText(music.getPicUrl());

        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("xml/musicXmi.xml");
            OutputFormat format = new OutputFormat();
            format.setNewlines(true);
            format.setIndent("      ");
            format.setEncoding("utf-8");
            XMLWriter writer = new XMLWriter(fileOutputStream,format);
            writer.write(document);
            fileOutputStream.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}
