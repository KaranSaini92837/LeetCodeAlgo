package LeetCode;

public class PartitionArrayInto3 {

    public static boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;

        for(int i = 0; i < A.length; i++){
            sum += A[i];
        }
        if(sum%3 != 0){
            return false;
        }
        int average = sum / 3;
        int count = 0;
        int subSum  = 0;
        for(int i = 0; i<A.length; i++){
            subSum += A[i];
            if(subSum == average){
                subSum = 0;
                ++count;
            }
            if(count == 3){
                return true;
            }
        }
        if(count == 3){
            return true;
        }
        else return false;
    }
}
