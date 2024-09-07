package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class View {

    String inputCarName(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)");
        return Console.readLine();
    }

    String inputNumberOfAttempts(){
        System.out.println("시도할 회수는 몇회인가요?");
        return Console.readLine();
    }

    void printResult(StringBuilder sb){
        System.out.println("\n실행 결과");
        System.out.println(sb);
    }

    void printWinner(String winner){
        System.out.print("최종 우승자 : ");
        System.out.println(winner);
    }

}
