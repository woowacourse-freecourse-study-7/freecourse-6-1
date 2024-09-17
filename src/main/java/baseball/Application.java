package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static baseball.validator.GameRestartNumberValidator.validateRestartNumber;
import static baseball.validator.UserNumbersValidator.*;

public class Application {
    private final static String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private final static String INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
    private final static String GAME_RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private final static String EXIT_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    private final static int NUMBER_LENGTH = 3;
    private final static int MIN_NUMBER = 1;
    private final static int MAX_NUMBER = 9;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        boolean playAgain = true;

        while (playAgain) {
            playGame();
            playAgain = wannaPlayAgain();
        }
    }

    private static void playGame() throws IOException {
        System.out.println(GAME_START_MESSAGE);
        List<Integer> computerNumbers = createComputerNumber();     //컴퓨터 난수 생성

        while (true) {
            List<Integer> userNumbers = inputView();
            int[] result = checkAnswerCorrect(userNumbers, computerNumbers);    //정답체크

            if (printResult(result))     //정답이면
                break;
        }
    }

    private static List<Integer> createComputerNumber() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < NUMBER_LENGTH) { //숫자가 아직 3개 다 채워지지 않았다면
            int randomNumber = Randoms.pickNumberInRange(1, 9); //1에서 9까지 서로 다른 임의의 수 선택
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    public static List<Integer> inputView() throws IOException {
        System.out.print(INPUT_NUMBER_MESSAGE);
        String input = br.readLine();

        validateNumber(input);
        validateInputLength(input);
        validateDuplicateNumber(input);
        validateNumberRange(input);

        return parseInput(input);
    }

    private static List<Integer> parseInput(String input){  //값 할당하기
        String[] line = input.split("");
        List<Integer> user = new ArrayList<>(NUMBER_LENGTH);
        for(String s : line){
            user.add(Integer.parseInt(s));
        }
        return user;
    }

    private static int[] checkAnswerCorrect(List<Integer> user, List<Integer> computer) {
        int balls = 0;
        int strikes = 0;
        int[] result = new int[2];
        for (int i = 0; i < NUMBER_LENGTH; i++) {
            if (computer.get(i).equals(user.get(i))) {
                strikes += 1;
            } else if (computer.contains(user.get(i))) {
                balls += 1;
            }
        }
        return new int[]{balls,strikes};
    }

    private static boolean printResult(int[] result) {
        int balls = result[0];
        int strikes = result[1];

        if (balls ==0 && strikes ==0) {
            System.out.print("낫싱");
        }
        else {
            if (balls > 0) {
                System.out.print(result[0] + "볼 ");
            }
            if (strikes > 0) {
                System.out.print(result[1] + "스트라이크");
            }
            System.out.println();
        }

        if (strikes == NUMBER_LENGTH) {
            System.out.println(EXIT_MESSAGE);
            return true;
        }
        return false;
    }

    static boolean wannaPlayAgain() throws IOException {
        System.out.println(GAME_RESTART_MESSAGE);
        String try_message = br.readLine();

        return validateRestartNumber(try_message);
    }
}