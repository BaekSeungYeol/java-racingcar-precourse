package racingcar.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TryTimeTest {


    @Test
    @DisplayName("올바른_횟수_입력")
    void validTrySuccess() {
        TryTime time = new TryTime(5);
    }

    @Test
    @DisplayName("올바르지않는_횟수_입력")
    void validTryFailed() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new TryTime(-1),
                () -> "올바른 숫자가 아닙니다.");
    }

}