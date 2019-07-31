package LeetCode;

import java.util.*;

public class FindDissapearedNumber {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> setOfNums = new HashSet<Integer>();
        List<Integer> finalList = new ArrayList<Integer>();
        for(int i = 0 ; i < nums.length; i++){
            setOfNums.add(nums[i]);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!setOfNums.contains(i)){
                finalList.add(i);
            }
        }
        return finalList;
    }
}
