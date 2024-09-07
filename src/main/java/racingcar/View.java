package racingcar;

import java.io.InputStreamReader;
import java.util.Scanner;

public class View {

    String inputCarName(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)");
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        return sc.next();
    }

    String inputNumberOfAttempts(){
        System.out.println("시도할 회수는 몇회인가요?");
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        return sc.next();
    }


}
