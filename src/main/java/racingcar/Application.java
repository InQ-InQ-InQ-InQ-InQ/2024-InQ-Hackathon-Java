package racingcar;

import racingcar.controller.InputController;
import racingcar.model.NumberVaild;
import racingcar.model.RacingCar;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class Application {

    static ResultView resultView = new ResultView();
    static InputController inputController = new InputController();
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        startGame();
    }

    // 게임 시작
    public static void startGame() {
        inputController.createRacingCar();
        int round = inputController.setRoundNum();
        resultView.printResult();
        for (int i = 0; i < round; i++) {
            RacingCar.moveCars();
            System.out.println();
        }
        RacingCar.getWinners();
    }
}