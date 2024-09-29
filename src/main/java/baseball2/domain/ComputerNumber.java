package baseball2.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static baseball2.utils.Constant.*;

public class ComputerNumber {

    private String computerNumber;

    //최초값 이후 변경 못하도록 잠그면 좋겠음.
    public ComputerNumber() {
        this.computerNumber = pickRandomNumberInRange();
    }

    public String getComputerNumber() {
        return computerNumber;
    }

    private String pickRandomNumberInRange() { //접근제어자로 내부 메서드임을 선언
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
