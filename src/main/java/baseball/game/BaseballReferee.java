package baseball.game;

public class BaseballReferee {
    private final BaseballJudgeRull baseballJudgeRull = new BaseballJudgeRull();

    public GameResult judge(String userPlayerNumber, String opponentPlayerNumber) {
        GameResult gameResult = new GameResult();

        for (String num: userPlayerNumber.split("")) {
            GameState gameState = baseballJudgeRull.checkGameState(num, userPlayerNumber.indexOf(num), opponentPlayerNumber) {
                switch (gameState) {
                    case STRIKE:
                        gameResult.addStrikeCnt();
                    case BALL:
                        gameResult.addBallCnt();
                }
            }
        }
        return gameResult;
    }
}
