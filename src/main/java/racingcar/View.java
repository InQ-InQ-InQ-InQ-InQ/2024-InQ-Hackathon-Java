package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.Model.Car;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class View {
    public List<Car> inputCarNames() {
        List<Car> cars = new ArrayList<>();
        try {
            System.out.println("자동차의 이름들을 입력하세요");
            String carNames = Console.readLine();
            StringTokenizer st = new StringTokenizer(carNames, ",");
            while (st.hasMoreTokens()) {
                String str = st.nextToken();
                Car car = new Car(str, 0, false);
                cars.add(car);
                if (str.length() > 5) {
                    throw new IllegalArgumentException("Car name should be less than 5 characters");
                }
            }
        } catch (Exception e) {
            System.out.println("Exception [Err_location] : " + e.getStackTrace()[0]);
            throw new RuntimeException(e);
        }
        return cars;
    }

    public int inputFrequency() throws IOException {
        System.out.println("총 시도할 횟수를 입력하세요");
        return Integer.parseInt(Console.readLine());
    }

    public void printCarProgress(List<Car> cars, int index) {
        System.out.print(cars.get(index).getName() + " : ");
        int progress = cars.get(index).getProgress();
        for (int i = 0; i < progress; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void printResult(List<Car> cars) {
        List<String> winner = new ArrayList<>();

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

        System.out.print("최종 우승자 : ");
        for (int i = 0; i < winner.size(); i++) {
            System.out.print(winner.get(i));
            if (i + 1 < winner.size()) {
                System.out.print(",");
            }
        }
    }
}
