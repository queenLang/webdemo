package com.test1;

/**
 * Created by dllo on 18/5/8.
 */
public class Army {
    int index = 0;
    private Weapon[] w;



  public Army (int a){
      w = new Weapon[a];
  }

 public void addWeapon(Weapon wa){
     if (index<w.length) {
         w[index] = wa;
         index++;
     }else{
         System.out.println();
     }
 }
   public void attackAll(){
       for (int i = 0; i < w.length; i++) {
           if (w[i]!=null){
          w[i].attack();
           }
       }
   }
   public void moveAll(){
       for (int i1 = 0; i1 < w.length; i1++) {
           if (w[i1]!=null) {
               w[i1].move();
           }
       }
   }
}
