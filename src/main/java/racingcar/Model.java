package racingcar;

import java.util.List;

public class Model {
    private boolean move() {
        int random = (int) (Math.random() * 10);
        return random >= 4;
    }

    private void gameProgress(List<String> carNames, List<String> carProgress, int frequency) {
        for (int i = 0; i < frequency; i++) {
            for (int index = 0; index < carNames.size(); index++) {
                String progress = carProgress.get(i);
                if (move()) {
                    progress += '-';
                    carProgress.set(i, progress);
                }
            }
        }
    }
}