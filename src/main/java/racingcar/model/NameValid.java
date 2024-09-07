package racingcar.model;

import java.util.ArrayList;
import java.util.Arrays;

public class NameValid {
    final String carName;
    final ArrayList<String> names;

    public static ArrayList<String> toArrayList(String carsString) {
        String[] carNames = carsString.trim().split(",");
        ArrayList<String> names = new ArrayList<>(Arrays.asList(carNames));
        return names;
    }

    public NameValid(String carName) {
        this.carName = carName;
        this.names = toArrayList(carName);
        isValid();
    }

    // 자동차 이름이 5자 이하인지 확인
    public void isNameValid() {
        for (String name : names) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
            }
        }
    }

    // 자동차 이름이 중복되는지 확인
    public void isNameDuplicate() {
        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))) {
                    // 에러 반환
                    throw new IllegalArgumentException("중복된 이름이 존재합니다.");
                }
            }
        }
    }

    // 자동차 이름이 유효한지 확인
    public void isValid() {
        isNameValid();
        isNameDuplicate();
    }

    public ArrayList<String> getNames() {
        return names;
    }
}
