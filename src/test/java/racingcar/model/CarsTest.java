package racingcar.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {


    @Test
    @DisplayName("자동차_이름_중복_여부_테스트_성공")
    void duplicateCarNamesSuccess() {
        String list = "seung,hi,baek";
        Cars cars = new Cars(list);
    }

    @Test
    @DisplayName("자동차_이름_중복_여부_테스트_실패")
    void duplicateCarNamesFailed() {
        String list = "seung,hi,seung";

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Cars(list),
                "중복된 이름 입니다.");

    }

    @Test
    @DisplayName("자동차_이름_최소_한개_이상_테스트")
    void CarsNotEmpty() {
        String list = "";

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Cars(list),
                "최소 하나의 자동차 이름은 입력해주세요.");

    }

    @Test
    @DisplayName("승자_구하기_2명이상")
    void showWinners() {
        Cars cars = new Cars("seungyeol,poby");
        String[] winners = cars.getWinners();

        assertThat(winners.length).isEqualTo(2);

    }
}