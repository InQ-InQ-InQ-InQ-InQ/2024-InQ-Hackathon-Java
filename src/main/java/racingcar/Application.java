package racingcar;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        View view = new View();
        Model model = new Model();

        model.saveCarName(view.inputCarName());
    }
}
