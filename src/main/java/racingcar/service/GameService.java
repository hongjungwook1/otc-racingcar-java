package racingcar.service;

import racingcar.validate.GameCountValidate;

public class GameService implements GameInterface {

    @Override
    public int getGameCount() {
        return GameCountValidate.validateGameCount();
    }

}
