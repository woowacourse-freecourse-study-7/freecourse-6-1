package baseball.game;

public class BaseballJudgeRull {

    public NumberState checkGameState(String userNumber, int userNumberIdx, String opponentNumber) {
        if (opponentNumber.contains(userNumber)) {
            if (opponentNumber.indexOf(userNumber) == userNumberIdx) {
                return NumberState.STRIKE;
            } else {
                return NumberState.BALL;
            }
        } else {
            return NumberState.NOTHING;
        }
    }
}
