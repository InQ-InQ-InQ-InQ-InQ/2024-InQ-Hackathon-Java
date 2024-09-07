package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Model {
    String[] car;
    int[] distance;
    int numberOfAttempts;
    int maxDistance = 0;

    void saveCarName(String input){

        StringTokenizer st = new StringTokenizer(input, ",");
        car = new String[st.countTokens()];
        distance = new int[st.countTokens()];
        for(int i=0; i<car.length; i++){
            String str = st.nextToken();
            if(str.length()>5) {
                throw new IllegalArgumentException("5글자 이하로 작성");
            }
            car[i] = str;
        }

    }

    void saveNumberOfAttempts(String input){

        try {
            numberOfAttempts = Integer.parseInt(input);
        } catch (Exception e){
            System.out.println("숫자를 입력하세요");
        }

    }

    StringBuilder race(){
        StringBuilder sb = new StringBuilder();
        while (numberOfAttempts --> 0) {
            for (int i = 0; i < car.length; i++) {
                int rand = Randoms.pickNumberInRange(0, 9);
                updateDistance(rand, i);
                sb.append(car[i]).append(" : ")
                        .append("-".repeat(Math.max(0, distance[i])))
                        .append("\n");
                updateMaxValue(maxDistance, i);
            }
            sb.append("\n");
        }

        return sb;
    }

    String findWinner(){
        ArrayList<String> winners = new ArrayList<>();
        for(int i=0; i<car.length; i++){
            if(distance[i]== maxDistance) {
                winners.add(car[i]);
            }
        }
        return winners.toString().replace("[", "").replace("]", "");
    }

    void updateDistance(int rand, int i){
        if(rand>=4) {
            distance[i]++;
        }
    }

    void updateMaxValue(int max, int i){
        maxDistance = Math.max(distance[i], max);
    }

}
