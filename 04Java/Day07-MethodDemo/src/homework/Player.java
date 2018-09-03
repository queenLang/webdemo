package homework;

import java.util.Scanner;

/**
 * Created by dllo on 18/5/3.
 */
public class Player {
    public String name = "李易峰";
    public int win,lose,peace,score;
    public int fight(){
        Scanner scanner = new Scanner(System.in);
        int hand = scanner.nextInt();
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
                System.out.println("输入有误默认出拳为");
                hand = 2;
                break;
        }
        return hand ;
    }



}
