package com.queen;

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
public class Music {
    private String  singer, picUrl;

    public Music() {
    }

    public Music(String singer, String picUrl) {
        this.singer = singer;
        this.picUrl = picUrl;
    }

    @Override
    public String toString() {
        return "Music{" +
                "singer='" + singer + '\'' +
                ", picUrl='" + picUrl + '\'' +
                '}';
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}
