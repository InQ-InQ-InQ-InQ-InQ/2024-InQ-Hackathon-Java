package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Random;
import java.util.StringTokenizer;

public class Model {
    String[] car;
    int[] len;
    int numberOfAttempts;
    int max = 0;

    void saveCarName(String input){

        StringTokenizer st = new StringTokenizer(input, ",");
        car = new String[st.countTokens()];
        len = new int[st.countTokens()];
        for(int i=0; i<car.length; i++){
            String str = st.nextToken();
            if(str.length()>5) throw new IllegalArgumentException("5글자 이하로 작성");
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
        Random random = new Random();
        for (int i = 0; i < car.length; i++) {
            int rand = Randoms.pickNumberInRange(0, 9);
            if(rand>=4) len[i]++;
            sb.append(car[i]).append(" : ");
            sb.append("-".repeat(Math.max(0, len[i])));
            sb.append("\n");
            max = Math.max(len[i], max);
        }

        return sb;
    }

    StringBuilder findWinner(){
        StringBuilder sb = new StringBuilder();
        boolean jointWinner = false;
        for(int i=0; i<car.length; i++){
            if(len[i]==max) {
                if(jointWinner) sb.append(", ");
                jointWinner = true;
                sb.append(car[i]);
            }
        }
        return sb;
    }

}
