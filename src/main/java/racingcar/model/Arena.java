package racingcar.model;

import racingcar.ui.PrintUtils;

public class Arena {

    private final TryTime tryTime;
    private final Cars cars;

    public Arena(int tryNumber, Cars cars) {
        this.tryTime = new TryTime(tryNumber);
        this.cars = cars;
    }


    public void play() {

        int count = tryTime.getTime();
        while (count-- > 0) {
            cars.updateBoostNumber();

            cars.printBoostNumber();

        }

        PrintUtils.printWinners(cars.getWinners());
    }

}
