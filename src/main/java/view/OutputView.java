package view;

import utils.Constant;

public class OutputView {

    public void printStartMessage() {
        System.out.println(Constant.GAME_START_MESSAGE);
    }

    public void printScoreMessage(int strikeCount, int ballCount) {
        if (strikeCount == 0 && ballCount == 0) {
            System.out.println(Constant.OUTPUT_NOTHING_MESSAGE);
            return;
        }
        printStrikeOrBall(strikeCount, ballCount);
    }

    private void printStrikeOrBall(int strikeCount, int ballCount) {
        if (strikeCount != 0) {
            System.out.print(strikeCount + Constant.OUTPUT_STRIKE_MESSAGE + " ");
        }
        if (ballCount != 0) {
            System.out.print(ballCount + Constant.OUTPUT_BALL_MESSAGE);
        }
        System.out.println();
    }

    public void printGameEndMessage() {
        System.out.println(Constant.GAME_END_MESSAGE);
    }
}
