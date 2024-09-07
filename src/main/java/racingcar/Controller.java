package racingcar;

import java.io.IOException;

public class Controller {
    Model model = new Model();
    View view = new View();

    public void startGame() {
        try {
            try {
                model.carNames = view.inputCarNames();
            } catch (Exception e) {
                System.out.println("Exception [Err_Msg] : " + e.getMessage());
            }
            model.initCarProgress(model.carNames.size());
            model.frequency = view.inputFrequency();
            for (int i = 0; i < model.frequency; i++) {
                model.gameProgress(model.carNames, model.carProgress);
                view.printCarProgress(model.carNames, model.carProgress);
            }
            view.printResult(model.carNames, model.carProgress);
        } catch (Exception e) {

        }
    }
}
