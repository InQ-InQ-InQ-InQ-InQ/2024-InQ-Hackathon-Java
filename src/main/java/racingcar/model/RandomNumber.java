package racingcar.model;
import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {
    private static final int MAX_NUMBER = 10;
    private static final int MIN_NUMBER = 0;

    public static int getRandomNumber() {
        return Randoms.pickNumberInRange(0,9);
    }
}
