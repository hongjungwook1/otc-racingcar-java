package racingcar.input;

import camp.nextstep.edu.missionutils.Console;

public class Input {

    public static String[] getInputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)로 구분):");
        return Console.readLine().split(",");
    }

    public static int getInputGameCount() {
        System.out.println("시도할 회수를 입력하세요:");
        return Integer.parseInt(Console.readLine());
    }

}
