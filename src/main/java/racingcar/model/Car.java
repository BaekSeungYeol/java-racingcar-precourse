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

    public int getNumber() {
        return number.getNo();
    }

    public void updateBoostNumber(int randomNo) {
        if(randomNo >= 4) {
            number.increment();
        }
    }

    public void showBoost() {
        System.out.print(name.getName() + ":");
        for(int i=0; i< number.getNo(); ++i) {
            System.out.print("-");
        }
        System.out.println();
    }
}
