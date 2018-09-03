package com.book;

/**
 * Created by dllo on 18/5/7.
 */
public abstract class Book {
    private String bookName,type;//类型
    private int pages; //页数

    public void  meaning (){
        System.out.println("读书使人进步");
    }
    public void result(){
        System.out.println("遨游在知识的海洋里");
    }//效果
     public abstract void pattern();//图案
    public abstract void form();//形状

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
