package baseball2.view;

import baseball2.utils.PrintLine;
import baseball2.utils.Validator;
import camp.nextstep.edu.missionutils.Console;

import static baseball.utils.Constant.GAME_CONTINUE_NUMBER;

public class InputView {
    Validator validator = new Validator();

    public String inputUserNumber() {
        //입력값 받아 검증
        System.out.print(PrintLine.INPUT_USERNUMBER_LINE);
        String inputNumber = Console.readLine();
        validator.validateBaseballNumber(inputNumber);

        return inputNumber;
    }

    public boolean inputContinueGameNumber() {
        System.out.println(PrintLine.INPUT_GAMECONTINUE_LINE);
        String gameContinueNumber = Console.readLine();
        validator.validateGameContinueNumber(gameContinueNumber);

        return Integer.parseInt(gameContinueNumber) == GAME_CONTINUE_NUMBER;
    }
}
