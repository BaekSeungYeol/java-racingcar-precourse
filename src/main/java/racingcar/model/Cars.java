package racingcar.model;

import racingcar.ui.RandomNumberUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {

    private final List<Car> cars;

    public Cars(String cars) {
        List<Car> carList = mapping(cars);
        checkDuplicate(carList);
        checkIfEmpty(carList);

        this.cars = carList;
    }

    private void checkIfEmpty(List<Car> carList) {
        if (carList.size() == 0) {
            throw new IllegalArgumentException("최소 하나의 자동차 이름은 입력해주세요.");
        }
        if (carList.get(0).getName().equals("")) {
            throw new IllegalArgumentException("최소 하나의 자동차 이름은 입력해주세요.");
        }
    }

    private void checkDuplicate(List<Car> carList) {
        Set<String> name = new HashSet<>();
        for (int idx = 0; idx < carList.size(); ++idx) {
            throwErrorIfDuplicate(carList, name, idx);

            name.add(carList.get(idx).getName());
        }
    }

    private void throwErrorIfDuplicate(List<Car> carList, Set<String> name, int i) {
        if (name.contains(carList.get(i).getName())) {
            throw new IllegalArgumentException("중복된 이름 입니다.");
        }
    }

    private List<Car> mapping(String cars) {
        List<Car> list = new ArrayList<>();

        String[] carList = cars.split(",");
        for (int i = 0; i < carList.length; ++i) {
            list.add(new Car(carList[i], 0));
        }
        return list;
    }

    public void updateBoostNumber() {
        for (int i = 0; i < cars.size(); ++i) {
            cars.get(i).updateBoostNumber(RandomNumberUtils.createNumber());
        }
    }

    public void printBoostNumber() {
        for (int i = 0; i < cars.size(); ++i) {
            cars.get(i).showBoost();
        }
        System.out.println();
    }

    public String[] getWinners() {
        List<String> cands = new ArrayList<>();
        int maxValue = getMaxBoostNumber();
        for (int i = 0; i < cars.size(); ++i) {
            addIfWinner(cands, maxValue, cars.get(i));
        }
        return cands.toArray(new String[cands.size()]);
    }

    private void addIfWinner(List<String> cands, int maxValue, Car car) {
        if (car.getNumber() == maxValue) {
            cands.add(car.getName());
        }
    }

    private int getMaxBoostNumber() {
        int maxValue = 0;
        for (int i = 0; i < cars.size(); ++i) {
            maxValue = Math.max(cars.get(i).getNumber(), maxValue);
        }
        return maxValue;
    }
}
