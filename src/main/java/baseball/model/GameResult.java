package baseball.model;

public class GameResult {

    private final int ballCnt;
    private final int strikeCnt;

    public GameResult(int ballCnt, int strikeCnt) {
        this.ballCnt = ballCnt;
        this.strikeCnt = strikeCnt;
    }

    public boolean isSuccess(){
        return strikeCnt == 3;
    }

    public int getBallCnt(){
        return ballCnt;
    }

    public int getStrikeCnt(){
        return strikeCnt;
    }

    @Override
    public String toString() {
        return "GameResult{" +
                "ballCount=" + ballCnt +
                ", strikeCount=" + strikeCnt +
                '}';
    }
}
