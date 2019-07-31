package LeetCode;

public class UnsortedSubArray {
    public static int findUnsortedSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int start = -1;
        int end = -2;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= max){
                max = nums[i];
            }
            if(nums[i] < max){
                end = i;
            }
        }
        System.out.println("end: "+end);
        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i] <= min){
                min = nums[i];
            }
            if(nums[i] > min){
                start = i;
            }
        }
        System.out.println("start: "+start);
        return end-start+1;
    }

    public static void main(String[] args){
        int[] arr = new int[]{2,6,4,8,10,9,15};
        System.out.println(UnsortedSubArray.findUnsortedSubarray(arr));
    }
}
