package racingcar.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Model {
    public List<Car> cars = new ArrayList<>();
    public List<String> winner = new ArrayList<>();
    public int frequency = 0;

    public void moveCars() {
        for (int i = 0; i < frequency; i++) {
            for (Car car : cars) {
                car.move();
            }
        }
    }

    public void splitNames(String carNames) {
        StringTokenizer st = new StringTokenizer(carNames, ",");
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            Car car = new Car(str, 0, false);
            cars.add(car);
            if (str.length() > 5) {
                throw new IllegalArgumentException("Car name should be less than 5 characters");
            }
        }
    }

    public void findWinner() {
        int max = 0;

        for (int i = 0; i < cars.size(); i++) { // 최댓값 찾기
            if (cars.get(i).getProgress() >= max) {
                max = cars.get(i).getProgress();
            }
        }

        for (int i = 0; i < cars.size(); i++) { // 우승자 찾기
            if (cars.get(i).getProgress() >= max) {
                winner.add(cars.get(i).getName());
            }
        }
    }
}