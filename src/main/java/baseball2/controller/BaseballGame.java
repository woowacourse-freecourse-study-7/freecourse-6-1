package baseball2.controller;

import baseball2.domain.ComputerNumber;
import baseball2.domain.UserNumber;
import baseball2.domain.UserResult;
import baseball2.service.PlayGame;
import baseball2.view.InputView;
import baseball2.view.OutputView;

public class BaseballGame {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final PlayGame playGame = new PlayGame();

    public void playOneRound() {
        boolean isThreeStrike = false;
        ComputerNumber computerNumber = new ComputerNumber();

        while (!isThreeStrike) {
            UserNumber userNumber = new UserNumber(inputView.inputUserNumber());
            UserResult userResult = playGame.baseball(computerNumber.getComputerNumber(), userNumber.getUserNumber());

            outputView.printUserResult(userResult);

            isThreeStrike = userResult.isThreeStrike();
        }

        continueOrStopRound();
    }

    public void continueOrStopRound() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        boolean continueGame = inputView.inputContinueGameNumber();

        if (continueGame) {
            playOneRound();
        } else {
            System.out.println("게임을 종료합니다.");
        }
    }
}
