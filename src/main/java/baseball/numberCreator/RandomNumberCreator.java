package baseball.numberCreator;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberCreator {

    public String pickRandomNumberInRange() {
        //정수->문자열로 변환하여 내 값, 상대값 모두 문자열로 탐색
        List<String> computer = new ArrayList<>();

        while (computer.size() < BALL_CNT) {
            int randomNum = Randoms.pickNumberInRange(Constant.MIN_BALL_NUMBER, Constant.MAX_BALL_NUMBER);
            String randomNumToString = Integer.toString(randomNum);
            if (!computer.contains(randomNumToString)) {
                computer.add(randomNumToString);
            }
        }
        return String.join("", computer);
    }
}
