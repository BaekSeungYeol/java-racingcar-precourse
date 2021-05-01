package racingcar.model;

public class Arena {

    private final int tryNumber;

    public Arena(int tryNumber) {
        checkTryNumber(tryNumber, "올바른 숫자가 아닙니다.");

        this.tryNumber = tryNumber;
    }



    private void checkTryNumber(Integer tryNumber, String message) {
        if(tryNumber < 0) throw new IllegalArgumentException(message);

    }
}
