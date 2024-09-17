package baseball.controller;

import baseball.model.GameResult;
import baseball.model.Numbers;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.Objects;

public class BaseBallGame {

    private static Numbers computerNumbers;

    public void gameStart(){
        do{
            initComputerNumbers();
            play();
        }while(replay());
    }

    private void initComputerNumbers(){
        computerNumbers = new Numbers();
    }

    private void play(){
        GameResult result;
        do{
            Numbers userNumbers= InputView.setUserNumber();
            result=userNumbers.compareToNumbers(computerNumbers);
            OutputView.printResult(result);
        }while(!result.isSuccess());
        OutputView.printGameSuccess();
    }

    private boolean replay() {
        return Objects.equals(InputView.setReplay(), 1);
    }
}
