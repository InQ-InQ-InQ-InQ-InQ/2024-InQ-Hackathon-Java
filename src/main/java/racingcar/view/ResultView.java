package racingcar.view;

import java.util.ArrayList;

public class ResultView {

    // 경주 결과를 출력한다.
    public static void printResult() {
        System.out.println("실행 결과");
    }

    // 라운드 결과 출력
    public static void printRoundResult(String name, int position) {
        System.out.print(name + " : ");
        System.out.print("-".repeat(position));
        System.out.println();
    }

    // 최종 우승자를 출력한다.
    public static void printWinner(ArrayList<String> winners) {
        System.out.print("최종 우승자 : ");
        for (int i = 0; i < winners.size(); i++) {
            System.out.print(winners.get(i));
            if (i != winners.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
