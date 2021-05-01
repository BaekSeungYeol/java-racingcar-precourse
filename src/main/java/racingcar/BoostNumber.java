package racingcar;

public class BoostNumber {
    public static final int MIN_VAL = 0;
    public static final int MAX_VAL = 9;
    private int no;
    public BoostNumber(int no) {
        checkArgument(no, "0에서 9사이의 숫자여야 합니다.");

        this.no = no;
    }

    private void checkArgument(int no, String message) {
        if(no < MIN_VAL || no > MAX_VAL)  throw new IllegalArgumentException(message);
    }
}
