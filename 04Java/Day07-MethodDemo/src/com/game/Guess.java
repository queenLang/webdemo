package com.game;

import java.util.Scanner;

/**
 * Created by dllo on 18/5/3.
 */
public class Guess {
    public void guess(int a){
        int count = 0;
        System.out.println("请输入一个数字");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >a ){
            System.out.println("大了");
            guess(a);
        }else if(num<a ){
            System.out.println("小了");
            guess(a );

        }else{
            System.out.println("恭喜你猜对了");
            System.out.println("共进行了"+count+ "次");
        }
    }
}
