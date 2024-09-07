package racingcar.model;

public class Car{

    RandomNumber randomNumber = new RandomNumber();
    private final String name;
    private int position;

    public Car(String name){
        this.name = name;
        this.position = 0;
    }

    public void move(){
        // 랜덤 값이 4 이상이면 전진한다.
        if(randomNumber.getRandomNumber() >= 4){
            position++;
        }
    }

    // 최대 위치 반환
    public int getPosition(){
        return position;
    }

    public String getName() {
        return name.replace(" ", "");
    }
}
