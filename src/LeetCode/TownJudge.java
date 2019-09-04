package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TownJudge {
    public int findJudge(int N, int[][] trust) {
        if(trust.length == 0 && N == 1){
            return 1;
        }
        Map<Integer, Integer> result = new HashMap<>();
        int judge = 0;
        for(int i = 1; i <= N; i++){
            result.put(i, 0);
        }
        for(int i = 0; i < trust.length; i++){
            if(result.containsKey(trust[i][1])){
                result.put(trust[i][1], result.getOrDefault(trust[i][1], 0)+1);
                if(result.get(trust[i][1]) == N-1){
                    judge = trust[i][1];
                }
            }
        }
        for(int i = 0; i < trust.length; i++){
            if(trust[i][0] == judge){
                return -1;
            }
        }
        return judge > 0 ? judge : -1;
    }
}
