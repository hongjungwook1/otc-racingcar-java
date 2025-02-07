package racingcar.validate;

import racingcar.api.InputApi;
import racingcar.exception.CustomException;
import racingcar.exception.ErrorCode;

import java.util.Arrays;

public class CarNameValidate {

    private static final String[] checkCarNames = InputApi.getInputCarNames();

    public static String[] validateCarNames() {
        checkCarCount();
        checkDuplicationCarName();
        return checkCarNameLength();
    }

    private static String[] checkCarNameLength() {
        for (String check : checkCarNames) {
            if (check.length() > 5) {
                System.out.println(ErrorCode.CAR_NAME_LENGTH);
                throw new CustomException(ErrorCode.CAR_NAME_LENGTH);
            }
        }
        return checkCarNames;
    }

    private static void checkCarCount() {
        if (checkCarNames.length < 2) {
            System.out.println(ErrorCode.CAR_COUNT);
            throw new CustomException(ErrorCode.CAR_COUNT);
        }
    }

    private static void checkDuplicationCarName() {
        long count = Arrays.stream(checkCarNames).distinct().count();
        if (count != checkCarNames.length) {
            System.out.println(ErrorCode.DUPLICATION_CAR_NAME);
            throw new CustomException(ErrorCode.DUPLICATION_CAR_NAME);
        }
    }
    // 공백 제거 추가 예정
}
