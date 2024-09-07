package racingcar;

import racingcar.model.RacingCar;

import static racingcar.controller.InputController.createRacingCar;
import static racingcar.controller.InputController.setRoundNum;
import static racingcar.view.InputView.carNameInput;
import static racingcar.view.ResultView.printResult;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        createRacingCar();
        setRoundNum();
        startGame();
    }

    // 게임 시작
    public static void startGame() {
        // TODO 구현
        // 회수만큼 실행
        printResult();
        for (int i = 0; i < setRoundNum(); i++) {
            RacingCar.moveCars();
        }
    }
}