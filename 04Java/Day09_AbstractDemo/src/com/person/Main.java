package com.person;

/**
 * Created by dllo on 18/5/7.
 */
public class Main {
    public static void main(String[] args) {
      Man man = new Man("Jack",30,"男");
        Woman woman = new Woman("Reom",50,"女");
        Child child = new Child("liu",10,"nan");

       man.setWoman(woman);
        man.setChild(child);
        woman.setChild(child);
        woman.setMan(man);
        child.setMan(man);
        child.setWoman(woman);

        Family family = new Family();
        family.party();



    }
}
