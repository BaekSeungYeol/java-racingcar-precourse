package racingcar.model;

public class BoostNumber {
    public static final int MIN_VAL = 0;
    private int no;

    public BoostNumber(int no) {
        checkNumber(no, "음수가 나와서는 안됩니다.");

        this.no = no;
    }

    private void checkNumber(int no, String message) {
        if (no < MIN_VAL) throw new IllegalArgumentException(message);
    }

    public int getNo() {
        return no;
    }

    public void increment() {
        this.no += 1;
    }
}
