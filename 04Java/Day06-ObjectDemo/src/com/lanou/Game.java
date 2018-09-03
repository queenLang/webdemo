package com.lanou;

/**
 * Created by dllo on 18/5/2.
 */
public class Game {
    private AloneGame aloneGame;
    private InternetGame internetGame;

    public AloneGame getAloneGame() {
        return aloneGame;
    }

    public void setAloneGame(AloneGame aloneGame) {
        this.aloneGame = aloneGame;
    }

    public InternetGame getInternetGame() {
        return internetGame;
    }

    public void setInternetGame(InternetGame internetGame) {
        this.internetGame = internetGame;
    }
}
