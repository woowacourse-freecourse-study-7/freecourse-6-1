package baseball2.domain;

import static baseball2.utils.Constant.BALL_CNT;

public class UserResult {

    private int ballCnt;
    private int strikeCnt;

    public int getBallCnt() {
        return ballCnt;
    }

    public int getStrikeCnt() {
        return strikeCnt;
    }

    public void addStrikeCnt() {
        strikeCnt++;
    }

    public void addBallCnt() {
        ballCnt++;
    }

    public boolean isThreeStrike() {
        return strikeCnt == BALL_CNT;
    }
}
