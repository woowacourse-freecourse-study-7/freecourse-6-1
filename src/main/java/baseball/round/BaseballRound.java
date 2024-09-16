package baseball.round;

import baseball.game.BaseballOpponentPlayer;
import baseball.game.BaseballReferee;
import baseball.game.BaseballUserPlayer;

public class BaseballRound implements Round{
    private final BaseballUserPlayer baseballUserPlayer = new BaseballUserPlayer();
    private final BaseballOpponentPlayer baseballOpponentPlayer = new BaseballOpponentPlayer();
    private final BaseballReferee baseballReferee = new BaseballReferee();

    @Override
    public void playOneRound() {
        boolean isThreeStrike = false;
        String opponentPlayerNumber = baseballOpponentPlayer.playGame();

        while (!isThreeStrike) {
            System.out.println("숫자를 입력해주세요 : ");
            String userPlayerNumber = baseballUserPlayer.playGame();

            Result judgeResult = baseballReferee.judge(batterNumber, fielderNumber);



        }
    }
}
