package baseball2.service;

import baseball2.domain.ResultState;
import baseball2.domain.UserResult;

public class PlayGame {

    public UserResult baseball(String computerNumber, String userNumber) {
        UserResult userResult = new UserResult();

        for (String num: userNumber.split("")) {
            ResultState resultState = ResultState.getResultState(num, userNumber.indexOf(num), computerNumber);
            switch (resultState) {
                case STRIKE:
                    userResult.addStrikeCnt();
                    break;
                case BALL:
                    userResult.addBallCnt();
                    break;
            }
        }
        return userResult;
    }
}
