package baseball.validator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UserNumbersValidator {
    private final static int INPUT_LENGTH = 3;
    private final static int MIN_NUMBER = 1;
    private final static int MAX_NUMBER = 9;
    private final static String DUPLICATED_NUMBER_ERROR_MESSAGE = "중복된 숫자를 입력하셨습니다.";
    private final static String INVALID_NUMBER_LENGTH_ERROR_MESSAGE = "입력 길이는 3자리여야 합니다.";
    private final static String NON_NUMERIC_ERROR_MESSAGE = "숫자가 아닙니다";
    private final static String INVALID_RANGE_ERROR_MESSAGE = "1~9 사이의 수가 아닙니다";

    public static void validateDuplicateNumber(String input){
        String[] numbers = input.split("");

        Set<String> numberSet = new HashSet<>(Arrays.asList(numbers));

        if(numbers.length != numberSet.size()){
            throw new IllegalArgumentException(DUPLICATED_NUMBER_ERROR_MESSAGE);
        }
    }

    public static void validateInputLength(String input){
        if(input.length() != INPUT_LENGTH){
            throw new IllegalArgumentException(INVALID_NUMBER_LENGTH_ERROR_MESSAGE);
        }
    }

    public static void validateNumber(String input){
        try{
            Integer.parseInt(input);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException(NON_NUMERIC_ERROR_MESSAGE);
        }
    }

    public static void validateNumberRange(String input){
        boolean isNumeric = true;

        for(char ch : input.toCharArray()){
            int digit = Character.getNumericValue(ch);
            if(digit < MIN_NUMBER || digit > MAX_NUMBER){
                throw new IllegalArgumentException(INVALID_RANGE_ERROR_MESSAGE);
            }
        }
    }
}
