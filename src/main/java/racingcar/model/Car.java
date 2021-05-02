package racingcar.model;

import racingcar.ui.RandomNumberUtils;

public class Car {

    private CarName name;
    private BoostNumber number;

    public Car(String name, int number) {
        this.name = new CarName(name);
        this.number = new BoostNumber(number);
    }

    public String getName() {
        return name.getName();
    }

    public void changeBoostNumber() {
        number.changeBoostNumber(RandomNumberUtils.createNumber());
    }

}
