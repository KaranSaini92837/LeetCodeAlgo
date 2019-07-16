package LeetCode;

public class SearchPosition {

    public static int searchInsert(int[] nums, int target) {
        return searchInsertRec(nums, target , 0 ,nums.length-1);
    }
    public static int searchInsertRec(int nums[], int target, int low, int high){

        int mid = low+(high-low)/2;
        if(high>low) {
            if (nums[mid] == target) {
                return mid;
            }
            if (target > nums[mid]) {
                return searchInsertRec(nums, target, mid + 1, high);
            } else {
                return searchInsertRec(nums, target, low, mid - 1);
            }
        }
        else if(target == nums[mid]){
            return mid;
        }
        else if(high <= low) {
            if (target > nums[mid]) {
                return mid + 1;
            } else if (mid == 0) {
                return 0;
            } else if (target < nums[mid]) {
                return mid;
            }

        }
        return -1;
    }

    public static void main(String args[]){

        int num[] = {1,3};
        String s = "dkbose";
        //System.out.println(s.contains(x));
       // System.out.println(searchInsert(num, 0));

    }

}
