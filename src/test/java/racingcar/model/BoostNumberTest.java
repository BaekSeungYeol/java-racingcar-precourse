package racingcar.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.BoostNumber;

public class BoostNumberTest {

    @Test
    @DisplayName("전진을_위한_부스트_넘버_생성 성공")
    void createRandomNumberSuccess() {
        BoostNumber boastNumber = new BoostNumber(9);
    }

    @Test
    @DisplayName("전진을_위한_부스트_넘버_생성 실패")
    void createRandomNumberFailed() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new BoostNumber(-1),
                () -> "음수가 나와서는 안됩니다.");
    }
}
