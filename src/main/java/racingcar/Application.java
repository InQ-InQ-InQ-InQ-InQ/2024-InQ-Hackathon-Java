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
        startGame();
    }

    // 게임 시작
    public static void startGame() {
        int round = setRoundNum();
        System.out.println();
        printResult();
        for (int i = 0; i < round; i++) {
            RacingCar.moveCars();
            System.out.println();
        }
        RacingCar.getWinners();
    }
}