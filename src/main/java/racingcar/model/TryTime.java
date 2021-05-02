package racingcar.model;

public class TryTime {

    private final int time;

    public TryTime(int tryTime) {
        checkTryNumber(tryTime, "올바른 숫자가 아닙니다.");

        this.time = tryTime;
    }

    private void checkTryNumber(Integer tryNumber, String message) {
        if (tryNumber < 0) throw new IllegalArgumentException(message);
    }

    public int getTime() {
        return time;
    }
}
