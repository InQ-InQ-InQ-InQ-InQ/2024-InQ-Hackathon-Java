package racingcar.controller;
import racingcar.model.NameValid;
import racingcar.model.NumberVaild;
import racingcar.model.RacingCar;
import racingcar.view.InputView;
import static racingcar.view.InputView.carNameInput;

public class InputController {
    // 레이싱 자동차를 생성한다.
    public static RacingCar createRacingCar() {
        try{
            NameValid nameValid = new NameValid(carNameInput());
            return new RacingCar(nameValid.getNames());
        }catch (IllegalArgumentException e){
            return createRacingCar();
        }
    }

    public static int setRoundNum() {
        try {
            NumberVaild validation = new NumberVaild(Integer.parseInt(InputView.tryCountInput()));
            return validation.getNumber();
        } catch (IllegalArgumentException e) {
            return setRoundNum();
        }
    }
}
