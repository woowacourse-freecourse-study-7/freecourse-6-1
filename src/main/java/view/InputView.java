package view;

import camp.nextstep.edu.missionutils.Console;
import utils.Constant;

import java.util.ArrayList;
import java.util.List;

public class InputView {

    public List<Integer> readBallNumbers() {
        System.out.println(Constant.INPUT_NUMBERS_MESSAGE);
        String input = Console.readLine();
        if (!input.matches(Constant.INPUT_NUMBER_REGEX)) {
            throw new IllegalArgumentException(Constant.ERROR_INVALID_NUMBER_MESSAGE);
        }

        List<Integer> numbers = new ArrayList<>();
        for (String ch : input.split("")) {
            numbers.add(Integer.parseInt(ch));
        }
        if (numbers.get(0).equals(numbers.get(1)) ||
            numbers.get(1).equals(numbers.get(2)) ||
            numbers.get(0).equals(numbers.get(2))) { //validator로 빼서 리팩토링
            throw new IllegalArgumentException(Constant.ERROR_DUPLICATE_NUMBER_MESSAGE);
        }
        return numbers;
    }
}
