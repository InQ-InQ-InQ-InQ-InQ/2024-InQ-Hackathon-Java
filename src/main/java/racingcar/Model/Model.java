package racingcar.Model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Model {
    public List<Car> cars = new ArrayList<>();
    public List<String> winner = new ArrayList<>();
    public int frequency = 0;

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