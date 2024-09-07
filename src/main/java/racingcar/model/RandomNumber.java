package racingcar.model;

public class RandomNumber {
    private static final int MAX_NUMBER = 10;
    private static final int MIN_NUMBER = 0;

    public static int getRandomNumber() {
        return (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1)) + MIN_NUMBER;
    }
}
