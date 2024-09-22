package baseball2.view;

import baseball2.domain.UserResult;

import static baseball2.utils.PrintLine.*;

public class OutputView {

    public void printUserResult(UserResult userResult) {
        String judgeResult = "";
        int ballCnt = userResult.getBallCnt();
        int strikeCnt = userResult.getStrikeCnt();

        if (ballCnt == 0 && strikeCnt == 0) {
            judgeResult = "낫싱";
        } else { //둘중 하나는 점수를 땄을 때
            if (ballCnt > 0) {
                judgeResult += ballCnt + "볼 ";
            }
            if (strikeCnt > 0) {
                judgeResult += strikeCnt + "스트라이크";

                if (userResult.isThreeStrike()) {
                    judgeResult += "\n" + GAME_CLEAR_LINE;
                }
            }
        }
        System.out.println(judgeResult);
        System.out.println();
    }

    public void printStopRound() {
        System.out.println(ROUND_STOP_LINE);
    }


}
