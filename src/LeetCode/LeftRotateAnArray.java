package LeetCode;

public class LeftRotateAnArray {

    static int[] rotLeft(int[] a, int d) {

        for(int i = 1; i <= d; i++){
            int temp = a[0];
            for(int j = 1; j < a.length; j++){
                a[j-1] = a[j];
            }
            a[a.length -1] = temp;
        }
        return a;
    }

    public static boolean checkPossibility(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        if (nums.length == 1) {
            return true;
        }
        int change = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                change++;
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                System.out.println(change);
            }
            if (change > 1) {
                return false;
            }
        }
        return true;
    }

}
