package racingcar.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarNameTest {

    @Test
    @DisplayName("알파벳_영어_체크")
    void validAlp() {
        char alp = 'a';
        CarName.validAlp(alp,"이름은 영어여야 합니다.");
    }

    @Test
    @DisplayName("영어_이름_체크")
    void validNameSuccess() {
        String name = "seungyeol";
        CarName carName = new CarName(name);
    }
    @Test
    @DisplayName("영어_이름_체크_실패")
    void validNameFailed() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new CarName("1234"),
                () -> "이름은 영어여야 합니다.");
    }


}
