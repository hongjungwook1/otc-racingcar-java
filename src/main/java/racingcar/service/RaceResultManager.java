package racingcar.service;

import racingcar.exception.CustomException;
import racingcar.exception.ErrorCode;
import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

public class RaceResultManager implements RaceResultManagerInterface {

    @Override
    public int getMaxPosition(List<Car> cars) {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElseThrow(() -> new CustomException(ErrorCode.WINNER_LESS));
    }

    @Override
    public List<String> resultWinner(List<Car> cars) {
        List<String> winners = new ArrayList<>();
        int maxPosition = getMaxPosition(cars);

        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }
        return winners;
    }

}
