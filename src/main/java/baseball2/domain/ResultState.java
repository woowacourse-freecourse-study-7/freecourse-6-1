package baseball2.domain;

public enum ResultState {
    BALL, STRIKE, OUT;

    public static ResultState getResultState(String userNumber, int userNumberIdx, String computerNumber) {
        if (computerNumber.contains(userNumber)) {
            if (computerNumber.indexOf(userNumber) == userNumberIdx) {
                return STRIKE;
            } else {
                return BALL;
            }
        } else {
            return OUT;
        }
    }
}
