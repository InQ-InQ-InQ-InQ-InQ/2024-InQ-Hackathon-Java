package racingcar.model;

import racingcar.view.ResultView;

import java.util.ArrayList;

public class RacingCar {
    private static final ArrayList<Car> cars = new ArrayList<>();
    static ResultView resultView = new ResultView();

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

    // 우승자를 반환한다.
    public static void getWinners() {
        ArrayList<String> winners = new ArrayList<>();
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }
        resultView.printWinner(winners);
    }
}
