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
        final ComputerNumber computerNumber = new ComputerNumber(); //final 넣어도 되나?

        while (!isThreeStrike) {
            UserNumber userNumber = new UserNumber(inputView.inputUserNumber());
            UserResult userResult = playGame.baseball(computerNumber.getComputerNumber(), userNumber.getUserNumber());

            outputView.printUserResult(userResult);

            isThreeStrike = userResult.isThreeStrike();
        }

        continueOrStopRound();
    }

    public void continueOrStopRound() {
        boolean continueGame = inputView.inputContinueGameNumber();

        if (continueGame) {
            playOneRound();
        } else {
            outputView.printStopRound();
        }
    }
}
