package baseball.game;

public enum GameResult3 {
    BALL(0),
    STRIKE(0);

    private int count;

    GameResult3(int count) {
        this.count = count;
    }

    public void addBallCnt() {
        BALL.count ++;
    }

    public void addStrikeCnt() {
        STRIKE.count ++;
    }

    public int getBallCnt() {
        return BALL.count;
    }

    public int getStrikeCnt() {
        return STRIKE.count;
    }

    public boolean isThreeStrike() {
        return STRIKE.count == BALL_CNT;
    }

    public void printResult() {
        String judgeResult = "";

        if (BALL.count == 0 && STRIKE.count == 0) {
            judgeResult = "낫싱";
        } else { //둘중 하나는 점수를 땄을 때
            if (BALL.count > 0) {
                judgeResult += BALL.count + "볼 ";
            }
            if (STRIKE.count > 0) {
                judgeResult += STRIKE.count + "스트라이크";

                if (isThreeStrike()) {
                    judgeResult += "\n3개의 숫자를 모두 맞히셨습니다! 게임 종료";
                }
            }
        }

        System.out.println(judgeResult);
    }
}
