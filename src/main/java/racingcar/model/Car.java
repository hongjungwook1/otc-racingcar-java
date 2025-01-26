package racingcar.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Car {

    private final String name;
    @Setter
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move(int randomNumber) {
        if (randomNumber >= 4) {
            position++;
        }
    }

}
