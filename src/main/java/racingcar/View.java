package racingcar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class View {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public List<String> inputCarNames(BufferedReader reader) throws IOException {
        System.out.println("자동차의 이름들을 입력하세요");
        String carNames = reader.readLine();
        List<String> cars = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(carNames, ",");
        while (st.hasMoreTokens()) {
            cars.add(st.nextToken());
        }
        return cars;
    }

    public int inputFrequency(BufferedReader reader) throws IOException {
        System.out.println("총 시도할 횟수를 입력하세요");
        return Integer.parseInt(reader.readLine());
    }
}
