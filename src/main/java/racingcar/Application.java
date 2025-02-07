package racingcar;

import racingcar.controller.GameController;
import racingcar.service.CarService;
import racingcar.service.GameService;
import racingcar.service.RaceResultManager;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        GameController controller = new GameController(new CarService(), new GameService(), new RaceResultManager());
        controller.gameStart();
        
    }
}
