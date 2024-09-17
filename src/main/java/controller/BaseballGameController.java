package controller;

import camp.nextstep.edu.missionutils.Console;
import model.BaseballGame;
import model.BaseballNumbers;
import model.Command;
import model.Score;
import utils.Constant;
import view.InputView;
import view.OutputView;

import java.util.List;

public class BaseballGameController {

    private final InputView inputView;
    private final OutputView outputView;

    public BaseballGameController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        outputView.printStartMessage();
        do{
            startGame();
            System.out.println(Constant.GAME_RESTART_MESSAGE);
        }while(Command.findByValue(Console.readLine()) == Command.RESTART);
    }

    private void startGame() {
        BaseballGame baseballGame = BaseballGame.start();
        while (true) { //리팩토링
            try { //indent depth2 리팩토링
                List<Integer> numbers = inputView.readBallNumbers();
                Score score = baseballGame.play(new BaseballNumbers(numbers));
                outputView.printScoreMessage(score.getStrikeCount(), score.getBallCount());
                if (gameEndCommand(score)) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private boolean gameEndCommand(Score score) {
        if (score.checkGameEnd()) {
            outputView.printGameEndMessage();
            return true;
        }
        return false;
    }
}

