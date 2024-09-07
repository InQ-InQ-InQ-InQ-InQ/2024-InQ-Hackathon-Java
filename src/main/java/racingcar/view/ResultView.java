package racingcar.view;

import java.util.ArrayList;

public class ResultView {

    // 경주 결과를 출력한다.
    public void printResult() {
        System.out.println("실행 결과");
    }

    // 최종 우승자를 출력한다.
    public void printWinner(ArrayList<String> winners) {
        System.out.print("최종 우승자 : ");
        for (int i = 0; i < winners.size(); i++) {
            System.out.print(winners.get(i));
            if (i != winners.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
