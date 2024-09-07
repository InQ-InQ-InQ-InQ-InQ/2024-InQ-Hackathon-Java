package racingcar;

import java.util.Random;
import java.util.StringTokenizer;

public class Model {
    String[] car;
    int[] len;
    int numberOfAttempts;
    int max;

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

    StringBuilder race(Model model){
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < model.car.length; i++) {
            int rand = random.nextInt(10);
            if(rand>=4) model.len[i]++;
            sb.append(model.car[i]).append(" : ");
            sb.append("-".repeat(Math.max(0, model.len[i])));
            sb.append("\n");
            model.max = Math.max(model.len[i], model.max);
        }

        return sb;
    }

}
