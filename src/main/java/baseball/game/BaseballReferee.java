package baseball.game;

public class BaseballReferee {
    private final BaseballJudgeRull baseballJudgeRull = new BaseballJudgeRull();

    public GameResult judge(String userPlayerNumber, String opponentPlayerNumber) {
        GameResult gameResult = new GameResult();

        for (String num: userPlayerNumber.split("")) {
            NumberState numberState = baseballJudgeRull.checkGameState(num, userPlayerNumber.indexOf(num), opponentPlayerNumber);
            switch (numberState) {
                case STRIKE:
                    gameResult.addStrikeCnt();
                    break;
                case BALL:
                    gameResult.addBallCnt();
                    break;
            }
        }
        return gameResult;
    }
}
