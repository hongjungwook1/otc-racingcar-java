package racingcar;

import racingcar.model.Car;
import racingcar.service.CarService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        CarService service = new CarService();
        List<Car> cars = service.getCarName();

        for (Car car : cars) {
            System.out.println("차 이름 : " + car.getName() + " 현 위치 : " + car.getPosition());
        }
    }
}
