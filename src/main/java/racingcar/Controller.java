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
            view.printCarProgress(model.cars, model.frequency);
            model.findWinner();
            view.printWinner(model.winner);
        } catch (Exception e) {

        }
    }
}
