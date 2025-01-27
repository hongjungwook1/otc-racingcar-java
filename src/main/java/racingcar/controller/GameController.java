package racingcar.controller;

import racingcar.model.Car;
import racingcar.service.CarService;
import racingcar.service.GameService;
import racingcar.service.RaceResultManager;

import java.util.List;

public class GameController {

    CarService carService = new CarService();
    GameService gameService = new GameService();
    RaceResultManager raceResultManager = new RaceResultManager();

    // carService 에서 가져온 메소드를 어떠한 추가 작업이 없기에 바로 호출
    public void gameStart() {
        List<Car> cars = carService.getCarName();
        int gameCount = gameService.getGameCount();

        for (int i = 0; i < gameCount; i++) {
            carService.movePosition();
            printCar(cars);
            System.out.println();
        }
        System.out.println("우승자 : " + raceResultManager.resultWinner(cars));
    }

    public void printCar(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
    }

}
