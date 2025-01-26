package racingcar.validate;

import racingcar.api.InputApi;

public class GameCountValidate {
    private static final int gameCount = InputApi.getInputGameCount();

    public static int validateGameCount() {
        if (gameCount < 0) {
            System.out.println("게임 횟수가 0보다 작음");
        }
        return gameCount;
    }
}
