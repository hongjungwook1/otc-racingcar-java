package racingcar.service;

import racingcar.api.InputApi;
import racingcar.model.Car;
import racingcar.validate.CarNameValidate;
import racingcar.validate.GameCountValidate;

import java.util.ArrayList;
import java.util.List;

public class CarService implements CarInterface {

    static List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getCarName() {
        String[] carNameArray = CarNameValidate.validateCarNames();

        for (String name : carNameArray) {
            cars.add(new Car(name));
        }
        return cars;
    }

    @Override
    public void movePosition() {
        for (Car car : cars) {
            car.move(InputApi.pickOneRandomNumber());
        }
    }


}
