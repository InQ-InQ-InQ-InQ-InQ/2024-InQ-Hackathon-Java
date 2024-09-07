package racingcar;

public class Car {

    final String name;
    int distance;

    public Car(String name){
        this.name = name;
    }

    public void addDistance(int rand){
        if(rand>=4){
            distance++;
        }
    }

    public boolean sameDistance(int distance){
        return this.distance==distance;
    }

}
