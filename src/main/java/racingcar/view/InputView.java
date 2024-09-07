package racingcar.view;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    // 자동차의 이름을 입력받는다.
    public String carNameInput() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    // 시도할 회수를 입력받는다.
    public String tryCountInput() {
        System.out.println("시도할 회수는 몇회인가요?");
        return Console.readLine();
    }
}
