package baseball.numberCreator;

import static baseball.utils.Constant.*;

public class Validation {
    public void validateBaseballNumber(String number) {

        class BaseballNumberValidation {

            private boolean isCorrectLength() {
                return number.length() == BALL_CNT;
            }
            private boolean isNotDuplicated() {
                for (int i=0; i<number.length(); i++) {
                    for (int j=0; j<number.length(); j++) {
                        if (number.charAt(i) == number.charAt(j) && i != j) {
                            return false;
                        }
                    }
                }
                return true;
            }
            private boolean isNumberFromOneToNine() {
                for (int i=0; i<BALL_CNT; i++) {
                    if ((int) number.charAt(i) < 49 || (int) number.charAt(i) > 57) {
                        return false;
                    }
                }
                return true;
            }
        }

        BaseballNumberValidation baseballNumberValidation = new BaseballNumberValidation();
        /**
         * 잘못된 값인 경우
         * 1. 중복된 숫자가 있을 때
         * 2. 3자리가 아닐때
         * 3. 1~9의 숫자가 아닐때 - 아스키코드 확인 => 보류
         */
        if (!baseballNumberValidation.isCorrectLength()
                || !baseballNumberValidation.isNotDuplicated()
                || !baseballNumberValidation.isNumberFromOneToNine()) {
            throw new IllegalArgumentException("잘못된 값입니다. 값은 1~9 사이 서로다른 숫자 3개로 이루어져야 합니다. 게임을 종료합니다.");
        }
    }

    public void validateGameContinueNumber(String number) {
        class GameContinueNumberValidation {
            private boolean isCorrectNumber() {
                return Integer.parseInt(number) == GAME_CONTINUE_NUMBER || Integer.parseInt(number) == GAME_STOP_NUMBER;
            }
        }

        /**
         * 잘못된 값인 경우
         * 1. 1 또는 2가 아닐때
         */
        GameContinueNumberValidation gameContinueNumberValidation = new GameContinueNumberValidation();
        if (!gameContinueNumberValidation.isCorrectNumber()) {
            throw new IllegalArgumentException("잘못된 값입니다. 값은 1 또는 2여야 합니다. 게임을 종료합니다.");
        }
    }
}
