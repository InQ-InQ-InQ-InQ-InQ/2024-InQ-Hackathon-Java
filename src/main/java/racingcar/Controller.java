package racingcar;

public class Controller {

    Model model = new Model();
    View view = new View();

    void run(){
        model.saveCarName(view.inputCarName());

        model.saveNumberOfAttempts(view.inputNumberOfAttempts());

        view.printResult(model.race());

        view.printWinner(model.findWinner());
    }

}
