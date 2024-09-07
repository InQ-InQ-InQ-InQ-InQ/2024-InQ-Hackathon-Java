package racingcar.view;

import java.util.ArrayList;

public class ResultView {

    // 경주 결과를 출력한다.
    public static void printResult() {
        System.out.println("실행 결과");
    }

    // 최종 우승자를 출력한다.
    public static void printWinner(ArrayList<String> winners) {
        System.out.print("최종 우승자: ");
        for (String winner : winners) {
            System.out.print(winner + " ");
        }
        System.out.println();
    }
}
