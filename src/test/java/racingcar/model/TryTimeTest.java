package racingcar.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TryTimeTest {


    @Test
    void validTrySuccess() {
        TryTime time = new TryTime(5);
    }

    @Test
    void validTryFailed() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new TryTime(-1),
                () -> "올바른 숫자가 아닙니다.");
    }

}