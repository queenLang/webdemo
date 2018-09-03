package homework;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by dllo on 18/5/3.
 */
public class Computer {

    public String name;
    public int win, lose, peace, score;

    public int fight(String name) {
        int hand = new Random().nextInt(3) + 1;
        switch (hand) {
            case 1:
                System.out.println(name+"玩家出拳:剪刀");
                break;
            case 2:
                System.out.println(name+"玩家出拳:石头");
                break;
            case 3:
                System.out.println(name+"玩家出拳:布");
                break;
            default:
                System.out.println("请输入正确的数字");
                break;
        }
      return hand;
    }

}