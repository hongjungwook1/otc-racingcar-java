package racingcar.exception;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum ErrorCode {

    CAR_NAME_LENGTH("CAR_NAME_LENGTH", "5글자 넘음"),
    CAR_COUNT("CAR_COUNT", "차는 2개 이상"),
    DUPLICATION_CAR_NAME("DUPLICATION_CAR_NAME", "자동차 이름 중복");

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
