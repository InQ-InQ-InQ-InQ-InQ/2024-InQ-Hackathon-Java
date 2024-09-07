package racingcar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class View {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private List<String> inputCarNames(BufferedReader reader) throws IOException {
        System.out.println("자동차의 이름들을 입력하세요");
        String carNames = reader.readLine();
        List<String> cars = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(carNames, ",");
        while (st.hasMoreTokens()) {
            cars.add(st.nextToken());
        }
        return cars;
    }

    private int inputFrequency(BufferedReader reader) throws IOException {
        System.out.println("총 시도할 횟수를 입력하세요");
        return Integer.parseInt(reader.readLine());
    }

    private void printCarProgress(List<String> carNames, List<String> carProgress) {
        for (int i = 0; i < carNames.size(); i++) {
            System.out.println(carNames.get(i) + " : " + carProgress.get(i));
        }
    }

    private void printResult(List<String> carNames, List<String> carProgress) {
        List<String> winner = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < carProgress.size(); i++) { // 최댓값 찾기
            if (carProgress.get(i).length() >= max) {
                max = carProgress.get(i).length();
            }
        }
        for (int i = 0; i < carProgress.size(); i++) { // 우승자 찾기
            if (carProgress.get(i).length() >= max) {
                winner.add(carNames.get(i));
            }
        }

        System.out.print("최종 우승자 : ");
        for (int i = 0; i < winner.size(); i++) {
            System.out.print(winner.get(i));
            if (i + 1 < winner.size()) {
                System.out.println(",");
            }
        }
    }
}
