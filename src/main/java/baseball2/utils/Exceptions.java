package baseball2.utils;

public enum Exceptions {

    WRONG_USER_NUMBER("잘못된 값입니다. 값은 1~9 사이 서로다른 숫자 3개로 이루어져야 합니다. 게임을 종료합니다."),
    WRONG_GAME_CONTINUE_NUMBER("잘못된 값입니다. 값은 1 또는 2여야 합니다. 게임을 종료합니다.");

    private final String msg;

    Exceptions(String msg) {
        this.msg = msg;
    }
}
