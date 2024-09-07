package racingcar.model;

public class Car{
    private String name;
    private int position;

    public Car(String name){
        this.name = name;
        this.position = 0;
    }

    // 라운드 결과 출력
    public void printRoundResult(){
        System.out.print(name.trim() + " : ");
        for(int i = 0; i < position; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    public void move(){
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
