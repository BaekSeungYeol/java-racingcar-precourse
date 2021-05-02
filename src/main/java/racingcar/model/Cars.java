package racingcar.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {

    private final List<Car> cars;

    public Cars(String cars) {
        List<Car> carList =  mapping(cars);
        checkDuplicate(carList);
        checkIfEmpty(carList);

        this.cars = carList;
    }

    private void checkIfEmpty(List<Car> carList) {
        if(carList.size() == 0) {
            throw new IllegalArgumentException("최소 하나의 자동차 이름은 입력해주세요.");
        }
        if(carList.get(0).getName().equals("")) {
            throw new IllegalArgumentException("최소 하나의 자동차 이름은 입력해주세요.");
        }
    }

    private void checkDuplicate(List<Car> carList) {
        Set<String> name = new HashSet<>();
        for(int idx=0; idx< carList.size(); ++idx) {
            throwErrorIfDuplicate(carList, name, idx);

            name.add(carList.get(idx).getName());
        }
    }

    private void throwErrorIfDuplicate(List<Car> carList, Set<String> name, int i) {
        if(name.contains(carList.get(i).getName())) {
            throw new IllegalArgumentException("중복된 이름 입니다.");
        }
    }

    private List<Car> mapping(String cars) {
        List<Car> list = new ArrayList<>();

        String[] carList = cars.split(",");
        for(int i=0; i< carList.length; ++i) {
            list.add(new Car(carList[i],0));
        }
        return list;
    }
}
