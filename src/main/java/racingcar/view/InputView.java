package racingcar.view;
import java.util.Scanner;

public class InputView {

    // 자동차의 이름을 입력받는다.
    public static String carNameInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return scanner.nextLine();
    }

    // 시도할 회수를 입력받는다.
    public static int tryCountInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 회수는 몇회인가요?");
        return scanner.nextInt();
    }
}
