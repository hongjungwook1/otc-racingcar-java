package racingcar.service;

import racingcar.validate.GameValidate;

public class GameService implements GameInterface {

    @Override
    public int getGameCount() {
        return GameValidate.validateGameCount();
    }

}
