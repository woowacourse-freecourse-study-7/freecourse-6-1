package model;

public class Score {

    private final int strikeCount;
    private final int ballCount;

    public Score(int strikeCount, int ballCount) {
        validate(strikeCount, ballCount);
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public boolean checkGameEnd() {
        return strikeCount == 3;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    private void validate(int strike, int ball) {
        checkCountRange(strike, ball);
        checkTotalCount(strike, ball);
    }

    private void checkCountRange(int strike, int ball) {
        if (strike < 0 || strike > 3 || ball < 0 || ball > 3) {
            throw new IllegalArgumentException("스트라이크와 볼은 0 이상 3 이하의 값이어야 합니다.");
        }
    }

    private void checkTotalCount(int strike, int ball) {
        if (strike + ball > 3) {
            throw new IllegalArgumentException("스트라이크와 볼의 합은 3 이하여야 합니다.");
        }
    }
}
