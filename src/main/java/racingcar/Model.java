package racingcar;

public class Model {
    private boolean move() {
        int random = (int) (Math.random() * 10);
        return random >= 4;
    }
}