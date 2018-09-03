package com.queen;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.SAXWriter;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
public class ParseXml {
    public List<Music> parse(String path) {
        List<Music> musicList = new ArrayList<>();
        SAXReader reader = new SAXReader();
        File file = new File(path);
        try {
            Document document = reader.read(file);
            Element musicElement = document.getRootElement();
            Iterator<Element> musicIterator = musicElement.attributeIterator();
            while (musicIterator.hasNext()) {
                Music music = new Music();
                Element songElement = musicIterator.next();
                Iterator<Element> songIterator = songElement.attributeIterator();
                while (songIterator.hasNext()){
                    Element song = songIterator.next();
                    if (song.getName().equals("singer")) {
                        music.setSinger(song.getText());
                    }

                    if (song.getName().equals("PicUrl")) {
                        music.setPicUrl(song.getText());
                    }
                }
               musicList.add(music) ;
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }
        for (Music music : musicList) {
            System.out.println(music);
        }
        return musicList;
    }





}
