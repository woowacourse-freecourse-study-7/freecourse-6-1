package baseball.game;

public class BaseballJudgeRull {

    public GameState checkGameState(String userNumber, int userNumberIdx, String opponentNumber) {
        if (opponentNumber.contains(userNumber)) {
            if (opponentNumber.indexOf(userNumber) == userNumberIdx) {
                return GameState.STRIKE;
            } else {
                return GameState.BALL;
            }
        } else {
            return GameState.NOTHING;
        }
    }
}
