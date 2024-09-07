package racingcar;

import java.util.StringTokenizer;

public class Model {
    String[] car;

    void saveCarName(String input){
        StringTokenizer st = new StringTokenizer(input);
        car = new String[st.countTokens()];
        for(int i=0; i<car.length; i++){
            String str = st.nextToken();
            if(str.length()>5) throw new IllegalArgumentException("5글자 이하로 작성");
            car[i] = str;
        }
    }


}
