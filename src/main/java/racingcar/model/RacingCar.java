package racingcar.model;

import racingcar.view.ResultView;

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
            ResultView.printRoundResult(car.getName(), car.getPosition());
        }
    }

    // 우승자를 반환한다.
    public static void getWinners() {
        ArrayList<String> winners = new ArrayList<>();
        int maxPosition = 0;
        maxPosition = getMaxPosition();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }
        ResultView.printWinner(winners);
    }

    // 최대 이동값
    private static int getMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }
}
