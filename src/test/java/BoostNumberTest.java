import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.BoostNumber;

public class BoostNumberTest {

    @Test
    @DisplayName("전진을_위한_랜덤_숫자_0_9_생성 성공")
    void createRandomNumberSuccess() {
        BoostNumber boastNumber = new BoostNumber(9);
    }

    @Test
    @DisplayName("전진을_위한_랜덤_숫자_0_9_생성 실패")
    void createRandomNumberFailed() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new BoostNumber(11),
                () -> "0에서 9사이의 숫자여야 합니다.");
    }
}
