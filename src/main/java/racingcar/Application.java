package racingcar;

import static racingcar.controller.InputController.createRacingCar;
import static racingcar.controller.InputController.setRoundNum;
import static racingcar.view.InputView.carNameInput;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        createRacingCar();
        setRoundNum();
    }
}