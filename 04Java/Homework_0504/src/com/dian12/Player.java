package com.dian12;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by dllo on 18/5/4.
 */
public class Player {
    private int score, count = 0;

    public int win, lose, peace;

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

    public int fight() {
        count++;
        if (count < 6) {
            int num = new Random().nextInt(10) + 1;
            System.out.println("当前的牌是" + num);
            score += num;
            System.out.println("您当前的总点数为" + score);
        }
        if (score < 22 && count < 6) {
            System.out.println("是否继续要牌Y/N");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            if (str.equals("Y")) {
                fight();
            } else {
                System.out.println("下面电脑要开始发牌了");
            }


        } else if (count > 5) {
            System.out.println("您的机会用完了");
        } else if (score > 21) {
            System.out.println("您当前点数是" + score);
            System.out.println("您的点数爆了");
        }
        return score;
    }
}

