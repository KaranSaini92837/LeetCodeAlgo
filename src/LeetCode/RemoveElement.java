package LeetCode;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int counter = 0;
        for(int i = 0 ; i < nums.length  ;i++){
            if(nums[i] != val){
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }

    public static void main(String args[]){
        int arr[] = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr, 2));
        for(int i = 0; i<removeElement(arr, 2);i++){
            System.out.print(arr[i]+" ");
        }
    }
}
