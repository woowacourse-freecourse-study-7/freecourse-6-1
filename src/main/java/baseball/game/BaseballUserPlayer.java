package baseball.game;

import baseball.numberCreator.InputNumberCreator;

public class BaseballUserPlayer {
    private final InputNumberCreator inputNumberCreator = new InputNumberCreator();

    public String playGame() {
        return inputNumberCreator.inputeBaseballNumber();
    }

    public boolean inputContinueGame() {
        return inputNumberCreator.inputeGameContinueNumber();
    }
}
