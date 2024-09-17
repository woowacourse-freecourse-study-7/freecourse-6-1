package model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {

    private final BaseballNumbers answer;

    private BaseballGame(BaseballNumbers answer) {
        this.answer = answer;
    }

    public static BaseballGame start() {
        return new BaseballGame(generateRandomNumbers());
    }

    public Score play(BaseballNumbers numbers) {
        return answer.evaluate(numbers);
    }

    private static BaseballNumbers generateRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!numbers.contains(randomNumber)) { //depth 리팩토링
                numbers.add(randomNumber);
            }
        }

        return new BaseballNumbers(numbers);
    }

}
