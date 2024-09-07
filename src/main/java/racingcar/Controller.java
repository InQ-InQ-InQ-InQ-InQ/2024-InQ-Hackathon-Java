package racingcar;

import racingcar.Model.Model;

public class Controller {
    Model model = new Model();
    View view = new View();

    public void startGame() {
        try {
            model.splitNames(view.inputCarNames());
            model.frequency = view.inputFrequency();
            for (int i = 0; i <= model.frequency; i++) {
                model.moveCars();
                view.printCarProgress(model.cars, model.cars.size());
            }
            model.findWinner();
            view.printWinner(model.winner);
        } catch (Exception e) {
            System.out.println("Exception [Err_Msg] : " + e.getMessage());
        }
    }
}
