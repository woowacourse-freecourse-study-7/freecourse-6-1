package baseball.game;

import baseball.numberCreator.InputNumberCreator;

public class BaseballUserPlayer implements UserPlayer {
    private final InputNumberCreator inputNumberCreator = new InputNumberCreator();

    @Override
    public String playGame() {
        return inputNumberCreator.inputeBaseballNumber();
    }

    @Override
    public boolean inputContinueGame() {
        return inputNumberCreator.inputeGameContinueNumber();
    }
}
