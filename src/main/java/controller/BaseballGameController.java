package controller;

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

    public void execute() {
        while (true) { //리팩토링
            startGame();
        }
    }

    private void startGame() {
        outputView.printStartMessage();
        while (true) { //리팩토링
            try { //indent depth2 리팩토링
                List<Integer> numbers = inputView.readBallNumbers();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

