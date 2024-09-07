package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Model {

    int numberOfAttempts;
    int maxDistance = 0;
    ArrayList<Car> carList;

    void saveCarName(String input){

        StringTokenizer st = new StringTokenizer(input, ",");
        carList = new ArrayList<>();
        while (st.hasMoreTokens()){
            String name = st.nextToken();
            if(name.length()>5) {
                throw new IllegalArgumentException("5글자 이하로 작성");
            }
            carList.add(new Car(name));
        }

    }

    void saveNumberOfAttempts(String input){

        try {
            numberOfAttempts = Integer.parseInt(input);
        } catch (Exception e){
            System.out.println("숫자를 입력하세요");
        }

    }

    Map<String, Integer> race(){

        Map<String, Integer> result = new HashMap<>();

        while (numberOfAttempts --> 0) {
            for (Car list : carList) {
                int rand = Randoms.pickNumberInRange(0, 9);
                list.addDistance(rand);
                result.put(list.name, list.distance);
                updateMaxValue(maxDistance, list.distance);
            }
        }

        return result;
    }

    String findWinner(){
        ArrayList<String> winners = new ArrayList<>();
        for (Car list : carList) {
            if(list.sameDistance(maxDistance)){
                winners.add(list.name);
            }
        }
        return winners.toString().replace("[", "").replace("]", "");
    }


    void updateMaxValue(int max, int distance){
        maxDistance = Math.max(distance, max);
    }

}
