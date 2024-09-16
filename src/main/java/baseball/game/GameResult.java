package baseball.game;

public class GameResult {
    private int ballCnt;
    private int strikeCnt;

    public void addStrikeCnt() {
        strikeCnt++;
    }

    public void addBallCnt() {
        ballCnt++;
    }

    public boolean isThreeStrike() {
        return strikeCnt == 3;
    }

    public void printResult() {
        String judgeResult = "";

        if (ballCnt == 0 && strikeCnt == 0) {
            judgeResult = "낫싱";
        } else { //둘중 하나는 점수를 땄을 때
            if (ballCnt > 0) {
                judgeResult += ballCnt + "볼 ";
            }
            if (strikeCnt > 0) {
                judgeResult += strikeCnt + "스트라이크";

                if (isThreeStrike()) {
                    judgeResult += "\n3개의 숫자를 모두 맞히셨습니다! 게임 종료";
                }
            }
        }
        System.out.println(judgeResult);
    }
}
