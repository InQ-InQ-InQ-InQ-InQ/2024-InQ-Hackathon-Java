package racingcar;

import racingcar.controller.InputController;
import racingcar.model.RacingCar;
import racingcar.view.ResultView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        startGame();
    }

    // 게임 시작
    public static void startGame() {
        InputController.createRacingCar();
        int round = InputController.setRoundNum();
        ResultView.printResult();
        for (int i = 0; i < round; i++) {
            RacingCar.moveCars();
            System.out.println();
        }
        RacingCar.getWinners();
    }
}