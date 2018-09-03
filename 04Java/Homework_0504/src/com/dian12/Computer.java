package com.dian12;

import java.util.Random;

/**
 * Created by dllo on 18/5/4.
 */
public class Computer {
   public int win,lose, peace;
    private int score,count;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public int fight(){
       count ++;
        if (count<6){
          int num = new Random().nextInt(10)+1;
            System.out.println("电脑当前点数"+num);
            score+=num;
            System.out.println("电脑当前总点数是"+score);

        }
        if (21-score>5&&count<6){
            fight();
        }else if (21-score<=5&&count<6&& score<22){
            System.out.println("电脑停止要牌");
        }else if (score>21){
            System.out.println("电脑当前点数为"+score);
            System.out.println("电脑爆点了");
        }else if (count>5){
            System.out.println("电脑的机会用完了");
        }
        return score;
    }
}
