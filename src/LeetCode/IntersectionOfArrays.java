package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int z = nums1.length;
        int y = nums2.length;
        HashMap<Integer, Integer> compareElements = new HashMap<Integer, Integer>();
        List<Integer> x = new ArrayList<>();
        for(int i = 0; i < (z<y ? z : y); i++){
            if(z<=y){
                if(!compareElements.containsKey(nums1[i])){
                    compareElements.put(nums1[i], 1);
                }
                else{
                    compareElements.put(nums1[i], compareElements.get(nums1[i])+1);
                }
            }
            else{
                if(!compareElements.containsKey(nums2[i])){
                    compareElements.put(nums2[i], 1);
                }
                else{
                    compareElements.put(nums2[i], compareElements.get(nums2[i])+1);
                }
            }
        }
        if(z<=y){
            for(int i = 0; i < y; i++){
                if(compareElements.containsKey(nums2[i]) && compareElements.get(nums2[i]) > 0){
                    compareElements.put(nums2[i], compareElements.get(nums2[i])-1);
                    x.add(nums2[i]);
                }
            }
        }
        else{
            for(int i = 0; i < z; i++){
                if(compareElements.containsKey(nums1[i]) && compareElements.get(nums1[i]) > 0){
                    compareElements.put(nums1[i], compareElements.get(nums1[i])-1);
                    x.add(nums1[i]);
                }
            }
        }
        int[] result = x.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
