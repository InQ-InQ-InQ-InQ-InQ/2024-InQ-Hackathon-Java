package racingcar.Model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    String name;
    int progress;
    boolean win;

    public Car(String name, int progress, boolean win) {
        this.name = name;
        this.progress = progress;
        this.win = win;
    }

    public String getName() {
        return name;
    }

    public int getProgress() {
        return progress;
    }

    public boolean isWin() {
        return win;
    }

    public void move() {
        int random = Randoms.pickNumberInRange(0, 9);
        if (random >= 4) {
            progress += 1;
        }
    }
}
