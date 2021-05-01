import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.model.Arena;
import racingcar.model.BoostNumber;

public class ArenaTest {


    @Test
    void validTrySuccess() {
        Arena arena = new Arena(5);
    }

    @Test
    void validTryFailed() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Arena(-1),
                () -> "올바른 숫자가 아닙니다.");
    }
}
