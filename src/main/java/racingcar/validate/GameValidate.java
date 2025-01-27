package racingcar.validate;

import racingcar.api.InputApi;
import racingcar.exception.CustomException;
import racingcar.exception.ErrorCode;

public class GameValidate {
    private static final int gameCount = InputApi.getInputGameCount();

    public static int validateGameCount() {
        if (gameCount < 0) {
            System.out.println(ErrorCode.GAME_COUNT_LESS_THAN_ZERO);
            throw new CustomException(ErrorCode.GAME_COUNT_LESS_THAN_ZERO);
        }
        return gameCount;
    }

}
