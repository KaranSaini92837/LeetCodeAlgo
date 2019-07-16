package LeetCode;

import java.util.HashMap;

public class RemoveDuplicatesFromASortedArray {

    public static int removeDuplicates(int nums[]) {

       // HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
        if (nums.length == 1) {
            return 1;
        }
        int counter = 1;
        int x = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[counter] = nums[i];
                counter++;
            }

        }


        return counter;
    }

    public static void main(String args[]) {
        int nums[] = {0,0,1,1,2,2,3,3,4,4};
        System.out.println(removeDuplicates(nums));
        System.out.println("\n");
        for(int i = 0; i < removeDuplicates(nums) ; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
