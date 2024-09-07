package racingcar.model;

import java.util.ArrayList;

public class RacingCar {
    private static final ArrayList<Car> cars = new ArrayList<>();

    public RacingCar(ArrayList<String> cars) {
        for (String car : cars) {
            RacingCar.cars.add(new Car(car));
        }
    }

    // 자동차들을 이동시킨다.
    public static void moveCars() {
        for (Car car : cars) {
            car.move();
            car.printRoundResult();
        }
    }
}
