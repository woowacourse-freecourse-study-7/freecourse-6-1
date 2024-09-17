package baseball.view;

import baseball.model.GameResult;

import java.util.ArrayList;

public class OutputView {
    private static final String BALL_MESSAGE = "%d볼";
    private static final String STRIKE_MESSAGE = "%d스트라이크";
    private static final String NOTHING_MESSAGE = "낫싱";

    public static void printResult(GameResult gameResult){
        int ballCnt=gameResult.getBallCnt();
        int strikeCnt=gameResult.getStrikeCnt();

        ArrayList<String> result=new ArrayList<>();
        if (ballCnt == 0 && strikeCnt == 0) result.add(NOTHING_MESSAGE);
        if (ballCnt != 0) result.add(String.format(BALL_MESSAGE, ballCnt));
        if (strikeCnt != 0) result.add(String.format(STRIKE_MESSAGE, strikeCnt));

        System.out.println(String.join(" ", result));
    }


    public static void printGameSuccess(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
