package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    @DisplayName("전진_하는_조건의_숫자가_4이상")
    void GoBoostNumber() {
        int randomNumber = 4;
        Car car = new Car("seung", 0);
        car.updateBoostNumber(randomNumber);
        assertThat(car.getNumber()).isEqualTo(1);
    }

    @Test
    @DisplayName("전진_하는_조건의_숫자가_4미만")
    void StopBoostNumber() {
        int randomNumber = 3;
        Car car = new Car("seung", 0);
        car.updateBoostNumber(randomNumber);
        assertThat(car.getNumber()).isEqualTo(0);
    }

}
