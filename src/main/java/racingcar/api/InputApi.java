package racingcar.api;

import camp.nextstep.edu.missionutils.Console;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class InputApi {

    public static String[] getInputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)로 구분):");
        return Console.readLine().trim().split(",");
    }

    public static int getInputGameCount() {
        System.out.println("시도할 회수를 입력하세요:");
        return Integer.parseInt(Console.readLine());
    }

    public static int pickOneRandomNumber() {
        return pickNumberInRange(0, 9);
    }

}
