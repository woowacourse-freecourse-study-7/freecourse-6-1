package baseball.game;

import baseball.numberCreator.RandomNumberCreator;

public class BaseballOpponentPlayer {
    private final RandomNumberCreator randomNumberCreator = new RandomNumberCreator();

    public String playGame() {
        return randomNumberCreator.pickRandomNumberInRange();
    }
}
