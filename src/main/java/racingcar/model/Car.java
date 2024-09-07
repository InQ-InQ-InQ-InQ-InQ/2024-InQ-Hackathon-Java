package racingcar.model;

public class Car{
    private final String name;
    private int position;

    public Car(String name){
        this.name = name;
        this.position = 0;
    }

    public void move(){
        // 매개변수로 랜덤 값을 주면 테스트하기 좋아진다.
        // 랜덤 값이 4 이상이면 전진한다.
        if(RandomNumber.getRandomNumber() >= 4){
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
