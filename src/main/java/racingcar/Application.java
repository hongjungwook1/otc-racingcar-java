package racingcar;

import racingcar.controller.GameController;
import racingcar.model.Car;
import racingcar.service.CarService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        GameController controller = new GameController();
        controller.gameStart();
    }
}
