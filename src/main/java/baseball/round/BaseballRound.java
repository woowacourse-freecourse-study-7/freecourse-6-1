package baseball.round;

import baseball.game.*;

public class BaseballRound implements Round{
    private final BaseballUserPlayer baseballUserPlayer = new BaseballUserPlayer();
    private final BaseballOpponentPlayer baseballOpponentPlayer = new BaseballOpponentPlayer();
    private final BaseballReferee baseballReferee = new BaseballReferee();

    @Override
    public void playOneRound() {
        boolean isThreeStrike = false;
        String opponentPlayerNumber = baseballOpponentPlayer.playGame();

        while (!isThreeStrike) {
            System.out.print("숫자를 입력해주세요 : ");
            String userPlayerNumber = baseballUserPlayer.playGame();
            GameResult gameResult = baseballReferee.judge(userPlayerNumber, opponentPlayerNumber);

            gameResult.printResult();

            isThreeStrike = gameResult.isThreeStrike();
        }

        continueOrStopRound();
    }

    @Override
    public void continueOrStopRound() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        boolean continueGame = baseballUserPlayer.inputContinueGame();

        if (continueGame) {
            playOneRound();
        } else {
            System.out.println("게임을 종료합니다.");
        }
    }
}
