package baseball.game;

import baseball.numberCreator.RandomNumberCreator;

public class BaseballOpponentPlayer implements OpponentPlayer {
    private final RandomNumberCreator randomNumberCreator = new RandomNumberCreator();

    @Override
    public String playGame() {
        return randomNumberCreator.pickRandomNumberInRange();
    }
}
