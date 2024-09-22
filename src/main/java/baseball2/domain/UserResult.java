package baseball2.domain;

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
        return strikeCnt == 3;
    }
}
