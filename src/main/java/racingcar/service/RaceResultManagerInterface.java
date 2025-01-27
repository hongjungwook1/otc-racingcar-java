package racingcar.service;

import racingcar.model.Car;

import java.util.List;

public interface RaceResultManagerInterface {
    int getMaxPosition(List<Car> cars);

    List<String> resultWinner(List<Car> cars);


}
