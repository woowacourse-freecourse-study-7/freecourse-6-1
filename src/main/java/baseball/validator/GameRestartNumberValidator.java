package baseball.validator;

public class GameRestartNumberValidator {
    private final static String INVALID_RESTART_NUMBER_ERROR_MESSAGE = "1 또는 2를 입력해주세요";

    public static boolean validateRestartNumber(String input){
        if(!input.equals("1") && !input.equals("2")){
            throw new IllegalArgumentException(INVALID_RESTART_NUMBER_ERROR_MESSAGE);
        }
        else return input.equals("1");
    }
}
