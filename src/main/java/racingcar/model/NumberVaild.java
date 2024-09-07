package racingcar.model;

public class NumberVaild {
    private static int number = 0;

    public NumberVaild(int number) {
        this.number = number;
        isValid();
    }

    // 숫자가 맞는지 확인한다.
    public void isValid() {
        isNumber();
        isPositiveNumber();
    }

    // 숫자만 입력했는지 확인한다.
    public void isNumber() {
        if (!String.valueOf(number).matches("^[0-9]*$")) {
            throw new IllegalArgumentException("숫자만 입력해주세요.");
        }
    }

    // 0보다 큰 숫자인지 확인한다.
    public void isPositiveNumber() {
        if (number < 0) {
            throw new IllegalArgumentException("0보다 큰 숫자를 입력해주세요.");
        }
    }

    public int getNumber() {
        return number;
    }
}
