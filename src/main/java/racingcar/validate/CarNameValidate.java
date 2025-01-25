package racingcar.validate;

import racingcar.input.Input;

import java.util.Arrays;

public class CarNameValidate {

    private static String[] checkCarNames = Input.getInputCarNames();

    public static String[] validateCarNames() {
        checkCarCount();
        checkDuplicationCarName();
        return checkCarNameLength();
    }


    public static String[] checkCarNameLength() {
        for (String check : checkCarNames) {
            if (check.length() > 5) {
                System.out.println("5글자 넘음");
            }
        }
        return checkCarNames;
    }

    public static String[] checkCarCount() {
        if (checkCarNames.length < 2) {
            System.out.println("차는 2개 이상");
        }
        return checkCarNames;
    }

    public static String[] checkDuplicationCarName() {
        long count = Arrays.stream(checkCarNames).distinct().count();
        if (count != checkCarNames.length) {
            System.out.println("자동차 이름 중복.");
        }
        return checkCarNames;
    }

}
