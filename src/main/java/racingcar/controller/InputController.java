package racingcar.controller;
import racingcar.model.NameValid;
import racingcar.model.NumberVaild;
import racingcar.model.RacingCar;
import racingcar.view.InputView;

public class InputController {

    InputView inputView = new InputView();
    // 레이싱 자동차를 생성한다.
    public RacingCar createRacingCar() {
        NameValid nameValid = new NameValid(inputView.carNameInput());
        return new RacingCar(nameValid.getNames());
    }

    public int setRoundNum() {
        NumberVaild validation = new NumberVaild(Integer.parseInt(inputView.tryCountInput()));
        return validation.getNumber();
    }
}
