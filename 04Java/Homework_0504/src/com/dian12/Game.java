package com.dian12;

import java.util.Scanner;

/**
 * Created by dllo on 18/5/4.
 */
public class Game {
    private Computer computer;
    private Player player;
     public Game(){
         computer = new Computer();
         player = new Player();
     }
     public void pk(int p , int c){
         if ((p > c && p < 22 && c < 22) || (p < 22 && c > 21)){
            player.win+= 1;
             computer.lose += 1;
             player.peace += 0;
             computer.peace += 0;
             System.out.println("您获胜了");
         }

         else if ((p < c && p < 22 && c < 22) || (c < 22 && p > 21)) {
             player.lose += 1;
             computer.win += 1;
             player.peace += 0;
             computer.peace += 0;
             System.out.println("电脑获胜了");
         }

         else if ((p == c && p < 22 && c < 22) || (p > 21 && c > 21)) {
             player.peace += 1;
             computer.peace +=1;
             System.out.println("平局");

         }
     }
     public void circlePk (){
         int p = player.fight();
         int c = computer.fight();
         pk(p,c);
         System.out.println("是否继续下一轮比拼Y/N");
         Scanner scanner = new Scanner(System.in);
         String str = scanner.nextLine();
         if (str.equals("Y")){
             //清零操作
             player.setScore(0);
             player.setCount(0);
             computer.setScore(0);
             computer.setCount(0);
             circlePk();
         }else {
             showResult();
         }


     }

    private void showResult() {
        System.out.println("游戏结束");
        System.out.println("玩家胜利场数"+player.win
                +"玩家负局场数"
                +player.lose
                +"玩家平局场数"
                +player.peace );
        System.out.println("电脑胜利场数"
                +computer.win
                +"电脑负局场数"
                +computer.lose
                +"电脑平局场数"
                +computer.peace );
    }

}

