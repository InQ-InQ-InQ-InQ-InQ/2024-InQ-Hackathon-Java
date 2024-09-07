package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Model {
    List<String> carNames = new ArrayList<>();
    List<String> carProgress = new ArrayList<>();
    int frequency = 0;

    public List<String> initCarProgress(int length) {
        for (int i = 0; i < length; i++) {
            carProgress.add("");
        }
        return carProgress;
    }

    public boolean isMovable() {
        int random = Randoms.pickNumberInRange(0, 9);
        return random >= 4;
    }

    public void gameProgress(List<String> carNames, List<String> carProgress) {
        for (int i = 0; i < carNames.size(); i++) {
            String progress = carProgress.get(i);
            if (isMovable()) {
                progress += '-';
                carProgress.set(i, progress);
            }
        }
    }
}