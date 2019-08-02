package LeetCode;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> n = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            n.add(nums[i]);
        }
        return (n.size() == nums.length) ? false : true;
    }
}
