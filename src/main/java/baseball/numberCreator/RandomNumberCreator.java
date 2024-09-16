package baseball.numberCreator;

import static baseball.utils.Constant.*;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberCreator {

    public String pickRandomNumberInRange() {
        //정수->문자열로 변환
        List<String> computer = new ArrayList<>();

        while (computer.size() < BALL_CNT) {
            int randomNum = Randoms.pickNumberInRange(MIN_BALL_NUMBER, MAX_BALL_NUMBER);
            String randomNumToString = Integer.toString(randomNum);
            if (!computer.contains(randomNumToString)) {
                computer.add(randomNumToString);
            }
        }
        return String.join("", computer);
    }
}
