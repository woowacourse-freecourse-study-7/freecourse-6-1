package baseball;

import controller.BaseballGameController;
import view.InputView;
import view.OutputView;

public class Application {
    public static void main(String[] args) {
        BaseballGameController gameController = new BaseballGameController(new InputView(), new OutputView());
        gameController.execute();
    }
}
