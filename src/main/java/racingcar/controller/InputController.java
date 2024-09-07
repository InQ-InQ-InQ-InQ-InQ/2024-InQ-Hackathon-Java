package racingcar.controller;
import racingcar.model.NameValid;
import racingcar.model.NumberVaild;
import racingcar.model.RacingCar;
import racingcar.view.InputView;

public class InputController {
    // 레이싱 자동차를 생성한다.
    public static RacingCar createRacingCar() {
        NameValid nameValid = new NameValid(InputView.carNameInput());
        return new RacingCar(nameValid.getNames());
    }

    public static int setRoundNum() {
        NumberVaild validation = new NumberVaild(Integer.parseInt(InputView.tryCountInput()));
        return validation.getNumber();
    }
}
