package baseball.model;

import java.util.ArrayList;
import java.util.List;

import static baseball.validator.NumbersValidator.*;

public class Numbers {

    private List<Integer> numbers;

    //컴퓨터 수
    public Numbers(){
        ComputerNumbers computerNumbers = new ComputerNumbers();
        this.numbers =computerNumbers.generate();
    }

    //User 수
    public Numbers(String input){
        validateNonNumeric(input);
        validateDigit(input);
        validateDuplicateNumber(input);
        validateRange(input);

        this.numbers=StringToIntNumbers(input);
    }

    private List<Integer> StringToIntNumbers(String input){
        ArrayList<Integer> intNumbers = new ArrayList<>();
        for(char c:input.toCharArray()){
            intNumbers.add(Character.getNumericValue(c));
        }
        return intNumbers;
    }

    public GameResult compareToNumbers(Numbers inputNumbers) {
        return new GameResult(countBall(inputNumbers), countStrike(inputNumbers));
    }

    private boolean isStrike(int number,int position){
        return position==numbers.indexOf(number);
    }

    private boolean isBall(int number,int position){
        return position!=numbers.indexOf(number)&&numbers.contains(number);
    }
    private int countBall(Numbers inputNumbers) {
        int ball = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (inputNumbers.isBall(numbers.get(i), i)) {
                ball++;
            }
        }
        return ball;
    }

    private int countStrike(Numbers inputNumbers) {
        int strike = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (inputNumbers.isStrike(numbers.get(i), i)) {
                strike++;
            }
        }
        return strike;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "numbers=" + numbers +
                '}';
    }
}
