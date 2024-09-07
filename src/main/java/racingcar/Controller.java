package racingcar;

import racingcar.Model.Model;

public class Controller {
    Model model = new Model();
    View view = new View();

    public void startGame() {
        try {
            try {
                model.cars = view.inputCarNames();
            } catch (Exception e) {
                System.out.println("Exception [Err_Msg] : " + e.getMessage());
            }
            model.frequency = view.inputFrequency();
            for (int i = 0; i < model.frequency; i++) {
                view.printCarProgress(model.cars, i);
            }
            view.printResult(model.cars);
        } catch (Exception e) {

        }
    }
}
