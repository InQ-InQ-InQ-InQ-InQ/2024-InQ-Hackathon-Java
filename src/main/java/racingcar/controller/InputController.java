package racingcar.controller;
import racingcar.model.NameValid;
import racingcar.model.NumberVaild;
import racingcar.view.InputView;

import static racingcar.view.InputView.carNameInput;

public class InputController {
    // 레이싱 자동차를 생성한다.
    public static void createRacingCar() {
        try{
            NameValid nameValid = new NameValid(carNameInput());
            // return new RacingCar(nameValid);
        }catch (IllegalArgumentException e){
            createRacingCar();
        }
    }

    public static void setRoundNum() {
        try {
            NumberVaild validation = new NumberVaild(InputView.tryCountInput());
            // eturn Integer.parseInt(validation.toString());
        } catch (IllegalArgumentException e) {
            setRoundNum();
        }
    }
}
