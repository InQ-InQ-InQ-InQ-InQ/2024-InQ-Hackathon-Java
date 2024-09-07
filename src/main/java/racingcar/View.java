package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class View {
    public List<String> inputCarNames() throws IOException {
        System.out.println("자동차의 이름들을 입력하세요");
        String carNames = Console.readLine();
        List<String> cars = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(carNames, ",");
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            cars.add(str);
            if (str.length() > 5) {
                throw new IllegalArgumentException();
            }
        }
        return cars;
    }

    public int inputFrequency() throws IOException {
        System.out.println("총 시도할 횟수를 입력하세요");
        return Integer.parseInt(Console.readLine());
    }

    public void printCarProgress(List<String> carNames, List<String> carProgress) {
        for (int i = 0; i < carNames.size(); i++) {
            System.out.println(carNames.get(i) + " : " + carProgress.get(i));
        }
        System.out.println();
    }

    public void printResult(List<String> carNames, List<String> carProgress) {
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
                System.out.print(",");
            }
        }
    }
}
