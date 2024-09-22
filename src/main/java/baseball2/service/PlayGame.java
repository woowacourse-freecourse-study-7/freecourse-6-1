package baseball2.service;

import baseball2.domain.ResultState;
import baseball2.domain.UserResult;

public class PlayGame {

    public UserResult baseball(String computerNumber, String userNumber) {
        UserResult userResult = new UserResult();

        for (String num: userNumber.split("")) {
            ResultState resultState = checkGameState(num, userNumber.indexOf(num), computerNumber);
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

    //REsultstate 안에 넣으면 좋을듯.
    private ResultState checkGameState(String userNumber, int userNumberIdx, String computerNumber) {
        if (computerNumber.contains(userNumber)) {
            if (computerNumber.indexOf(userNumber) == userNumberIdx) {
                return ResultState.STRIKE;
            } else {
                return ResultState.BALL;
            }
        } else {
            return ResultState.OUT;
        }
    }
}
