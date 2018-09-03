package com.lijingjing;

/**
 * Created by dllo on 18/5/2.
 */
public class Book {
    private String name;
    private int pages;
    private double price;

    public void introduction (){
        System.out.println("书名"+name+"页数"+ pages+"价格"+ price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("西游记")){
        this.name = name;
    }else{
            System.out.println("书名不可以为西游记");}
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages>200){
        this.pages = pages;

    }else{
            System.out.println("页数太少");}
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>20){

        this.price = price;
    }else {
            System.out.println("钱太少");
    }
    }
}
