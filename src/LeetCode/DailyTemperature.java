package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class DailyTemperature {

    public int[] dailyTemperatures(int[] T) {
        HashMap<Integer, Integer> mapOfTemp = new HashMap<>();
        int[] arr = new int[T.length];

        for(int i = 1; i < T.length; i++){
            mapOfTemp.put(i, T[i]);
        }
        for(int i = 0; i < T.length; i++){

        }
        return new int[8];
    }

}
