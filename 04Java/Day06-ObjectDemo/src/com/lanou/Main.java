package com.lanou;

/**
 * Created by dllo on 18/5/2.
 */
public class Main {
    public static void main(String[] args) {
        AloneGame aloneGame = new AloneGame();
        aloneGame.setName("鬼泣");
        aloneGame.setType("动作RPG");
        InternetGame internetGame = new InternetGame();
        internetGame.setName("绝地求生");
        internetGame.setType("第三人称射击");
        Game game = new Game();
        game.setAloneGame(aloneGame);
        //通过game对象打印出单机游戏的名字类型以及网络游戏的名字类型
        System.out.println(game.getAloneGame().getName());
        System.out.println(game.getAloneGame().getType());
        System.out.println(game.getInternetGame().getName());
        System.out.println(game.getInternetGame().getType());
    }
}
