package com.botany;

/**
 * Created by dllo on 18/5/7.
 */
public abstract class Botany {
    //植物
    private String name ,type;
    private int age;

    public void growUp (){
        System.out.println("在阳光下茁壮成长");
    }
    public void condition(){ //条件
        System.out.println("需要光和水");
    }
     public abstract void hight();
     public abstract void flower();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
