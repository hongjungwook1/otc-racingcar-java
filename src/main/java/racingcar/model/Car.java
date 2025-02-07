package racingcar.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Car {

    String name;
    @Setter
    @NonFinal
    int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move(int randomNumber) {
        if (randomNumber >= 4) {
            position++;
        }
    }

}
