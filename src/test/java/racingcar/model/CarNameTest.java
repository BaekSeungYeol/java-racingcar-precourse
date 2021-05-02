package racingcar.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarNameTest {

    @Test
    void validAlp() {
        char alp = 'a';
        CarName.validAlp(alp,"이름은 영어여야 합니다.");
    }

    @Test
    void validNameSuccess() {
        String name = "seungyeol";
        CarName carName = new CarName(name);
    }
    @Test
    void validNameFailed() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new CarName("1234"),
                () -> "이름은 영어여야 합니다.");
    }


}
