package baseball.numberCreator;

import static baseball.utils.Constant.*;
import camp.nextstep.edu.missionutils.Console;

public class InputNumberCreator {
    Validation validation = new Validation();

    public String inputeBaseballNumber() {
        //입력값 받아 검증
        String inputNumber = Console.readLine();
        validation.validateBaseballNumber(inputNumber);

        return inputNumber;
    }

    public boolean inputeGameContinueNumber() {
        String gameContinueNumber = Console.readLine();
        validation.validateGameContinueNumber(gameContinueNumber);

        return Integer.parseInt(gameContinueNumber) == GAME_CONTINUE_NUMBER;
    }
}
