package racingcar.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {

    CAR_NAME_LENGTH("CAR_NAME_LENGTH", "자동차 이름은 5자 이하만 가능합니다."),
    CAR_COUNT("CAR_COUNT", "자동차는 2대 이상이여야 게임이 가능합니다."),
    DUPLICATION_CAR_NAME("DUPLICATION_CAR_NAME", "자동차 이름이 중복 됩니다."),
    GAME_COUNT_LESS_THAN_ZERO("GAME_COUNT_LESS_THAN_ZERO", "게임 횟수를 0미만 설정 할 수 없습니다."),
    WINNER_LESS("WINNER_LESS", "우승자가 없네요..?"),
    EMPTY_CAR_NAME("EMPTY_CAR_NAME", "차 이름은 공백이 불가능합니다.");

    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("ErrorCode : code = %s , message = %s ", code, message);
    }
}
