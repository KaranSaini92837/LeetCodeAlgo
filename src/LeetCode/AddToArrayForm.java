package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {

    public static List<Integer> addToArrayForm(int[] A, int K) {
        int carry = 0;
        int sum = 0;
        List<Integer> resultList = new ArrayList<Integer>();
        int i = A.length-1;
        while(K != 0 || i >= 0){

            if(i < 0){
                sum = K%10 + carry;
                carry = sum/10;
                K = K/10;
                resultList.add(sum%10);
            }
            else if(K == 0){
                sum = A[i] + carry;
                carry = sum/10;
                resultList.add(sum%10);
                i--;
            }else{
                sum = A[i] + K%10 + carry;
                carry = sum/10;
                K = K/10;
                resultList.add(sum%10);
                i--;
            }
        }
        if(carry == 1){
            resultList.add(carry);
        }
        Collections.reverse(resultList);
        return resultList;
    }



    public static void main(String[] args){
        int[] arr = new int[]{1,2,0,0};
        for(Integer i : AddToArrayForm.addToArrayForm(arr, 34)){
            System.out.print(i+",");
        }
    }
}
