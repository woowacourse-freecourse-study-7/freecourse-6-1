package model;

import java.util.List;

public class BaseballNumbers {

    private final List<Integer> numbers;

    public BaseballNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Score evaluate(BaseballNumbers baseballNumbers) {
        int strikeCount = 0;
        int ballCount = 0;
        for (int order = 0; order < 3; order++) {
            if (numbers.get(order).equals(baseballNumbers.numbers.get(order))) {
                strikeCount++;
                continue;
            }
            if (baseballNumbers.numbers.contains(numbers.get(order))) {
                ballCount++;
            }
        }
        return new Score(strikeCount, ballCount);
    }
}
