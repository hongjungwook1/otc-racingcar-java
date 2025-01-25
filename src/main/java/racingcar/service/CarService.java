package racingcar.service;

import racingcar.input.Input;
import racingcar.model.Car;
import racingcar.validate.CarNameValidate;

import java.util.ArrayList;
import java.util.List;

public class CarService implements CarInterface {

    @Override
    public List<Car> getCarName() {
        String[] carNameArray = CarNameValidate.validateCarNames();

        List<Car> cars = new ArrayList<>();

        for (String name : carNameArray) {
            cars.add(new Car(name));
        }

        return cars;
    }
}
