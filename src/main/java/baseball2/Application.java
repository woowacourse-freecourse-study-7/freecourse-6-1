package baseball2;

import baseball2.controller.BaseballGame;

public class Application {

    public static void main(String[] args) {

        BaseballGame baseballGame = new BaseballGame();
        baseballGame.playOneRound();
    }
}
